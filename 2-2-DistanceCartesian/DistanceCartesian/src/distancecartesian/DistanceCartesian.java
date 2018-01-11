/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancecartesian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Angius
 */
public class DistanceCartesian {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Punkt A - X: ");
        float aX = Float.parseFloat(br.readLine());
        System.out.println("Punkt A - Y: ");
        float aY = Float.parseFloat(br.readLine());
        
        Point pointA = new Point(aX, aY);
        
        System.out.println("Punkt B - X: ");
        float bX = Float.parseFloat(br.readLine());
        System.out.println("Punkt B - Y: ");
        float bY = Float.parseFloat(br.readLine());
        
        Point pointB = new Point(bX, bY);
        
        Vector2D distance = new Vector2D(pointA, pointB);


        System.out.println("Odległość: " + distance.length);

    }  
}

    
class Point
{
    float xCoord = 0;
    float yCoord = 0;
    
    public Point(float x, float y)
    {
        xCoord = x;
        yCoord = y;
    }
}

class Vector2D
{
    Point pointA = new Point(0, 0);
    Point pointB = new Point(0, 0);
    double length = 0;
    
    public Vector2D(Point a, Point b)
    {
        pointA = a;
        pointB = b;
        
        double aBracket = Math.pow(pointA.xCoord - pointB.xCoord, 2);
        double bBracket = Math.pow(pointA.yCoord - pointB.yCoord, 2);
        double root = Math.sqrt(aBracket + bBracket);
        
        length = root;
    }
}
