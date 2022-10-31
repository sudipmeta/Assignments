public class Circle implements Shape{

	private int x;
	private int y;
	private int radius;
	private int id;
	ShapeType type = ShapeType.Circle;
	
	public Circle(int x, int y, int r, int id) {
		this.x = x;
		this.y = y;
		this.radius = r;
		this.id = id;
	}
	
	/**
	 * For calculating the area of Circle.
	 * @return area of Circle.
	 */
	@Override
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	/**
	 * For calculating the perimeter of Circle.
	 * @return perimeter of Circle.
	 */
	@Override
	public double getPerimeter() {
		double pm = 2 * Math.PI * radius;
		return pm;
	}

	/**
	 * For returning the origin of Circle.
	 * @return origin of Circle.
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
		if((pt.getX() - this.x) * (pt.getX() - this.x) + (pt.getY() - this.y) * (pt.getY() - this.y) < (radius * radius))
			return true;
		return false;
	}
	
	/**
	 * For returning the id of Circle.
	 * @return id of Circle.
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