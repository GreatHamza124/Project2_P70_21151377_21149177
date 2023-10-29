/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_2_group;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Hamza
 */
public class ShoppingCart_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Shopping_Cart
     */
    public ShoppingCart_Screen() {
        initComponents();
        cart_adjustments();
        cart_Details();
    }
    
    
    /**
     * Method to adjust the appearance and behavior of the cart table.
     */
    public void cart_adjustments(){
        DefaultTableModel model_Product = new DefaultTableModel();
        model_Product.addColumn("ID");
        model_Product.addColumn("Name");
        model_Product.addColumn("Price");
        model_Product.addColumn("Quantity");
        model_Product.addColumn("Category");
        
        // Get the column model for customization
        TableColumnModel customcolumn = cart_table.getColumnModel();
        cart_table.setModel(model_Product);
        
        // Set selection mode and disable reordering of columns
        cart_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cart_table.getTableHeader().setReorderingAllowed(false);
        
        // Customize column widths and make them non-resizable
        customcolumn.getColumn(0).setResizable(false);
        customcolumn.getColumn(0).setPreferredWidth(600);
        
        customcolumn.getColumn(1).setResizable(false);
        customcolumn.getColumn(1).setPreferredWidth(600);

        customcolumn.getColumn(2).setResizable(false);
        customcolumn.getColumn(2).setPreferredWidth(600);
        
        customcolumn.getColumn(3).setResizable(false);
        customcolumn.getColumn(3).setPreferredWidth(600);
        
        customcolumn.getColumn(4).setResizable(false);
        customcolumn.getColumn(4).setPreferredWidth(600);
        
        
    }
    
    /**
     * Method to retrieve and display the cart details in the table.
     */
    public void cart_Details(){
        DefaultTableModel model = (DefaultTableModel) cart_table.getModel();
        model.setRowCount(0);
        
        // Retrieve data from the shopping cart database
        ResultSet item_Result = MainProgram.shopping_cart.executeQuery("SELECT * FROM shoppingcart");
   
        try{
            while (item_Result.next()){
                int id = item_Result.getInt("id");
                String name = item_Result.getString("name");
                double price = item_Result.getDouble("price");
                int quantity = item_Result.getInt("quantity");
                String category = item_Result.getString("category");
                
                // Add retrieved data to the table model
                model.addRow(new Object[]{id,name,price,quantity,category});
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    /**
     * Method to update the shopping cart after an item is removed.
     * @param quantity_left The quantity of the item remaining in the cart.
     * @param quantity_input The quantity entered by the user for removal.
     * @param product_id The ID of the product being removed.
     */
    public void updateShoppingCart(int quantity_left, int quantity_input, int product_id){
        String update_item = "UPDATE shoppingcart SET quantity = " + (quantity_left - quantity_input) + " WHERE id = " + product_id;
        MainProgram.shopping_cart.executeUpdate(update_item);
        this.cart_Details();
        
    }
    
    //Method to handle the case where quantity input is equal to quantity left.
    //Removes the item from the cart.
    public void emptyInventory(int quantity_left, int quantity_input, int product_id){
        if (quantity_input == quantity_left){
            String remove_item = "DELETE FROM shoppingcart WHERE id = " + product_id;
            MainProgram.shopping_cart.executeUpdate(remove_item);
            this.cart_Details();
        }
        
    }
    
    //Method to retrieve the value from the table at a specified row
    public Object getValuefromtable(int row){
        return cart_table.getValueAt(cart_table.getSelectedRow(), row);
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        end_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart_table = new javax.swing.JTable();
        remove_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        quantity_enter = new javax.swing.JTextField();
        Finish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Shopping Cart");

        end_button.setText("End");
        end_button.setToolTipText("");
        end_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151)
                .addComponent(end_button)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(end_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        cart_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(cart_table);

        remove_button.setText("Remove");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Quantity:");

        Finish.setText("Finish");
        Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(remove_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Finish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back_button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantity_enter, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addComponent(remove_button))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back_button)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Finish)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Event handler for back button
    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        new Shop_Screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_buttonActionPerformed

    // Event handler for remove button
    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed
        if (cart_table.getSelectedRow() >= 0){
            int product_id = (int) getValuefromtable(0);
            String product_name = getValuefromtable(1).toString();
            Double product_price = (Double) getValuefromtable(2);;
            String product_category = getValuefromtable(4).toString();
            
            int quantity_left = (int) getValuefromtable(3);;
            int quantity_input = 0;
            try{
                quantity_input = Integer.parseInt(quantity_enter.getText());
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(this, "Please enter a valid number");
                return;
            }
            
            if (quantity_input != 0){
                if (quantity_input > quantity_left){
                    JOptionPane.showMessageDialog(this, "Not enough in cart");
                }else{

                    updateShoppingCart(quantity_left, quantity_input, product_id);
                    
                    emptyInventory(quantity_left, quantity_input, product_id);
                    
                    String already_query = "SELECT name FROM Shop WHERE id = " + product_id;
                    ResultSet checkResult = MainProgram.shop_items.executeQuery(already_query);
                    
                    try{
                        if (!checkResult.next()){
                            String shop_columns = " (id, name, price, quantity, category)";
                            String insert_shop = "(" + product_id + ", '" + product_name + "', " + product_price + ", " + quantity_input + ", '" + product_category + "')";
                            MainProgram.shop_items.insertTable(insert_shop, "Shop", shop_columns);
                        }else{
                            String insert_cart = "UPDATE Shop SET quantity = quantity + " + quantity_input + " WHERE id = " + product_id;
                            MainProgram.shop_items.executeUpdate(insert_cart);
                        }
                        
                    }catch(SQLException e){
                        e.printStackTrace();
                    }
                    
                }
            }
        }
    }//GEN-LAST:event_remove_buttonActionPerformed

    // Event handler for Finish button
    private void FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishActionPerformed
        this.setVisible(false);
        new Payment_Screen().setVisible(true);
    }//GEN-LAST:event_FinishActionPerformed

    // Event handler for end button
    private void end_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end_buttonActionPerformed
        end_program();
    }//GEN-LAST:event_end_buttonActionPerformed

    /**
     * Method to close connections and exit the program.
     */
    public void end_program(){
        MainProgram.signup_list.closeConnection();
        MainProgram.shopping_cart.closeConnection();
        MainProgram.shop_items.closeConnection();
        System.exit(0);
    }
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
            java.util.logging.Logger.getLogger(ShoppingCart_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCart_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Finish;
    private javax.swing.JButton back_button;
    private javax.swing.JTable cart_table;
    private javax.swing.JButton end_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantity_enter;
    private javax.swing.JButton remove_button;
    // End of variables declaration//GEN-END:variables
}