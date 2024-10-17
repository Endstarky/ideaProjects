package task_tracker;

import javax.swing.*;

public class DoneTasks extends Main {
    int count =0;
    void write(){
        count = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to write?"));
        for (int i=0 ; count>i;i++){
            String task = JOptionPane.showInputDialog("Task "+(i+1)+": ");
             BLOCK.add(task);
        }
        Confm execute = new Confm();
        execute.execute();
    }
}
