package model;

public class Table {

	private int id;
	private int state;
	private int x_coordinate;
	private int y_coordinate;
	
	public Table(int id,int x_coordinate, int y_coordinate) {
		this.id = id;
		this.state = 0;
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int isState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getX_coordinate() {
		return x_coordinate;
	}

	public void setX_coordinate(int x_coordinate) {
		this.x_coordinate = x_coordinate;
	}

	public int getY_coordinate() {
		return y_coordinate;
	}

	public void setY_coordinate(int y_coordinate) {
		this.y_coordinate = y_coordinate;
	}

	@Override
	public String toString() {
		return "Table [id=" + id + ", state=" + state + "]";
	}
}