package co.julianvalencia.gradingstudents;
import java.util.*;

public class GradingStudents {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> grades = new ArrayList<>();
        Collections.addAll(grades, 19, 29, 37, 42, 53, 38);
        
        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
    }
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> res = new ArrayList<>();

        for (Integer value : grades) {
            if (value>=38 ) {
                
                if ( value%5>=3 ) {
                    int adicion = 5 - value%5;
                    value = value + adicion;
                }
            }

            res.add(value);
        }
        return res;
    }
}
