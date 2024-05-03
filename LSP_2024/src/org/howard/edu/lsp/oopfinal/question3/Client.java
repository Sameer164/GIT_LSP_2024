package org.howard.edu.lsp.oopfinal.question3;

public class Client {
	public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("Rectangle");
        shape2.draw();
    }

}
