public class Square implements Shape{

	private int x;
	private int y;
	private int width;
	private int id;
	ShapeType type = ShapeType.Square;
	
	public Square(int x, int y, int w, int id) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.id = id;
	}
	
	/**
	 * For calculating the area of Square.
	 * @return area of Square.
	 */
	@Override
	public double getArea() {
		double area = width * width;
		return area;
	}

	/**
	 * For calculating the perimeter of Square.
	 * @return perimeter of Square.
	 */
	@Override
	public double getPerimeter() {
		double pm = 4 * width;
		return pm;
	}

	/**
	 * For returning the origin of Square.
	 * @return origin of Square.
	 */
	@Override
	public String getOrigin() {
		String origin = Integer.toString(x) + "," + Integer.toString(y);
		return origin;
	}

	/**
	 * To check whether a point is inside the shape.
	 * @param pt object of Point class
	 * @return true if point is inside the shape else false.
	 */
	@Override
	public boolean isPointEnclosed(Point pt) {
		if(pt.getX() < (x + width) && pt.getX() > x && pt.getY() < (y + width)  && pt.getY() > y)
			return true;
		return false;
	}
	
	/**
	 * For returning the id of Square.
	 * @return id of Square.
	 */
	public int getID() {
		return id;
	}

	/**
	 * For returning the type of shape.
	 * @return type of shape.
	 */
	@Override
	public ShapeType getType() {
		return type;
	}

}