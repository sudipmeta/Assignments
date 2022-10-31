import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int x,y,id,length,width,radius, side1,side2,side3;
		ShapeType type;
		Shape shape;
		Point point;
		List<Integer> parameters = new ArrayList<>();
		Screen s = new Screen();
		while(true) {
			
			shape = null;
			System.out.println("Enter 1 to add a shape to the screen.");
			System.out.println("Enter 2 to delete a shape the screen.");
			System.out.println("Enter 3 to delete all shapes of a specific type the screen.");
			System.out.println("Enter 4 to show all shapes on the screen.");
			System.out.println("Enter 5 to show all shapes with time stamp on the screen.");
			System.out.println("Enter 6 to return the shapes on the screen sorted in desired ascending order based on area, perimeter, timestamp or origin distance.");
			System.out.println("Enter 7 to return the list of shape objects enclosing a specified point.");
			System.out.println("Enter 8 to Exit.");
			
			int n;
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			parameters.clear();
			
			switch(n) {
				case 1:
					int addChoice;
					System.out.println("Enter 1 for Rectangle");
					System.out.println("Enter 2 for Square");
					System.out.println("Enter 3 for Triangle");
					System.out.println("Enter 4 for Circle");
					addChoice = sc.nextInt();
					switch(addChoice) {
						case 1:
							System.out.println("Enter X Coordinate: ");
							x = sc.nextInt();
							System.out.println("Enter Y Coordinate: ");
							y = sc.nextInt();
							point = new Point(x,y);
							System.out.println("Enter Length of the Rectangle: ");
							length = sc.nextInt();
							System.out.println("Enter Width of the Rectangle: ");
							width = sc.nextInt();
							parameters.add(length);
							parameters.add(width);
							System.out.println("Enter ID of the shape: ");
							id = sc.nextInt();
							
							type = ShapeType.Rectangle;
							shape = ShapeFactory.createShape(type, point, parameters, id);
							if(s.addShape(id, shape)) {
								System.out.println("\nSuccessfully Added\n");
							}
							break;
							
						case 2:
							System.out.println("Enter X Coordinate: ");
							x = sc.nextInt();
							System.out.println("Enter Y Coordinate: ");
							y = sc.nextInt();
							point = new Point(x,y);
							System.out.println("Enter Width of the Square: ");
							width = sc.nextInt();
							parameters.add(width);
							System.out.println("Enter ID of the shape: ");
							id = sc.nextInt();
							
							type = ShapeType.Square;
							shape = ShapeFactory.createShape(type, point, parameters, id);
							if(s.addShape(id, shape)) {
								System.out.println("\nSuccessfully Added\n");
							}
							break;
						
						case 3:
							System.out.println("Enter X Coordinate: ");
							x = sc.nextInt();
							System.out.println("Enter Y Coordinate: ");
							y = sc.nextInt();
							point = new Point(x,y);
							System.out.println("Enter Length of Side 1: ");
							side1 = sc.nextInt();
							System.out.println("Enter Length of Side 2: ");
							side2 = sc.nextInt();
							System.out.println("Enter Length of Side 3: ");
							side3 = sc.nextInt();
							parameters.add(side1);
							parameters.add(side2);
							parameters.add(side3);
							System.out.println("Enter ID of the shape: ");
							id = sc.nextInt();
							
							type = ShapeType.Triangle;
							shape = ShapeFactory.createShape(type, point, parameters, id);
							if(s.addShape(id, shape)) {
								System.out.println("\nSuccessfully Added\n");
							}
							break;	
						
						case 4:
							System.out.println("Enter X Coordinate: ");
							x = sc.nextInt();
							System.out.println("Enter Y Coordinate: ");
							y = sc.nextInt();
							point = new Point(x,y);
							System.out.println("Enter Radius of the Circle: ");
							radius = sc.nextInt();
							parameters.add(radius);
							System.out.println("Enter ID of the shape: ");
							id = sc.nextInt();
							
							type = ShapeType.Circle;
							shape = ShapeFactory.createShape(type, point, parameters, id);
							if(s.addShape(id, shape)) {
								System.out.println("\nSuccessfully Added\n");
							}
							break;
							
						default:
							System.out.println("Invalid input\n");
					}
					break;
				
				case 2:
					int delId;
					System.out.println("Enter ID of shape to be deleted: ");
					delId = sc.nextInt();
					if(s.delShape(delId)) {
						System.out.println("\nSuccessfully Deleted\n");
					} 
					else {
						System.out.println("\nDeletion Failed\n");
					}
					break;
					
				case 3:
					ShapeType type1 = null;
					int delChoice;
					System.out.println("Enter 1 to delete all Rectangles");
					System.out.println("Enter 2 to delete all Squares");
					System.out.println("Enter 3 to delete all Triangles");
					System.out.println("Enter 4 to delete all Circles");
					delChoice = sc.nextInt();
					switch(delChoice) {
						case 1:
							type1 = ShapeType.Rectangle;
							s.delSpecificTypeOfShape(type1);
							System.out.println("\nSuccessfully Deleted\n");
							break;
							
						case 2:
							type1 = ShapeType.Square;
							s.delSpecificTypeOfShape(type1);
							System.out.println("\nSuccessfully Deleted\n");
							break;
							
						case 3:
							type1 = ShapeType.Triangle;
							s.delSpecificTypeOfShape(type1);
							System.out.println("\nSuccessfully Deleted\n");
							break;
							
						case 4:
							type1 = ShapeType.Circle;
							s.delSpecificTypeOfShape(type1);
							System.out.println("\nSuccessfully Deleted\n");
							break;
							
						default:
							System.out.println("Invalid input");
							break;
					}
					break;
					
				case 4:
					System.out.println("All Shapes on the Screen: \n");
					Map<Integer, Shape> showShapes = s.returnShapes();
					showShapes.forEach((_id, shapes) -> System.out.println("\nID: " + _id +
																				"\nType: " + shapes.getType() + "\n"));
					System.out.println();
					break;
					
				case 5:
					System.out.println("All Shapes on the Screen with time stamp: \n");
					Map<Shape, String> showTimeShapes = s.returnShapesWithTime();
					showTimeShapes.forEach((shapes, time) -> System.out.println("\nID: " + shapes.getID() +
																				"\nTime: " + time +
																				"\nType: " + shapes.getType() + "\n"));
					System.out.println();
					break;
					
				case 6:
					List<Shape> sorted = s.getSortedShapes();
					System.out.println("\nSorted Shapes: \n");
					for(int i = 0; i < sorted.size(); i++) {
						System.out.println("Area: " + sorted.get(i).getArea());
						System.out.println("ID: " + sorted.get(i).getID());
						System.out.println("Type: " + sorted.get(i).getType());
					}
					System.out.println();
					sorted.clear();
					break;
					
				case 7:
					int enclosingX, enclosingY;
					System.out.println("Enter X coordinate");
					enclosingX = sc.nextInt();
					System.out.println("Enter Y coordinate");
					enclosingY = sc.nextInt();
					Point enclosingPoint = new Point(enclosingX, enclosingY);
					List<Shape> enclosed = s.isEnclosing(enclosingPoint);
					if(enclosed.size()>0) {
						System.out.println("\nFollowing Shapes enclose the point: \n");
					}
					else {
						System.out.println("\nNo Shapes enclose the point\n");
					}
					for(int i = 0; i < enclosed.size(); i++) {
						System.out.println("ID: " + enclosed.get(i).getID());
						System.out.println("Type: " + enclosed.get(i).getType());
					}
					System.out.println();
					break;
				
				case 8:
					return;
					
				default:
					System.out.println("Invalid input");
					break;
			}
		}
	}
}