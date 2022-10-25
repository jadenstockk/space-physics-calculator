package MediumEquationsPkg;

import ScreensPkg.*; // Import the screens package
import Other.Validation; // Import the Validation class

public class DynamicPressure extends javax.swing.JFrame
{

    // Create a new validation class
    Validation validate = new Validation();

    // Creates new DynamicPressure frame
    public DynamicPressure()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        DynamicPressurePanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txaDescription = new javax.swing.JTextArea();
        lblEquationDyanmic = new javax.swing.JLabel();
        lblFluidMassDensity = new javax.swing.JLabel();
        txfFluidMassDensity = new javax.swing.JTextField();
        lblFlowSpeed = new javax.swing.JLabel();
        txfFlowSpeed = new javax.swing.JTextField();
        txfOutput = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblFluidMassDensityUnit = new javax.swing.JLabel();
        lblFlowSpeedUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        DynamicPressurePanel.setBackground(new java.awt.Color(32, 5, 60));
        DynamicPressurePanel.setMaximumSize(new java.awt.Dimension(800, 500));
        DynamicPressurePanel.setMinimumSize(new java.awt.Dimension(800, 500));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/ShuttleIcon.png"))); // NOI18N
        lblTitle.setText(" DYNAMIC PRESSURE");

        txaDescription.setEditable(false);
        txaDescription.setBackground(new java.awt.Color(0, 0, 0));
        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        txaDescription.setForeground(new java.awt.Color(255, 255, 255));
        txaDescription.setLineWrap(true);
        txaDescription.setRows(5);
        txaDescription.setText("The dynamic pressure formula is used to calculate the kinetic energy per unit volume of a fluid. Dynamic pressure can be used to determine the airspeed of an aircraft or spacecraft\n.");
        txaDescription.setWrapStyleWord(true);
        txaDescription.setOpaque(false);

        lblEquationDyanmic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationDyanmic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/DynamicPressure.png"))); // NOI18N

        lblFluidMassDensity.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblFluidMassDensity.setForeground(new java.awt.Color(255, 255, 255));
        lblFluidMassDensity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFluidMassDensity.setText("Fluid Mass Density (p)");

        txfFluidMassDensity.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfFluidMassDensity.setText("0.0");
        txfFluidMassDensity.setToolTipText("Type in the fluid mass density here");

        lblFlowSpeed.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblFlowSpeed.setForeground(new java.awt.Color(255, 255, 255));
        lblFlowSpeed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFlowSpeed.setText("Flow Speed (u)");

        txfFlowSpeed.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfFlowSpeed.setText("0.0");
        txfFlowSpeed.setToolTipText("Type in the flow speed here");

        txfOutput.setEditable(false);
        txfOutput.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        txfOutput.setForeground(new java.awt.Color(0, 80, 0));
        txfOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOutput.setText("OUTPUT: Dyanmic Pressure (q) = 0.0 Pa");
        txfOutput.setToolTipText("The output dynamic pressure of the equation with display here");

        btnCalculate.setBackground(new java.awt.Color(200, 255, 200));
        btnCalculate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/CalculatorIcon.png"))); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Click here to calculate the output dynamic pressure of the equation");
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

        lblFluidMassDensityUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblFluidMassDensityUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblFluidMassDensityUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFluidMassDensityUnit.setText("kg/m^3");

        lblFlowSpeedUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblFlowSpeedUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblFlowSpeedUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFlowSpeedUnit.setText("m/s");

        javax.swing.GroupLayout DynamicPressurePanelLayout = new javax.swing.GroupLayout(DynamicPressurePanel);
        DynamicPressurePanel.setLayout(DynamicPressurePanelLayout);
        DynamicPressurePanelLayout.setHorizontalGroup(
            DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DynamicPressurePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(DynamicPressurePanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DynamicPressurePanelLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquationDyanmic)
                            .addGap(297, 297, 297))
                        .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txaDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DynamicPressurePanelLayout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))
                    .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DynamicPressurePanelLayout.createSequentialGroup()
                                .addComponent(lblFlowSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txfFlowSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFlowSpeedUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DynamicPressurePanelLayout.createSequentialGroup()
                                .addComponent(lblFluidMassDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txfFluidMassDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFluidMassDensityUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(DynamicPressurePanelLayout.createSequentialGroup()
                            .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        DynamicPressurePanelLayout.setVerticalGroup(
            DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicPressurePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEquationDyanmic)
                .addGap(32, 32, 32)
                .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFluidMassDensity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfFluidMassDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFluidMassDensityUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFlowSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfFlowSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFlowSpeedUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(DynamicPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(DynamicPressurePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DynamicPressurePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Run when the back button is pressed
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Switch to the Medium Equations screen
        final MediumEquationsMenu medium = new MediumEquationsMenu();
        medium.setLocationRelativeTo(null); // Centre the window
        medium.setResizable(false); // Prevent window size from being changed
        medium.setVisible(true); // Show the medium equations screen window
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
        if (validate.vDouble(txfFluidMassDensity.getText(), "The Fluid Mass Density value is invalid. Please enter a valid value and try again."))
        {
            if (validate.vDouble(txfFlowSpeed.getText(), "The Flow Speed value is invalid. Please enter a valid value and try again."))
            {

                // Create variables and set their values to the associated text field values
                double fluidMassDensity = Double.parseDouble(txfFluidMassDensity.getText());
                double flowSpeed = Double.parseDouble(txfFlowSpeed.getText());

                // Calculate the dynamic pressure that will be output
                double dynamicPressure = (fluidMassDensity * Math.pow(flowSpeed, 2)) / 2;

                // Set the output text field to the previously calculated dynamic pressure
                txfOutput.setText("OUTPUT: Dyanmic Pressure (q) = " + dynamicPressure + " Pa");

            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

// Run when the reset button is clicked
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Set each text field to their default value
        txfFluidMassDensity.setText("0.0");
        txfFlowSpeed.setText("0.0");
        txfOutput.setText("OUTPUT: Dyanmic Pressure (q) = 0.0 Pa");
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPressurePanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblEquationDyanmic;
    private javax.swing.JLabel lblFlowSpeed;
    private javax.swing.JLabel lblFlowSpeedUnit;
    private javax.swing.JLabel lblFluidMassDensity;
    private javax.swing.JLabel lblFluidMassDensityUnit;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txfFlowSpeed;
    private javax.swing.JTextField txfFluidMassDensity;
    private javax.swing.JTextField txfOutput;
    // End of variables declaration//GEN-END:variables
}
