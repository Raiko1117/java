
import java.util.ArrayList;


public class Shape extends Point{
        private ArrayList<Point> points;

        public Shape() {points = new ArrayList<>();}

        public void addPoint(Point j) {
                points.add(j);
        }

        public ArrayList<Point> getPoints(){
                return points;
        }

        public double calculatePerimeter(){
                double perimeter = 0;
                for(int i = 0; i < points.size() - 1;i++)
                        perimeter += points.get(i).distance(points.get(i+1));
                 perimeter += points.get(points.size() - 1).distance(points.get(0));
                 return perimeter;

        }
        public double getLongestSide(){
                double longest = 0;
                double leng;
                for(int i = 0; i < points.size() - 1; i++){
                        leng = points.get(i).distance(points.get(i+1));
                        if(leng > longest) {
                                longest = leng;

                        }
                }
                return longest;


        }
        public double getAverageLength(){
                double average = calculatePerimeter()/points.size();
                return average;

        }

}

