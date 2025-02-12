package library;

import java.util.ArrayList;

/**
 * @author Aryan Dubey
 */
public class ClerkMenuUI extends javax.swing.JFrame {

    int id;
    Library Obj;
    public ClerkMenuUI() {
        initComponents();
    }
    
     public ClerkMenuUI(int id, Library Obj) {
        initComponents();
        this.id=id;
        this.Obj=Obj;
        
    }
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LoanHistoryUserIdTextField = new javax.swing.JTextField();
        TitleTextField = new javax.swing.JTextField();
        AuthorTextField = new javax.swing.JTextField();
        SubjectTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CheckOutUserIdTextField = new javax.swing.JTextField();
        CheckOutBookIdTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CheckInUserIdTextField = new javax.swing.JTextField();
        CheckInBookIdTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UserFineIdTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NewNameTextField = new javax.swing.JTextField();
        NewGenderTextField = new javax.swing.JTextField();
        NewTelTextField = new javax.swing.JTextField();
        NewAddressTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NameRadioButton = new javax.swing.JRadioButton();
        GenderRadioButton = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        ClerkChoiceTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ResultMsgTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        InfoTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CheckInReturnDateTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        IncreaseQuantityRadioButton = new javax.swing.JRadioButton();
        DecreaseQuantityRadioButton = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        RenewBookIdTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clerk Menu Page");

        jLabel2.setText("1 To Search Book by Title Enter the title ");

        jLabel3.setText("2 To Search Book by  Author Enter Author Name");

        jLabel4.setText("3 To Search Book by Subject Enter Subject");

        jLabel5.setText("4 To View Loan Info Enter UserId to see his history");

        LoanHistoryUserIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanHistoryUserIdTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("5 To CheckOut Item ");

        jLabel7.setText("6 To CheckIn Item ");

        jLabel8.setText("7 To Record Fine Paid");

        UserFineIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFineIdTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("8 Add Borrower");

        NewNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNameTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("9 Update Borrower Personal Info");

        buttonGroup1.add(NameRadioButton);
        NameRadioButton.setText("Name");

        buttonGroup1.add(GenderRadioButton);
        GenderRadioButton.setText("Gender");

        jLabel11.setText("Command");

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel12.setText("Name");

        jLabel13.setText("Gender");

        jLabel14.setText("Tel#");

        jLabel15.setText("Address");

        jLabel16.setText("Select Option then provide Id and UpdatedInfo");

        IDTextField.setText("ID");

        jLabel18.setText("Info:");

        jLabel17.setText("Id");

        CheckInReturnDateTextField.setText("yyyy/MM/dd");

        jLabel19.setText("Return Date");

        jLabel20.setText("BookId");

        jLabel21.setText("UserId");

        jLabel22.setText("UserId");

        jLabel23.setText("BookId");

        jLabel24.setText("10 Renew an Item");

        buttonGroup2.add(IncreaseQuantityRadioButton);
        IncreaseQuantityRadioButton.setText("IncreaseQuantity");

        buttonGroup2.add(DecreaseQuantityRadioButton);
        DecreaseQuantityRadioButton.setText("DecreaseQuantity");

        jLabel25.setText("BookId");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoanHistoryUserIdTextField)
                            .addComponent(SubjectTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AuthorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(NewNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel13))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CheckOutUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CheckInUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(NewGenderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(NewTelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(NewAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(25, 25, 25)
                                                        .addComponent(jLabel20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel23)
                                                        .addGap(12, 12, 12)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(CheckInBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(32, 32, 32)
                                                        .addComponent(jLabel19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(CheckInReturnDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(CheckOutBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(UserFineIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(ResultMsgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel10)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(IncreaseQuantityRadioButton)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(NameRadioButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(GenderRadioButton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(IDTextField)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(jLabel18)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(InfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(DecreaseQuantityRadioButton)
                                                        .addGap(75, 75, 75)
                                                        .addComponent(jLabel25)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(RenewBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(ClerkChoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(358, 358, 358)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(39, 39, 39)))
                        .addGap(201, 201, 201))))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SubjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LoanHistoryUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CheckOutUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckOutBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckInUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckInBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckInReturnDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(UserFineIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewGenderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewTelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameRadioButton)
                    .addComponent(GenderRadioButton)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(IDTextField)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(IncreaseQuantityRadioButton)
                    .addComponent(DecreaseQuantityRadioButton)
                    .addComponent(jLabel25)
                    .addComponent(RenewBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClerkChoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jButton1)
                    .addComponent(ResultMsgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }
    private void LoanHistoryUserIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//LoanHistoryUserIdTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//LoanHistoryUserIdTextFieldActionPerformed

    private void UserFineIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//UserFineIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//UserFineIdTextFieldActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//jButton1MouseClicked
        // TODO add your handling code here:
        int choice = Integer.parseInt(ClerkChoiceTextField.getText());
        
        
        if (choice == 1) {
            String title = TitleTextField.getText();

            String PrintingMessage = "No Record found";
           
                
               
                    ArrayList<Books> SelectedBooks = Obj.ClerkSearchBookbyTitle(title, id);

                    if (SelectedBooks.isEmpty() == false) {
                        PrintingMessage = " ";
                        for (int counter = 0; counter < SelectedBooks.size(); counter++) {
                            Books B = SelectedBooks.get(counter);

                            PrintingMessage = PrintingMessage + "   " + B.GetBookId() + "  " + B.GetTitle() + "    " + B.GetAuthor() + "  "
                                    + B.GetSubject() + "\n";
                        }
                        
                    }
                        
            ResultMsgTextField.setText(PrintingMessage);
        }
        
        else if(choice == 2)
        {
            
                     String author = AuthorTextField.getText();

            String PrintingMessage = "No Record found";

            ArrayList<Books> SelectedBooks = Obj.ClerkSearchBookbyAuthor(author, id);

            if (SelectedBooks.isEmpty() == false) {
                PrintingMessage = " ";
                for (int counter = 0; counter < SelectedBooks.size(); counter++) {
                    Books B = SelectedBooks.get(counter);

                    PrintingMessage = PrintingMessage + "   " + B.GetBookId() + "  " + B.GetTitle() + "    " + B.GetAuthor() + "  "
                            + B.GetSubject() + "\n";
                }
            }

            ResultMsgTextField.setText(PrintingMessage);
           
        }
        
        else if(choice == 3)
        {

            String subject = SubjectTextField.getText();

            String PrintingMessage = "No Record found";

            ArrayList<Books> SelectedBooks = Obj.ClerkSearchBookbySubject(subject, id);

            if (SelectedBooks.isEmpty() == false) {
                PrintingMessage = " ";
                for (int counter = 0; counter < SelectedBooks.size(); counter++) {
                    Books B = SelectedBooks.get(counter);

                    PrintingMessage = PrintingMessage + "   " + B.GetBookId() + "  " + B.GetTitle() + "    " + B.GetAuthor() + "  "
                            + B.GetSubject() + "\n";
                }
            }

            ResultMsgTextField.setText(PrintingMessage);

        }
        
        
        
        else if(choice ==4)
        {
        
            
            int userid = Integer.parseInt(LoanHistoryUserIdTextField.getText());
            String PrintingMessage=Obj.CheckLoanofUser(userid, id);
            ResultMsgTextField.setText(PrintingMessage);
        }
        
        else if(choice ==5)
        {
             int userid = Integer.parseInt(CheckOutUserIdTextField.getText());
             int book_id=Integer.parseInt(CheckOutBookIdTextField.getText());
             Obj.ClerkCheckOutItem( book_id , userid, id);
             ResultMsgTextField.setText("Item Loaned");
        
        }
        
        
        else if(choice ==6)
        {
             int userid = Integer.parseInt(CheckInUserIdTextField.getText());
             int book_id=Integer.parseInt(CheckInBookIdTextField.getText());
             String returndate=CheckInReturnDateTextField.getText();
             Obj.ClerkCheckInItem(returndate, book_id, userid, id);
             ResultMsgTextField.setText("Item Returned");
            
        
        }
        
         else if(choice ==7)
        {
            int user_id=Integer.parseInt(UserFineIdTextField.getText() );
            Obj.ClerkRecordFine(user_id , id);
            ResultMsgTextField.setText("Fine Recorded");
        
        }
        
         else if(choice ==8)
         {
             String borrower_name=NewNameTextField.getText();
             char gender=NewGenderTextField.getText().charAt(0);
             String tel_num=NewTelTextField.getText();
             String address=NewAddressTextField.getText();
            boolean result= Obj.AddNewBorrower(borrower_name , gender  , tel_num , address, id);
            if(result ==true )
            {
                
               ResultMsgTextField.setText("New User added");
            }
            else
            {
              ResultMsgTextField.setText("Command Failed");
            }
         }
        
         else if(choice ==9)
         {
             int user_id=Integer.parseInt(IdTextField.getText());
             String Info=InfoTextField.getText();
             boolean result=false;
            if( NameRadioButton.isSelected() )
            {
               result= Obj.ClerkUpdatingInfo(Info, 1, id, user_id);
            
            }
            else if(GenderRadioButton.isSelected())
            {
                result=Obj.ClerkUpdatingInfo(Info, 2, id, user_id);

            }
            
           
            
            
            
            if(result==false)
            {
               ResultMsgTextField.setText("Command Failed");
            }
            
            else
            {
               ResultMsgTextField.setText("Updated Successfully");
            }
            
         }
         else if(choice ==10)
         {
         
               int book_id= Integer.parseInt(RenewBookIdTextField.getText());
               int option=0;
               if(IncreaseQuantityRadioButton.isSelected())
               {
                   option =1;
               }
               else
               {
                   option=2;
               }
               
               Obj.ClerkRenewItem(book_id , option , id);
               ResultMsgTextField.setText("Item Renewed");
         }
         else 
         {
             ResultMsgTextField.setText("Invalid Command");
         }
    }//jButton1MouseClicked
    private void NewNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//NewNameTextFieldActionPerformed
        // TODO add your handling code here:
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClerkMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClerkMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClerkMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClerkMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ClerkMenuUI().setVisible(true);
//            }
//        });
    }

    // Variables declaration
    private javax.swing.JTextField AuthorTextField;
    private javax.swing.JTextField CheckInBookIdTextField;
    private javax.swing.JTextField CheckInReturnDateTextField;
    private javax.swing.JTextField CheckInUserIdTextField;
    private javax.swing.JTextField CheckOutBookIdTextField;
    private javax.swing.JTextField CheckOutUserIdTextField;
    private javax.swing.JTextField ClerkChoiceTextField;
    private javax.swing.JRadioButton DecreaseQuantityRadioButton;
    private javax.swing.JRadioButton GenderRadioButton;
    private javax.swing.JLabel IDTextField;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JRadioButton IncreaseQuantityRadioButton;
    private javax.swing.JTextField InfoTextField;
    private javax.swing.JTextField LoanHistoryUserIdTextField;
    private javax.swing.JRadioButton NameRadioButton;
    private javax.swing.JTextField NewAddressTextField;
    private javax.swing.JTextField NewGenderTextField;
    private javax.swing.JTextField NewNameTextField;
    private javax.swing.JTextField NewTelTextField;
    private javax.swing.JTextField RenewBookIdTextField;
    private javax.swing.JTextField ResultMsgTextField;
    private javax.swing.JTextField SubjectTextField;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JTextField UserFineIdTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration
}