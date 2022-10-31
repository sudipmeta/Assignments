enum ShapeType{
	Square,
	Rectangle,
	Circle,
	Triangle;
}

interface Shape{
	 public double getArea();
	 public double getPerimeter();
	 public String getOrigin();
	 public boolean isPointEnclosed(Point pt);
	 public ShapeType getType();
	 public int getID();
}