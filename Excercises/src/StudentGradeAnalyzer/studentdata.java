package StudentGradeAnalyzer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class studentdata {

    String name;
    int age;
    double CSmarks;
    double Mathsmarks;
    double Engmarks;
    int noOfstudents;
    static ArrayList<ArrayList<ArrayList<String>>> database = new ArrayList<>();
    static int noOfstudentsFinal;
    ArrayList<String> studentNoarray= new ArrayList<>();
    ArrayList<String> stuBio = new ArrayList<>();
    ArrayList<String> grades= new ArrayList<>();
    ArrayList<ArrayList<String>> databaseholder = new ArrayList<>();
    studentdata(int noOfstudents){
        this.noOfstudents=noOfstudents;
        studentNoarray.add(String.valueOf(noOfstudents));
        databaseholder.add(studentNoarray);
        database.add(databaseholder);
    }
    studentdata(String name, int age, double CSmarks, double Mathsmarks, double Engmarks){
        //ArrayList<ArrayList<ArrayList<String>>> database = new ArrayList<>();
        //static database= database
        this.name = name;
        this.age= age;
        this.CSmarks= CSmarks;
        this.Engmarks= Engmarks;
        this.Mathsmarks= Mathsmarks;

        stuBio.add(name);
        stuBio.add(String.valueOf(age));

        grades.add(String.valueOf(CSmarks));
        grades.add(String.valueOf(Mathsmarks));
        grades.add(String.valueOf(Engmarks));

        databaseholder.add(stuBio);
        databaseholder.add(grades);
        database.add(databaseholder);


        }
        void showDB(){
            System.out.println(database);
            System.out.println(database.get(0).get(0).get(0));
            System.out.println(database.indexOf("2"));
        }
        void average(){
        noOfstudentsFinal= Integer.parseInt(String.valueOf(database.get(0)));
        //for ()
        }


}
