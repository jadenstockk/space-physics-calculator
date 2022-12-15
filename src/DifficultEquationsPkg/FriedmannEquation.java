package DifficultEquationsPkg;

import ScreensPkg.*; // Import the screens package
import Other.Validation; // Import the Validation class

public class FriedmannEquation extends javax.swing.JFrame
{

    // Create a new validation class
    Validation validate = new Validation();

    // Creates new FriedmannEquation frame
    public FriedmannEquation()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        FriedmannEquationPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txaDescription = new javax.swing.JTextArea();
        lblEquationFriedmann = new javax.swing.JLabel();
        lblDensity = new javax.swing.JLabel();
        txfDensity = new javax.swing.JTextField();
        lblCosmicScaleFactor = new javax.swing.JLabel();
        txfCosmicScaleFactor = new javax.swing.JTextField();
        lblCurvatureParameter = new javax.swing.JLabel();
        txfCurvatureParameter = new javax.swing.JTextField();
        txfOutput = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblDensityUnit = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        FriedmannEquationPanel.setBackground(new java.awt.Color(32, 5, 60));
        FriedmannEquationPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        FriedmannEquationPanel.setMinimumSize(new java.awt.Dimension(800, 500));

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/PlanetIcon.png"))); // NOI18N
        lblTitle.setText(" FRIEDMANN EQUATION");

        txaDescription.setEditable(false);
        txaDescription.setBackground(new java.awt.Color(0, 0, 0));
        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txaDescription.setForeground(new java.awt.Color(255, 255, 255));
        txaDescription.setLineWrap(true);
        txaDescription.setRows(5);
        txaDescription.setText("The Friedmann equation (based on curvature) describes how, based on what is in the universe, its expansion rate will change over time. This allows us to calculate where the Universe came from and where it's headed.");
        txaDescription.setWrapStyleWord(true);
        txaDescription.setOpaque(false);

        lblEquationFriedmann.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationFriedmann.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/FriedmannEquation.png"))); // NOI18N

        lblDensity.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblDensity.setForeground(new java.awt.Color(255, 255, 255));
        lblDensity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDensity.setText("Density (p)");

        txfDensity.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfDensity.setText("0.0");
        txfDensity.setToolTipText("Type in the density here");

        lblCosmicScaleFactor.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblCosmicScaleFactor.setForeground(new java.awt.Color(255, 255, 255));
        lblCosmicScaleFactor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCosmicScaleFactor.setText("Cosmic Scale Factor (R)");

        txfCosmicScaleFactor.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfCosmicScaleFactor.setText("0.0");
        txfCosmicScaleFactor.setToolTipText("Type in the cosmic scale factor here");

        lblCurvatureParameter.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblCurvatureParameter.setForeground(new java.awt.Color(255, 255, 255));
        lblCurvatureParameter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCurvatureParameter.setText("Curvature Parameter (k)");

        txfCurvatureParameter.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfCurvatureParameter.setText("0.0");
        txfCurvatureParameter.setToolTipText("Type in the curvature parameter here");

        txfOutput.setEditable(false);
        txfOutput.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        txfOutput.setForeground(new java.awt.Color(0, 80, 0));
        txfOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOutput.setText("OUTPUT: Friedmann Equation (fv) = 0.0");
        txfOutput.setToolTipText("The output Friedmann equation of the equation with display here");

        btnCalculate.setBackground(new java.awt.Color(200, 255, 200));
        btnCalculate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/CalculatorIcon.png"))); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Click here to calculate the output Friedmann equation of the equation");
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
        btnBack.setToolTipText("Click here to go back to the difficult equations menu");
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

        lblDensityUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblDensityUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblDensityUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDensityUnit.setText("mg");

        lblNote.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblNote.setForeground(new java.awt.Color(255, 51, 51));
        lblNote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNote.setText("Note: there are constant variables in this equation that cannot be changed as well as variables without units");

        javax.swing.GroupLayout FriedmannEquationPanelLayout = new javax.swing.GroupLayout(FriedmannEquationPanel);
        FriedmannEquationPanel.setLayout(FriedmannEquationPanelLayout);
        FriedmannEquationPanelLayout.setHorizontalGroup(
            FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txaDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FriedmannEquationPanelLayout.createSequentialGroup()
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)))
                            .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                                .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                                .addComponent(lblCurvatureParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txfCurvatureParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                                .addComponent(lblCosmicScaleFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txfCosmicScaleFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                                .addComponent(lblDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txfDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDensityUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FriedmannEquationPanelLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FriedmannEquationPanelLayout.createSequentialGroup()
                        .addComponent(lblEquationFriedmann)
                        .addGap(223, 223, 223))))
            .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNote)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FriedmannEquationPanelLayout.setVerticalGroup(
            FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FriedmannEquationPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEquationFriedmann)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDensity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDensityUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCosmicScaleFactor, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(txfCosmicScaleFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCurvatureParameter, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(txfCurvatureParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(lblNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(FriedmannEquationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(FriedmannEquationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FriedmannEquationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (validate.vDouble(txfDensity.getText(), "The Density value is invalid. Please enter a valid value and try again."))
        {
            if (validate.vDouble(txfCosmicScaleFactor.getText(), "The Cosmic Scale Factor value is invalid. Please enter a valid value and try again."))
            {
                if (validate.vDouble(txfCurvatureParameter.getText(), "The Curvature Parameter is invalid. Please enter a valid value and try again."))
                {

                    // Create double variables and set their values to the associated parsed double text field values
                    double density = Double.parseDouble(txfDensity.getText());
                    double cosmicScaleFactor = Double.parseDouble(txfCosmicScaleFactor.getText());
                    double curvatureParameter = Double.parseDouble(txfCurvatureParameter.getText());

                    // Create variables for each constant variable
                    double gravitionalConstant = 6.6743e-11;
                    double cosmologicalConstant = 2.036e-35;
                    double speedLight = 299792458;
                    double pi = Math.PI;

                    // Calculate the Friedmann equation function that will be output
                    double friedmannEquation = (8 * (pi / 3) * gravitionalConstant * density * Math.pow(cosmicScaleFactor, 2))
                            - (curvatureParameter * Math.pow(speedLight, 2))
                            + (cosmologicalConstant * Math.pow(cosmicScaleFactor, 2)) / 3;

                    // Set the output text field to the previously calculated probability density function
                    txfOutput.setText("OUTPUT: Friedmann Equation (fv) = " + friedmannEquation);

                }
            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    // Run when the reset button is clicked
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Set each text field to their default value
        txfDensity.setText("0.0");
        txfCosmicScaleFactor.setText("0.0");
        txfCurvatureParameter.setText("0.0");
        txfOutput.setText("OUTPUT: Friedmann Equation (fv) = 0.0");
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FriedmannEquationPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblCosmicScaleFactor;
    private javax.swing.JLabel lblCurvatureParameter;
    private javax.swing.JLabel lblDensity;
    private javax.swing.JLabel lblDensityUnit;
    private javax.swing.JLabel lblEquationFriedmann;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txfCosmicScaleFactor;
    private javax.swing.JTextField txfCurvatureParameter;
    private javax.swing.JTextField txfDensity;
    private javax.swing.JTextField txfOutput;
    // End of variables declaration//GEN-END:variables
}
