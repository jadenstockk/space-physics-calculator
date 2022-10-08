
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class LoadingScreen extends javax.swing.JFrame
{

    static int k = 0;

    public LoadingScreen()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LoadingScreenPanel = new javax.swing.JPanel();
        pbLoading = new javax.swing.JProgressBar();
        lblProgress = new javax.swing.JLabel();
        lblLoadingImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoadingScreenPanel.setBackground(new java.awt.Color(32, 5, 60));

        lblProgress.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblProgress.setForeground(new java.awt.Color(255, 255, 255));
        lblProgress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgress.setText("Loading Space Physics Equations... 0%");

        lblLoadingImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPkg/LoadingImage.gif"))); // NOI18N
        lblLoadingImage.setToolTipText("");

        javax.swing.GroupLayout LoadingScreenPanelLayout = new javax.swing.GroupLayout(LoadingScreenPanel);
        LoadingScreenPanel.setLayout(LoadingScreenPanelLayout);
        LoadingScreenPanelLayout.setHorizontalGroup(
            LoadingScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoadingScreenPanelLayout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(LoadingScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoadingImage))
                .addGap(217, 217, 217))
        );
        LoadingScreenPanelLayout.setVerticalGroup(
            LoadingScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadingScreenPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblLoadingImage)
                .addGap(32, 32, 32)
                .addComponent(lblProgress)
                .addGap(18, 18, 18)
                .addComponent(pbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingScreenPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingScreenPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {
        final LoadingScreen s = new LoadingScreen();

        //s.getContentPane().setBackground(new Color(32, 5, 60));

        s.setLocationRelativeTo(null);
        s.setVisible(true);

        final Timer t = new Timer();

        TimerTask tt = new TimerTask()
        {
            public void run()
            {
                k++;
                if (k < 101)
                {
                    s.pbLoading.setValue(k);
                    s.lblProgress.setText("Loading Space Physics Equations... " + k + "%");

                } else
                {
                    s.lblProgress.setText("Loading Space Physics Equations... Done");
                    t.cancel();
                    
                    final MenuScreen m = new MenuScreen();
                    m.setLocationRelativeTo(null);
                    m.setResizable(false);
                    m.setVisible(true);
                    s.dispose();
                }
            }
        };
        t.scheduleAtFixedRate(tt, 0, 20);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoadingScreenPanel;
    private javax.swing.JLabel lblLoadingImage;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JProgressBar pbLoading;
    // End of variables declaration//GEN-END:variables
}
