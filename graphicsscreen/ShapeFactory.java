import java.util.List;

public class ShapeFactory{
	
	/**
	 * For creating a shape.
	 * @param type of shape to be created
	 * @param Point pt containing coordinates of the origin
	 * @param list of all the parameters
	 * @param Integer id to identify the shape
	 * @return created shape.
	 */
	public static Shape createShape(ShapeType s, Point p, List<Integer> params, int id) {
		Shape shape = null;
		
		switch(s) {
			case Rectangle:
				shape = new Rectangle(p.getX(), p.getY(), params.get(0), params.get(1), id);
				break;
				
			case Square:
				return shape = new Square(p.getX(), p.getY(), params.get(0), id);
				
			case Circle:
				return shape = new Circle(p.getX(), p.getY(), params.get(0), id);
				
			case Triangle:
					return shape = new Triangle(p.getX(), p.getY(), params.get(0), params.get(1), params.get(2), id);
					
			default:
				System.out.println("Invalid input");
		}
		
		return shape;
	}
}