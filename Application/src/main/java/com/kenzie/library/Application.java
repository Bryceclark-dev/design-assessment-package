package com.kenzie.library;

//import dependencies
import com.kenzie.library.book.service.BookRequestService;
import com.kenzie.library.logger.service.Logger;
import java.util.ArrayList;



public class Application {

    //TODO: Remove comments and complete method to convert a single response string to LibraryBook
//    public static LibraryBook convertResponseToLibraryBook(String response){
//
//    }

    //TODO: Remove comments and complete method to return ArrayList of LibraryBook
//    public static ArrayList<LibraryBook> returnBookList(String response1,
//                                                        String response2,
//                                                        String response3,
//                                                        String response4,
//                                                        String response5) {
//    }

    public static void main(String[] args) {
        //Use these constant values as input
        final String BOOK_1 = "The Hobbit|J.R.R. Tolkien||";
        final String BOOK_2 = "Dune|Frank Herbert||";
        final String BOOK_3 = "The Nonsense Book|Mr. Myzlplk||";
        final String BOOK_4 = "The Cat in the Hat|Dr. Seuss||";
        final String BOOK_5 = "The Art of War|Sun Tzu||";

        try {
            //Write code inside this try/catch block
            //1. Instantiate Singleton Logger object to log: "Process starting"
            //2. Repeat for all five books listed (you do not need to loop):
            //      a. Call BookRequestService.sendGetRequest()
            //      b. Get the String response as the return value
            //      c. Use Logger to log each response string
            // 3. Write a public static method convertResponseToLibraryBook() in Appplication.java
            //      a. the method takes in a response string
            //      b. instantiate a LibraryBook object
            //      c. use the response string to set book info
            //      d. return the LibraryBook object
            // 4. Write a public static method returnBookList() in Application.java
            //      a. the method takes in 5 formatted Strings
            //      b. within the method, instantiate the LibraryBook objects
            //      c. Add the LibraryBook objects to an ArrayList<LibraryBook>
            //      d. return the Arraylist<LibraryBook>
            //5. Call the returnBookList() and print the results with System.out.println()
            //        to make sure the method works and toString() is overridden.
            //6. User Logger to log: "Process complete"
            //7. Unit Test your code with LibraryBookTest.java and ApplicationTest.java

    }
        catch (Exception e){
            System.out.println("Error occurred: unable to request book info");
            System.out.println("Exception info:" + e.getMessage());
        }
    }

}
