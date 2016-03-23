public class Line implements Shape {

    public void draw() {
        System.out.println("Drawing line (length:" + length + ")");
    }

    public Line() {
        length = 1;
    }

    private int length;

    public void setLength(int l) {
        length = l;
    }
}
