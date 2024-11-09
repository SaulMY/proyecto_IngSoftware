package com.mycompany.proyectois;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.mycompany.controls.ControlRegProd;
import com.mycompany.interfaces.Home;
import com.mycompany.interfaces.InterfazEditProduct;
import com.mycompany.interfaces.InterfazRegProduct;
import com.mycompany.interfaces.InterfazDelProduct;
import java.awt.BorderLayout;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JPanel;

public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    ControlRegProd controlProd = new ControlRegProd();
    
    public MainInterface() {
        initComponents();
        
        Home home = new Home();
        
        content.removeAll();
        content.add(home, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        principal = new javax.swing.JButton();
        addProd = new javax.swing.JButton();
        editProd = new javax.swing.JButton();
        delProd = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setMaximumSize(new java.awt.Dimension(1020, 700));
        bg.setPreferredSize(new java.awt.Dimension(1020, 700));

        menuBar.setMinimumSize(new java.awt.Dimension(240, 100));
        menuBar.setPreferredSize(new java.awt.Dimension(270, 700));

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("LOGO");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        principal.setBackground(new java.awt.Color(242, 242, 242));
        principal.setText("Principal");
        principal.setBorder(null);
        principal.setBorderPainted(false);
        principal.setPreferredSize(new java.awt.Dimension(270, 40));
        principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalActionPerformed(evt);
            }
        });

        addProd.setBackground(new java.awt.Color(242, 242, 242));
        addProd.setText("Añadir producto");
        addProd.setBorder(null);
        addProd.setBorderPainted(false);
        addProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProd.setPreferredSize(new java.awt.Dimension(270, 40));
        addProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdActionPerformed(evt);
            }
        });

        editProd.setBackground(new java.awt.Color(242, 242, 242));
        editProd.setText("Editar producto");
        editProd.setBorder(null);
        editProd.setBorderPainted(false);
        editProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProd.setPreferredSize(new java.awt.Dimension(270, 40));
        editProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProdActionPerformed(evt);
            }
        });

        delProd.setBackground(new java.awt.Color(242, 242, 242));
        delProd.setText("Eliminar producto");
        delProd.setBorder(null);
        delProd.setBorderPainted(false);
        delProd.setPreferredSize(new java.awt.Dimension(270, 40));
        delProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuBarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(756, 756, 756))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuBarLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(addProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(editProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(delProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content.setMaximumSize(new java.awt.Dimension(750, 720));
        content.setMinimumSize(new java.awt.Dimension(750, 720));
        content.setPreferredSize(new java.awt.Dimension(750, 720));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBar, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, 1026, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, 720, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdActionPerformed
        // Este lo hace saul
        InterfazRegProduct regProd = new InterfazRegProduct(controlProd);
        ShowPanel(regProd);
    }//GEN-LAST:event_addProdActionPerformed

    private void editProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProdActionPerformed
        // Este lo hace saul
        InterfazEditProduct regProd = new InterfazEditProduct(controlProd);
        ShowPanel(regProd);
    }//GEN-LAST:event_editProdActionPerformed

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
        // TODO add your handling code here:
        Home principal = new Home();
        ShowPanel(principal);
    }//GEN-LAST:event_principalActionPerformed

    private void delProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delProdActionPerformed
        // Este lo hace Luis
        InterfazDelProduct regProd = new InterfazDelProduct(controlProd);
        ShowPanel(regProd);
    }//GEN-LAST:event_delProdActionPerformed

    //aditional functions
    private void ShowPanel(JPanel panel){
        panel.setSize(750, 720);
        panel.setLocation(0, 0);
        
        content.removeAll();
        content.add(panel,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightFlatIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProd;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JButton delProd;
    private javax.swing.JButton editProd;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuBar;
    private javax.swing.JButton principal;
    // End of variables declaration//GEN-END:variables
}
