package library;

import java.util.*;
import java.io.*;

/**
 *
 * @author Aryan Dubey
 */
abstract class Users {

    // more attributes needed 
    private int user_id;
    private String user_name;
    private char gender;

    Users() {
        this.user_id = -1;
        this.user_name = " ";
        this.gender = '-';

    }

    Users(int user_id, String user_name, char gender) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.gender = gender;

    }

    public ArrayList<Books> SearchBookbyTitle(String title) {
       for (Books b : BooksList) {
           String titleofcurrentbook = b.GetTitle();
           if (titleofcurrentbook.contains(title) == true) {
               b.PrintInformation();
           } else {
               System.out.println("Sorry ! No record found \n");

           }
       }
        ArrayList<Books> BooksList = new ArrayList<>();
        dbConnectivity dbC = new dbConnectivity();
        BooksList = dbC.SearchBookbyTitle(title);
       if (BooksList.isEmpty() == false) {
           for (Books b : BooksList) {

               b.PrintInformation();
           }
       } else {
           System.out.println("Sorry ! No record found \n");

       }
        return BooksList;
    }

    public ArrayList<Books> SearchBookbySubject(String subject) {

        ArrayList<Books> BooksList = new ArrayList<>();
        dbConnectivity dbC = new dbConnectivity();
        BooksList = dbC.SearchBookbySubject(subject);
       if (BooksList.isEmpty() == false) {
           for (Books b : BooksList) {

               b.PrintInformation();
           }
       } else {
           System.out.println("Sorry ! No record found \n");

       }
        return BooksList;
    }

    public ArrayList<Books> SearchBookbyAuthor(String author) {

        ArrayList<Books> BooksList = new ArrayList<>();
        dbConnectivity dbC = new dbConnectivity();
        BooksList = dbC.SearchBookbyAuthor(author);
         
        return BooksList;
    }

    public int GetId() {
        return this.user_id;

    }

    public String GetName() {
        return this.user_name;
    }

    public char GetGender() {
        return this.gender;
    }

    public void SetId(int id) {
        this.user_id = id;

    }

    public void SetName(String name) {
        this.user_name = name;
    }

    public void SetGender(char g) {
        this.gender = g;
    }

    public String PrintInformation() {

        String Resultant="Id: " + this.user_id+"   "+"Name:" + this.user_name+"  "+"Gender: " + this.gender+"  ";
        return Resultant;

    }
     void SetFineAmount(double fine)           
     {
         dbConnectivity dbC= new dbConnectivity ();
         dbC.SetFineAmount(user_id, fine);
     }
     
      boolean SetFineStatus(boolean status){
           dbConnectivity dbC= new dbConnectivity ();
          boolean result= dbC.SetFineStatus(user_id, status);
          return result;
      }
      
       void UpdateLoanInfo(Loan L, int i ) {}
       boolean GetFineStatus()
       {
           return true;
       }
       boolean AddLoanInfo(Loan Current_Loan)
       {
           return true;
       }

    abstract String ViewInformation(ArrayList<Loan> LoanLoanList, int user_id);

}
