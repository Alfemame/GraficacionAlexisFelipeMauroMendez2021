package Unidad2;

import java.awt.Color;
import java.awt.Point;


public class Circulo extends Figura{
    
    Point punto1;
    Point punto2;
    Color color;
    
    public Circulo(Point p1, Point p2, Color c) {
        this.punto1 = new Point(p1.x, p1.y);
        this.punto2 = new Point(p2.x, p2.y);
        this.color = c;
    }
}
