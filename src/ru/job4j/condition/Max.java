package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max3(int first, int second, int third) {
        int temp =  first > second ? first : second;
        int max = temp > third ? temp : third;
        return max;
    }

    public static int max4(int first, int second, int third, int fourth) {
        int temp = first > second ? first : second;
        int temp2 = third > fourth ? third : fourth;
        int max = temp > temp2 ? temp : temp2;
        return max;
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2);
        int msg3 = Max.max3(1, 2, 3);
        int msg4 = Max.max4(1, 2, 3, 4);

            System.out.println(msg);
            System.out.println(msg3);
            System.out.println(msg4);
    }
}
