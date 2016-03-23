public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Drawing rectangle (corners:" + corners + " size:" + size + ")");
    }

    public Rectangle() {
        corners = 4;
        size = 1;
    }

    private int corners;

    private int size;

    public void setSize(int s) {
        size = s;
    }

    public void setCorners(int c) {
        corners = c;
    }
}
