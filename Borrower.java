package library;

import java.util.*;
import java.io.*;

/**
 * @author Aryan Dubey
 */
public class Borrower extends Users {

    private String address;
    private String telephone;
    // private boolean fine_defaulter;
    // private double fine;
    private ArrayList<Loan> BookLoans;

    Borrower() {
        super();
        fine_defaulter = false;
        BookLoans = null;
        fine = 0.0;
        address = " ";
        telephone = "  ";
        BookLoans = new ArrayList<>();

    }

    Borrower(int user_id, String user_name, char gender, String telephone, String address, boolean fine_defaulter, double fine) {
        super(user_id, user_name, gender);
        this.fine_defaulter = fine_defaulter;
        this.fine = fine;
        this.address = address;
        this.telephone = telephone;
        BookLoans = new ArrayList<>();

    }

    @Override
    public boolean GetFineStatus() {
//        return this.fine_defaulter;
        dbConnectivity dbC = new dbConnectivity();
        return (dbC.GetFineStatus(this.GetId()));
    }

    public double GetFineAmout() {
//        return this.fine;
        dbConnectivity dbC = new dbConnectivity();
        return (dbC.GetFineAmount(this.GetId()));

    }

    public String GetAddress() {
        return this.address;

    }

    public String GetTelephone() {

        return this.telephone;
    }

    @Override
    public boolean SetFineStatus(boolean fine_defaulter) {
        this.fine_defaulter = fine_defaulter;
        dbConnectivity dbC = new dbConnectivity();
        boolean result = dbC.SetFineStatus(this.GetId(), fine_defaulter);
        return result;
    }

    public boolean SetTelephone(String Telephone) {
        this.telephone = Telephone;
        dbConnectivity dbC = new dbConnectivity();
        boolean result = dbC.SetTelephone(this.GetId(), this.telephone);
        return result;

    }

   
    public boolean SetAddress(String Address) {
        this.address = Address;
       dbConnectivity dbC = new dbConnectivity();
        boolean result = dbC.SetAddress(this.GetId(), this.address);
        return result;

    }
  
    @Override
    public void SetFineAmount(double user_fine) {
        this.fine = user_fine;
        dbConnectivity dbC = new dbConnectivity();
        boolean result = dbC.SetFineAmount(this.GetId(), user_fine);
        

    }

    public void SetName(String name)
    {
        super.SetName(name);
        dbConnectivity dbC = new dbConnectivity();
        boolean result = dbC.SetName(this.GetId(), name);

    }
    
    
    public void SetGender(char g)
    {
        super.SetGender(g);
        dbConnectivity dbC = new dbConnectivity();
        boolean result = dbC.SetGender(this.GetId(), g);

    }
    
    @Override
    public boolean AddLoanInfo(Loan LoanInfo) {

        BookLoans.add(LoanInfo);
        return true;
//        dbConnectivity dbC = new dbConnectivity ();
//        boolean result=dbC.AddLoanInfo(this.GetId(), LoanInfo);
//        return result;

    }

    public void AllLoansofUser(ArrayList<Loan> LoansofUser) {

        // this.BookLoans=LoansofUser;
        dbConnectivity dbC = new dbConnectivity();
        this.BookLoans = dbC.LoadLoanListofSpecificUser(this.GetId());
    }

    //helping function to update loan info 
     @Override
    public void UpdateLoanInfo(Loan Update, int book_id) {
      for (int count=BookLoans.size()-1 ; count > -1; count--){
                 Loan L = BookLoans.get(count);

            if ((L.GetaBookId() == book_id)) {
                L.SetLoan(Update);
                break;
            }
        }

    }

    @Override
    public String ViewInformation(ArrayList<Loan> LoanList, int user_id) {

        
        String res="";
        res=res+super.PrintInformation();
        res+="Address :" + address+"  ";
        res+="Telephone:" + telephone+"  ";
        res+="\n Loan Info \n";

        if (BookLoans.isEmpty() == false) {
            for (int i=0;i< BookLoans.size();i++) {
                Loan L=BookLoans.get(i);
                res+=L.PrintLoanInfo();
                res+="\n";
            }
        } else {

            res +="NO LOANS TILL YET!";
        }
        
        return res;

    }

}
