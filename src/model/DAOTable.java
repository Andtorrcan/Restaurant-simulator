package model;

import java.util.ArrayList;

public class DAOTable {

	private ArrayList<Table> tables_list;
	
	public DAOTable() {
		this.tables_list = new ArrayList<Table>();
		this.loadTables();
	}
	
	private void loadTables(){
		this.tables_list.add(new Table(11,0,0));
		this.tables_list.add(new Table(12,0,0));
		this.tables_list.add(new Table(13,0,0));
		this.tables_list.add(new Table(14,0,0));
		this.tables_list.add(new Table(15,0,0));
		this.tables_list.add(new Table(16,0,0));
		this.tables_list.add(new Table(17,0,0));
		this.tables_list.add(new Table(18,0,0));
		this.tables_list.add(new Table(19,0,0));
		this.tables_list.add(new Table(20,0,0));
		this.tables_list.add(new Table(21,0,0));
		this.tables_list.add(new Table(22,0,0));
		this.tables_list.add(new Table(23,0,0));
		this.tables_list.add(new Table(24,0,0));
		this.tables_list.add(new Table(25,0,0));
		this.tables_list.add(new Table(26,0,0));
		this.tables_list.add(new Table(27,0,0));
		this.tables_list.add(new Table(28,0,0));
		this.tables_list.add(new Table(29,0,0));
		this.tables_list.add(new Table(30,0,0));
		this.tables_list.add(new Table(31,0,0));
		this.tables_list.add(new Table(32,0,0));
		this.tables_list.add(new Table(33,0,0));
		this.tables_list.add(new Table(34,0,0));
		this.tables_list.add(new Table(35,0,0));
		this.tables_list.add(new Table(36,0,0));
		this.tables_list.add(new Table(37,0,0));
		this.tables_list.add(new Table(38,0,0));
		this.tables_list.add(new Table(39,0,0));
		this.tables_list.add(new Table(40,0,0));
		this.tables_list.add(new Table(41,0,0));
	}
	
	public Table searchTableById(int id) {
		for (int i = 0; i < this.tables_list.size(); i++) {
			if(this.tables_list.get(i).getId() == id) {
				return this.tables_list.get(i);
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		DAOTable d = new DAOTable();
		System.out.println(d.searchTableById(22));
	}
}
