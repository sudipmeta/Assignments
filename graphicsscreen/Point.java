public class Point{
	private int x;
	private int y;
	
	private final int xmax = 1000;
	private final int ymax = 1000;
	
	public Point(int xCoOrd, int yCoOrd) {
		x = xCoOrd;
		y = yCoOrd;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getXMax() {
		return xmax;
	}
	
	public int getYMax() {
		return ymax;
	}
}