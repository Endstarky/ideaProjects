import javax.swing.*;
import java.awt.*;

public class finance_tracker {
    public static void main(String[] args) {
        /*Personal Finance Tracker
Write a program to track personal expenses. The program should:

Use a 2D array to store expenses for different categories (e.g., Food, Transportation, Entertainment) over multiple months.
Allow the user to input expenses for each category and month.
Calculate the total and average expenses for each category.
Find the category with the highest and lowest expenses.
Use a while loop to continuously accept user input until they choose to exit.
        */
        String[][] food = {
                {"January", ""},
                {"February", ""},
                {"March", ""},
                {"April", ""},
                {"May", ""},
                {"June", ""},
                {"July", ""},
                {"August", ""},
                {"September", ""},
                {"October", ""},
                {"November", ""},
                {"December", ""}
        };
        String[][] transportation = {
                {"January", ""},
                {"February", ""},
                {"March", ""},
                {"April", ""},
                {"May", ""},
                {"June", ""},
                {"July", ""},
                {"August", ""},
                {"September", ""},
                {"October", ""},
                {"November", ""},
                {"December", ""}
        };
        String[][] entertainment = {
                {"January", ""},
                {"February", ""},
                {"March", ""},
                {"April", ""},
                {"May", ""},
                {"June", ""},
                {"July", ""},
                {"August", ""},
                {"September", ""},
                {"October", ""},
                {"November", ""},
                {"December", ""}
        };
        String category = JOptionPane.showInputDialog("Give the category name(food,entertainment,transportation)");
        if (category.equalsIgnoreCase("food")) {
            String consecutive = JOptionPane.showInputDialog("Do you want to input expenditures in consecutive months?(yes/no)");
            if (consecutive.equalsIgnoreCase("yes")) {
                for (int i = 0; i <= 11; i++) {
                    int temp = i + 1;
                    double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure for month " + temp + ": "));
                    food[i][1] = String.valueOf(amount);
                }
                String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the food category?(reply in yes/no)");
                if (calc.equalsIgnoreCase("yes")) {
                    double totalValue = 0;
                    for (int i = 0; i <= 11; i++) {
                        totalValue = Double.parseDouble(food[i][1]) + totalValue;
                    }
                    double average = totalValue / 12;
                    JOptionPane.showMessageDialog(null, "The total and average of the Food category is " + totalValue + " &" + average);
                }
            }
            if (consecutive.equalsIgnoreCase("no")) {
                int month_id = Integer.parseInt(JOptionPane.showInputDialog("Give the required month number: "));
                if (month_id > 0) {
                    double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure: "));
                    food[month_id - 1][1] = String.valueOf(amount);
                    String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the food category?(reply in yes/no)");
                    if (calc.equalsIgnoreCase("yes")) {
                        JOptionPane.showMessageDialog(null, "The total and average of the Food category is " + amount);
                    }
                }
            }
        }
 int categoryConfirmation = (JOptionPane.showConfirmDialog(null, "Do you want to continue to input other category expenditure? "));
        System.out.println(categoryConfirmation);
        if (categoryConfirmation== JOptionPane.YES_OPTION) {
            String category2 = JOptionPane.showInputDialog("Give the category name(food,entertainment,transportation)");
            if (category2.equalsIgnoreCase("transportation")) {
                String consecutive = JOptionPane.showInputDialog("Do you want to input expenditures in consecutive months?(yes/no)");
                if (consecutive.equalsIgnoreCase("yes")) {
                    for (int i = 0; i <= 11; i++) {
                        int temp = i + 1;
                        double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure for month " + temp + ": "));
                        transportation[i][1] = String.valueOf(amount);
                    }
                    String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the transportation category?(reply in yes/no)");
                    if (calc.equalsIgnoreCase("yes")) {
                        double totalValue = 0;
                        for (int i = 0; i <= 11; i++) {
                            totalValue = Double.parseDouble(transportation[i][1]) + totalValue;
                        }
                        double average = totalValue / 12;
                        JOptionPane.showMessageDialog(null, "The total and average of the transportation category is " + totalValue + " &" + average);
                    }
                }
                if (consecutive.equalsIgnoreCase("no")) {
                    int month_id = Integer.parseInt(JOptionPane.showInputDialog("Give the required month number: "));
                    if (month_id > 0) {
                        double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure: "));
                        transportation[month_id - 1][1] = String.valueOf(amount);
                        String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the transportation category?(reply in yes/no)");
                        if (calc.equalsIgnoreCase("yes")) {
                            JOptionPane.showMessageDialog(null, "The Average and total expenses of the category is " + amount);
                        }
                    }
                }

            }
            if (category2.equalsIgnoreCase("food")) {
                String consecutive = JOptionPane.showInputDialog("Do you want to input expenditures in consecutive months?(yes/no)");
                if (consecutive.equalsIgnoreCase("yes")) {
                    for (int i = 0; i <= 11; i++) {
                        int temp = i + 1;
                        double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure for month " + temp + ": "));
                        food[i][1] = String.valueOf(amount);
                    }
                    String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the food category?(reply in yes/no)");
                    if (calc.equalsIgnoreCase("yes")) {
                        double totalValue = 0;
                        for (int i = 0; i <= 11; i++) {
                            totalValue = Double.parseDouble(food[i][1]) + totalValue;
                        }
                        double average = totalValue / 12;
                        JOptionPane.showMessageDialog(null, "The total and average of the Food category is " + totalValue + " &" + average);
                    }
                }
                if (consecutive.equalsIgnoreCase("no")) {
                    int month_id = Integer.parseInt(JOptionPane.showInputDialog("Give the required month number: "));
                    if (month_id > 0) {
                        double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure: "));
                        food[month_id - 1][1] = String.valueOf(amount);
                        String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the food category?(reply in yes/no)");
                        if (calc.equalsIgnoreCase("yes")) {
                            JOptionPane.showMessageDialog(null, "The total and average of the Food category is " + amount);
                        }
                    }
                }
            }
            if (category2.equalsIgnoreCase("entertainment")) {
                String consecutive = JOptionPane.showInputDialog("Do you want to input expenditures in consecutive months?(yes/no)");
                if (consecutive.equalsIgnoreCase("yes")) {
                    for (int i = 0; i <= 11; i++) {
                        int temp = i + 1;
                        double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure for month " + temp + ": "));
                        entertainment[i][1] = String.valueOf(amount);
                    }
                    String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the entertainment category?(reply in yes/no)");
                    if (calc.equalsIgnoreCase("yes")) {
                        double totalValue = 0;
                        for (int i = 0; i <= 11; i++) {
                            totalValue = Double.parseDouble(entertainment[i][1]) + totalValue;
                        }
                        double average = totalValue / 12;
                        JOptionPane.showMessageDialog(null, "The total and average of the entertainment category is " + totalValue + " &" + average);
                    }
                }
                if (consecutive.equalsIgnoreCase("no")) {
                    int month_id = Integer.parseInt(JOptionPane.showInputDialog("Give the required month number: "));
                    if (month_id > 0) {
                        double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure: "));
                        entertainment[month_id - 1][1] = String.valueOf(amount);
                        String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the entertainment category?(reply in yes/no)");
                        if (calc.equalsIgnoreCase("yes")) {
                            JOptionPane.showMessageDialog(null, "The Average and total expenses of the category is " + amount);

                        }
                    }
                }
            }
        }
        if (categoryConfirmation==JOptionPane.YES_OPTION) {
            int categoryConfirmation2 =JOptionPane.showConfirmDialog(null, "Do you want to continue to input other category expenditure? ");
            if (categoryConfirmation2==JOptionPane.OK_OPTION) {
                String category3 = JOptionPane.showInputDialog("Give the category name(food,entertainment,transportation)");
                if (category3.equalsIgnoreCase("transportation")) {
                    String consecutive = JOptionPane.showInputDialog("Do you want to input expenditures in consecutive months?(yes/no)");
                    if (consecutive.equalsIgnoreCase("yes")) {
                        for (int i = 0; i <= 11; i++) {
                            int temp = i + 1;
                            double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure for month " + temp + ": "));
                            transportation[i][1] = String.valueOf(amount);
                        }
                        String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the transportation category?(reply in yes/no)");
                        if (calc.equalsIgnoreCase("yes")) {
                            double totalValue = 0;
                            for (int i = 0; i <= 11; i++) {
                                totalValue = Double.parseDouble(transportation[i][1]) + totalValue;
                            }
                            double average = totalValue / 12;
                            JOptionPane.showMessageDialog(null, "The total and average of the transportation category is " + totalValue + " &" + average);
                        }
                    }
                    if (consecutive.equalsIgnoreCase("no")) {
                        int month_id = Integer.parseInt(JOptionPane.showInputDialog("Give the required month number: "));
                        if (month_id > 0) {
                            double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure: "));
                            transportation[month_id - 1][1] = String.valueOf(amount);
                            String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the transportation category?(reply in yes/no)");
                            if (calc.equalsIgnoreCase("yes")) {
                                JOptionPane.showMessageDialog(null, "The Average and total expenses of the category is " + amount);
                            }
                        }
                    }

                }
                if (category3.equalsIgnoreCase("food")) {
                    String consecutive = JOptionPane.showInputDialog("Do you want to input expenditures in consecutive months?(yes/no)");
                    if (consecutive.equalsIgnoreCase("yes")) {
                        for (int i = 0; i <= 11; i++) {
                            int temp = i + 1;
                            double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure for month " + temp + ": "));
                            food[i][1] = String.valueOf(amount);
                        }
                        String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the food category?(reply in yes/no)");
                        if (calc.equalsIgnoreCase("yes")) {
                            double totalValue = 0;
                            for (int i = 0; i <= 11; i++) {
                                totalValue = Double.parseDouble(food[i][1]) + totalValue;
                            }
                            double average = totalValue / 12;
                            JOptionPane.showMessageDialog(null, "The total and average of the Food category is " + totalValue + " &" + average);
                        }
                    }
                    if (consecutive.equalsIgnoreCase("no")) {
                        int month_id = Integer.parseInt(JOptionPane.showInputDialog("Give the required month number: "));
                        if (month_id > 0) {
                            double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure: "));
                            food[month_id - 1][1] = String.valueOf(amount);
                            String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the food category?(reply in yes/no)");
                            if (calc.equalsIgnoreCase("yes")) {
                                JOptionPane.showMessageDialog(null, "The total and average of the Food category is " + amount);
                            }
                        }
                    }
                }
                if (category3.equalsIgnoreCase("entertainment")) {
                    String consecutive = JOptionPane.showInputDialog("Do you want to input expenditures in consecutive months?(yes/no)");
                    if (consecutive.equalsIgnoreCase("yes")) {
                        for (int i = 0; i <= 11; i++) {
                            int temp = i + 1;
                            double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure for month " + temp + ": "));
                            entertainment[i][1] = String.valueOf(amount);
                        }
                        String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the entertainment category?(reply in yes/no)");
                        if (calc.equalsIgnoreCase("yes")) {
                            double totalValue = 0;
                            for (int i = 0; i <= 11; i++) {
                                totalValue = Double.parseDouble(entertainment[i][1]) + totalValue;
                            }
                            double average = totalValue / 12;
                            JOptionPane.showMessageDialog(null, "The total and average of the entertainment category is " + totalValue + " &" + average);
                        }
                    }
                    if (consecutive.equalsIgnoreCase("no")) {
                        int month_id = Integer.parseInt(JOptionPane.showInputDialog("Give the required month number: "));
                        if (month_id > 0) {
                            double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the expenditure: "));
                            entertainment[month_id - 1][1] = String.valueOf(amount);
                            String calc = JOptionPane.showInputDialog("Do you want to calculate the total and average of the entertainment category?(reply in yes/no)");
                            if (calc.equalsIgnoreCase("yes")) {
                                JOptionPane.showMessageDialog(null, "The Average and total expenses of the category is " + amount);

                            }
                        }
                    }
                }
            }
        }
    }
}