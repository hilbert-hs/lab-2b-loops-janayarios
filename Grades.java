import java.util.Scanner;

  public class Grades {

  public static void main(String[] args) {
    //  write your code here
    Scanner scan = new Scanner(System.in);
    System.out.println("How many grades do you have?");
    int numGrades = scan.nextInt();
    double gradeAvg = 0;

    for (int i = 0; i < numGrades; i++) {

      System.out.println("Type in your grade");
      double grade = scan.nextDouble();
      gradeAvg = gradeAvg + grade;

    }

    System.out.println((double) gradeAvg / (double) numGrades);
    
  } 
}

// write any helper methods here
