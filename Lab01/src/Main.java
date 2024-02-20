import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

import edu.princeton.cs.algs4.StdArrayIO;

import edu.princeton.cs.algs4.StdDraw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TODO 读取数据
        int N = StdIn.readInt(); //读取整数
        StdOut.println(N); //打印整数

        double M = StdIn.readDouble(); //读取浮点数
        StdOut.println(M);

        int arr [] = StdIn.readAllInts(); //输入数字后回车可以换行，使用command D结束输入
        StdArrayIO.print(arr); //打印数组

        int [][] arr2 = StdArrayIO.readInt2D();
        StdArrayIO.print(arr2);
        //输入：
        //2 4
        //1 2 3 4
        //5 6 7 8

        //TODO 可以尝试在IDE中使用重定向来使用txt文件读入数据


        //TODO StdDraw
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.RED); StdDraw.point(0.0, 0.0); StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.point(1.0, 0.0); StdDraw.setPenColor(StdDraw.BLUE); StdDraw.point(0.0, 1.0);
        StdDraw.line(0.2, 0.2, 0.8, 0.2); StdDraw.rectangle(0.5, 0.5, 0.2, 0.2);
        //图的左下角是原点，x和y与直角坐标一样
        //单位1以窗口来定义，而不是像素

    }
}
