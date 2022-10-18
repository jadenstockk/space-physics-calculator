package EasyEquationsPkg;

import ScreensPkg.*; // Import the screens package
import Other.Validation; // Import the Validation class
import javax.swing.JOptionPane; // Import JOptionPane

public class DriftVelocity extends javax.swing.JFrame
{

    // Create a new validation class
    Validation validate = new Validation();

    // Creates new DriftVelocity frame
    public DriftVelocity()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LorentzForcePanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txaDescription = new javax.swing.JTextArea();
        lblDriftVelocity = new javax.swing.JLabel();
        lblCurrentFlow = new javax.swing.JLabel();
        txfCurrentFlow = new javax.swing.JTextField();
        lblFreeElectronDensity = new javax.swing.JLabel();
        txfFreeElectronDensity = new javax.swing.JTextField();
        lblCrossSectionalArea = new javax.swing.JLabel();
        txfCrossSectionalArea = new javax.swing.JTextField();
        txfOutput = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblCurrentFlowUnit = new javax.swing.JLabel();
        lblFreeElectronDensityUnit = new javax.swing.JLabel();
        lblCurrentFlowUnit1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        LorentzForcePanel.setBackground(new java.awt.Color(32, 5, 60));
        LorentzForcePanel.setMaximumSize(new java.awt.Dimension(800, 500));
        LorentzForcePanel.setMinimumSize(new java.awt.Dimension(800, 500));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 204, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/RocketIcon.png"))); // NOI18N
        lblTitle.setText(" DRIFT VELOCITY EQUATION");

        txaDescription.setEditable(false);
        txaDescription.setBackground(new java.awt.Color(0, 0, 0));
        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaDescription.setForeground(new java.awt.Color(255, 255, 255));
        txaDescription.setLineWrap(true);
        txaDescription.setRows(5);
        txaDescription.setText("The drift velocity formula is used to calculate the average velocity attained by charged particles, such as electrons, in a material due to an electric field.");
        txaDescription.setWrapStyleWord(true);
        txaDescription.setOpaque(false);

        lblDriftVelocity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDriftVelocity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/DriftVelocity.png"))); // NOI18N

        lblCurrentFlow.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblCurrentFlow.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentFlow.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCurrentFlow.setText("Current Flow (I)");

        txfCurrentFlow.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfCurrentFlow.setText("0.0");
        txfCurrentFlow.setToolTipText("Type in the current flow here");

        lblFreeElectronDensity.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblFreeElectronDensity.setForeground(new java.awt.Color(255, 255, 255));
        lblFreeElectronDensity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFreeElectronDensity.setText("Free Electron Density (n)");

        txfFreeElectronDensity.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfFreeElectronDensity.setText("0.0");
        txfFreeElectronDensity.setToolTipText("Type in the free electron density here");

        lblCrossSectionalArea.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblCrossSectionalArea.setForeground(new java.awt.Color(255, 255, 255));
        lblCrossSectionalArea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCrossSectionalArea.setText("Cross Sectional Area (A)");

        txfCrossSectionalArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfCrossSectionalArea.setText("0.0");
        txfCrossSectionalArea.setToolTipText("Type in the cross sectional area here");

        txfOutput.setEditable(false);
        txfOutput.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        txfOutput.setForeground(new java.awt.Color(0, 80, 0));
        txfOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOutput.setText("OUTPUT: Drift Velocity (Vd) = undefined m/s");
        txfOutput.setToolTipText("The output drift velocity of the equation with display here");

        btnCalculate.setBackground(new java.awt.Color(200, 255, 200));
        btnCalculate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/CalculatorIcon.png"))); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Click here to calculate the output drift velocity of the equation");
        btnCalculate.setIconTextGap(8);
        btnCalculate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCalculateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/BackIcon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Click here to go back to the easy equations menu");
        btnBack.setIconTextGap(8);
        btnBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackActionPerformed(evt);
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

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ResetIcon.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setToolTipText("Click here to reset all the variable fields to their default values");
        btnReset.setIconTextGap(8);
        btnReset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnResetActionPerformed(evt);
            }
        });

        lblCurrentFlowUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblCurrentFlowUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentFlowUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCurrentFlowUnit.setText("mm^2");

        lblFreeElectronDensityUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblFreeElectronDensityUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblFreeElectronDensityUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFreeElectronDensityUnit.setText("x10^/m3");

        lblCurrentFlowUnit1.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblCurrentFlowUnit1.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentFlowUnit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCurrentFlowUnit1.setText("A");

        javax.swing.GroupLayout LorentzForcePanelLayout = new javax.swing.GroupLayout(LorentzForcePanel);
        LorentzForcePanel.setLayout(LorentzForcePanelLayout);
        LorentzForcePanelLayout.setHorizontalGroup(
            LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LorentzForcePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txaDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                        .addComponent(lblFreeElectronDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txfFreeElectronDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                        .addComponent(lblCurrentFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txfCurrentFlow))
                                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                        .addComponent(lblCrossSectionalArea, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txfCrossSectionalArea, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFreeElectronDensityUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCurrentFlowUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCurrentFlowUnit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(lblDriftVelocity)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        LorentzForcePanelLayout.setVerticalGroup(
            LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDriftVelocity)
                .addGap(27, 27, 27)
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                        .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCurrentFlow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txfCurrentFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCurrentFlowUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFreeElectronDensity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfFreeElectronDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblFreeElectronDensityUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCrossSectionalArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfCrossSectionalArea, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCurrentFlowUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnBack)
                    .addComponent(btnHelp)
                    .addComponent(btnReset))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LorentzForcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LorentzForcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Run when the back button is pressed
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Switch to the Easy Equations screen
        final EasyEquationsMenu easy = new EasyEquationsMenu();
        easy.setLocationRelativeTo(null); // Centre the window
        easy.setResizable(false); // Prevent window size from being changed
        easy.setVisible(true); // Show the easy equations screen window
        this.dispose(); // Close the current window
    }//GEN-LAST:event_btnBackActionPerformed

    // Run when the help button is pressed
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // Overlay the Help Menu screen
        final HelpMenu help = new HelpMenu();
        help.setLocationRelativeTo(null); // Centre the window
        help.setResizable(false); // Prevent window size from being changed
        help.setAlwaysOnTop(true); // Ensure the help menu stays on top of all other windows
        help.setVisible(true); // Show the help menu screen window
    }//GEN-LAST:event_btnHelpActionPerformed

    // Run when the exit button is pressed
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); // Close the program when exit button pressed
    }//GEN-LAST:event_btnExitActionPerformed

    // Run when the calculate button is pressed
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // Check/validate whether each text field value is a valid double else display an error
        if (validate.vDouble(txfCurrentFlow.getText(), "The Current Flow value is invalid. Please enter a valid value and try again."))
        {
            if (validate.vDouble(txfFreeElectronDensity.getText(), "The Free Electron Density value is invalid. Please enter a valid value and try again."))
            {
                if (validate.vDouble(txfCrossSectionalArea.getText(), "The Cross Sectional Area value is invalid. Please enter a valid value and try again."))
                {
                    // Create variables and set their values to the associated text field values
                    double currentFlow = Double.parseDouble(txfCurrentFlow.getText());
                    double freeElectronDensity = Double.parseDouble(txfFreeElectronDensity.getText());
                    double crossSectionalArea = Double.parseDouble(txfCrossSectionalArea.getText());

                    // If either of the denominator variables are 0 (undefined) then store an error message in the error variable
                    String error = "";
                    if (freeElectronDensity == 0)
                    {
                        error = "The Free Electron Density value cannot be 0. Please enter a valid value and try again.";
                    } else if (crossSectionalArea == 0)
                    {
                        error = "The Cross Sectional Area value cannot be 0. Please enter a valid value and try again.";
                    }

                    // If one of the denominator variables are 0 then don't run the calculation, display the error message
                    if (error.length() > 0)
                    {
                        JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);

                    } else
                    {
                        // Hard code the electron charge
                        double electronCharge = 1.602 * 10e-19;

                        // Calculate the drift velocity that will be output
                        double driftVelocity = currentFlow / (freeElectronDensity * electronCharge * crossSectionalArea);

                        // Set the output text field to the previously calculated drift velocity
                        txfOutput.setText("OUTPUT: Drift Velocity (Vd) = " + driftVelocity + " m/s");

                    }
                }
            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    // Run when the reset button is clicked
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Set each text field to their default value
        txfCurrentFlow.setText("0.0");
        txfFreeElectronDensity.setText("0.0");
        txfCrossSectionalArea.setText("0.0");
        txfOutput.setText("OUTPUT: Drift Velocity (Vd) = undefined m/s");
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LorentzForcePanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblCrossSectionalArea;
    private javax.swing.JLabel lblCurrentFlow;
    private javax.swing.JLabel lblCurrentFlowUnit;
    private javax.swing.JLabel lblCurrentFlowUnit1;
    private javax.swing.JLabel lblDriftVelocity;
    private javax.swing.JLabel lblFreeElectronDensity;
    private javax.swing.JLabel lblFreeElectronDensityUnit;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txfCrossSectionalArea;
    private javax.swing.JTextField txfCurrentFlow;
    private javax.swing.JTextField txfFreeElectronDensity;
    private javax.swing.JTextField txfOutput;
    // End of variables declaration//GEN-END:variables
}
