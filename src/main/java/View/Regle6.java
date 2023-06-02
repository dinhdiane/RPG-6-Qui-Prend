package View;

import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Regle6 extends javax.swing.JDialog {


    /** Creates new form Regle6 */
    public Regle6(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        URL url_tmp = getClass().getResource("/images/logo 6QuiPrend.png");
        if(url_tmp!=null) setIconImage(new ImageIcon(url_tmp).getImage());
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JPanel containerPanel = new JPanel(new BorderLayout());

        url_tmp = getClass().getResource("/images/fond 6QuiPrend.png");
        ImageIcon img = new ImageIcon(url_tmp);
        JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1080,720);
        containerPanel.add(background, BorderLayout.CENTER); //add(background);

        getContentPane().add(containerPanel, BorderLayout.CENTER);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(
                "______________________Principe de jeu____________________________" +
                        "\n 6 qui prend! est un jeu de cartes pouvant se jouer de 2 à 10 joueurs."+
                        "\n Le jeu contient :"+
                            "\n • 104 cartes, numérotées de 1 à 104."+
                        "\n Chaque carte possède un nombre de “têtes de bœuf”, allant de 1 à 7 " +
                        "\n selon les règles cumulatives suivantes :"+
                            "\n • les numéros se terminant en 5 ont 2 têtes de bœuf,"+
                            "\n • Les num´eros se terminant en 0 ont 3 tˆetes de bœuf,"+
                            "\n • Les doublets (“11”, “22”) ont 5 têtes de bœuf."+
                        "\n Par exemple, la carte “12” a une tête de bœuf, “15” en a 2 et “55” en a 7."+
                        "\n L’objectif pour chaque joueur est d’obtenir le moins de têtes de bœuf."+

                "\n \n \n  ______________________Règles de jeu____________________________" +
                        "\nLa partie se déroule de la manière suivante :\n" +
                        "• Au début, 10 cartes sont distribuées à chaque joueur.\n" +
                        "• 4 cartes sont posées ensuite au milieu. " +
                        "\n Chacune des cartes représente le début d’une série.\n" +
                        "• A chaque début de tour, chaque joueur place une carte face cachée " +
                        "\n devant lui.\n" +
                        "• Une fois que tous les joueurs ont posé leur carte, on les dévoile et on les\n" +
                        "place en fonction des règles présentées dans la section suivante.\n" +
                        "• La partie se termine quand les 10 cartes ont été posées.\n"+

                        "\n Lorsque l’on dévoile les cartes, on commence par placer la plus faible " +
                        "\n des cartes et on procède par ordre croissant.\n" +
                                    "\n \n Le placement des cartes répond aux règles suivantes:\n" +
                                "\n Règle 1: Valeurs croissantes: " +
                        "\n Les cartes d’une série doivent toujours se succéder dans l’ordre croissant de leurs valeurs.\n" +
                                "\n Règle 2: La plus petite différence : " +
                        "\n Une carte doit toujours être déposée dans la\n" +
                                "série où la différence entre la dernière carte déposée et la nouvelle est la plus faible.\n" +
                                "\n Règle 3: Série terminée: " +
                        "\n Une série est terminée lorsqu’elle compte 5 cartes.\n " +
                                "Lorsque d’après la règle 2, une sixième carte doit y être déposée, le joueur qui joue\n" +
                                "cette carte doit ramasser les 5 cartes de la série. Sa sixième carte forme alors le début d’une nouvelle série.\n" +
                                "\n Règle 4: La carte la plus faible: " +
                        "\n Le joueur qui joue une carte si faible qu’elle ne peut aller dans " +
                                "\n aucune des séries doit ramasser toutes les cartes d’une série de son choix." +
                                "\n Sa carte “faible” représente alors la première carte d’une nouvelle série.\n" +
                                "Lorsqu’un joueur récupère des cartes, elles ne vont pas dans sa main" +
                                "\n mais dans son tas.\n"

        );
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(39, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Regle6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regle6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regle6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regle6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Regle6 dialog = new Regle6(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables


}
