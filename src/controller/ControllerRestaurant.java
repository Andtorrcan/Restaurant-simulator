package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.SwingWorker;

import model.DAOOrder;
import model.DAOTable;
import model.Table;
import utils.Util;
import view.JFMainWindow2;

public class ControllerRestaurant extends SwingWorker<Void, ArrayList<Table>> implements ActionListener {

	private DAOTable dao_table;
	private DAOOrder dao_order;
	private Util util;
	private JFMainWindow2 window;

	public ControllerRestaurant() {
		this.util = new Util();
		this.dao_table = new DAOTable();
		this.dao_order = new DAOOrder(this.dao_table, this.util);
		this.window = new JFMainWindow2(this, this.dao_table.getTables_list());
		this.window.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		switch (e.getActionCommand()) {
		case "start":
			this.execute();
			break;

		default:
			break;
		}

	}

	public static void main(String[] args) {
		ControllerRestaurant c = new ControllerRestaurant();
	}

	@Override
	protected Void doInBackground() throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(31);
		for (int i = 0; i < this.dao_order.getOrder_list().size(); i++) {
			executor.execute(this.dao_order.getOrder_list().get(i));
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
			publish(this.dao_table.getTables_list());
		}
		System.out.println("Finished all threads");
		return null;
	}
	
	@Override
	protected void process(List<ArrayList<Table>> chunks) {
		/* Pinto la vista con lo que se supone que me esta llegando del publish */
		this.window.sendDataTablesToPanelToDraw(chunks.get(0));
	}

	@Override
	protected void done() {
		this.window.sendDataTablesToPanelToDraw(this.dao_table.getTables_list());
	}
}
