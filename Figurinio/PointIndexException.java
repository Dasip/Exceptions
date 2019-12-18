package Figurinio;

public class PointIndexException extends Exception{
	private final int index;
	
	public PointIndexException(int i){
		super("Некорректный индекс точки");
		this.index = i;
	}
	
	public int getIndex(){
		return this.index;
	}

}
