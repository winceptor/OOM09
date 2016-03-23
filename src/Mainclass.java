public class Mainclass {

    public static void main(String[] args) {
        System.out.println("Creating shapes...");
        System.out.println();
        Circle c1 = new Circle();
        c1.setSize(9);
        Shape s1 = c1;
        
        Line l1 = new Line();
        l1.setLength(3);
        Shape s2 = new BorderDecorator(l1, "blue");
        
        Rectangle r1 = new Rectangle();
        r1.setCorners(8);
        r1.setSize(5);
        
        Shape s3 = new FillDecorator(new BorderDecorator(r1, "green"), "yellow");
        
        
        System.out.println("Drawing shapes...");
        System.out.println();
        s1.draw();
        System.out.println();
        s2.draw();
        System.out.println();
        s3.draw();  
        System.out.println();
        
        System.out.println("Creating complex shape...");
        System.out.println();
        ComplexShape cs = new ComplexShape();
        cs.addShape(s1);
        cs.addShape(s3);
       
        System.out.println("Drawing complex shape...");
        System.out.println();
        cs.draw();
    }
}
