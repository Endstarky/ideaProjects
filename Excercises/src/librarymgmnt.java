import java.util.ArrayList;
import java.util.Scanner;

public class librarymgmnt {
    public static void main(String[] args) {
        /*
        Library Management System
Create a program to manage a small library. The program should:

Use an array to store the list of books.
Allow the user to add new books (use wrapper classes for book IDs).
Allow the user to search for a book by title (use string reference).
Allow the user to borrow and return books.
Display the current list of available books.
         */
        ArrayList<String> books = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("How many books do you want to add?");
        int get_books = input.nextInt();
        input.nextLine();

        for (int i = 0; i < get_books; i++) {
            System.out.println("Give the name of the book " + (i + 1) + ":");
            String dat = input.nextLine();
            books.add(i, dat);
        }
        System.out.println(books);
        int book_index = books.size()-1;//This is for the array size in indexing format.

        System.out.println("Which book do you want?");
        String query = input.nextLine();
        int result;
        for (int i = 0; i < get_books; i++) {
            String index_query = books.get(i);
            if (index_query.equalsIgnoreCase(query)) {
                result = books.indexOf(index_query);
                System.out.println("Yes,the book is available at index: " + result);
            }
        }

        System.out.println("Do you want to borrow a book or return it?");
        String response = input.nextLine();

        int result2;
        int result_store;
        int index_query=0;
        int books_size = books.size();
        String book_query = "";
        String response_boolean="";
        if (response.equalsIgnoreCase("Borrow")) {                    //Borrow method.
            System.out.println("Name the book you want to borrow:");
            String borrow = input.nextLine();
            for (int i = 0;i<get_books;i++){
                String get_bookname= books.get(i);
                String inval_brrw_query= books.get(i);
                if (get_bookname.equalsIgnoreCase(borrow)){
                    index_query = books.indexOf(get_bookname);
                    System.out.println("Yes, the book is available for borrowing.");
                    System.out.println("Do you want to borrow?yes/no.");
                    response_boolean = input.nextLine();
                }
            }

            if (response_boolean.equalsIgnoreCase("YES")){                 //Borrow execution from the library.
                System.out.println("Here you GO!");
                books.remove(index_query);
            }
            System.out.println(books);
            String inval_brrw_normalize = borrow.toLowerCase();
            String boolean_store="";
            if (books.size()==books_size){                                      //If the inquired book is invalid
            for (int i =0;i<get_books;i++){
            if (inval_brrw_normalize!= books.get(i)){
                boolean_store = "False";
            }
            }
            }
            String boolean_store_final= boolean_store;
            if (boolean_store_final=="False"){
                System.out.println("The required book is not available!");
            }

        }


        if (response.equalsIgnoreCase("RETURN")){                       //Return Method
            System.out.println("Name the book you want to return: ");
            String Return= input.nextLine();
            books.add(Return);
            System.out.println("Thank A lot ^_^ ! \nvisit again!" );
            System.out.println(books);
        }
    }
}