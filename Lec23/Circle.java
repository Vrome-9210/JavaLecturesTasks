package Lec23;

//public class Circle {
//
//    private final double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getPerimetr() {
//        return 2 * 3.14 * radius;
//    }
//
//    public double getArea() {
//        return 3.14 * radius * radius;
//    }
//}
public class Circle extends Figure {

   public Circle(double radius) {
       super("Circle", new double[]{radius});
   }

    @Override
    protected String getType() {
        return "Круг";
    }

    @Override
   public double getPerimetr() {
       return 2 * 3.14 * sides[0];
   }

   @Override
   public double getArea() {
       return 3.14 * sides[0] * sides[0];
   }


}

