package ScreensPkg;
import EasyEquationsPkg.*;

public class EasyEquationsMenu extends javax.swing.JFrame {

    // Creates new EasyEquationsMenu frame
    public EasyEquationsMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EasyEquationsPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblTitleLorentz = new javax.swing.JLabel();
        lblEquationLorentz = new javax.swing.JLabel();
        btnSelectLorentz = new javax.swing.JButton();
        lblTitleDrift = new javax.swing.JLabel();
        lblEquationDrift = new javax.swing.JLabel();
        btnSelectDrift = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        EasyEquationsPanel.setBackground(new java.awt.Color(32, 5, 60));
        EasyEquationsPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        EasyEquationsPanel.setMinimumSize(new java.awt.Dimension(800, 500));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 204, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/RocketIcon.png"))); // NOI18N
        lblTitle.setText(" EASY EQUATIONS");

        lblDescription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Space Physics Calculator");

        lblTitleLorentz.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTitleLorentz.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleLorentz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleLorentz.setText("LORENTZ FORCE");

        lblEquationLorentz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationLorentz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/LorentzForce.png"))); // NOI18N

        btnSelectLorentz.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectLorentz.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSelectLorentz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SelectIcon.png"))); // NOI18N
        btnSelectLorentz.setText("Select");
        btnSelectLorentz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectLorentzActionPerformed(evt);
            }
        });

        lblTitleDrift.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTitleDrift.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleDrift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDrift.setText("DRIFT VELOCITY");

        lblEquationDrift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationDrift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/DriftVelocity.png"))); // NOI18N

        btnSelectDrift.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectDrift.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSelectDrift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/SelectIcon.png"))); // NOI18N
        btnSelectDrift.setText("Select");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/BackIcon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Click here to go back to the main menu");
        btnBack.setIconTextGap(8);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ExitIcon.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setToolTipText("Click here to exit the program");
        btnExit.setIconTextGap(8);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(255, 255, 255));
        btnHelp.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/HelpIcon.png"))); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setToolTipText("Click here to open the help menu");
        btnHelp.setIconTextGap(8);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EasyEquationsPanelLayout = new javax.swing.GroupLayout(EasyEquationsPanel);
        EasyEquationsPanel.setLayout(EasyEquationsPanelLayout);
        EasyEquationsPanelLayout.setHorizontalGroup(
            EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EasyEquationsPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EasyEquationsPanelLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSelectLorentz, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEquationLorentz, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitleLorentz, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTitleDrift, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEquationDrift, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectDrift, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
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
                .addGap(47, 47, 47)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitleLorentz)
                    .addComponent(lblTitleDrift))
                .addGap(1, 1, 1)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEquationDrift, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEquationLorentz, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EasyEquationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectDrift, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectLorentz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
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


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        // Switch to the Main Menu screen
        final MainMenu menu = new MainMenu();
        menu.setLocationRelativeTo(null); // Centre the window
        menu.setResizable(false); // Prevent window size from being changed
        menu.setVisible(true); // Show the menu screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        // Overlay the Help Menu screen
        final HelpMenu help = new HelpMenu();
        help.setLocationRelativeTo(null); // Centre the window
        help.setResizable(false); // Prevent window size from being changed
        help.setAlwaysOnTop(true); // Ensure the help menu stays on top of all other windows
        help.setVisible(true); // Show the help menu screen window
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnSelectLorentzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectLorentzActionPerformed
        // Switch to the Lorentz Force Equation screen
        final LorentzForce lorentz = new LorentzForce();
        lorentz.setLocationRelativeTo(null); // Centre the window
        lorentz.setResizable(false); // Prevent window size from being changed
        lorentz.setVisible(true); // Show the menu screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnSelectLorentzActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EasyEquationsPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSelectDrift;
    private javax.swing.JButton btnSelectLorentz;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEquationDrift;
    private javax.swing.JLabel lblEquationLorentz;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleDrift;
    private javax.swing.JLabel lblTitleLorentz;
    // End of variables declaration//GEN-END:variables
}
