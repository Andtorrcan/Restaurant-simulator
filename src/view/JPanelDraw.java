package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Table;

public class JPanelDraw extends JPanel{
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -6154661501997901030L;
	public final int SIZE_SQUARE = 47;
	public final Color OPEN = new Color(23, 32, 42);
	public final Color ORDERING = new Color(66, 73, 73);
	public final Color WAITING = new Color(212, 172, 13);
	public final Color EATING = new Color(231, 76, 60);
	private ArrayList<Table> tables_list;
	
	
	
	public JPanelDraw(ArrayList<Table> tables_list) {
		this.tables_list = tables_list;
	}
	
	public void setTableList(ArrayList<Table> tables_list) {
		this.tables_list = tables_list;
		System.out.println(this.tables_list);
	}

	
	@Override
	public void paint(Graphics g) {
		  super.paint(g);
        for (int i = 0; i < tables_list.size(); i++) {
			if(this.tables_list.get(i).isState() == 0) {
				g.setColor(new Color(123, 234, 234));
			} else if(this.tables_list.get(i).isState() == 1) {
				g.setColor(new Color(166, 73, 73));
			} else if(this.tables_list.get(i).isState() == 2) {
				g.setColor(new Color(212, 172, 13));
			} else if(this.tables_list.get(i).isState() == 3) {
				g.setColor(new Color(231, 76, 60));
			}
			g.fillOval(this.tables_list.get(i).getX_coordinate(), this.tables_list.get(i).getY_coordinate(), this.SIZE_SQUARE, this.SIZE_SQUARE);
			g.setColor(Color.BLACK);
			g.drawOval(this.tables_list.get(i).getX_coordinate(), this.tables_list.get(i).getY_coordinate(), this.SIZE_SQUARE, this.SIZE_SQUARE);
			g.drawString(String.valueOf(this.tables_list.get(i).getId()), this.tables_list.get(i).getX_coordinate(), this.tables_list.get(i).getY_coordinate());
		}
      
        
    }
}
