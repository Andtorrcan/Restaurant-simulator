package controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import model.DAOOrder;
import model.DAOTable;
import utils.Util;

public class ControllerRestaurant {

	private DAOTable dao_table;
	private DAOOrder dao_order;
	private Util util;

	public ControllerRestaurant() {
		this.util = new Util();
		this.dao_table = new DAOTable();
		this.dao_order = new DAOOrder(this.dao_table, this.util);
	}

	
	private void startSimulation(){
		ExecutorService executor = Executors.newFixedThreadPool(31);
		 for (int i = 0; i < this.dao_order.getOrder_list().size(); i++) {
            executor.execute( this.dao_order.getOrder_list().get(i));
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        	//Aca se pasa a la vista
        }
        System.out.println("Finished all threads");
	}

	public static void main(String[] args) {
		ControllerRestaurant c = new ControllerRestaurant();
		c.startSimulation();
	}
}
