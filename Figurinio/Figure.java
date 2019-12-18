package Figurinio;

public class Figure {
	public Point[] pts;
	public int points;
	
	Figure(int p){
		this.pts = new Point[p];
		this.points = p;
		for (int i=0; i<p; i++){
			pts[i] = new Point(i);
		}
	}
	
	public void setCoord(int i, double x, double y) throws PointIndexException{
		if (i < points && i >= 0){
			pts[i].setCoords(x, y);
		}
		else{
			throw new PointIndexException(i);
		}
			
	}

}
