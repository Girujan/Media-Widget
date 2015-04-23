/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcwidget;

import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author girujan
 */

public class Widget extends javax.swing.JFrame {

    /**
     * Creates new form Widget
     */
    int xMouse, yMouse;
    
    public Widget() {
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

        redditBtn = new javax.swing.JButton();
        youtubeBtn = new javax.swing.JButton();
        facebookBtn = new javax.swing.JButton();
        twitterBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        redditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcwidget/redditicon.png"))); // NOI18N
        redditBtn.setIconTextGap(0);
        redditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redditBtnActionPerformed(evt);
            }
        });

        youtubeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcwidget/YouTubelogo.png"))); // NOI18N
        youtubeBtn.setIconTextGap(0);
        youtubeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                youtubeBtnActionPerformed(evt);
            }
        });

        facebookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcwidget/facebook-icon-small.png"))); // NOI18N
        facebookBtn.setIconTextGap(0);
        facebookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facebookBtnActionPerformed(evt);
            }
        });

        twitterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcwidget/twitterlogo.png"))); // NOI18N
        twitterBtn.setIconTextGap(0);
        twitterBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        twitterBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        twitterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twitterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(facebookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(twitterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(youtubeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(facebookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(youtubeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twitterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void twitterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twitterBtnActionPerformed
        try {
            // TODO add your handling code here:
            String URL = "https://twitter.com/?lang=en";
            Desktop.getDesktop().browse(URI.create(URL));

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_twitterBtnActionPerformed

    private void facebookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facebookBtnActionPerformed
        // TODO add your handling code here:
        try{
            String URL = "https://www.facebook.com";
            Desktop.getDesktop().browse(URI.create(URL));
        }catch(IOException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_facebookBtnActionPerformed

    private void youtubeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_youtubeBtnActionPerformed
        // TODO add your handling code here:
        try{
            String URL = "https://www.youtube.com/";
            Desktop.getDesktop().browse(URI.create(URL));
        }catch(IOException err){
            JOptionPane.showMessageDialog(rootPane, err);
        }
    }//GEN-LAST:event_youtubeBtnActionPerformed

    private void redditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redditBtnActionPerformed
        // TODO add your handling code here:
        try{
            String URL = "http://www.reddit.com/";
            Desktop.getDesktop().browse(URI.create(URL));
        }catch(IOException err){
            JOptionPane.showMessageDialog(rootPane, err);
        }
    }//GEN-LAST:event_redditBtnActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(Widget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Widget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Widget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Widget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Widget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton facebookBtn;
    private javax.swing.JButton redditBtn;
    private javax.swing.JButton twitterBtn;
    private javax.swing.JButton youtubeBtn;
    // End of variables declaration//GEN-END:variables
}
