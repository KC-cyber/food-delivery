
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cart extends javax.swing.JFrame {
int i=0;
String pay=" ";
    
    public Cart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTf3 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTf5 = new javax.swing.JTextField();
        jTf2 = new javax.swing.JTextField();
        jTf1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTf6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 450, 160));

        jButton2.setText("jButton2");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 130, 50));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 110, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount(in Rs)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 180, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 0));
        jRadioButton1.setText("Cash on delivery");
        jRadioButton1.setToolTipText("");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 220, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 0));
        jRadioButton2.setText("Credit/Debit Card");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 30, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 60, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Options", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vijay\\Downloads\\2.png")); // NOI18N
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, 60));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vijay\\Downloads\\4.png")); // NOI18N
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 120, 80));

        jTf3.setColumns(3);
        jTf3.setEnabled(false);
        jTf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTf3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 50, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("CVV");
        jLabel5.setEnabled(false);
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("EXP DATE");
        jLabel11.setEnabled(false);
        jLabel11.setOpaque(true);
        jLabel11.setPreferredSize(new java.awt.Dimension(27, 17));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 20));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("Name on card");
        jLabel3.setEnabled(false);
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("CARD NUMBER");
        jLabel4.setEnabled(false);
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jTf5.setEnabled(false);
        jPanel1.add(jTf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 30, -1));

        jTf2.setEnabled(false);
        jPanel1.add(jTf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 170, -1));

        jTf1.setEnabled(false);
        jPanel1.add(jTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, 30));

        jLabel12.setText("/");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 10, 20));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("PROCEED>>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jTf6.setEnabled(false);
        jPanel1.add(jTf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 500, 260));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 51, 102)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Display ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 220, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vijay\\Downloads\\wood.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 680));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 680));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setText("CVV");
        jLabel10.setEnabled(false);
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jButton2.doClick();
        DefaultTableModel l1=(DefaultTableModel)jTable1.getModel();

try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/foodip","root","student");
    Statement stmt=con.createStatement();
    String query="select * from cart;";
    ResultSet rs=stmt.executeQuery(query);
    
    while(rs.next())
    { 
      l1.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getInt(3)});
     }
rs.close();
stmt.close();
con.close();   
}
catch(Exception ex){
            System.out.println("Error");
        }  

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Connection con=null;
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/foodip","root","student");
           
            String q="delete from cart;";
            
            PreparedStatement rs=con.prepareStatement(q);
            rs.execute();
            
      
      }
    
      catch(Exception e)
              {
              System.out.println(e);
              }
        DefaultTableModel l1=(DefaultTableModel)jTable1.getModel();
   int i=l1.getRowCount();
   while(i>0)
   {
       for(int j=1;j<i;j++){
           l1.removeRow(0);
       }
       
   }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel l1=(DefaultTableModel)jTable1.getModel();
  try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/foodip","root","student");
    Statement stmt=con.createStatement();
    String query="select sum(price) from cart;";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next()){
    jLabel1.setText(""+rs.getInt(1));
    }
    jLabel1.setForeground(Color.YELLOW);
    }
catch(Exception e){
    System.out.println(e);
}   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        JOptionPane.showMessageDialog(null,"Choose card type from visa/mastercard");
jButton5.setEnabled(true);jButton6.setEnabled(true);


    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
      jLabel3.setEnabled(false);
jLabel4.setEnabled(false);
jLabel5.setEnabled(false);
jTf1.setEnabled(false);
jTf2.setEnabled(false);
jTf3.setEnabled(false);
pay="CASH";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed


        if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false)
{
    JOptionPane.showMessageDialog(null,"Select mode of payment");
}
if(jRadioButton1.isSelected()==true || jRadioButton2.isSelected()==true)
{
    if(jRadioButton2.isSelected()==true){
    if(jTf1.getText().equals("") || jTf2.getText().equals("")||jTf3.getText().equals(""))
    {
        JOptionPane.showMessageDialog(null,"Enter all details");
        if(jTf1.getText().equals(""))
        {
           jTf1.requestFocusInWindow();
        }
        if(jTf2.getText().equals(""))
        {
           jTf2.requestFocusInWindow();
        }
        if(jTf3.getText().equals(""))
        {
           jTf3.requestFocusInWindow();
        }
        
    }
    else
    {
 Cart c=new Cart();
this.setVisible(false);
new bill().setVisible(true);
    }
    }
    if(jRadioButton1.isSelected()==true){
         Cart c=new Cart();
this.setVisible(false);
new bill().setVisible(true);
    }
    
       
}
if(jRadioButton1.isSelected()==true)
{
  Connection con=null;
        Statement st=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/foodip","root","student");
            st=con.createStatement();
            String query1="INSERT INTO payment VALUES(?);";
            PreparedStatement statement=con.prepareStatement(query1);
            statement.setString(1,pay);
            statement.execute();
            con.close();
            st.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }    
}
if(jRadioButton2.isSelected()==true)
{
  Connection con=null;
        Statement st=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/foodip","root","student");
            st=con.createStatement();
            String query1="INSERT INTO payment VALUES(?);";
            PreparedStatement statement=con.prepareStatement(query1);
            statement.setString(1,"CREDIT/DEBIT CARD");
           statement.execute();
            con.close();
            st.close();
            }
        catch(Exception ex){
            System.out.println(ex);
        }    
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
jLabel3.setEnabled(true);
jLabel4.setEnabled(true);
jLabel5.setEnabled(true);
jLabel11.setEnabled(true);
jTf1.setEnabled(true);
jTf2.setEnabled(true);
jTf3.setEnabled(true);
jTf5.setEnabled(true);
jTf6.setEnabled(true);
pay="VISA CREDIT/DEBIT CARD";        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
jLabel3.setEnabled(true);
jLabel4.setEnabled(true);
jLabel5.setEnabled(true);
jLabel11.setEnabled(true);
jTf1.setEnabled(true);
jTf2.setEnabled(true);
jTf3.setEnabled(true);
jTf5.setEnabled(true);
jTf6.setEnabled(true);
pay="MASTERCARD CREDIT/DEBIT CARD";        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTf1;
    private javax.swing.JTextField jTf2;
    private javax.swing.JPasswordField jTf3;
    private javax.swing.JTextField jTf5;
    private javax.swing.JTextField jTf6;
    // End of variables declaration//GEN-END:variables
}
