
package ScreensPkg;

public class HelpMenu extends javax.swing.JFrame {

    // Creates new HelpMenu frame
    public HelpMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HelpMenuPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblQuestion1 = new javax.swing.JLabel();
        lblAnswer1P1 = new javax.swing.JLabel();
        btnExitExample = new javax.swing.JButton();
        lblAnswer1P2 = new javax.swing.JLabel();
        lblQuestion2 = new javax.swing.JLabel();
        lblAnswer2P1 = new javax.swing.JLabel();
        btnSelectExample = new javax.swing.JButton();
        lblAnswer2P2 = new javax.swing.JLabel();
        lblQuestion3 = new javax.swing.JLabel();
        lblAnswer3P1 = new javax.swing.JLabel();
        btnBackExample = new javax.swing.JButton();
        lblAnswer3P2 = new javax.swing.JLabel();
        lblTip = new javax.swing.JLabel();
        btnCloseHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 550));
        setMinimumSize(new java.awt.Dimension(500, 550));
        setPreferredSize(new java.awt.Dimension(500, 550));
        setResizable(false);

        HelpMenuPanel.setBackground(new java.awt.Color(32, 5, 60));
        HelpMenuPanel.setMaximumSize(new java.awt.Dimension(500, 550));
        HelpMenuPanel.setMinimumSize(new java.awt.Dimension(500, 550));
        HelpMenuPanel.setPreferredSize(new java.awt.Dimension(500, 550));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("HELP MENU FAQ");
        lblTitle.setIconTextGap(10);

        lblQuestion1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        lblQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion1.setText("How do I close the program?");

        lblAnswer1P1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer1P1.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer1P1.setText("Click on");

        btnExitExample.setBackground(new java.awt.Color(255, 255, 255));
        btnExitExample.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnExitExample.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ExitIcon.png"))); // NOI18N
        btnExitExample.setText("Exit");
        btnExitExample.setToolTipText("When you see this button, click it to exit the program");
        btnExitExample.setIconTextGap(8);
        btnExitExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitExampleActionPerformed(evt);
            }
        });

        lblAnswer1P2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer1P2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer1P2.setText("to close the program.");

        lblQuestion2.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        lblQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion2.setText("How do I open the equation calculator?");

        lblAnswer2P1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer2P1.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer2P1.setText("Once you have found an equation, click on");

        btnSelectExample.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectExample.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSelectExample.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SelectIcon.png"))); // NOI18N
        btnSelectExample.setText("Select");
        btnSelectExample.setToolTipText("When you see this button, click it to open the above equation");
        btnSelectExample.setIconTextGap(8);
        btnSelectExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectExampleActionPerformed(evt);
            }
        });

        lblAnswer2P2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer2P2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer2P2.setText("below to the one you want to open.");

        lblQuestion3.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        lblQuestion3.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion3.setText("How do I go back to the main menu?");

        lblAnswer3P1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer3P1.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer3P1.setText("Click on");

        btnBackExample.setBackground(new java.awt.Color(255, 255, 255));
        btnBackExample.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnBackExample.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/BackIcon.png"))); // NOI18N
        btnBackExample.setText("Back");
        btnBackExample.setToolTipText("When you see this button, click it to go back to the previous screen");
        btnBackExample.setIconTextGap(8);
        btnBackExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackExampleActionPerformed(evt);
            }
        });

        lblAnswer3P2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer3P2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer3P2.setText("until you see the main menu.");

        lblTip.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblTip.setForeground(new java.awt.Color(255, 255, 255));
        lblTip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTip.setText("Tip: when unsure about something, hover your mouse over it");

        btnCloseHelp.setBackground(new java.awt.Color(255, 255, 255));
        btnCloseHelp.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCloseHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ExitIcon.png"))); // NOI18N
        btnCloseHelp.setText("Close Help Menu");
        btnCloseHelp.setToolTipText("Click here to exit the program");
        btnCloseHelp.setIconTextGap(8);
        btnCloseHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HelpMenuPanelLayout = new javax.swing.GroupLayout(HelpMenuPanel);
        HelpMenuPanel.setLayout(HelpMenuPanelLayout);
        HelpMenuPanelLayout.setHorizontalGroup(
            HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblTitle))
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTip)
                            .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblQuestion1)
                                .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                                    .addComponent(lblAnswer1P1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnExitExample)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblAnswer1P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblQuestion2)
                                .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                                    .addComponent(lblAnswer2P1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSelectExample))
                                .addComponent(lblQuestion3)
                                .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                                    .addComponent(lblAnswer3P1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBackExample)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblAnswer3P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblAnswer2P2)))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpMenuPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCloseHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        HelpMenuPanelLayout.setVerticalGroup(
            HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addComponent(lblQuestion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswer1P1)
                    .addComponent(lblAnswer1P2)
                    .addComponent(btnExitExample, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(lblQuestion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswer2P1)
                    .addComponent(btnSelectExample, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnswer2P2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(lblQuestion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswer3P1)
                    .addComponent(lblAnswer3P2)
                    .addComponent(btnBackExample, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(lblTip)
                .addGap(18, 18, 18)
                .addComponent(btnCloseHelp)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HelpMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HelpMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseHelpActionPerformed
        // Close the help menu
        this.dispose();
    }//GEN-LAST:event_btnCloseHelpActionPerformed

    private void btnExitExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitExampleActionPerformed
        // Nothing happens when the button is clicked because this is an example button
    }//GEN-LAST:event_btnExitExampleActionPerformed

    private void btnSelectExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectExampleActionPerformed
        // Nothing happens when the button is clicked because this is an example button
    }//GEN-LAST:event_btnSelectExampleActionPerformed

    private void btnBackExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackExampleActionPerformed
        // Nothing happens when the button is clicked because this is an example button
    }//GEN-LAST:event_btnBackExampleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HelpMenuPanel;
    private javax.swing.JButton btnBackExample;
    private javax.swing.JButton btnCloseHelp;
    private javax.swing.JButton btnExitExample;
    private javax.swing.JButton btnSelectExample;
    private javax.swing.JLabel lblAnswer1P1;
    private javax.swing.JLabel lblAnswer1P2;
    private javax.swing.JLabel lblAnswer2P1;
    private javax.swing.JLabel lblAnswer2P2;
    private javax.swing.JLabel lblAnswer3P1;
    private javax.swing.JLabel lblAnswer3P2;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblQuestion3;
    private javax.swing.JLabel lblTip;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
