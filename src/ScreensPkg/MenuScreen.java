
public class MenuScreen extends javax.swing.JFrame
{

    public MenuScreen()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        MenuScreenPanel = new javax.swing.JPanel();
        lblDescription = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEasyEquations = new javax.swing.JButton();
        btnMediumEquations = new javax.swing.JButton();
        btnDifficultEquations = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MenuScreenPanel.setBackground(new java.awt.Color(32, 5, 60));

        lblDescription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Space Physics Calculator");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MAIN MENU");

        btnEasyEquations.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnEasyEquations.setForeground(new java.awt.Color(0, 204, 153));
        btnEasyEquations.setText("Easy Equations");
        btnEasyEquations.setToolTipText("Click here to go to the Easy Equations calculator");
        btnEasyEquations.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEasyEquationsActionPerformed(evt);
            }
        });

        btnMediumEquations.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnMediumEquations.setForeground(new java.awt.Color(255, 153, 51));
        btnMediumEquations.setText("Medium Equations");
        btnMediumEquations.setToolTipText("Click here to go to the Medium Equations calculator");
        btnMediumEquations.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMediumEquationsActionPerformed(evt);
            }
        });

        btnDifficultEquations.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnDifficultEquations.setForeground(new java.awt.Color(255, 51, 51));
        btnDifficultEquations.setText("Difficult Equations");
        btnDifficultEquations.setToolTipText("Click here to go to the Difficult Equations calculator");
        btnDifficultEquations.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDifficultEquationsActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setToolTipText("Click here to exit the program");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        btnHelp.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setToolTipText("Click here to open the help menu");
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuScreenPanelLayout = new javax.swing.GroupLayout(MenuScreenPanel);
        MenuScreenPanel.setLayout(MenuScreenPanelLayout);
        MenuScreenPanelLayout.setHorizontalGroup(
            MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuScreenPanelLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnEasyEquations, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnDifficultEquations, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MenuScreenPanelLayout.createSequentialGroup()
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnMediumEquations, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );
        MenuScreenPanelLayout.setVerticalGroup(
            MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuScreenPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription)
                .addGap(27, 27, 27)
                .addComponent(btnEasyEquations, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMediumEquations, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDifficultEquations, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnHelp))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEasyEquationsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEasyEquationsActionPerformed
    {//GEN-HEADEREND:event_btnEasyEquationsActionPerformed

        final EasyEquations e = new EasyEquations();
        e.setLocationRelativeTo(null);
        e.setResizable(false);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEasyEquationsActionPerformed

    private void btnDifficultEquationsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDifficultEquationsActionPerformed
    {//GEN-HEADEREND:event_btnDifficultEquationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDifficultEquationsActionPerformed

    private void btnMediumEquationsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMediumEquationsActionPerformed
    {//GEN-HEADEREND:event_btnMediumEquationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMediumEquationsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHelpActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuScreenPanel;
    private javax.swing.JButton btnDifficultEquations;
    private javax.swing.JButton btnEasyEquations;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMediumEquations;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDescription;
    // End of variables declaration//GEN-END:variables
}
