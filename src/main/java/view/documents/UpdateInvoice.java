/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.documents;

import com.documentsystem.model.Businesspartner;
import com.documentsystem.model.Customer;
import com.documentsystem.model.Invoice;
import com.documentsystem.model.OrderItem;
import com.documentsystem.model.Products;
import com.documentsystem.model.Users;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import logic.Controller;
import view.documents.OrderItemTableModel;

/**
 *
 * @author Asus
 */
public class UpdateInvoice extends javax.swing.JFrame {
//List<OrderItem> orderItemList;

    Invoice i;

    /**
     * Creates new form UpdateInvoice
     */
    public UpdateInvoice(Invoice i) throws Exception {
        this.i = i;
        initComponents();
        // orderItemList = new LinkedList<>();
        srediFormu();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_customer = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField_date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_orderItems = new javax.swing.JTable();
        jButton_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField_id.setEditable(false);
        jTextField_id.setEnabled(false);

        jLabel1.setText("ID");

        jComboBox_customer.setEditable(true);
        jComboBox_customer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_customer.setEnabled(false);

        jLabel2.setText("Customer");

        jLabel3.setText("Date");

        jTable_orderItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_orderItems);

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_date)
                                    .addComponent(jComboBox_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton_back)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_back)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        this.dispose();
        ViewAllInvoices v;
        try {
            v = new ViewAllInvoices();
            v.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(UpdateInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_backActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    public javax.swing.JComboBox jComboBox_customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_orderItems;
    public javax.swing.JTextField jTextField_date;
    public javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() throws Exception {

        try {
            Users user = Controller.getInstance().getLogged();
            //Customer c = Controller.getInstance().getPartnerList();
            String logged = user.getUsername();

            Businesspartner bpid = user.getBp();
            List<Customer> bp = Controller.getInstance().getCustomerListConditional(bpid);
            JComboBox customer = new JComboBox();
            jComboBox_customer.removeAllItems();
            for (Customer c : bp) {

                jComboBox_customer.addItem(c);
                customer.addItem(c);
            }
            jTextField_id.setText("" + i.getInvoiceID());
            jComboBox_customer.setSelectedItem(i.getCustomer());
            jTextField_date.setText(i.getInvoiceDate().toString());

            OrderItemTableModel model = new OrderItemTableModel(i);
            System.out.println(i.getOrderItemList().size());
            jTable_orderItems.setModel(model);
//                List<OrderItem> ol = new LinkedList<>();
//                 for(OrderItem o: orderItemList){
//                ol.add(o);
//                    }
//            OrderItemTableModel model = new OrderItemTableModel(ol);
//            jTable_orderItems.setModel(model);

//
//                List<OrderItem> ol = Controller.getInstance().getOrderItemList();
//                OrderItemTableModel model = new OrderItemTableModel(ol);
//                jTable_orderItems.setModel(model);
        } catch (Exception ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }
}