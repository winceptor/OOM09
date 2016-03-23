import java.util.ArrayList;

public class ComplexShape implements Shape {

    private ArrayList<Shape> shapes;

    public ComplexShape() {
        shapes = new ArrayList();
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.shapes.size(); i++) {
            this.shapes.get(i).draw();
        }
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }
}
