package fundamental.data_abstraction;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;
import java.util.Scanner;

public class prac1_2_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入生成数字：");
        int N = in.nextInt();
        Point2D[] points = new Point2D[N];
        for( int i = 0; i < N; i++)
        {
            points[i] = new Point2D(Math.random(), Math.random());
            StdDraw.setPenRadius(0.01);
            points[i].draw();
        }

        if(N > 1)
        {
            double min = points[0].distanceTo(points[1]);
            for ( int i = 0; i < N-1; i++)
            {
                for (int j = i + 1; j < N; j++) {
                    if (points[i].distanceTo(points[j]) < min)
                        min = points[i].distanceTo(points[j]);
                }
            }
            System.out.println("min distance: " + min);
        }

    }
}
