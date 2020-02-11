package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Util {
	public ArrayList<Integer> order_times_list;
	public ArrayList<Integer> waiting_times_list;
	public ArrayList<Integer> eating_times_list;

	public Util() {
		this.order_times_list = new ArrayList<Integer>();
		this.waiting_times_list = new ArrayList<Integer>();
		this.eating_times_list = new ArrayList<Integer>();
		this.readOrderTimes();
		this.readWaitingTimes();
		this.readEatingTimes();
	}

	private void readOrderTimes() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./src/res/DatosOrdenando.csv"));
			String line = br.readLine();
			while (null != line) {
				this.order_times_list.add(Integer.valueOf(line) *60);
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void readWaitingTimes() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./src/res/DatosEsperando.csv"));
			String line = br.readLine();
			while (null != line) {
				this.waiting_times_list.add(Integer.valueOf(line) *60);
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void readEatingTimes() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./src/res/DatosConsumiendo.csv"));
			String line = br.readLine();
			while (null != line) {
				this.eating_times_list.add(Integer.valueOf(line) *60);
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public int getRandomOrderTime() {
		int index = (int) (Math.random() * 299);
		return this.order_times_list.get(index);
	}
	
	public int getRandomWaitingTime() {
		int index = (int) (Math.random() * 299);
		return this.waiting_times_list.get(index);
	}
	
	public int getRandomEatingTime() {
		int index = (int) (Math.random() * 299);
		return this.eating_times_list.get(index);
	}

	public ArrayList<Integer> getOrder_times_list() {
		return order_times_list;
	}

	public ArrayList<Integer> getWaiting_times_list() {
		return waiting_times_list;
	}

	public ArrayList<Integer> getEating_times_list() {
		return eating_times_list;
	}
}