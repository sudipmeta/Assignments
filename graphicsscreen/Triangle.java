public class Triangle implements Shape{

	private int x;
	private int y;
	private int length1;
	private int length2;
	private int length3;
	private int id;
	ShapeType type = ShapeType.Triangle;
	
	public Triangle(int x, int y, int l1, int l2, int l3, int id) {
		this.x = x;
		this.y = y;
		this.length1 = l1;
		this.length2 = l2;
		this.length3 = l3;
		this.id = id;
	}
	
	/**
	 * For calculating the area of Triangle.
	 * @return area of Triangle.
	 */
	@Override
	public double getArea() {
		double s = getPerimeter()/2;
		double temp = s * (s - length1) * (s - length2) * (s - length2);
		double area = Math.sqrt(temp);
		return area;
	}

	/**
	 * For calculating the perimeter of Triangle.
	 * @return perimeter of Triangle.
	 */
	@Override
	public double getPerimeter() {
		double pm = length1 + length2 + length3;
		return pm;
	}

	/**
	 * For returning the origin of Triangle.
	 * @return origin of Triangle.
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
		if(pt.getX() > this.x && pt.getY() > this.y && pt.getX() < this.x + length1) {
			return true;
		}
		return false;
	}
	
	/**
	 * For returning the id of Triangle.
	 * @return id of Triangle.
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