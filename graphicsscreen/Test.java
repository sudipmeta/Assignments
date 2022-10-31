import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Screen s = new Screen();
		ShapeType type = ShapeType.Square;
		Shape shape;
		Point point = new Point(0,0);
		List<Integer> parameters = new ArrayList<Integer>();
		parameters.add(5);
		int id = 1;
		shape = ShapeFactory.createShape(type, point, parameters, id);
		assertEquals(true, s.addShape(id, shape));
		assertEquals(25, shape.getArea());
		assertEquals(20, shape.getPerimeter());
		assertEquals(1, shape.getID());
		String str = "0,0";
		assertEquals(str, shape.getOrigin());
		assertEquals(type, shape.getType());
		Point p = new Point(1,1);
		assertEquals(true, shape.isPointEnclosed(p));
		assertEquals(true, s.delShape(id));
	}

}
