package DifficultEquationsPkg;

import ScreensPkg.*; // Import the screens package
import Other.Validation; // Import the Validation class

public class MaxwellBoltzmannDistribution extends javax.swing.JFrame
{

    // Create a new validation class
    Validation validate = new Validation();

    // Creates new MaxwellBoltzmannDistribution frame
    public MaxwellBoltzmannDistribution()
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
        lblEquationLorentz = new javax.swing.JLabel();
        lblElectricCharge = new javax.swing.JLabel();
        txfElectricCharge = new javax.swing.JTextField();
        lblExternalElectricField = new javax.swing.JLabel();
        txfExternalElectricField = new javax.swing.JTextField();
        lblVelocity = new javax.swing.JLabel();
        txfVelocity = new javax.swing.JTextField();
        lblMagneticField = new javax.swing.JLabel();
        txfMagneticField = new javax.swing.JTextField();
        txfOutput = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblElectricChargeUnit = new javax.swing.JLabel();
        lblExternalElectricFieldUnit = new javax.swing.JLabel();
        lblMagneticFieldUnit = new javax.swing.JLabel();
        lblVelocityUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        LorentzForcePanel.setBackground(new java.awt.Color(32, 5, 60));
        LorentzForcePanel.setMaximumSize(new java.awt.Dimension(800, 500));
        LorentzForcePanel.setMinimumSize(new java.awt.Dimension(800, 500));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/PlanetIcon.png"))); // NOI18N
        lblTitle.setText(" MAXWELL–BOLTZMANN DISTRIBUTION");

        txaDescription.setEditable(false);
        txaDescription.setBackground(new java.awt.Color(0, 0, 0));
        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        txaDescription.setForeground(new java.awt.Color(255, 255, 255));
        txaDescription.setLineWrap(true);
        txaDescription.setRows(5);
        txaDescription.setText("The Maxwell–Boltzmann distribution describes the distribution of speeds among the particles in a sample of gas at a given temperature.");
        txaDescription.setWrapStyleWord(true);
        txaDescription.setOpaque(false);

        lblEquationLorentz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationLorentz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/MaxwellBoltzmannDistribution.png"))); // NOI18N

        lblElectricCharge.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblElectricCharge.setForeground(new java.awt.Color(255, 255, 255));
        lblElectricCharge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblElectricCharge.setText("Particle Mass (m)");

        txfElectricCharge.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfElectricCharge.setText("0.0");
        txfElectricCharge.setToolTipText("Type in the electric charge here");

        lblExternalElectricField.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblExternalElectricField.setForeground(new java.awt.Color(255, 255, 255));
        lblExternalElectricField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblExternalElectricField.setText(" Electric Field (ExternalE)");

        txfExternalElectricField.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfExternalElectricField.setText("0.0");
        txfExternalElectricField.setToolTipText("Type in the electric field here");

        lblVelocity.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblVelocity.setForeground(new java.awt.Color(255, 255, 255));
        lblVelocity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVelocity.setText("Velocity (V)");

        txfVelocity.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfVelocity.setText("0.0");
        txfVelocity.setToolTipText("Type in the velocity here");

        lblMagneticField.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblMagneticField.setForeground(new java.awt.Color(255, 255, 255));
        lblMagneticField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMagneticField.setText("Magnetic Field (B)");

        txfMagneticField.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfMagneticField.setText("0.0");
        txfMagneticField.setToolTipText("Type in the magnetic field here");

        txfOutput.setEditable(false);
        txfOutput.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        txfOutput.setForeground(new java.awt.Color(0, 80, 0));
        txfOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOutput.setText("OUTPUT: PD Function (fv) = 0.0 s/m");
        txfOutput.setToolTipText("The output force of the equation with display here");
        txfOutput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txfOutputActionPerformed(evt);
            }
        });

        btnCalculate.setBackground(new java.awt.Color(200, 255, 200));
        btnCalculate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/CalculatorIcon.png"))); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Click here to calculate the output force of the equation");
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

        lblElectricChargeUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblElectricChargeUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblElectricChargeUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblElectricChargeUnit.setText("c");

        lblExternalElectricFieldUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblExternalElectricFieldUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblExternalElectricFieldUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblExternalElectricFieldUnit.setText("V/m");

        lblMagneticFieldUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblMagneticFieldUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblMagneticFieldUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMagneticFieldUnit.setText("T");

        lblVelocityUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblVelocityUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblVelocityUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVelocityUnit.setText("m/s");

        javax.swing.GroupLayout LorentzForcePanelLayout = new javax.swing.GroupLayout(LorentzForcePanel);
        LorentzForcePanel.setLayout(LorentzForcePanelLayout);
        LorentzForcePanelLayout.setHorizontalGroup(
            LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txaDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LorentzForcePanelLayout.createSequentialGroup()
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)))
                            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                        .addComponent(lblMagneticField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txfMagneticField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMagneticFieldUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LorentzForcePanelLayout.createSequentialGroup()
                                        .addComponent(lblVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txfVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblVelocityUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                        .addComponent(lblExternalElectricField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txfExternalElectricField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblExternalElectricFieldUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                        .addComponent(lblElectricCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txfElectricCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblElectricChargeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                                .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(lblEquationLorentz)))
                .addContainerGap(47, Short.MAX_VALUE))
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
        );
        LorentzForcePanelLayout.setVerticalGroup(
            LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LorentzForcePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEquationLorentz)
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblElectricCharge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfElectricCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblElectricChargeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblExternalElectricField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfExternalElectricField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblExternalElectricFieldUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVelocity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVelocityUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMagneticField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfMagneticField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMagneticFieldUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(LorentzForcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
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
        // Switch to the Diffcult Equations screen
        final DifficultEquationsMenu difficult = new DifficultEquationsMenu();
        difficult.setLocationRelativeTo(null); // Centre the window
        difficult.setResizable(false); // Prevent window size from being changed
        difficult.setVisible(true); // Show the difficult equations screen window
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
        if (validate.vDouble(txfElectricCharge.getText(), "The Electric Charge value is invalid. Please enter a valid value and try again."))
        {
            if (validate.vDouble(txfExternalElectricField.getText(), "The Electric Field value is invalid. Please enter a valid value and try again."))
            {
                if (validate.vDouble(txfVelocity.getText(), "The Velocity value is invalid. Please enter a valid value and try again."))
                {
                    if (validate.vDouble(txfMagneticField.getText(), "The Magentic Field value is invalid. Please enter a valid value and try again."))
                    {

                        // Create variables and set their values to the associated text field values
                        double electricCharge = Double.parseDouble(txfElectricCharge.getText());
                        double externalElectricField = Double.parseDouble(txfExternalElectricField.getText());
                        double velocity = Double.parseDouble(txfVelocity.getText());
                        double magneticField = Double.parseDouble(txfMagneticField.getText());

                        // Calculate the force that will be output
                        double force = electricCharge * (externalElectricField + velocity + magneticField);

                        // Set the output text field to the previously calculated force
                        txfOutput.setText("OUTPUT: Force (F) = " + force + " N");

                    }
                }
            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    // Run when the reset button is clicked
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Set each text field to their default value
        txfElectricCharge.setText("0.0");
        txfExternalElectricField.setText("0.0");
        txfVelocity.setText("0.0");
        txfMagneticField.setText("0.0");
        txfOutput.setText("OUTPUT: Force (F) = 0.0 N");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txfOutputActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txfOutputActionPerformed
    {//GEN-HEADEREND:event_txfOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfOutputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LorentzForcePanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblElectricCharge;
    private javax.swing.JLabel lblElectricChargeUnit;
    private javax.swing.JLabel lblEquationLorentz;
    private javax.swing.JLabel lblExternalElectricField;
    private javax.swing.JLabel lblExternalElectricFieldUnit;
    private javax.swing.JLabel lblMagneticField;
    private javax.swing.JLabel lblMagneticFieldUnit;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVelocity;
    private javax.swing.JLabel lblVelocityUnit;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txfElectricCharge;
    private javax.swing.JTextField txfExternalElectricField;
    private javax.swing.JTextField txfMagneticField;
    private javax.swing.JTextField txfOutput;
    private javax.swing.JTextField txfVelocity;
    // End of variables declaration//GEN-END:variables
}
