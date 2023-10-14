
package codsoft.task2;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects,count=0,total=0,percentage;
        char grade= 'F';
        System.out.println("***** STUDENTS GRADE CALCULATOR *****");
        System.out.println("");
        System.out.print("Enter the total number of subjects: ");
        subjects=sc.nextInt();
        int[] marks = new int[subjects];
        while (count!=subjects) { 
            System.out.print("Enter the marks obtained in subject no.");
            System.out.println(count+1);
            marks[count]=sc.nextInt();
            while(marks[count]<0 || marks[count]>100){
                System.out.println("***** Marks Not in Range *****");
                System.out.print("Enter the marks obtained in subject no.");
                System.out.println(count+1);
                marks[count]=sc.nextInt();
            }
            total+=marks[count];
            count++;
        }
        percentage=(total/subjects);
        System.out.println("|*|*|*|*|*|*|*|*|*|*|*|");
        System.out.print("Total Marks: ");
        System.out.println(total);
        System.out.print("Average Percentage: ");
        System.out.print(percentage);
        System.out.println("%");
        if (percentage>=90){
            System.out.println("Grade: A");
        }
        else if (percentage>=80){
            System.out.println("Grade: B");
        }
        else if (percentage>=70){
            System.out.println("Grade: C");
        }
        else if (percentage>=90){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}
