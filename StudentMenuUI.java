package library;

/**
 * @author Aryan Dubey
 */

import java.util.ArrayList;

public class StudentMenuUI extends javax.swing.JFrame {
    int id;

    /**
     * Creates new form StudentMenuUI
     */
    public StudentMenuUI() {
        initComponents();
    }
    
    
    public StudentMenuUI(int id) {
        initComponents();
        this.id=id;
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UserChoiceTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SubjectTextField = new javax.swing.JTextField();
        AuthorTextField = new javax.swing.JTextField();
        TitleTextField = new javax.swing.JTextField();
        Result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student Menu Page");

        jLabel2.setText("Command");

        jLabel4.setText("1. To Search Book by Title Enter Book Name");

        jLabel5.setText("2.To Search Book By Author Enter Author Name");

        jLabel6.setText("3.To Search Book by Subject Enter Subject Name");

        jLabel7.setText("4. View Loan Info");

        jButton1.setText("OK!");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TitleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(AuthorTextField)
                                .addComponent(SubjectTextField))
                            .addGap(72, 72, 72))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(UserChoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1)))
                            .addContainerGap(319, Short.MAX_VALUE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SubjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UserChoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jButton1))
        );

        pack();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        
        int choice = Integer.parseInt(UserChoiceTextField.getText());
       // Library obj = new Library ();
        
        
        if (choice == 1) {
            String title = TitleTextField.getText();
//            Library L = new Library ();
//            Borrower B=  L.GetBorrowerbyUserId(id);
//           ArrayList<Books>B1= B.SearchBookbyTitle(title);
            String PrintingMessage = "No Record found";
            for (int i = 0; i < Library.UsersList.size(); i++) {

                Users U = Library.UsersList.get(i);
                if (U.GetId() == id) {

                    ArrayList<Books> SelectedBooks = U.SearchBookbyTitle(title);

                    if (SelectedBooks.isEmpty() == false) {
                        PrintingMessage = " ";
                        for (int counter = 0; counter < SelectedBooks.size(); counter++) {
                            Books B = SelectedBooks.get(counter);

                            PrintingMessage = PrintingMessage + "   " + B.GetBookId() + "  " + B.GetTitle() + "    " + B.GetAuthor() + "  "
                                    + B.GetSubject() + "\n";
                        }

                        break;
                    }
                }

            }
            Result.setText(PrintingMessage);
        }
        
        else if(choice == 2)
        {
            String Author=AuthorTextField.getText();
            String PrintingMessage="No Record found";
            for (int i = 0; i < Library.UsersList.size(); i++) {

                Users U = Library.UsersList.get(i);
                if (U.GetId() == id) {

                    ArrayList<Books> SelectedBooks = U.SearchBookbyAuthor(Author);
                    if (SelectedBooks.isEmpty() == false) {
                        PrintingMessage = " ";
                        for (int counter = 0; counter < SelectedBooks.size(); counter++) {
                            Books B = SelectedBooks.get(counter);

                            PrintingMessage = PrintingMessage + "   " + B.GetBookId() + "  " + B.GetTitle() + "    " + B.GetAuthor() + "  "
                                    + B.GetSubject() + "\n";
                        }

                        break;
                    }
                }

            }
            Result.setText(PrintingMessage);


        }
        
        else if(choice == 3)
        {
            String Subject=SubjectTextField.getText();
            String PrintingMessage="No Record found";
            for (int i = 0; i < Library.UsersList.size(); i++) {

                Users U = Library.UsersList.get(i);
                if (U.GetId() == id) {

                    ArrayList<Books> SelectedBooks = U.SearchBookbySubject(Subject);
                    if (SelectedBooks.isEmpty() == false) {
                        PrintingMessage = " ";
                        for (int counter = 0; counter < SelectedBooks.size(); counter++) {
                            Books B = SelectedBooks.get(counter);

                            PrintingMessage = PrintingMessage + "   " + B.GetBookId() + "  " + B.GetTitle() + "    " + B.GetAuthor() + "  "
                                    + B.GetSubject() + "\n";
                        }

                        break;
                    }
                }

            }
            Result.setText(PrintingMessage);

        }
        
        else if(choice ==4)
        {
            String PrintingMessage="No Record found";
            for (int i = 0; i < Library.UsersList.size(); i++) {

                Users U = Library.UsersList.get(i);
                if (U.GetId() == id) {

                    
                   PrintingMessage=U.ViewInformation(Library.LoanList, id);
                }

            }
            Result.setText(PrintingMessage);
            
        }
        
       
    }

    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(StudentMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration
    private javax.swing.JTextField AuthorTextField;
    private javax.swing.JTextField Result;
    private javax.swing.JTextField SubjectTextField;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JTextField UserChoiceTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration
}
