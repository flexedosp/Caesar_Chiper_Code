/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kriptographapps;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class Applications extends javax.swing.JFrame {

    /**
     * Creates new form Applications
     */
    public Applications() {
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

        jLabel1 = new javax.swing.JLabel();
        txtkey = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btenkripsi = new javax.swing.JButton();
        btdekripsi = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kriptographapps/UI-UX.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 414, 900));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        txtkey.setText("jTextField1");
        getContentPane().add(txtkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 160, 35));
        txtkey.getAccessibleContext().setAccessibleName("");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 406, 335, 90));
        jScrollPane2.getAccessibleContext().setAccessibleDescription("");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 536, 335, 85));
        jScrollPane3.getAccessibleContext().setAccessibleName("");

        btenkripsi.setLabel("ENKRIPSI");
        btenkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btenkripsiActionPerformed(evt);
            }
        });
        getContentPane().add(btenkripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 740, 100, 40));
        btenkripsi.getAccessibleContext().setAccessibleName("ENKRIPSI");

        btdekripsi.setActionCommand("DEKRIPSI");
        btdekripsi.setLabel("DEKRIPSI");
        btdekripsi.setName(""); // NOI18N
        btdekripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdekripsiActionPerformed(evt);
            }
        });
        getContentPane().add(btdekripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 740, 110, 40));
        btdekripsi.getAccessibleContext().setAccessibleName("DEKRIPSI");

        btkeluar.setActionCommand("KELUAR");
        btkeluar.setLabel("KELUAR");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 830, 100, 30));
        btkeluar.getAccessibleContext().setAccessibleName("KELUAR");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btenkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btenkripsiActionPerformed
        String key = txtkey.getText();
        String isitext = (key.length()) +key+txtPlaintext.getText();
        String out= "";
        for (int i=0; i<isitext.length(); i++)
        {
            int index = isitext.charAt(i);
            char s = (char)(index+1);
            out= out+String.valueOf(s);
        }
        txtChipertext.setText(out);
        txtPlaintext.setText("");
        txtkey.setText("");                    
    }//GEN-LAST:event_btenkripsiActionPerformed

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btkeluarActionPerformed

    private void btdekripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdekripsiActionPerformed
      String isitext = txtChipertext.getText();
       char k = (char) (isitext.charAt(0));
       String key = "",out = "";
       int jumkey = Integer.parseInt(String.valueOf(k))-1;
       
       for(int i=1; i<=jumkey; i++)
       {
           int index = isitext.charAt(i);
           char s = (char) (index-1);
           key = key + String.valueOf(s);
       }
       if(key.equals(txtkey.getText()))
       {
           for(int i=(jumkey+1); i<isitext.length(); i++)
           {
               int index = isitext.charAt(i);
               char s = (char) (index-1);
               out = out + String.valueOf(s);
           }
           txtPlaintext.setText(out);
       }
       else{
           JOptionPane.showMessageDialog(null,"key tidak cocok\nSilahkan coba lagi");
       }
    }//GEN-LAST:event_btdekripsiActionPerformed

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
            java.util.logging.Logger.getLogger(Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Applications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdekripsi;
    private javax.swing.JButton btenkripsi;
    private javax.swing.JButton btkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtkey;
    // End of variables declaration//GEN-END:variables
}
