/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderclient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Melida
 */
public class FoodOrderClient extends javax.swing.JFrame {

    private BufferedReader in;
    private PrintWriter out;
    public String ChoosenFood;
    public String ChoosenDrink;
    public int price=0;
    public int ukupno=0;
   /* private JFrame frame = new JFrame("Capitalize Client");
    private JTextField dataField = new JTextField(40);
    private JTextArea messageArea = new JTextArea(8, 60);*/
    /**
     * Creates new form FoodOrderClient
     */
    public FoodOrderClient() {
        
        initComponents();
        this.txtPorudzbina.setEditable(false);
        this.txtOrderDetails.setEditable(false);
        
    }
    public void Hrana() throws IOException
    {   
            String response;
            try{
                while(true){
                response=in.readLine();
                 this.txtOrderDetails.append(response+"\n");  
                 }   
            }
            catch(Exception ex)
            {
                
            } 
    }
    
   public void HandlerEventFood(JButton b)
   {
        this.ChoosenFood=b.getText();
        this.txtPorudzbina.setText(this.txtPorudzbina.getText()+ChoosenFood+"\n");
   }
   public void HandlerEventDrink(JButton b)
  {
        this.ChoosenDrink=b.getText();
        this.txtPorudzbina.setText(this.txtPorudzbina.getText()+ChoosenDrink+"\n");
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnBurger = new javax.swing.JButton();
        btnPizza = new javax.swing.JButton();
        btnFries = new javax.swing.JButton();
        btnFish = new javax.swing.JButton();
        btnNacos = new javax.swing.JButton();
        btnSushi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCoffee = new javax.swing.JButton();
        btnWater = new javax.swing.JButton();
        btnPepsi = new javax.swing.JButton();
        btnOrange = new javax.swing.JButton();
        btnFrape = new javax.swing.JButton();
        btnJuice = new javax.swing.JButton();
        btbPoruci = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPorudzbina = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOrderDetails = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(730, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(164, 198, 57));
        jPanel3.setMaximumSize(new java.awt.Dimension(730, 480));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(164, 198, 57));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(248, 235, 216));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBurger.setBackground(new java.awt.Color(252, 203, 26));
        btnBurger.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBurger.setForeground(new java.awt.Color(255, 255, 255));
        btnBurger.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\burger (2).png")); // NOI18N
        btnBurger.setText("Burger");
        btnBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenFoodHandler(evt);
            }
        });
        jPanel1.add(btnBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 130));

        btnPizza.setBackground(new java.awt.Color(252, 203, 26));
        btnPizza.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPizza.setForeground(new java.awt.Color(255, 255, 255));
        btnPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\pizza-slice.png")); // NOI18N
        btnPizza.setText("Pizza");
        btnPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenFoodHandler(evt);
            }
        });
        jPanel1.add(btnPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 130));

        btnFries.setBackground(new java.awt.Color(252, 203, 26));
        btnFries.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFries.setForeground(new java.awt.Color(255, 255, 255));
        btnFries.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\fries.png")); // NOI18N
        btnFries.setText("Fries");
        btnFries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenFoodHandler(evt);
            }
        });
        jPanel1.add(btnFries, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 160, 130));

        btnFish.setBackground(new java.awt.Color(252, 203, 26));
        btnFish.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFish.setForeground(new java.awt.Color(255, 255, 255));
        btnFish.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\atlantic.png")); // NOI18N
        btnFish.setText("Fish ");
        btnFish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenFoodHandler(evt);
            }
        });
        jPanel1.add(btnFish, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 130));

        btnNacos.setBackground(new java.awt.Color(252, 203, 26));
        btnNacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNacos.setForeground(new java.awt.Color(255, 255, 255));
        btnNacos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\nachos.png")); // NOI18N
        btnNacos.setText("Nacosi");
        btnNacos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenFoodHandler(evt);
            }
        });
        jPanel1.add(btnNacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 130));

        btnSushi.setBackground(new java.awt.Color(252, 203, 26));
        btnSushi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSushi.setForeground(new java.awt.Color(255, 255, 255));
        btnSushi.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\sushi.png")); // NOI18N
        btnSushi.setText("Sushi");
        btnSushi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenFoodHandler(evt);
            }
        });
        jPanel1.add(btnSushi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 130));

        jTabbedPane2.addTab("Food", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCoffee.setBackground(new java.awt.Color(246, 83, 20));
        btnCoffee.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCoffee.setForeground(new java.awt.Color(255, 255, 255));
        btnCoffee.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\coffee-cup.png")); // NOI18N
        btnCoffee.setText("Coffee");
        btnCoffee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenDrinkHandler(evt);
            }
        });
        jPanel2.add(btnCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 130));

        btnWater.setBackground(new java.awt.Color(246, 83, 20));
        btnWater.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnWater.setForeground(new java.awt.Color(255, 255, 255));
        btnWater.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\water.png")); // NOI18N
        btnWater.setText("Water");
        btnWater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenDrinkHandler(evt);
            }
        });
        jPanel2.add(btnWater, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 130));

        btnPepsi.setBackground(new java.awt.Color(246, 83, 20));
        btnPepsi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPepsi.setForeground(new java.awt.Color(255, 255, 255));
        btnPepsi.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\can.png")); // NOI18N
        btnPepsi.setText("Pepsi");
        btnPepsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenDrinkHandler(evt);
            }
        });
        jPanel2.add(btnPepsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 130));

        btnOrange.setBackground(new java.awt.Color(246, 83, 20));
        btnOrange.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnOrange.setForeground(new java.awt.Color(255, 255, 255));
        btnOrange.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\orange-juice.png")); // NOI18N
        btnOrange.setText("Orange");
        btnOrange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenDrinkHandler(evt);
            }
        });
        jPanel2.add(btnOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 130));

        btnFrape.setBackground(new java.awt.Color(246, 83, 20));
        btnFrape.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFrape.setForeground(new java.awt.Color(255, 255, 255));
        btnFrape.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\frappe.png")); // NOI18N
        btnFrape.setText("Frappe");
        btnFrape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenDrinkHandler(evt);
            }
        });
        jPanel2.add(btnFrape, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 160, 130));

        btnJuice.setBackground(new java.awt.Color(246, 83, 20));
        btnJuice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnJuice.setForeground(new java.awt.Color(255, 255, 255));
        btnJuice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melida\\Downloads\\strawberry-juice.png")); // NOI18N
        btnJuice.setText("Juice");
        btnJuice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoosenDrinkHandler(evt);
            }
        });
        jPanel2.add(btnJuice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 130));

        jTabbedPane2.addTab("Drinks", jPanel2);

        jPanel3.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        btbPoruci.setBackground(new java.awt.Color(164, 198, 57));
        btbPoruci.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btbPoruci.setForeground(new java.awt.Color(255, 255, 255));
        btbPoruci.setText("Order");
        btbPoruci.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btbPoruci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbPoruciActionPerformed(evt);
            }
        });
        jPanel3.add(btbPoruci, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 390, 50));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        txtPorudzbina.setColumns(20);
        txtPorudzbina.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPorudzbina.setRows(5);
        txtPorudzbina.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jScrollPane1.setViewportView(txtPorudzbina);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 230, 340));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Receipt");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 70, 30));

        jPanel4.setBackground(new java.awt.Color(150, 182, 52));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List of orders");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 400, 40));

        txtOrderDetails.setColumns(20);
        txtOrderDetails.setRows(5);
        jScrollPane2.setViewportView(txtOrderDetails);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 160, 310));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbPoruciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbPoruciActionPerformed
        // TODO add your handling code here:
        if(this.txtPorudzbina.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(this, "You didn't choose");
        }
        else
        {
          try{
              out.println(this.txtPorudzbina.getText()); 
              this.txtPorudzbina.setText("");
              int dialogButton = JOptionPane.YES_NO_OPTION;
               int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to order again", "Order", dialogButton);
               if(dialogResult == 0) {     
                   this.txtOrderDetails.setText("");            
               } 
               else {
              System.exit(0);
              }    
        }
        catch(Exception ex)
        {
            //System.out.println("nema");
        }
        }
    }//GEN-LAST:event_btbPoruciActionPerformed
  
    private void ChoosenFoodHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoosenFoodHandler
       
        // TODO add your handling code here:
        HandlerEventFood((JButton)evt.getSource());
        
    }//GEN-LAST:event_ChoosenFoodHandler

    private void ChoosenDrinkHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoosenDrinkHandler
        // TODO add your handling code here:
        HandlerEventDrink((JButton)evt.getSource());
    }//GEN-LAST:event_ChoosenDrinkHandler

   
    /**
     * @param args the command line arguments
     */
    
    public void connectToServer() throws IOException {

        // Get the server address from a dialog
// box.
        String serverAddress = "localhost";

        // Make connection and initialize streams
        try{
        Socket socket = new Socket("localhost", 9898);
        in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);}
        catch(Exception ex)
        { 
            JOptionPane.showMessageDialog(this, "Nema servera");
        }
    }
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(FoodOrderClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodOrderClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodOrderClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodOrderClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
                FoodOrderClient client=new FoodOrderClient();
                    client.setVisible(true);
                    client.connectToServer();
                    client.Hrana();
    }    
            
        
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbPoruci;
    private javax.swing.JButton btnBurger;
    private javax.swing.JButton btnCoffee;
    private javax.swing.JButton btnFish;
    private javax.swing.JButton btnFrape;
    private javax.swing.JButton btnFries;
    private javax.swing.JButton btnJuice;
    private javax.swing.JButton btnNacos;
    private javax.swing.JButton btnOrange;
    private javax.swing.JButton btnPepsi;
    private javax.swing.JButton btnPizza;
    private javax.swing.JButton btnSushi;
    private javax.swing.JButton btnWater;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea txtOrderDetails;
    private javax.swing.JTextArea txtPorudzbina;
    // End of variables declaration//GEN-END:variables
}
