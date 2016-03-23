public class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing circle (size:" + size + ")");
    }

    public Circle() {
        size = 1;
    }

    private int size;

    public void setSize(int s) {
        size = s;
    }
}
