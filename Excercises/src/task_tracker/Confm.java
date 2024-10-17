package task_tracker;

import javax.swing.*;

public class Confm {
    Main input = new Main();

    void execute(){
       int confirm = JOptionPane.showConfirmDialog(null, "Do you wanna continue adding?");
        if (confirm == JOptionPane.YES_OPTION){
            input.input();
        }
        else if(confirm == JOptionPane.NO_OPTION){
            System.out.println(input.BLOCK_FINAL);
        } else if (confirm==JOptionPane.CANCEL_OPTION) {
            System.out.println(input.BLOCK_FINAL);
        }

    }
}
