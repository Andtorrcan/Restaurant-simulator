package model;

import java.util.ArrayList;

import utils.Util;

public class DAOOrder {

	public final int QUANTITY_ORDERS = 100;
	private ArrayList<Order> order_list;
	private DAOTable dao_table;
	private Util util;

	public DAOOrder(DAOTable dao_table, Util util) {
		this.util = util;
		this.dao_table = dao_table;
		this.order_list = new ArrayList<Order>();
		this.loadOrders();
	}

	private void loadOrders() {
		for (int i = 0; i < QUANTITY_ORDERS; i++) {
			this.order_list.add(new Order(new Person(i + 1), dao_table, this.util.getRandomOrderTime(),
					this.util.getRandomWaitingTime(), this.util.getRandomEatingTime()));
		}
	}

	public ArrayList<Order> getOrder_list() {
		return order_list;
	}

	public void setOrder_list(ArrayList<Order> order_list) {
		this.order_list = order_list;
	}

	public DAOTable getDao_table() {
		return dao_table;
	}

	public void setDao_table(DAOTable dao_table) {
		this.dao_table = dao_table;
	}
}