/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Admin
 */
import java.sql.*;

public class Kamar extends javax.swing.JFrame {

    /**
     * Creates new form Kamar
     * Memanggil method initComponents
     */
    public Kamar() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Kamar = new javax.swing.JComboBox();
        jumlahkamar = new javax.swing.JTextField();
        terisi = new javax.swing.JTextField();
        kosong = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Tamu = new javax.swing.JMenu();
        Menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("KELAS KAMAR HOTEL MANTEP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Kamar");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Terisi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Kosong");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Jumlah Kamar");

        Kamar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Reguler", "2. Premium", "3. Suite", "4. VIP" }));
        Kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KamarActionPerformed(evt);
            }
        });

        jumlahkamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahkamarActionPerformed(evt);
            }
        });

        terisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terisiActionPerformed(evt);
            }
        });

        jButton1.setText("Menu Utama");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jMenu1.setText("Menu");

        Tamu.setText("Tamu");
        Tamu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TamuMouseClicked(evt);
            }
        });
        jMenu1.add(Tamu);

        Menu.setText("Menu utama");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });
        jMenu1.add(Menu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addComponent(Kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlahkamar)
                            .addComponent(terisi)
                            .addComponent(kosong, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jumlahkamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(terisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kosong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        // Menu
        // Membuat objek Mu dari kelas MenuUtama
        MenuUtama Mu = new MenuUtama();
        // Memanggil setVisible() yang menampilkan output
        Mu.setVisible(true);
        // Memanggil setVisible() yang menyembunyikan output
        this.setVisible(false);
    }//GEN-LAST:event_MenuMouseClicked

    /**
     * 
     * @param evt 
     */
    private void TamuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TamuMouseClicked
        // Tamu
        // Membuat objek T dari kelas Tamu
        Tamu T = new Tamu();
        // Memanggil setVisible() yang menampilkan output
        T.setVisible(true);
        // Memanggil setVisible() yang menyembunyikan output
        this.setVisible(false);
    }//GEN-LAST:event_TamuMouseClicked

    /**
     * 
     * @param evt 
     */
    private void KamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KamarActionPerformed
        // Kamar
        String h = "jdbc:derby://localhost:1527/hotel";
        // Jika kamar yang dipilih "Reguler", maka jumlah kamarnya adalah 50
        if (Kamar.getSelectedItem() == "1. Reguler") {
            jumlahkamar.setText("50");
            try {
                Connection con = DriverManager.getConnection(h);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM kamar WHERE status = true");
                // Inisialisasi variabel q bertipe integer, bernilai 0
                int q = 0;
                // Inisialisasi variabel z bertipe integer, bernilai 0
                int z = 0;
                // Perulangan
                while (rs.next()) {
                    // Memberi nilai variabel j bertipe boolean
                    boolean j = rs.getBoolean(4);
                    // Jika user memilih reguler, maka
                    if (rs.getString(1).equals("reguler")) {
                        // Increment variabel q
                        q++;
                    }
                }
                // Jika kamar terisi, tampilan akan formatnya seperti ini
                terisi.setText(String.format("%d", q));
                // Jika kamar kosong, tampilan akan formatnya seperti ini
                kosong.setText(String.format("%d", (50-q)));
            } catch (SQLException err) {
                // Jika terjadi error
                // Menampilkan error message
                System.out.println(err.getMessage());
            }
            // Jika kamar yang terpilih "Premium", maka jumlah kamarnya adalah 20
        } else if (Kamar.getSelectedItem() == "2. Premium") {
            jumlahkamar.setText("20");
            try {
                Connection con = DriverManager.getConnection(h);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM kamar WHERE status = true");
                // Inisialisasi variabel q bertipe data integer, bernilai 0
                int q = 0;
                // Inisialisasi variabel z bertipe data integer, bernilai 0
                int z = 0;
                // Perulangan
                while (rs.next()) {
                    // Memberi nilai variabel j bertipe boolean
                    boolean j = rs.getBoolean(4);
                    // Jika user memilih "Premium", maka
                    if (rs.getString(1).equals("premium")) {
                        // Increment variabel q
                        q++;
                    }
                }
                // Jika kamar terisi maka format sudah diatur seperti di atas
                terisi.setText(String.format("%d", q));
                // Jika kamar kosong maka formatnya seperti ini
                kosong.setText(String.format("%d", 20-q));
            } catch (SQLException err) {
                // Jika terjadi error
                // Akan menampilkan error Message
                System.out.println(err.getMessage());
            }
            // Jika kamar yang terpilih "Suite", maka jumlah kamarnya adalah 20
        } else if (Kamar.getSelectedItem() == "3. Suite") {
            jumlahkamar.setText("20");
            try {
                Connection con = DriverManager.getConnection(h);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM kamar WHERE status = true");
                // Inisialisasi variabel q bertipe data integer, bernilai 0
                int q = 0;
                // Inisialisasi variabel z bertipe data integer, bernilai 0
                int z = 0;
                // Perulangan
                while (rs.next()) {
                    // Memberi nilai variabel j bertipe boolean
                    boolean j = rs.getBoolean(4);
                    // Jika user memilih "Suite", maka
                    if (rs.getString(1).equals("suite")) {
                        // Increment variabel q
                        q++;
                    }
                }
                // Jika kamar terisi, maka formatnya seperti ini
                terisi.setText(String.format("%d", q));
                // Jika kamar kosong maka formatnya seperti ini
                kosong.setText(String.format("%d", (20-q)));
            } catch (SQLException err) {
                // Jika terjadi error
                // Menampilkan error Message
                System.out.println(err.getMessage());
            }
            // Jika kamar yang terpilih "VIP", maka jumlah kamarnya adalah 10
        } else if (Kamar.getSelectedItem() == "4. VIP") {
            jumlahkamar.setText("10");
            try {
                Connection con = DriverManager.getConnection(h);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM kamar WHERE status = true");
                // Inisialisasi variabel q bertipe data integer, bernilai 0
                int q = 0;
                // Inisialisasi variabel z bertipe data integer, bernilai 0
                int z = 0;
                // Perulangan
                while (rs.next()) {
                    // Memberi nilai variabel j bertipe boolean
                    boolean j = rs.getBoolean(4);
                    // Jika user memilih "VIP", maka
                    if (rs.getString(1).equals("VIP")) {
                        // Increment variabel q
                        q++;
                    }
                }
                // Jika terisi maka akan formatnya seperti ini
                terisi.setText(String.format("%d", q));
                // Jika kosong maka akan formatnya seperti ini
                kosong.setText(String.format("%d", (10-q)));
            } catch (SQLException err) {
                // Jika Error, maka
                // Menampilkan Error Massage
                System.out.println(err.getMessage());
            }

        }
    }//GEN-LAST:event_KamarActionPerformed

    /**
     * 
     * @param evt 
     * // Menu
     * 
     */
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Menu
        // Membuat objek Mu dari kelas MenuUtama
        MenuUtama Mu = new MenuUtama();
        // Memanggil setVisible() yang menampilkan output
        Mu.setVisible(true);
        // Memanggil setVisible() yang menyembunyikan output
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * 
     * @param evt 
     * // TODO add your handling code here:
     * 
     */
    private void jumlahkamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahkamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahkamarActionPerformed

    /**
     * 
     * @param evt 
     * // TODO add your handling code here:
     * 
     */
    private void terisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terisiActionPerformed

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
            java.util.logging.Logger.getLogger(Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * @see Kamar()
             */
            public void run() {
                new Kamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Kamar;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenu Tamu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jumlahkamar;
    private javax.swing.JTextField kosong;
    private javax.swing.JTextField terisi;
    // End of variables declaration//GEN-END:variables
}
