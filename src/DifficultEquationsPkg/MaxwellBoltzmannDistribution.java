package DifficultEquationsPkg;

import ScreensPkg.*; // Import the screens package
import Other.Validation; // Import the Validation class
import javax.swing.JOptionPane;

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

        MaxwellBoltzmannDistributionPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txaDescription = new javax.swing.JTextArea();
        lblEquationMaxwell = new javax.swing.JLabel();
        lblParticleMass = new javax.swing.JLabel();
        txfParticleMass = new javax.swing.JTextField();
        lblAbsoluteTemperatue = new javax.swing.JLabel();
        txfAbsoluteTemperatue = new javax.swing.JTextField();
        lblParticleSpeed = new javax.swing.JLabel();
        txfParticleSpeed = new javax.swing.JTextField();
        txfOutput = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblParticleMassUnit = new javax.swing.JLabel();
        lblAbsoluteTemperatueUnit = new javax.swing.JLabel();
        lblParticleSpeedUnit = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        MaxwellBoltzmannDistributionPanel.setBackground(new java.awt.Color(32, 5, 60));
        MaxwellBoltzmannDistributionPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        MaxwellBoltzmannDistributionPanel.setMinimumSize(new java.awt.Dimension(800, 500));

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

        lblEquationMaxwell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquationMaxwell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/MaxwellBoltzmannDistribution.png"))); // NOI18N

        lblParticleMass.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblParticleMass.setForeground(new java.awt.Color(255, 255, 255));
        lblParticleMass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParticleMass.setText("Particle Mass (m)");

        txfParticleMass.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfParticleMass.setText("0.0");
        txfParticleMass.setToolTipText("Type in the particle mass here");

        lblAbsoluteTemperatue.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblAbsoluteTemperatue.setForeground(new java.awt.Color(255, 255, 255));
        lblAbsoluteTemperatue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAbsoluteTemperatue.setText("Absolute Temperature (T)");

        txfAbsoluteTemperatue.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfAbsoluteTemperatue.setText("0.0");
        txfAbsoluteTemperatue.setToolTipText("Type in the absolute temperature here");

        lblParticleSpeed.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblParticleSpeed.setForeground(new java.awt.Color(255, 255, 255));
        lblParticleSpeed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParticleSpeed.setText("Particle Speed (v)");

        txfParticleSpeed.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfParticleSpeed.setText("0.0");
        txfParticleSpeed.setToolTipText("Type in the particle speed here");

        txfOutput.setEditable(false);
        txfOutput.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        txfOutput.setForeground(new java.awt.Color(0, 80, 0));
        txfOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOutput.setText("OUTPUT: PD Function (fv) = undefined s/m");
        txfOutput.setToolTipText("The output probability density function of the equation with display here");

        btnCalculate.setBackground(new java.awt.Color(200, 255, 200));
        btnCalculate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/CalculatorIcon.png"))); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Click here to calculate the output probability density function of the equation");
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

        lblParticleMassUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblParticleMassUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblParticleMassUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblParticleMassUnit.setText("kg");

        lblAbsoluteTemperatueUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblAbsoluteTemperatueUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblAbsoluteTemperatueUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAbsoluteTemperatueUnit.setText("K");

        lblParticleSpeedUnit.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        lblParticleSpeedUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblParticleSpeedUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblParticleSpeedUnit.setText("m/s");

        lblNote.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblNote.setForeground(new java.awt.Color(255, 51, 51));
        lblNote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNote.setText("Note: there are constant variables in this equation that cannot be changed");

        javax.swing.GroupLayout MaxwellBoltzmannDistributionPanelLayout = new javax.swing.GroupLayout(MaxwellBoltzmannDistributionPanel);
        MaxwellBoltzmannDistributionPanel.setLayout(MaxwellBoltzmannDistributionPanelLayout);
        MaxwellBoltzmannDistributionPanelLayout.setHorizontalGroup(
            MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txaDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)))
                            .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                                    .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(lblEquationMaxwell)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                        .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                                .addComponent(lblParticleSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txfParticleSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblParticleSpeedUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                                .addComponent(lblAbsoluteTemperatue, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txfAbsoluteTemperatue, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAbsoluteTemperatueUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                                .addComponent(lblParticleMass, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txfParticleMass, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblParticleMassUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))))
        );
        MaxwellBoltzmannDistributionPanelLayout.setVerticalGroup(
            MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaxwellBoltzmannDistributionPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEquationMaxwell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblParticleMass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfParticleMass, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblParticleMassUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAbsoluteTemperatue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfAbsoluteTemperatue, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAbsoluteTemperatueUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblParticleSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfParticleSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblParticleSpeedUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(lblNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(MaxwellBoltzmannDistributionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(MaxwellBoltzmannDistributionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MaxwellBoltzmannDistributionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (validate.vDouble(txfParticleMass.getText(), "The Particle Mass value is invalid. Please enter a valid value and try again."))
        {
            if (validate.vDouble(txfAbsoluteTemperatue.getText(), "The Absolute Temperature value is invalid. Please enter a valid value and try again."))
            {
                if (validate.vDouble(txfParticleSpeed.getText(), "The Particle Speed is invalid. Please enter a valid value and try again."))
                {

                    // Create variables and set their values to the associated text field values
                    double particleMass = Double.parseDouble(txfParticleMass.getText());
                    double absoluteTemperature = Double.parseDouble(txfAbsoluteTemperatue.getText());
                    double particleSpeed = Double.parseDouble(txfParticleSpeed.getText());

                    // Create variables for each constant variable
                    double boltzmannConstant = 1.3806488;
                    double eulersNumber = Math.E;
                    double pi = Math.PI;

                    // If any of the denominator variables are 0 (undefined) then store an error message in the error variable
                    String error = "";
                    if (particleMass == 0)
                    {
                        error = "The Particle Mass value cannot be 0. Please enter a valid value and try again.";
                    } else if (absoluteTemperature == 0)
                    {
                        error = "The Absolute Temperature value cannot be 0. Please enter a valid value and try again.";
                    }

                    // If one of the denominator variables are 0 then don't run the calculation, display the error message
                    if (error.length() > 0)
                    {
                        JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);

                    } else
                    {
                     
                        // Calculate the probability density function that will be output
                        double pdFunction = Math.sqrt(Math.pow(particleMass / (2 * pi * boltzmannConstant * absoluteTemperature), 3))
                                * 4 * pi * Math.pow(particleSpeed, 2)
                                * Math.pow(eulersNumber, -((particleMass * Math.pow(particleSpeed, 2)) / (2 * boltzmannConstant * absoluteTemperature)));

                        // Set the output text field to the previously calculated probability density function
                        txfOutput.setText("OUTPUT: PD Function (fv) = " + pdFunction + " s/m");

                    }

                }
            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    // Run when the reset button is clicked
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Set each text field to their default value
        txfParticleMass.setText("0.0");
        txfAbsoluteTemperatue.setText("0.0");
        txfParticleSpeed.setText("0.0");
        txfOutput.setText("OUTPUT: PD Function (fv) = undefined s/m");
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MaxwellBoltzmannDistributionPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblAbsoluteTemperatue;
    private javax.swing.JLabel lblAbsoluteTemperatueUnit;
    private javax.swing.JLabel lblEquationMaxwell;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblParticleMass;
    private javax.swing.JLabel lblParticleMassUnit;
    private javax.swing.JLabel lblParticleSpeed;
    private javax.swing.JLabel lblParticleSpeedUnit;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txfAbsoluteTemperatue;
    private javax.swing.JTextField txfOutput;
    private javax.swing.JTextField txfParticleMass;
    private javax.swing.JTextField txfParticleSpeed;
    // End of variables declaration//GEN-END:variables
}
