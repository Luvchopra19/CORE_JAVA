package Inheritance;

public class Tringle extends Shape {

	private int base;
	private int height;
	
	public int getBase() {
		return this.base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void getArea() {
		System.out.println("Tringle Area");
	}
}
