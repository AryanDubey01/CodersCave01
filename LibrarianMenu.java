package library;

import java.util.ArrayList;

/**
 * @author Aryan Dubey
 */
public class LibrarianMenu extends javax.swing.JFrame {

    int id;
    Library Obj;
    public LibrarianMenu() {
        initComponents();
    }
    
     public LibrarianMenu(int  id , Library Obj) {
        initComponents();
        this.id=id;
        this.Obj=Obj;
    }
    
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LibrarianChoiceTextField = new javax.swing.JTextField();
        ResultMsgTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TitleTextField = new javax.swing.JTextField();
        AuthorTextField = new javax.swing.JTextField();
        SubjectTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        LoanHistoryUserIdTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        NewNameTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        NewGenderTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        NewTelTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        NewAddressTextField = new javax.swing.JTextField();
        UpdateUserId = new javax.swing.JTextField();
        UpdateInfoTextfield = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        NameRadioButton = new javax.swing.JRadioButton();
        GenderRadioButton = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CheckOutUserIdTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        CheckOutBookIdTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CheckInUserIdTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CheckInBookIdTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CheckInReturnDateTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        UserFineIdTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        IncreaseQuantityRadioButton = new javax.swing.JRadioButton();
        DecreaseQuantityRadioButton = new javax.swing.JRadioButton();
        RenewBookIdTextField = new javax.swing.JLabel();
        RenewItemBookID = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        newauthortextfield = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        newsubjectextfield = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        newtitletextfield = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        newquantitytextfield = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        deletebookidtextfield = new javax.swing.JLabel();
        DeleteBookIdTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        AuthorRadioButton = new javax.swing.JRadioButton();
        TitleRadioButton = new javax.swing.JRadioButton();
        Subjecttextfield = new javax.swing.JRadioButton();
        quantitytextfield = new javax.swing.JRadioButton();
        UpdatedInfoBookidtextfield = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        UpdatedNewInfoTextField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Librarian Menu ");

        jLabel2.setText("1 for search by title");

        jLabel3.setText("2 for search by author");

        jLabel4.setText("3 for search by subject");

        jLabel5.setText("4 to view loan history ");

        jLabel6.setText("5 to add borrower");

        jLabel7.setText("6 Update borrower personal info");

        jLabel11.setText("Command");

        LibrarianChoiceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrarianChoiceTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AuthorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("User Id");

        jLabel14.setText("Name");

        NewNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNameTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("Gender");

        jLabel16.setText("TelNum");

        jLabel17.setText("Address");

        UpdateUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserIdActionPerformed(evt);
            }
        });

        UpdateInfoTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateInfoTextfieldActionPerformed(evt);
            }
        });

        jLabel18.setText("Id");

        jLabel19.setText("New Info");

        buttonGroup2.add(NameRadioButton);
        NameRadioButton.setText("Name");
        NameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(GenderRadioButton);
        GenderRadioButton.setText("Gender");
        GenderRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderRadioButtonActionPerformed(evt);
            }
        });

        jLabel20.setText("Id");

        jLabel22.setText("7 to CheckOut an Item");

        jLabel23.setText("UserId");

        jLabel24.setText("BookId");

        CheckOutBookIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutBookIdTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("8 Check In an Item ");

        jLabel9.setText("Id");

        jLabel10.setText("BookId");

        jLabel13.setText("ReturnDate");

        CheckInReturnDateTextField.setText("yyyy/MM/dd");
        CheckInReturnDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInReturnDateTextFieldActionPerformed(evt);
            }
        });

        jLabel21.setText("9 Record Fine Paid");

        jLabel25.setText("BorrowerId");

        UserFineIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFineIdTextFieldActionPerformed(evt);
            }
        });

        jLabel26.setText("10 Renew Item");

        buttonGroup1.add(IncreaseQuantityRadioButton);
        IncreaseQuantityRadioButton.setText("IncreaseQuantity");

        buttonGroup1.add(DecreaseQuantityRadioButton);
        DecreaseQuantityRadioButton.setText("DecreaseQuantity");

        RenewBookIdTextField.setText("BookId");

        jLabel28.setText("11 Add a Book");

        jLabel29.setText("author");

        jLabel30.setText("subject");

        jLabel31.setText("title");

        newtitletextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtitletextfieldActionPerformed(evt);
            }
        });

        jLabel32.setText("quantity");

        jLabel33.setText("12 Delete a book");

        deletebookidtextfield.setText("BookId");

        jLabel35.setText("13 Update Book Info");

        buttonGroup3.add(AuthorRadioButton);
        AuthorRadioButton.setText("author");

        buttonGroup3.add(TitleRadioButton);
        TitleRadioButton.setText("title");
        TitleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(Subjecttextfield);
        Subjecttextfield.setText("subject");

        buttonGroup3.add(quantitytextfield);
        quantitytextfield.setText("quantity");
        quantitytextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitytextfieldActionPerformed(evt);
            }
        });

        UpdatedInfoBookidtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatedInfoBookidtextfieldActionPerformed(evt);
            }
        });

        jLabel36.setText("BookId");

        UpdatedNewInfoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatedNewInfoTextFieldActionPerformed(evt);
            }
        });

        jLabel37.setText("NewInfo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(100, 100, 100)
                        .addComponent(AuthorRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TitleRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Subjecttextfield)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantitytextfield)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel26))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(32, 32, 32)
                                                .addComponent(CheckInUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(NameRadioButton)
                                                .addGap(29, 29, 29)
                                                .addComponent(GenderRadioButton)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel20)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel24)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(CheckOutBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DecreaseQuantityRadioButton)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(CheckInBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckInReturnDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(UpdateInfoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(UserFineIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(IncreaseQuantityRadioButton)
                                                        .addGap(228, 228, 228)
                                                        .addComponent(RenewBookIdTextField)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(RenewItemBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(jLabel29)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(newauthortextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel30)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(newsubjectextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(jLabel31)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(newtitletextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel32)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(315, 315, 315)
                                                        .addComponent(jLabel36)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(UpdatedInfoBookidtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                                        .addComponent(jLabel37)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(newquantitytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(UpdatedNewInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LoanHistoryUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CheckOutUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(UpdateUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(NewTelTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(NewNameTextField)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel11)
                                                .addGap(19, 19, 19)
                                                .addComponent(LibrarianChoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel33))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(deletebookidtextfield)
                                                .addGap(29, 29, 29)
                                                .addComponent(DeleteBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ResultMsgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jButton1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TitleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(AuthorTextField)
                                            .addComponent(SubjectTextField))
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel6)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NewGenderTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(NewAddressTextField))
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(AuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NewNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(NewGenderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(SubjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LoanHistoryUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NameRadioButton)
                                .addComponent(GenderRadioButton)
                                .addComponent(UpdateUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19)
                                .addComponent(UpdateInfoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(jLabel24)
                                .addComponent(CheckOutBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23)
                                .addComponent(CheckOutUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(CheckInUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckInBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(CheckInReturnDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel25)
                                    .addComponent(UserFineIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(IncreaseQuantityRadioButton)
                                    .addComponent(DecreaseQuantityRadioButton)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RenewBookIdTextField)
                                .addComponent(RenewItemBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(newauthortextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(newsubjectextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(newtitletextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newquantitytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(deletebookidtextfield)
                            .addComponent(DeleteBookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(NewAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(NewTelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AuthorRadioButton)
                        .addComponent(TitleRadioButton)
                        .addComponent(Subjecttextfield)
                        .addComponent(quantitytextfield)
                        .addComponent(UpdatedInfoBookidtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(UpdatedNewInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LibrarianChoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(ResultMsgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }

    private void LibrarianChoiceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        
        
         int choice = Integer.parseInt(LibrarianChoiceTextField.getText());
        
        
        if (choice == 1) {
            String title = TitleTextField.getText();

            String PrintingMessage = "No Record found";
           
            
               
                    ArrayList<Books> SelectedBooks = Obj.LibrarianSearchBookbyTitle(title, id);

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

            ArrayList<Books> SelectedBooks = Obj.LibrarianSearchBookbyAuthor(author, id);

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

            ArrayList<Books> SelectedBooks = Obj.LibrarianSearchBookbySubject(subject, id);

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
            String PrintingMessage=Obj.LibrarianCheckLoanofUser(userid, id);
            ResultMsgTextField.setText(PrintingMessage);
        
        }
       
        else if(choice ==5)
        {
        
            String borrower_name=NewNameTextField.getText();
             char gender=NewGenderTextField.getText().charAt(0);
             String tel_num=NewTelTextField.getText();
             String address=NewAddressTextField.getText();
            boolean result= Obj.AddNewBorrowerLibrarian(borrower_name , gender  , tel_num , address, id);
            if(result ==true )
            {
                
               ResultMsgTextField.setText("New User added");
            }
            else
            {
              ResultMsgTextField.setText("Command Failed");
            }
        
        }
        
        else if (choice == 6)
        {
        
          int user_id=Integer.parseInt(UpdateUserId.getText());
             String Info=UpdateInfoTextfield.getText();
             boolean result=false;
            if( NameRadioButton.isSelected() )
            {
               result= Obj.LibrarianUpdatingInfo(Info, 1, id, user_id);
                
            
            }
            else if(GenderRadioButton.isSelected())
            {
                result=Obj.LibrarianUpdatingInfo(Info, 2, id, user_id);
                 

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
        
        else if (choice ==7)
        {
            
             int userid = Integer.parseInt(CheckOutUserIdTextField.getText());
             int book_id=Integer.parseInt(CheckOutBookIdTextField.getText());
             Obj.LibrarianCheckOutItem( book_id , userid, id);
             ResultMsgTextField.setText("Item Loaned");
        
        
        }
        
        
        else if (choice ==8)
        {
             int userid = Integer.parseInt(CheckInUserIdTextField.getText());
             int book_id=Integer.parseInt(CheckInBookIdTextField.getText());
             String returndate=CheckInReturnDateTextField.getText();
             Obj.LibrarianCheckInItem(returndate, book_id, userid, id);
             ResultMsgTextField.setText("Item Returned");
        }
        
        
        else if(choice ==9)
        {
        
            int user_id=Integer.parseInt(UserFineIdTextField.getText() );
            Obj.LibrarianRecordFine(user_id , id);
            ResultMsgTextField.setText("FineRecorded");
        
        }
        
        else if (choice ==10)
        {
        
            
            int book_id= Integer.parseInt(RenewItemBookID.getText());
               int option=0;
               if(IncreaseQuantityRadioButton.isSelected())
               {
                   option =1;
               }
               else
               {
                   option=2;
               }
               
               Obj.LibrarianRenewItem(book_id , option , id);
               ResultMsgTextField.setText("Quantity Updated");
        }
        
        else if(choice ==11)
        {
        
            
            String NewAuthor=newauthortextfield.getText();
            String NewTitle=newtitletextfield.getText();
            String NewSubject=newsubjectextfield.getText();
            int quantity=Integer.parseInt(newquantitytextfield.getText());
            Obj.LibrarianAddNewBook(NewAuthor , NewTitle , NewSubject , quantity , id);
            ResultMsgTextField.setText("New Book Added Successfully");
                 
            
        }
        
        else if(choice ==12)
        {
          int book_id=Integer.parseInt(DeleteBookIdTextField.getText());
         boolean result= Obj.LibrarianDeleteBook(book_id, id);
         if(result ==true )
            {
                
               ResultMsgTextField.setText("BookDeleted");
            }
            else
            {
              ResultMsgTextField.setText("Command Failed");
            }
        
        }
        
        else if (choice ==13)
        {
            int option=0;
            int book_id=Integer.parseInt(UpdatedInfoBookidtextfield.getText());
            String NewInfo=UpdatedNewInfoTextField.getText();
            
            if(AuthorRadioButton.isSelected ())
            {
                option=2;
                 Obj.LibrarianUpdateBookInfo(book_id , id ,NewInfo ,0,option);
            
            }
            else if(TitleRadioButton.isSelected())
            {
                option=1;
                Obj.LibrarianUpdateBookInfo(book_id , id ,NewInfo ,0, option);
            }
            
            else if(Subjecttextfield.isSelected())
            {
                option=3;
                Obj.LibrarianUpdateBookInfo(book_id , id ,NewInfo ,0,option);
            }
        
            else if(quantitytextfield.isSelected())
            {
                option=4;
                int quantity=Integer.parseInt(UpdatedNewInfoTextField.getText() );
                Obj.LibrarianUpdateBookInfo(book_id , id ," ",quantity, option );
            }
            
           ResultMsgTextField.setText("Updated Successfully");
        }
    }

    private void AuthorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void NewNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdateInfoTextfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdateUserIdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CheckOutBookIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void UserFineIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void GenderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void NameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void TitleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void quantitytextfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void newtitletextfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CheckInReturnDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdatedInfoBookidtextfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdatedNewInfoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibrarianMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration
    private javax.swing.JRadioButton AuthorRadioButton;
    private javax.swing.JTextField AuthorTextField;
    private javax.swing.JTextField CheckInBookIdTextField;
    private javax.swing.JTextField CheckInReturnDateTextField;
    private javax.swing.JTextField CheckInUserIdTextField;
    private javax.swing.JTextField CheckOutBookIdTextField;
    private javax.swing.JTextField CheckOutUserIdTextField;
    private javax.swing.JRadioButton DecreaseQuantityRadioButton;
    private javax.swing.JTextField DeleteBookIdTextField;
    private javax.swing.JRadioButton GenderRadioButton;
    private javax.swing.JRadioButton IncreaseQuantityRadioButton;
    private javax.swing.JTextField LibrarianChoiceTextField;
    private javax.swing.JTextField LoanHistoryUserIdTextField;
    private javax.swing.JRadioButton NameRadioButton;
    private javax.swing.JTextField NewAddressTextField;
    private javax.swing.JTextField NewGenderTextField;
    private javax.swing.JTextField NewNameTextField;
    private javax.swing.JTextField NewTelTextField;
    private javax.swing.JLabel RenewBookIdTextField;
    private javax.swing.JTextField RenewItemBookID;
    private javax.swing.JTextField ResultMsgTextField;
    private javax.swing.JTextField SubjectTextField;
    private javax.swing.JRadioButton Subjecttextfield;
    private javax.swing.JRadioButton TitleRadioButton;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JTextField UpdateInfoTextfield;
    private javax.swing.JTextField UpdateUserId;
    private javax.swing.JTextField UpdatedInfoBookidtextfield;
    private javax.swing.JTextField UpdatedNewInfoTextField;
    private javax.swing.JTextField UserFineIdTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel deletebookidtextfield;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField newauthortextfield;
    private javax.swing.JTextField newquantitytextfield;
    private javax.swing.JTextField newsubjectextfield;
    private javax.swing.JTextField newtitletextfield;
    private javax.swing.JRadioButton quantitytextfield;
    // End of variables declaration
}
