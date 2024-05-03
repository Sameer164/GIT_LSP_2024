package org.howard.edu.lsp.oopfinal.question3;
import static org.junit.Assert.*;
import org.junit.Test;


public class ShapeFactoryTest {
    @Test
    public void testCircleCreation() {
        Shape circle = ShapeFactory.getShape("Circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }
    
    
    @Test
    public void testRectangleCreation() {
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
    
    @Test
    public void testDefaultShapeCreation() {
        Shape defaultShape = ShapeFactory.getShape("Random");
        assertNotNull(defaultShape);
        assertTrue(defaultShape instanceof Circle);
    }
}
