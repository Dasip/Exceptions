package Figurinio;

public class Mainn {

	public static void main(String[] args) {
		Figure triangle = new Figure(3);
		try{
			triangle.setCoord(0, 10, 10);
			triangle.setCoord(1, 0, 10);
			triangle.setCoord(2, 10, 0);
			triangle.setCoord(3, 12, 12);
		}
		catch (PointIndexException e){
			System.out.println(e.toString());
		}

	}

}