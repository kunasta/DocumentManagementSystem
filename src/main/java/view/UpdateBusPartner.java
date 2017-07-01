/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.documentsystem.model.City;
import com.documentsystem.model.Businesspartner;
import db.DbCommunication;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import logic.Controller;

/**
 *
 * @author Asus
 */
public class UpdateBusPartner extends javax.swing.JFrame {

    /**
     * Creates new form UpdateBusPartner
     */
    public UpdateBusPartner() {
        initComponents();
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

        jPanel_updateBusPartner = new javax.swing.JPanel();
        jTextField_partnerAccountNumber = new javax.swing.JTextField();
        jTextField_partnerAddress = new javax.swing.JTextField();
        jComboBox_partnerCity = new javax.swing.JComboBox();
        jButton_updatePartner = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_partnerID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_partnerName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jTextField_partnerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_partnerAddressActionPerformed(evt);
            }
        });

        jComboBox_partnerCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton_updatePartner.setText("Update Partner Info");
        jButton_updatePartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updatePartnerActionPerformed(evt);
            }
        });

        jLabel1.setText("Partner Name");

        jLabel2.setText("Address");

        jLabel5.setText("ID");

        jTextField_partnerID.setEditable(false);
        jTextField_partnerID.setEnabled(false);

        jLabel3.setText("Account number");

        jLabel4.setText("City");

        javax.swing.GroupLayout jPanel_updateBusPartnerLayout = new javax.swing.GroupLayout(jPanel_updateBusPartner);
        jPanel_updateBusPartner.setLayout(jPanel_updateBusPartnerLayout);
        jPanel_updateBusPartnerLayout.setHorizontalGroup(
            jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_updateBusPartnerLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_partnerName)
                    .addComponent(jTextField_partnerAccountNumber)
                    .addComponent(jTextField_partnerAddress)
                    .addComponent(jComboBox_partnerCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_partnerID, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jButton_updatePartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel_updateBusPartnerLayout.setVerticalGroup(
            jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_updateBusPartnerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_partnerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_partnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_partnerAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_partnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_updateBusPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_partnerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jButton_updatePartner)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel_updateBusPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel_updateBusPartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_partnerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_partnerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_partnerAddressActionPerformed

    private void jButton_updatePartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updatePartnerActionPerformed
        try
        {
            
            String name = jTextField_partnerName.getText().trim();
            String accountNumber = jTextField_partnerAccountNumber.getText().trim();
            String address = jTextField_partnerAddress.getText().trim();
            City city = (City)jComboBox_partnerCity.getSelectedItem();
            Integer bpID=(Integer.parseInt(jTextField_partnerID.getText()));

         Businesspartner bp = new Businesspartner(name, new City(city.getZip(), city.getCityName()), accountNumber, address);;
            bp.setBpID(bpID);
            bp.setName(name);
            bp.setCity(city);
            bp.setAccountNumber(accountNumber);
            bp.setAddress(address);
            
           
            Controller.getInstance().updatePartner(bp);

            JOptionPane.showMessageDialog(this, "Business Partner Updated!");
           this.dispose();
           ViewAllBusinessPartners vp = new ViewAllBusinessPartners();
           vp.setVisible(true);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Business Partner NOOOOOOT Updated!");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_updatePartnerActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBusPartner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_updatePartner;
    public javax.swing.JComboBox jComboBox_partnerCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel_updateBusPartner;
    public javax.swing.JTextField jTextField_partnerAccountNumber;
    public javax.swing.JTextField jTextField_partnerAddress;
    public javax.swing.JTextField jTextField_partnerID;
    public javax.swing.JTextField jTextField_partnerName;
    // End of variables declaration//GEN-END:variables

private void srediFormu()
  {
    try
    {
      java.util.List<City> lc = Controller.getInstance().getCityList();
      JComboBox cityTable = new JComboBox();
      jComboBox_partnerCity.removeAllItems();
      for (City c : lc) {
        jComboBox_partnerCity.addItem(c);
        cityTable.addItem(c);
      }
      
  
     
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(this, ex.getMessage());
    }
  }

}