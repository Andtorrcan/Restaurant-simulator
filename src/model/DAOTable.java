package model;

import java.util.ArrayList;

public class DAOTable {

	private ArrayList<Table> tables_list;
	
	public DAOTable() {
		this.tables_list = new ArrayList<Table>();
		this.loadTables();
	}
	
	private void loadTables(){
		this.tables_list.add(new Table(1,471,11));
		this.tables_list.add(new Table(2,471,69));
		this.tables_list.add(new Table(3,471,166));
		this.tables_list.add(new Table(4,471,224));
		this.tables_list.add(new Table(5,471,282));
		this.tables_list.add(new Table(6,471,338));
		this.tables_list.add(new Table(7,471,396));
		this.tables_list.add(new Table(8,414,11));
		this.tables_list.add(new Table(9,414,69));
		this.tables_list.add(new Table(10,414,166));
		this.tables_list.add(new Table(11,414,224));
		this.tables_list.add(new Table(12,414,282));
		this.tables_list.add(new Table(13,414,338));
		this.tables_list.add(new Table(14,414,396));
		this.tables_list.add(new Table(15,357,11));
		this.tables_list.add(new Table(16,357,69));
		this.tables_list.add(new Table(17,357,166));
		this.tables_list.add(new Table(18,357,224));
		this.tables_list.add(new Table(19,357,282));
		this.tables_list.add(new Table(20,357,338));
		this.tables_list.add(new Table(21,357,396));
		this.tables_list.add(new Table(22,283,11));
		this.tables_list.add(new Table(23,283,69));
		this.tables_list.add(new Table(24,223,11));
		this.tables_list.add(new Table(25,223,69));
		this.tables_list.add(new Table(26,161,11));
		this.tables_list.add(new Table(27,166,69));
		this.tables_list.add(new Table(28,107,166));
		this.tables_list.add(new Table(29,107,224));
		this.tables_list.add(new Table(30,107,282));
		this.tables_list.add(new Table(31,47,166));
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
