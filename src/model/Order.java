package model;

public class Order implements Runnable {

	private Person person;
	private Table table;
	private DAOTable dao_table;
	private int order_time;
	private int waiting_time;
	private int eating_time;

	public Order(Person person, DAOTable dao_table,int order_time, int waiting_time, int eating_time) {
		this.person = person;
		this.dao_table = dao_table;
		this.order_time = order_time;
		this.waiting_time = waiting_time;
		this.eating_time = eating_time;
	}

	@Override
	public void run() {
		//Escogee la mesa
		
		
		int id_table = (int) Thread.currentThread().getId();
		this.table = dao_table.searchTableById(id_table);
		System.out.println(id_table);
		this.table.setState(1);
		// Espero el tiempo de tomar mi orden
		try {
			Thread.sleep(this.order_time);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Pongo la mesa en estado de esperado la orden
		this.table.setState(2);
		// Espero el tiempo de tomar mi orden
		try {
			Thread.sleep(this.waiting_time);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Pongo la mesa en estado de comiendo
		this.table.setState(4);
		// Espero el tiempo de comer
		try {
			Thread.sleep(this.eating_time);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.table.setState(0);
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public int getOrder_time() {
		return order_time;
	}

	public void setOrder_time(int order_time) {
		this.order_time = order_time;
	}

	public int getWaiting_time() {
		return waiting_time;
	}

	public void setWaiting_time(int waiting_time) {
		this.waiting_time = waiting_time;
	}

	public int getEating_time() {
		return eating_time;
	}

	public void setEating_time(int eating_time) {
		this.eating_time = eating_time;
	}

	@Override
	public String toString() {
		return "Order [person=" + person + ", table=" + table + ", order_time=" + order_time + ", waiting_time="
				+ waiting_time + ", eating_time=" + eating_time + "]";
	}

}