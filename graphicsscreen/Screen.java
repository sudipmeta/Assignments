import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Screen{
	
	private Map<Integer, Shape> shapes = new HashMap<Integer, Shape>();
	private Map<Shape, String> shapesWithTime = new HashMap<Shape, String>();
	
	/**
	 * For adding a shape to the screen.
	 * @param Integer id to identify the object
	 * @param Shape to add to screen
	 * @return true if successfully added.
	 */
	public boolean addShape(int id, Shape s) {
		if(shapes.containsKey(id)) {
			throw new AssertionError("ID already exists");
		}

		shapes.put(id, s);
		shapesWithTime.put(s, LocalDateTime.now().toString());
		return true;
	}
	
	/**
	 * For deleting a shape from the screen.
	 * @param Integer id to identify the object
	 * @return true if successfully deleted.
	 */
	public boolean delShape(int id) {
		if(shapes.containsKey(id)) {
			shapesWithTime.remove(shapes.get(id));
			shapes.remove(id);
			return true;
		}
		return false;
	}
	
	/**
	 * For returning all the shapes on the screen.
	 * @return all the shapes on the screen.
	 */
	public Map<Integer, Shape> returnShapes() {
		return shapes;
	}
	
	/**
	 * For returning all the shapes on the screen with time stamp.
	 * @return all the shapes on the screen with time stamp.
	 */
	public Map<Shape, String> returnShapesWithTime() {
		return shapesWithTime;
	}
	
	/**
	 * For deleting a specific type of shape from the screen.
	 * @param type of shape to be deleted
	 * @return true if successfully deleted.
	 */
	public boolean delSpecificTypeOfShape(ShapeType type1) {
		if(!shapes.isEmpty()) {
			List<Integer> toRemove = new ArrayList<Integer>();
			for (Integer key : shapes.keySet()) {
				
	            Shape value = null;
	            value = shapes.get(key);
	            if (value.getType() == (type1)) {
	            	toRemove.add(key);
	            }
	        }
			
			for(int index : toRemove) {
				shapesWithTime.remove(shapes.get(index));
				shapes.remove(index);
			}
			
			return true;
		}
		return false;
	}
	
	/**
	 * For returning all the shapes on the screen in a sorted order according to their area.
	 * @return all the shapes on the screen in a sorted order according to their area.
	 */
	public List<Shape> getSortedShapes() {
		List<Shape> sortedShapes = new ArrayList<Shape>();
		
		for(Shape s : shapes.values()) {
			sortedShapes.add(s);
		}
		
		  for (int i = 0; i < sortedShapes.size() - 1; i++) {
		        for (int j = 0; j < sortedShapes.size() - i - 1; j++) {
		            if (sortedShapes.get(j).getArea() > sortedShapes.get(j+1).getArea()) {
		            	Shape temp1 = sortedShapes.get(j);
		            	Shape temp2 = sortedShapes.get(j+1);
		            	sortedShapes.set(j, temp2);
		            	sortedShapes.set(j+1, temp1);
		            }
		        }
	}
		
		return sortedShapes;
	}
	
	/**
	 * For returning all the shapes on the screen enclosing the point.
	 * @param Point pt containing coordinates of the point to be checked
	 * @return all the shapes on the screen enclosing the point.
	 */
	public List<Shape> isEnclosing(Point pt) {
		List<Shape> enclosingShapes = new ArrayList<Shape>();
		
		for(Shape s : shapes.values()) {
			if(s.isPointEnclosed(pt)) {
				enclosingShapes.add(s);
			}
		}
		
		return enclosingShapes;
	}
}