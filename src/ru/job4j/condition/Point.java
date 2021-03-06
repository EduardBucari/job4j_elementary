package ru.job4j.condition;

// Refactoring OOP

  import static java.lang.Math.sqrt;
  import static java.lang.Math.pow;

public class Point {
    // N1
  //  public static double distance(int x1, int y1, int x2, int y2) {
  //      double rsl = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  //      return Math.sqrt(rsl);
  //  }

   // public static void main(String[] args) {
   //     double result = Point.distance(0, 0, 2, 0);
    //    System.out.println("result from (0, 0) to (2, 0) is " + result);
   // }

    //  N2
    // public double distance(int x1, int y1, int x2, int y2) {
    //   return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    // }

    private int x;   // create Constructor
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

}
