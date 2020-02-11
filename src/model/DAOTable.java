package model;

import java.util.ArrayList;

public class DAOTable {

	private ArrayList<Table> tables_list;
	
	public DAOTable() {
		this.tables_list = new ArrayList<Table>();
		this.loadTables();
	}
	
	private void loadTables(){
		this.tables_list.add(new Table(11,551,11));
		this.tables_list.add(new Table(12,551,69));
		this.tables_list.add(new Table(13,551,166));
		this.tables_list.add(new Table(14,551,224));
		this.tables_list.add(new Table(15,551,282));
		this.tables_list.add(new Table(16,551,338));
		this.tables_list.add(new Table(17,551,396));
		this.tables_list.add(new Table(18,494,11));
		this.tables_list.add(new Table(19,494,69));
		this.tables_list.add(new Table(20,494,166));
		this.tables_list.add(new Table(21,494,224));
		this.tables_list.add(new Table(22,494,282));
		this.tables_list.add(new Table(23,494,338));
		this.tables_list.add(new Table(24,494,396));
		this.tables_list.add(new Table(25,437,11));
		this.tables_list.add(new Table(26,437,69));
		this.tables_list.add(new Table(27,437,166));
		this.tables_list.add(new Table(28,437,224));
		this.tables_list.add(new Table(29,437,282));
		this.tables_list.add(new Table(30,437,338));
		this.tables_list.add(new Table(31,437,396));
		this.tables_list.add(new Table(32,363,11));
		this.tables_list.add(new Table(33,363,69));
		this.tables_list.add(new Table(34,303,11));
		this.tables_list.add(new Table(35,303,69));
		this.tables_list.add(new Table(36,241,11));
		this.tables_list.add(new Table(37,246,69));
		this.tables_list.add(new Table(38,187,166));
		this.tables_list.add(new Table(39,187,224));
		this.tables_list.add(new Table(40,187,282));
		this.tables_list.add(new Table(41,127,166));
		this.tables_list.add(new Table(41,127,224));
		this.tables_list.add(new Table(41,127,282));
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
