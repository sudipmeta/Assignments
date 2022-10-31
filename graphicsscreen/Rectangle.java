public class Rectangle implements Shape{

	private int x;
	private int y;
	private int length;
	private int width;
	private int id;
	ShapeType type = ShapeType.Rectangle;
	
	public Rectangle(int x, int y, int l, int w, int id) {
		this.x = x;
		this.y = y;
		this.length = l;
		this.width = w;
		this.id = id;
	}
	
	/**
	 * For calculating the area of Rectangle.
	 * @return area of Rectangle.
	 */
	@Override
	public double getArea() {
		double area = length * width;
		return area;
	}

	/**
	 * For calculating the perimeter of Rectangle.
	 * @return perimeter of Rectangle.
	 */
	@Override
	public double getPerimeter() {
		double pm = 2 * (length + width);
		return pm;
	}

	/**
	 * For returning the origin of Rectangle.
	 * @return origin of Rectangle.
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
		if(pt.getX() < (x + length) && pt.getX() > x && pt.getY() < (y + width)  && pt.getY() > y)
			return true;
		return false;
	}
	
	/**
	 * For returning the id of Rectangle.
	 * @return id of Rectangle.
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