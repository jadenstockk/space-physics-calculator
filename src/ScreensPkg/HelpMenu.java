
package ScreensPkg;

public class HelpMenu extends javax.swing.JFrame {

    // Creates new HelpMenu frame
    public HelpMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        HelpMenuPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTip = new javax.swing.JLabel();
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
        btnCloseHelp = new javax.swing.JButton();
        lblQuestion4 = new javax.swing.JLabel();
        lblAnswer4P1 = new javax.swing.JLabel();
        lblAnswer4P2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 650));
        setMinimumSize(new java.awt.Dimension(500, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 650));

        HelpMenuPanel.setBackground(new java.awt.Color(32, 5, 60));
        HelpMenuPanel.setMaximumSize(new java.awt.Dimension(500, 650));
        HelpMenuPanel.setMinimumSize(new java.awt.Dimension(500, 650));
        HelpMenuPanel.setPreferredSize(new java.awt.Dimension(500, 650));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/BulbIcon.png"))); // NOI18N
        lblTitle.setText("HELP MENU FAQ");
        lblTitle.setIconTextGap(10);

        lblTip.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblTip.setForeground(new java.awt.Color(255, 255, 255));
        lblTip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTip.setText("Tip: when unsure about something, hover your mouse over it");

        lblQuestion1.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion1.setText("HOW DO I CLOSE THE PROGRAM?");

        lblAnswer1P1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer1P1.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer1P1.setText("Click on");

        btnExitExample.setBackground(new java.awt.Color(255, 255, 255));
        btnExitExample.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnExitExample.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ExitIcon.png"))); // NOI18N
        btnExitExample.setText("Exit");
        btnExitExample.setToolTipText("When you see this button, click it to exit the program");
        btnExitExample.setIconTextGap(8);
        btnExitExample.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitExampleActionPerformed(evt);
            }
        });

        lblAnswer1P2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer1P2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer1P2.setText("to close the program.");

        lblQuestion2.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion2.setText("HOW DO I OPEN THE CALCULATOR?");

        lblAnswer2P1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer2P1.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer2P1.setText("Once you have found an equation, click on");

        btnSelectExample.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectExample.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSelectExample.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SelectIcon.png"))); // NOI18N
        btnSelectExample.setText("Select");
        btnSelectExample.setToolTipText("When you see this button, click it to open the above equation");
        btnSelectExample.setIconTextGap(8);
        btnSelectExample.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectExampleActionPerformed(evt);
            }
        });

        lblAnswer2P2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer2P2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer2P2.setText("below to the one you want to open.");

        lblQuestion3.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblQuestion3.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion3.setText("HOW DO I GO BACK TO THE MAIN MENU?");

        lblAnswer3P1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer3P1.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer3P1.setText("Click on");

        btnBackExample.setBackground(new java.awt.Color(255, 255, 255));
        btnBackExample.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnBackExample.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/BackIcon.png"))); // NOI18N
        btnBackExample.setText("Back");
        btnBackExample.setToolTipText("When you see this button, click it to go back to the previous screen");
        btnBackExample.setIconTextGap(8);
        btnBackExample.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackExampleActionPerformed(evt);
            }
        });

        lblAnswer3P2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer3P2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer3P2.setText("until you see the main menu.");

        btnCloseHelp.setBackground(new java.awt.Color(255, 255, 255));
        btnCloseHelp.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCloseHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ExitIcon.png"))); // NOI18N
        btnCloseHelp.setText("Close Help Menu");
        btnCloseHelp.setToolTipText("Click here to exit the program");
        btnCloseHelp.setIconTextGap(8);
        btnCloseHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseHelpActionPerformed(evt);
            }
        });

        lblQuestion4.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblQuestion4.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion4.setText("HOW DO I TYPE IN THE VALUES FOR EACH VARIABLE?");

        lblAnswer4P1.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblAnswer4P1.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer4P1.setText("Click on the text field next to the variable you want");

        lblAnswer4P2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAnswer4P2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer4P2.setText("to change and then type in the new value.");

        javax.swing.GroupLayout HelpMenuPanelLayout = new javax.swing.GroupLayout(HelpMenuPanel);
        HelpMenuPanel.setLayout(HelpMenuPanelLayout);
        HelpMenuPanelLayout.setHorizontalGroup(
            HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblTitle))
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTip))
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblQuestion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                                .addComponent(lblAnswer1P1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExitExample)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAnswer1P2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpMenuPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAnswer4P2)
                                    .addGap(36, 36, 36))
                                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAnswer4P1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblQuestion4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpMenuPanelLayout.createSequentialGroup()
                                        .addComponent(lblQuestion2)
                                        .addGap(91, 91, 91))
                                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                                        .addComponent(lblAnswer2P1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSelectExample))))))
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnswer2P2)
                            .addComponent(lblQuestion3)))
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblAnswer3P1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBackExample)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAnswer3P2))
                    .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnCloseHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        HelpMenuPanelLayout.setVerticalGroup(
            HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpMenuPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTip)
                .addGap(33, 33, 33)
                .addComponent(lblQuestion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExitExample, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAnswer1P1)
                        .addComponent(lblAnswer1P2)))
                .addGap(55, 55, 55)
                .addComponent(lblQuestion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAnswer2P1)
                    .addComponent(btnSelectExample, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnswer2P2)
                .addGap(53, 53, 53)
                .addComponent(lblQuestion3)
                .addGap(11, 11, 11)
                .addGroup(HelpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lblAnswer3P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackExample, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblAnswer3P2))
                .addGap(52, 52, 52)
                .addComponent(lblQuestion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnswer4P1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnswer4P2)
                .addGap(29, 29, 29)
                .addComponent(btnCloseHelp)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HelpMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HelpMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel lblAnswer4P1;
    private javax.swing.JLabel lblAnswer4P2;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblQuestion3;
    private javax.swing.JLabel lblQuestion4;
    private javax.swing.JLabel lblTip;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
