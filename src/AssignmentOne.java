
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class AssignmentOne{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("C:\\Users\\Raiymbek\\IdeaProjects\\Test 1\\src\\file1.txt"));
        Scanner scanner2 = new Scanner(new File("C:\\Users\\Raiymbek\\IdeaProjects\\Test 1\\src\\file2.txt") );
        double x,y;
        Shape shape1 = new Shape();
        Shape shape2 = new Shape();
        while(scanner1.hasNextLine()){
            x = scanner1.nextDouble();
            y = scanner1.nextDouble();
            shape1.addPoint(new Point(x, y));
        }
        while(scanner2.hasNextLine()){
            x = scanner2.nextDouble();
            y = scanner2.nextDouble();
            shape2.addPoint(new Point(x,y));

        }
        System.out.println(shape1.calculatePerimeter());
        System.out.println(shape1.getLongestSide());
        System.out.println(shape1.getAverageLength());
        System.out.println("//////////////////////////");
        System.out.println(shape2.calculatePerimeter());
        System.out.println(shape2.getLongestSide());
        System.out.println(shape2.getAverageLength());



    }
}