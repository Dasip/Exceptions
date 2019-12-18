package Figurinio;

public class Point {
	public int index;
	public double x;
	public double y;
	
	Point(int i){
		this.index = i;
	}
	
	Point(int i, double x, double y){
		this.index = i;
		this.x = x;
		this.y = y;
	}
	
	public void setCoords(double x, double y){
		this.x = x;
		this.y = y;
	}

}