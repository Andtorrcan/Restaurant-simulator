package controller;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import model.Order;
import model.Person;
import model.Table;

public class ControllerRestaurant {

	public final int QUANTITY_ORDERS = 100;
	private ArrayList<Order> order_list;

	public ControllerRestaurant() {
		this.order_list = new ArrayList<Order>();
		this.loadOrders();
	}

	private void loadOrders() {
		for (int i = 0; i < QUANTITY_ORDERS; i++) {
			this.order_list.add(new Order(new Person(i + 1), 2, 2, 1));
		}
	}
	
	private void startSimulation(){
		ExecutorService executor = Executors.newFixedThreadPool(31);
		 for (int i = 0; i < this.order_list.size(); i++) {
            executor.execute(this.order_list.get(i));
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
