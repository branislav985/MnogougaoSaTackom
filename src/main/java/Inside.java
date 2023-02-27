import model.Point;
import model.Polygon;

public class Inside {

    static Point[] points = new Point[Polygon.polygon.getPoints().size()];
    static Point test = Point.point;
    static int counter = 1;
    public static boolean is = false;

    public static void Inside() {
        for(int i = 0; i<Polygon.polygon.getPoints().size(); i++){
            points[i] = Polygon.polygon.getPoints().get(i);
            System.out.println("Naziv " + "tacke " + counter + " je: " + Polygon.polygon.getPoints().get(i).getName());
            System.out.println("Pozicija " + "tacke " + counter + " je: x=" + Polygon.polygon.getPoints().get(i).getX() + "/y=" + Polygon.polygon.getPoints().get(i).getY());
            counter++;
        }

        int i;
        int j;
        boolean result = false;
        for (i = 0, j = points.length - 1; i < points.length; j = i++) {
            if ((points[i].getY() > test.getY()) != (points[j].getY() > test.getY()) &&
                    (test.getX() < (points[j].getX() - points[i].getX()) * (test.getY() - points[i].getY()) / (points[j].getY()-points[i].getY()) + points[i].getX())) {
                result = !result;
            }
        }
        if(result) {
            System.out.println("Data Tacka pripada kreiranom mnogouglu");
            is = true;
        }else {
            System.out.println("Data tacka ne pripada kreiranom mnogouglu");
            is = false;
        }
    }

}
