package library;

import java.util.*;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aryan Dubey
 */

public class Books {

    private int book_id;
    private String author;
    private String title;
    private String subject;
    private int quantity; //A book may have more than one quantity

    Books() {
        this.book_id = -1;
        this.author = "  ";
        this.title = "  ";
        this.subject = "  ";
        this.quantity = 0;

    }

    Books(int book_id, String author, String title, String subject, int quantity) {

        this.book_id = book_id;
        this.author = author;
        this.title = title;
        this.subject = subject;
        this.quantity = quantity;
    }

    public void SetBookId(int book_id) {
        this.book_id = book_id;

    }

    public void SetAuthor(String author) {
        this.author = author;
        dbConnectivity dbC = new dbConnectivity();
        dbC.ChangeBookInfo(book_id, author, 2);
    }

    public void SetTitle(String title) {
        this.title = title;
        dbConnectivity dbC = new dbConnectivity();
        dbC.ChangeBookInfo(book_id, title, 1);
    }

    public void SetQuantity(int quantity) {
        this.quantity = quantity;
        dbConnectivity dbC = new dbConnectivity();
        dbC.UpdateBookQuantity(this.quantity, this.book_id);

    }

    public void SetSubject(String subject) {

        this.subject = subject;
        dbConnectivity dbC = new dbConnectivity();
        dbC.ChangeBookInfo(book_id, subject, 3);

    }

    public String GetTitle() {

        dbConnectivity dbC = new dbConnectivity();
        String title = dbC.GetTitleofBook(this.book_id);
        return title;
    }

    public String GetAuthor() {
        dbConnectivity dbC = new dbConnectivity();
        String author = dbC.GetAuthorofBook(this.book_id);
        return author;
    }

    public int GetBookId() {

        return this.book_id;

    }

    public String GetSubject() {
        dbConnectivity dbC = new dbConnectivity();
        String subject = dbC.GetSubjectofBook(this.book_id);
        return subject;
        //  return this.subject;
    }

    public Books GetaBook() {
        dbConnectivity dbC = new dbConnectivity();
        Books MyBook = dbC.GetaBookbyId(this.book_id);
        return MyBook;
    }

    public int GetQuantity() {
        dbConnectivity dbC = new dbConnectivity();
        int quantAvail = dbC.GetQuantityofBook(this.book_id);
        // return this.quantity;
        return quantAvail;

    }

    public boolean ChekcAvailability(int book_id) {
        dbConnectivity dbC = new dbConnectivity();
        int quantAvail = dbC.GetQuantityofBook(this.book_id);
        if (quantAvail <= 0) {
            return false;
        } else {
            return true;
        }

    }

    public void DecreaseQuantity() {
        if (quantity > 0) {
            this.quantity = this.quantity - 1;
            dbConnectivity dbC = new dbConnectivity();
            dbC.UpdateBookQuantity(this.quantity, book_id);
        }

    }

    public void IncreaseQuantity() {
        this.quantity = this.quantity + 1;
        dbConnectivity dbC = new dbConnectivity();
        dbC.UpdateBookQuantity(this.quantity, book_id);
    }

    public String PrintInformation() {
        boolean avail = ChekcAvailability(this.book_id);
        String status;
        if (avail == true) {
            status = "avail";
        } else {
            status = "not avail";
        }
        String res=" ";
        res =res+"    "+this.book_id + "\t" + this.title + "\t" + this.author + "\t" + this.subject + "\t" + this.quantity + "\t" + status + "\n";
       return res;
    }

}
