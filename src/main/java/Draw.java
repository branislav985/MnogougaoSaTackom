import model.Point;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Draw {

    private static JFrame mainMap;
    public static Point givenPoint  = Point.point;
    public static Boolean is = Inside.is;
    static String name;
    static int[] xParam = model.Polygon.xEs;
    static int[] yParam = model.Polygon.yEs;
    static int poligonPoints = model.Polygon.poligonPoints;
    public static Polygon poly = new java.awt.Polygon(xParam, yParam, poligonPoints);

    public static void initComponents() {
        mainMap = new JFrame();
        mainMap.setResizable(false);
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawPolygon(poly);
                g.setColor(Color.black);
                //Tacku ispitivanja sam skicirao kao liniju sa istim pocetkom i krajem jer nisam znao kako drugacije da ucrtam tacku.
                g.drawLine(givenPoint.getX(), givenPoint.getY(), givenPoint.getX(), givenPoint.getY());
                if(is){
                    name = givenPoint.getName() + " pripada datom mnogouglu";
                }else {
                    name = givenPoint.getName() + " ne pripada datom mnogouglu";
                }
                g.drawString(name, givenPoint.getX()+5, givenPoint.getY()+5);
                g.setColor(Color.red);
                g.drawRect(givenPoint.getX()-10, givenPoint.getY()-10,20, 20);

                model.Polygon po = model.Polygon.polygon;
                for(int i = 0; i < poligonPoints; i++){
                    int x = po.getPoints().get(i).getX();
                    int y = po.getPoints().get(i).getY();
                    String str = po.getPoints().get(i).getName();
                    g.drawString(str, x+5, y+15);
                }
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(800, 800);
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);

    }


}