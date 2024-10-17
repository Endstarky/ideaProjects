package StudentGradeAnalyzer;

import java.util.Scanner;

public class Main {
    /*
        Topics: 2D arrays, arrays, methods, for-each loop, OOPs, constructors

Create a Student class with fields for the student's name and an array of grades.
Implement a constructor that initializes the student's name and grades.
Write methods to calculate the average grade, find the highest and lowest grades, and determine if the student has passed (with an average grade above a certain threshold).
Use a 2D array or an ArrayList to store multiple Student objects.
Use a for-each loop to iterate over the students and display their names and average grades.*/
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("For how many students do you wanna store the data of?");
        int getint= input.nextInt();
        studentdata getIntinput = new studentdata(getint);

        for (int i =1; i<=getint; i++){
            System.out.println("What is the name of the student"+i+"?");
            String name = input.next();
            System.out.println("What is the age of student"+i+"?");
            int age = input.nextInt();
            System.out.println("What is the grade at computer science?");
            int CSmarks = input.nextInt();
            System.out.println("What is the grade at English?");
            int Engmarks = input.nextInt();
            System.out.println("What is the grade at Maths?");
            int Mathsmarks = input.nextInt();
            studentdata StInuput = new studentdata(name,age,CSmarks,Mathsmarks,Engmarks);

        }

        System.out.println(studentdata.database.get(0).get(0).get(0));



    }
}
