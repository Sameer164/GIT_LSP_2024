package org.howard.edu.lsp.oopfinal.question3;

public class ShapeFactory {
    public static Shape getCircle() {
        return new Circle();
    }
    
    public static Shape getRectangle() {
    	return new Rectangle();
    }
    
    public static Shape getShape(String shapeType) {
    	
    	if (shapeType.equals("Circle")) {
    		return getCircle();
    	} else if (shapeType.equals("Rectangle")) {
    		return getRectangle();
    		
    	} else { // We default to a circle
    		return getCircle();
    	}
    }

}
