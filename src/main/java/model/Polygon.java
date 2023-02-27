package model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Polygon {
    ArrayList<Point> points;

//    public Polygon() {
//    }

    public Polygon(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public static int poligonPoints;
    public static Polygon polygon;

    public static int[] xEs;
    public static int[] yEs;

    public static Polygon makePolygon() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Point> points = new ArrayList<>();

        System.out.println("Unesite broj tacaka mnogougla");
        poligonPoints = sc.nextInt();
        xEs = new int[poligonPoints];
        yEs = new int[poligonPoints];
        int counter = 1;

        for (int i = 0; i < poligonPoints; i++) {
            String name = String.format("T%s", counter);
            System.out.println("X osa tacke " + counter + ":");
            int x = sc.nextInt();
            xEs[i] = x;
            System.out.println("Y osa tacke " + counter + ":");
            int y = sc.nextInt();
            yEs[i] = y;

            Point point = new Point(name, x, y);
            points.add(point);
            counter++;
        }
        polygon = new Polygon(points);
        System.out.println(polygon);
        return polygon;
    }
}
