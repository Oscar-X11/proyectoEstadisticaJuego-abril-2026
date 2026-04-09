
public class VentanPerder extends javax.swing.JFrame {

    private String modoDeJuego;

    public VentanPerder(String numeroObj, String Modo) {
        initComponents();
        this.setTitle("Vuelve a intentarlo");
        //Colocar en medio de la pantalla
        this.setLocationRelativeTo(null);

        numeroObjetivo.setText("" + numeroObj);
        this.modoDeJuego = Modo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolverMenu = new javax.swing.JButton();
        numeroObjetivo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnJugarOtraVez = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolverMenu.setBackground(new java.awt.Color(51, 51, 51));
        btnVolverMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverMenu.setText("Volver al Menu");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, -1));

        numeroObjetivo.setBackground(new java.awt.Color(204, 204, 204));
        numeroObjetivo.setFont(new java.awt.Font("Sarpanch Black", 1, 36)); // NOI18N
        numeroObjetivo.setForeground(new java.awt.Color(255, 255, 255));
        numeroObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(numeroObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 170, 50));

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 70, -1));

        btnJugarOtraVez.setBackground(new java.awt.Color(51, 51, 51));
        btnJugarOtraVez.setForeground(new java.awt.Color(255, 255, 255));
        btnJugarOtraVez.setText("Volver a jugar");
        btnJugarOtraVez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarOtraVezActionPerformed(evt);
            }
        });
        jPanel1.add(btnJugarOtraVez, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/perdiste.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarOtraVezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarOtraVezActionPerformed

        this.dispose();
        switch (modoDeJuego) {
            case "Facil":
                modoFacil Ventana1 = new modoFacil();
                Ventana1.setVisible(true);
                break;
            case "Normal":
                modoNormal Ventana2 = new modoNormal();
                Ventana2.setVisible(true);
                break;
            case "Dificil":
                modoDificil Ventana3 = new modoDificil();
                Ventana3.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_btnJugarOtraVezActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        this.dispose();
        gameUI Ventana = new gameUI();
        Ventana.setVisible(true);
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarOtraVez;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numeroObjetivo;
    // End of variables declaration//GEN-END:variables
}
