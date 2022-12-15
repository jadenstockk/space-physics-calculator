package ScreensPkg;

public class MainMenu extends javax.swing.JFrame
{

    // Creates new MainMenu frame
    public MainMenu()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        MenuScreenPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        btnEasyEquations = new javax.swing.JButton();
        btnMediumEquations = new javax.swing.JButton();
        btnDifficultEquations = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        MenuScreenPanel.setBackground(new java.awt.Color(32, 5, 60));
        MenuScreenPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        MenuScreenPanel.setMinimumSize(new java.awt.Dimension(800, 500));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MAIN MENU");

        lblDescription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Space Physics Calculator");

        btnEasyEquations.setBackground(new java.awt.Color(255, 255, 255));
        btnEasyEquations.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnEasyEquations.setForeground(new java.awt.Color(0, 204, 0));
        btnEasyEquations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/RocketIcon.png"))); // NOI18N
        btnEasyEquations.setText(" EASY EQUATIONS");
        btnEasyEquations.setToolTipText("Click here to go to the Easy Equations section");
        btnEasyEquations.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEasyEquationsActionPerformed(evt);
            }
        });

        btnMediumEquations.setBackground(new java.awt.Color(255, 255, 255));
        btnMediumEquations.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnMediumEquations.setForeground(new java.awt.Color(255, 153, 51));
        btnMediumEquations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ShuttleIcon.png"))); // NOI18N
        btnMediumEquations.setText(" MEDIUM EQUATIONS");
        btnMediumEquations.setToolTipText("Click here to go to the Medium Equations section");
        btnMediumEquations.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMediumEquationsActionPerformed(evt);
            }
        });

        btnDifficultEquations.setBackground(new java.awt.Color(255, 255, 255));
        btnDifficultEquations.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnDifficultEquations.setForeground(new java.awt.Color(255, 51, 51));
        btnDifficultEquations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/PlanetIcon.png"))); // NOI18N
        btnDifficultEquations.setText(" DIFFICULT EQUATIONS");
        btnDifficultEquations.setToolTipText("Click here to go to the Difficult Equations section");
        btnDifficultEquations.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDifficultEquationsActionPerformed(evt);
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

        javax.swing.GroupLayout MenuScreenPanelLayout = new javax.swing.GroupLayout(MenuScreenPanel);
        MenuScreenPanel.setLayout(MenuScreenPanelLayout);
        MenuScreenPanelLayout.setHorizontalGroup(
            MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuScreenPanelLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnEasyEquations, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMediumEquations, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDifficultEquations, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, MenuScreenPanelLayout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
        );
        MenuScreenPanelLayout.setVerticalGroup(
            MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuScreenPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription)
                .addGap(27, 27, 27)
                .addComponent(btnEasyEquations, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnMediumEquations, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDifficultEquations, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(MenuScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnHelp))
                .addContainerGap(47, Short.MAX_VALUE))
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

    // Run when Easy Equations button is clicked
    private void btnEasyEquationsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEasyEquationsActionPerformed
    {//GEN-HEADEREND:event_btnEasyEquationsActionPerformed
        // Switch to the Easy Equations menu screen
        final EasyEquationsMenu easy = new EasyEquationsMenu();
        easy.setLocationRelativeTo(null); // Centre the window
        easy.setResizable(false); // Prevent window size from being changed
        easy.setVisible(true); // Show the Easy Equations menu screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnEasyEquationsActionPerformed

    // Run when Difficult Equations button is clicked
    private void btnDifficultEquationsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDifficultEquationsActionPerformed
    {//GEN-HEADEREND:event_btnDifficultEquationsActionPerformed
        // Switch to the Difficult Equations menu screen
        final DifficultEquationsMenu difficult = new DifficultEquationsMenu();
        difficult.setLocationRelativeTo(null); // Centre the window
        difficult.setResizable(false); // Prevent window size from being changed
        difficult.setVisible(true); // Show the Difficult Equations menu screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnDifficultEquationsActionPerformed

    // Run when Medium Equations button is clicked
    private void btnMediumEquationsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMediumEquationsActionPerformed
    {//GEN-HEADEREND:event_btnMediumEquationsActionPerformed
        // Switch to the Medium Equations menu screen
        final MediumEquationsMenu medium = new MediumEquationsMenu();
        medium.setLocationRelativeTo(null); // Centre the window
        medium.setResizable(false); // Prevent window size from being changed
        medium.setVisible(true); // Show the Medium Equations menu screen window
        this.dispose(); // Close the current windowÏ
    }//GEN-LAST:event_btnMediumEquationsActionPerformed

    // Run when the exit button is pressed
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        System.exit(0); // Close the program when exit button pressed
    }//GEN-LAST:event_btnExitActionPerformed

    // Run when help button is clicked
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        // Overlay the Help Menu screen
        final HelpMenu help = new HelpMenu();
        help.setLocationRelativeTo(null); // Centre the window
        help.setResizable(false); // Prevent window size from being changed
        help.setAlwaysOnTop(true); // Ensure the help menu stays on top of all other windows
        help.setVisible(true); // Show the help menu screen window
    }//GEN-LAST:event_btnHelpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuScreenPanel;
    private javax.swing.JButton btnDifficultEquations;
    private javax.swing.JButton btnEasyEquations;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMediumEquations;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
