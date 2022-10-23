package ScreensPkg;

import MediumEquationsPkg.*; // Import all classes from medium equations package

public class MediumEquationsMenu extends javax.swing.JFrame
{

    // Creates new MediumEquationsMenu frame
    public MediumEquationsMenu()
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
        lblTitleDynamic = new javax.swing.JLabel();
        lblEquationDynamic = new javax.swing.JLabel();
        btnSelectDynamic = new javax.swing.JButton();
        lblTitleSchwardzschild = new javax.swing.JLabel();
        lblEquationSchwardzschild = new javax.swing.JLabel();
        btnSelectSchwardzschild = new javax.swing.JButton();
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
        lblTitle.setForeground(new java.awt.Color(255, 153, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ShuttleIcon.png"))); // NOI18N
        lblTitle.setText(" MEDIUM EQUATIONS");

        lblDescription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Space Physics Calculator");

        lblTitleDynamic.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTitleDynamic.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleDynamic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDynamic.setText("DYNAMIC PRESSURE");

        lblEquationDynamic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationDynamic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/DynamicPressure.png"))); // NOI18N

        btnSelectDynamic.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectDynamic.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSelectDynamic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SelectIcon.png"))); // NOI18N
        btnSelectDynamic.setText("Select");
        btnSelectDynamic.setToolTipText("Click here to open the Dynamic Pressure calculator");
        btnSelectDynamic.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectDynamicActionPerformed(evt);
            }
        });

        lblTitleSchwardzschild.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTitleSchwardzschild.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleSchwardzschild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSchwardzschild.setText("SCHWARZSCHILD RADIUS");

        lblEquationSchwardzschild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationSchwardzschild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SchwarzschildRadius.png"))); // NOI18N

        btnSelectSchwardzschild.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectSchwardzschild.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSelectSchwardzschild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SelectIcon.png"))); // NOI18N
        btnSelectSchwardzschild.setText("Select");
        btnSelectSchwardzschild.setToolTipText("Click here to open the Schwardschild Radius calculator");
        btnSelectSchwardzschild.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectSchwardzschildActionPerformed(evt);
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
                            .addComponent(btnSelectDynamic, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquationDynamic, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitleDynamic, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblTitleSchwardzschild, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquationSchwardzschild, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectSchwardzschild, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 95, Short.MAX_VALUE))
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
                .addGap(69, 69, 69)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitleDynamic)
                    .addComponent(lblTitleSchwardzschild))
                .addGap(1, 1, 1)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEquationSchwardzschild, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEquationDynamic, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelectSchwardzschild, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectDynamic, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    // Run when Dyanmic Pressure select button is clicked
    private void btnSelectDynamicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDynamicActionPerformed
        // Switch to the Dyanmic Pressure equation screen
        final DynamicPressure dynamic = new DynamicPressure();
        dynamic.setLocationRelativeTo(null); // Centre the window
        dynamic.setResizable(false); // Prevent window size from being changed
        dynamic.setVisible(true); // Show the dynamic pressure screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnSelectDynamicActionPerformed

    // Run when Schwarzschild Radius select button is clicked
    private void btnSelectSchwardzschildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectSchwardzschildActionPerformed
        // Switch to the Schwardzschild Radius equation screen
        final SchwarzschildRadius schwarzschild = new SchwarzschildRadius();
        schwarzschild.setLocationRelativeTo(null); // Centre the window
        schwarzschild.setResizable(false); // Prevent window size from being changed
        schwarzschild.setVisible(true); // Show the schwarzschild radius screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnSelectSchwardzschildActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EasyEquationsPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSelectDynamic;
    private javax.swing.JButton btnSelectSchwardzschild;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEquationDynamic;
    private javax.swing.JLabel lblEquationSchwardzschild;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleDynamic;
    private javax.swing.JLabel lblTitleSchwardzschild;
    // End of variables declaration//GEN-END:variables
}
