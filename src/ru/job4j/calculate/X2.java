package ru.job4j.calculate;

public class X2 {
   public static int calc(int a, int b, int c, int x) {
       return a * x * x + b * x + c;
   }

    public static int calc1(int a1, int b1, int c1, int x1) {
       return a1 * x1 * x1 + b1 * x1 + c1;
    }

    public static int calc2(int a2, int b2, int c2, int x2) {
       return a2 * x2 * x2 + b2 * x2 + c2;
    }

    public static int calc3(int a3, int b3, int c3, int x3) {
       return a3 * x3 * x3 + b3 * x3 + c3;
    }

    public static int calc4(int a4, int b4, int c4, int x4) {

       return a4 * x4 * x4 + b4 * x4 + c4;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);

        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int rsl1 = X2.calc1(a1, b1, c1, x1);
        System.out.println(rsl1);

        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int rsl2 = X2.calc2(a2, b2, c2, x2);
        System.out.println(rsl2);

        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int rsl3 = X2.calc3(a3, b3, c3, x3);
        System.out.println(rsl3);

        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;
        int rsl4 = X2.calc4(a4, b4, c4, x4);
        System.out.println(rsl4);

    }
}
  // 0 =     40;   public void whenA10B0C0X2Then40()
  // 1 =      3;   public void whenA1B1C1X1Then3()
  // 2 =      2;   public void whenA0B1C1X1Then2()
  // 3 =      2;   public void whenA1B1C0X1Then2()
  // 4 =      1;   public void whenA1B1C1X0Then1()