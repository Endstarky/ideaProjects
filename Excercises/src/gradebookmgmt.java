import java.util.Scanner;

public class gradebookmgmt {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);

        System.out.println("How many students do you want to store?");
        int numOfStudents = dat.nextInt();
        dat.nextLine();  // Consume newline

        String[] studentNames = new String[numOfStudents];
        double[][] grades = new double[numOfStudents][3];  // 3 subjects: Maths, Computer, English

        // Input student names and their grades
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Provide student's name: ");
            studentNames[i] = dat.nextLine();

            System.out.println("Give the marks for Maths: ");
            grades[i][0] = dat.nextDouble();

            System.out.println("Give the marks for Computer: ");
            grades[i][1] = dat.nextDouble();

            System.out.println("Give marks for English: ");
            grades[i][2] = dat.nextDouble();
            dat.nextLine();  // Consume newline
        }
        for(int i=0; i<=studentNames.length;i++){
            System.out.println();
            for (int j=0 ; j<=studentNames[i].length(); j++){
                System.out.println(grades[i][j]);
            }
        }

        // Calculate and display average grades, highest, and lowest grades
        double highestGrade = Double.MIN_VALUE;
        double lowestGrade = Double.MAX_VALUE;

        for (int i = 0; i < numOfStudents; i++) {
            double avgGrade = (grades[i][0] + grades[i][1] + grades[i][2]) / 3;
            System.out.println("Average grade for " + studentNames[i] + ": " + avgGrade);

            for (int j = 0; j < 3; j++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                }
                if (grades[i][j] < lowestGrade) {
                    lowestGrade = grades[i][j];
                }
            }
        }

        System.out.println("Highest grade in the class: " + highestGrade);
        System.out.println("Lowest grade in the class: " + lowestGrade);

        // Display list of students who passed (average grade above a certain threshold)
        double passThreshold = 50.0;
        System.out.println("Students who passed (average grade above " + passThreshold + "):");
        for (int i = 0; i < numOfStudents; i++) {
            double avgGrade = (grades[i][0] + grades[i][1] + grades[i][2]) / 3;
            if (avgGrade >= passThreshold) {
                System.out.println(studentNames[i]);
            }
        }

        dat.close();
    }
}
