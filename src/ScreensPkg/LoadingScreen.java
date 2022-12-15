package ScreensPkg;

// Import timer packages for loading screen
import java.util.Timer;
import java.util.TimerTask;

public class LoadingScreen extends javax.swing.JFrame
{

    // Set the loading percentage to 0
    static int loadingPercent = 0;

    // Creates new LoadingScreen frame
    public LoadingScreen()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LoadingScreenPanel = new javax.swing.JPanel();
        lblLoadingImage = new javax.swing.JLabel();
        lblProgress = new javax.swing.JLabel();
        pbLoading = new javax.swing.JProgressBar();
        lblInformation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        LoadingScreenPanel.setBackground(new java.awt.Color(32, 5, 60));
        LoadingScreenPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        LoadingScreenPanel.setMinimumSize(new java.awt.Dimension(800, 500));

        lblLoadingImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/LoadingImage.gif"))); // NOI18N
        lblLoadingImage.setToolTipText("");

        lblProgress.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        lblProgress.setForeground(new java.awt.Color(255, 255, 255));
        lblProgress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgress.setText("Loading Space Physics Equations... 0%");

        lblInformation.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblInformation.setForeground(new java.awt.Color(255, 255, 255));
        lblInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformation.setText("Designed & Built by Jaden Stock");

        javax.swing.GroupLayout LoadingScreenPanelLayout = new javax.swing.GroupLayout(LoadingScreenPanel);
        LoadingScreenPanel.setLayout(LoadingScreenPanelLayout);
        LoadingScreenPanelLayout.setHorizontalGroup(
            LoadingScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoadingScreenPanelLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(LoadingScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoadingImage)
                    .addComponent(lblInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
        );
        LoadingScreenPanelLayout.setVerticalGroup(
            LoadingScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadingScreenPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLoadingImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProgress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInformation)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingScreenPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingScreenPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {
        // Create a new loading screen
        final LoadingScreen loading = new LoadingScreen();

        loading.setLocationRelativeTo(null); // Centre the window
        loading.setResizable(false); // Prevent window size from being changed
        loading.setVisible(true); // Show the loading screen window

        // Create a new timer
        final Timer timer = new Timer();

        // Run the timer and increase the loading percent
        TimerTask tt = new TimerTask()
        {
            public void run()
            {

                loadingPercent++; // Increase the loading percent by 1
                if (loadingPercent < 101)
                {
                    // Set the loading process bar and the loading text to the current percent
                    loading.pbLoading.setValue(loadingPercent);
                    loading.lblProgress.setText("Loading Space Physics Equations... " + loadingPercent + "%");

                } else
                {
                    // Once the loading percentage is over 100 switch to the menu screen
                    timer.cancel();
                    loading.lblProgress.setText("Loading Space Physics Equations... Done");

                    // Switch to the main menu screen
                    final MainMenu menu = new MainMenu();
                    menu.setLocationRelativeTo(null); // Centre the window
                    menu.setResizable(false); // Prevent the window size from being changed
                    menu.setVisible(true); // Show the main menu screen window
                    loading.dispose(); // Close the current window
                }
            }
        };
        timer.scheduleAtFixedRate(tt, 0, 20); // Set the rate at which the timer increases
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoadingScreenPanel;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JLabel lblLoadingImage;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JProgressBar pbLoading;
    // End of variables declaration//GEN-END:variables
}
