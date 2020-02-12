package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import model.Table;

public class JPanelDraw extends JPanel {

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
		// Flores
		ImageIcon Img = new ImageIcon("./src/res/flowers.png");
		g.drawImage(Img.getImage(), 360, 442, 80, 80, null);
		g.drawImage(Img.getImage(), 440, 442, 80, 80, null);
		// Casetas
		ImageIcon Img2 = new ImageIcon("./src/res/stall.png");
		g.drawImage(Img2.getImage(), 520, 100, 120, 120, null);
		g.drawImage(Img2.getImage(), 520, 240, 120, 120, null);
		// Basura
		ImageIcon Img3 = new ImageIcon("./src/res/dumpster.png");
		g.drawImage(Img3.getImage(), 365, 120, 40, 40, null);
		g.drawImage(Img3.getImage(), 415, 120, 40, 40, null);
		g.drawImage(Img3.getImage(), 465, 120, 40, 40, null);
		for (int i = 0; i < tables_list.size(); i++) {
			if (this.tables_list.get(i).isState() == 0) {
				g.setColor(new Color(230, 234, 244));
			} else if (this.tables_list.get(i).isState() == 1) {
				g.setColor(new Color(90, 123, 255));
			} else if (this.tables_list.get(i).isState() == 2) {
				g.setColor(new Color(255, 224, 95));
			} else if (this.tables_list.get(i).isState() == 3) {
				g.setColor(new Color(16, 220, 96));
			}
			g.fillOval(this.tables_list.get(i).getX_coordinate(), this.tables_list.get(i).getY_coordinate(),
					this.SIZE_SQUARE, this.SIZE_SQUARE);
			g.setColor(Color.BLACK);
			g.drawOval(this.tables_list.get(i).getX_coordinate(), this.tables_list.get(i).getY_coordinate(),
					this.SIZE_SQUARE, this.SIZE_SQUARE);
			g.drawString(String.valueOf(this.tables_list.get(i).getId()), this.tables_list.get(i).getX_coordinate(),
					this.tables_list.get(i).getY_coordinate());
			
			g.setColor(new Color(147,105,58));
			g.fillRect(180, 160, 150, 270);
			g.setColor(Color.BLACK);
			g.drawRect(180, 160, 150, 270);
		}

	}
}
