package model;

import java.util.Scanner;

public class Point {
    String name;
    int x;
    int y;

    public Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static Point point;

    public static Point makePoint(){
        Scanner sc = new Scanner(System.in);

        String name = "Test tacka";
        System.out.println("Unesite X poziciju Test tacke:");
        int x = sc.nextInt();
        System.out.println("Unesite Y poziciju Test tacke:");
        int y = sc.nextInt();

        point = new Point(name, x, y);
        return point;
    }
}
