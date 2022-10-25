package ScreensPkg;

import DifficultEquationsPkg.*; // Import all classes from difficult equations package

public class DifficultEquationsMenu extends javax.swing.JFrame
{

    // Creates new DiffcultEquationsMenu frame
    public DifficultEquationsMenu()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        EasyEquationsPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblTitleMaxwell = new javax.swing.JLabel();
        lblEquationMaxwell = new javax.swing.JLabel();
        btnSelectMaxwell = new javax.swing.JButton();
        lblTitleFriedmann = new javax.swing.JLabel();
        lblEquationFriedmann = new javax.swing.JLabel();
        btnSelectFriedmann = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        EasyEquationsPanel.setBackground(new java.awt.Color(32, 5, 60));
        EasyEquationsPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        EasyEquationsPanel.setMinimumSize(new java.awt.Dimension(800, 500));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/PlanetIcon.png"))); // NOI18N
        lblTitle.setText(" DIFFICULT EQUATIONS");

        lblDescription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Space Physics Calculator");

        lblTitleMaxwell.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        lblTitleMaxwell.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleMaxwell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleMaxwell.setText("MAXWELL–BOLTZMANN DISTRIBUTION");

        lblEquationMaxwell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationMaxwell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/MaxwellBoltzmannDistribution.png"))); // NOI18N

        btnSelectMaxwell.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectMaxwell.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSelectMaxwell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SelectIcon.png"))); // NOI18N
        btnSelectMaxwell.setText("Select");
        btnSelectMaxwell.setToolTipText("Click here to open the Maxwell-Boltzmann Distribution calculator");
        btnSelectMaxwell.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectMaxwellActionPerformed(evt);
            }
        });

        lblTitleFriedmann.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        lblTitleFriedmann.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleFriedmann.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleFriedmann.setText("FRIEDMANN EQUATION");

        lblEquationFriedmann.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationFriedmann.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/FriedmannEquation.png"))); // NOI18N

        btnSelectFriedmann.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectFriedmann.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSelectFriedmann.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SelectIcon.png"))); // NOI18N
        btnSelectFriedmann.setText("Select");
        btnSelectFriedmann.setToolTipText("Click here to open the Friedmann Equation calculator");
        btnSelectFriedmann.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectFriedmannActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/BackIcon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Click here to go back to the main menu");
        btnBack.setIconTextGap(8);
        btnBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ExitIcon.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setToolTipText("Click here to exit the program");
        btnExit.setIconTextGap(8);
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(255, 255, 255));
        btnHelp.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/HelpIcon.png"))); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setToolTipText("Click here to open the help menu");
        btnHelp.setIconTextGap(8);
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EasyEquationsPanelLayout = new javax.swing.GroupLayout(EasyEquationsPanel);
        EasyEquationsPanel.setLayout(EasyEquationsPanelLayout);
        EasyEquationsPanelLayout.setHorizontalGroup(
            EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EasyEquationsPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EasyEquationsPanelLayout.createSequentialGroup()
                        .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnSelectMaxwell, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquationMaxwell, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitleMaxwell, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblTitleFriedmann, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquationFriedmann, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectFriedmann, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 65, Short.MAX_VALUE))
            .addGroup(EasyEquationsPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EasyEquationsPanelLayout.setVerticalGroup(
            EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EasyEquationsPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitleMaxwell)
                    .addComponent(lblTitleFriedmann))
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EasyEquationsPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblEquationFriedmann, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelectFriedmann, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EasyEquationsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquationMaxwell, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelectMaxwell, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnBack)
                    .addComponent(btnHelp))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EasyEquationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EasyEquationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Run when back button is clicked
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        // Switch to the Main Menu screen
        final MainMenu menu = new MainMenu();
        menu.setLocationRelativeTo(null); // Centre the window
        menu.setResizable(false); // Prevent window size from being changed
        menu.setVisible(true); // Show the menu screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnBackActionPerformed

    // Run when the exit button is pressed
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        System.exit(0); // Close the program when exit button pressed
    }//GEN-LAST:event_btnExitActionPerformed

    // Run when the help button is pressed
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        // Overlay the Help Menu screen
        final HelpMenu help = new HelpMenu();
        help.setLocationRelativeTo(null); // Centre the window
        help.setResizable(false); // Prevent window size from being changed
        help.setAlwaysOnTop(true); // Ensure the help menu stays on top of all other windows
        help.setVisible(true); // Show the help menu screen window
    }//GEN-LAST:event_btnHelpActionPerformed

    // Run when Maxwell-Boltzmann Distribution select button is clicked
    private void btnSelectMaxwellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectMaxwellActionPerformed
        // Switch to the Maxwell-Boltzmann Distribution equation screen
        final MaxwellBoltzmannDistribution maxwell = new MaxwellBoltzmannDistribution();
        maxwell.setLocationRelativeTo(null); // Centre the window
        maxwell.setResizable(false); // Prevent window size from being changed
        maxwell.setVisible(true); // Show the Maxwell-Boltzmann Distribution screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnSelectMaxwellActionPerformed

    // Run when Friedmann Equation select button is clicked
    private void btnSelectFriedmannActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFriedmannActionPerformed
        // Switch to the Friedmann Equation screen
        final FriedmannEquation friedmann = new FriedmannEquation();
        friedmann.setLocationRelativeTo(null); // Centre the window
        friedmann.setResizable(false); // Prevent window size from being changed
        friedmann.setVisible(true); // Show the Friedmann Equation screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnSelectFriedmannActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EasyEquationsPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSelectFriedmann;
    private javax.swing.JButton btnSelectMaxwell;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEquationFriedmann;
    private javax.swing.JLabel lblEquationMaxwell;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleFriedmann;
    private javax.swing.JLabel lblTitleMaxwell;
    // End of variables declaration//GEN-END:variables
}
