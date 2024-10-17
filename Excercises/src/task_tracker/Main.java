package task_tracker;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    String option;
    static ArrayList<String>BLOCK = new ArrayList<>();
    static ArrayList<String>BLOCK_2 = new ArrayList<>();
    static ArrayList<String>BLOCK_3 = new ArrayList<>();
    static ArrayList<ArrayList<String>>BLOCK_FINAL = new ArrayList<>();
    public static void main(String[] args) {
        BLOCK.add("COMPLETED");
        BLOCK_FINAL.add(0,BLOCK);
        BLOCK_2.add("INCOMPLETE");
        BLOCK_FINAL.add(1,BLOCK_2);
        BLOCK_3.add("IN-PROGRESS");
        BLOCK_FINAL.add(2,BLOCK_3);


        JOptionPane.showMessageDialog(null, "Welcome to Task Tracker! :)");
        String option= JOptionPane.showInputDialog("Which category?(Completed, Incomplete, In-progress)");
        if (option.equalsIgnoreCase("COMPLETED")){
            DoneTasks complete = new DoneTasks();
            complete.write();
        }
        if (option.equalsIgnoreCase("INCOMPLETE")){
            NotDoneTasks incomplete = new NotDoneTasks();
            incomplete.write();
        }

        if (option.equalsIgnoreCase("In-Progress")){
            InProgress progressed = new InProgress();
            progressed.write();
        }
    }
    void input(){
        option = JOptionPane.showInputDialog("Which category?(Completed, Incomplete, In-progress)");
        if (option.equalsIgnoreCase("COMPLETED")) {
            DoneTasks complete = new DoneTasks();
            complete.write();
        }
        if (option.equalsIgnoreCase("INCOMPLETE")) {
            NotDoneTasks incomplete = new NotDoneTasks();
            incomplete.write();
        }

        if (option.equalsIgnoreCase("In-Progress")) {
            InProgress progressed = new InProgress();
            progressed.write();
            }
    }
}

