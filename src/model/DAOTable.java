package model;

import java.util.ArrayList;

public class DAOTable {

	private ArrayList<Table> tables_list;
	
	public DAOTable() {
		this.tables_list = new ArrayList<Table>();
		this.loadTables();
	}
	
	private void loadTables(){
		this.tables_list.add(new Table(1,551,11));
		this.tables_list.add(new Table(2,551,69));
		this.tables_list.add(new Table(3,551,166));
		this.tables_list.add(new Table(4,551,224));
		this.tables_list.add(new Table(5,551,282));
		this.tables_list.add(new Table(6,551,338));
		this.tables_list.add(new Table(7,551,396));
		this.tables_list.add(new Table(8,494,11));
		this.tables_list.add(new Table(9,494,69));
		this.tables_list.add(new Table(10,494,166));
		this.tables_list.add(new Table(11,494,224));
		this.tables_list.add(new Table(12,494,282));
		this.tables_list.add(new Table(13,494,338));
		this.tables_list.add(new Table(14,494,396));
		this.tables_list.add(new Table(15,437,11));
		this.tables_list.add(new Table(16,437,69));
		this.tables_list.add(new Table(17,437,166));
		this.tables_list.add(new Table(18,437,224));
		this.tables_list.add(new Table(19,437,282));
		this.tables_list.add(new Table(20,437,338));
		this.tables_list.add(new Table(21,437,396));
		this.tables_list.add(new Table(22,363,11));
		this.tables_list.add(new Table(23,363,69));
		this.tables_list.add(new Table(24,303,11));
		this.tables_list.add(new Table(25,303,69));
		this.tables_list.add(new Table(26,241,11));
		this.tables_list.add(new Table(27,246,69));
		this.tables_list.add(new Table(28,187,166));
		this.tables_list.add(new Table(29,187,224));
		this.tables_list.add(new Table(30,187,282));
		this.tables_list.add(new Table(31,127,166));
	}
	
	public Table searchTableById(int id) {
		for (int i = 0; i < this.tables_list.size(); i++) {
			if(this.tables_list.get(i).getId() == id) {
				return this.tables_list.get(i);
			}
		}
		return null;
	}
	
	public Table searchTableAvaiable() {
		for (int i = 0; i < this.tables_list.size(); i++) {
			if(this.tables_list.get(i).isState() == 0) {
				return this.tables_list.get(i);
			}
		}
		return null;
	}

	public ArrayList<Table> getTables_list() {
		return tables_list;
	}
}
