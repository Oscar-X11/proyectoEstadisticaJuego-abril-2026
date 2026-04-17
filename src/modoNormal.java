
import java.awt.Color;                      //manipular colores
import java.util.ArrayList;                 //arraylisy
import javax.swing.JLabel;                  //trabajar con jlabels
import javax.swing.JOptionPane;             //generar digitos randoms
import java.util.Random;
import javax.sound.sampled.AudioSystem;     // Trabajar con audio
import javax.sound.sampled.AudioInputStream;//-
import javax.sound.sampled.Clip;            //-

public class modoNormal extends javax.swing.JFrame {

    private String Modo = "Normal";
    private int FILAS = 6;
    private int COLUMNAS = 5;
    private JLabel[][] cuadricula;
    private int filaAct = 0;
    private String numeroObjetivo;
    private int intentos = FILAS;

    public static ArrayList<Integer> DividirDigitos(String palabra) {
        ArrayList<Integer> numerosDivididos = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            int digito = Character.getNumericValue(palabra.charAt(i));
            numerosDivididos.add(digito);
        }
        return numerosDivididos;
    }
    

    public modoNormal() {
        initComponents();
        this.setTitle("Adina el numero");
        //Colocar en medio de la pantalla
        this.setLocationRelativeTo(null);

        // num aleatorio
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COLUMNAS; i++) {
            sb.append(random.nextInt(10));
        }
        numeroObjetivo = sb.toString();
        
        cuadricula = new JLabel[][]{
            {JL1, JL2, JL3, JL4, JL5},
            {JL6, JL7, JL8, JL9, JL10},
            {JL11, JL12, JL13, JL14, JL15},
            {JL16, JL17, JL18, JL19, JL20},
            {JL21, JL22, JL23, JL24, JL25},
            {JL26, JL27, JL28, JL29, JL30}

        };
        jLabelDato1.setText("" + intentos);
        jLabelDato2.setText("Modo: " + Modo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtitulo = new javax.swing.JLabel();
        jpMain = new javax.swing.JPanel();
        GridNumeros = new javax.swing.JPanel();
        JL1 = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();
        JL3 = new javax.swing.JLabel();
        JL4 = new javax.swing.JLabel();
        JL5 = new javax.swing.JLabel();
        JL6 = new javax.swing.JLabel();
        JL7 = new javax.swing.JLabel();
        JL8 = new javax.swing.JLabel();
        JL9 = new javax.swing.JLabel();
        JL10 = new javax.swing.JLabel();
        JL11 = new javax.swing.JLabel();
        JL12 = new javax.swing.JLabel();
        JL13 = new javax.swing.JLabel();
        JL14 = new javax.swing.JLabel();
        JL15 = new javax.swing.JLabel();
        JL16 = new javax.swing.JLabel();
        JL17 = new javax.swing.JLabel();
        JL18 = new javax.swing.JLabel();
        JL19 = new javax.swing.JLabel();
        JL20 = new javax.swing.JLabel();
        JL21 = new javax.swing.JLabel();
        JL22 = new javax.swing.JLabel();
        JL23 = new javax.swing.JLabel();
        JL24 = new javax.swing.JLabel();
        JL25 = new javax.swing.JLabel();
        JL26 = new javax.swing.JLabel();
        JL27 = new javax.swing.JLabel();
        JL28 = new javax.swing.JLabel();
        JL29 = new javax.swing.JLabel();
        JL30 = new javax.swing.JLabel();
        AdivinarNum = new javax.swing.JButton();
        txtIngresarNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        GridDatos = new javax.swing.JPanel();
        jLabelDato2 = new javax.swing.JLabel();
        jLabelDato1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLtitulo1 = new javax.swing.JLabel();
        RregresarAlMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        JLtitulo.setFont(new java.awt.Font("Sarpanch Black", 1, 24)); // NOI18N
        JLtitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLtitulo.setText("ADIVINA EL NUMERO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMain.setBackground(new java.awt.Color(51, 0, 153));
        jpMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GridNumeros.setBackground(new java.awt.Color(51, 51, 51));
        GridNumeros.setOpaque(false);
        GridNumeros.setLayout(new java.awt.GridLayout(6, 5, 10, 15));

        JL1.setBackground(new java.awt.Color(51, 51, 51));
        JL1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL1.setForeground(new java.awt.Color(255, 255, 255));
        JL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JL1.setOpaque(true);
        GridNumeros.add(JL1);

        JL2.setBackground(new java.awt.Color(51, 51, 51));
        JL2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL2.setForeground(new java.awt.Color(255, 255, 255));
        JL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL2.setOpaque(true);
        GridNumeros.add(JL2);

        JL3.setBackground(new java.awt.Color(51, 51, 51));
        JL3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL3.setForeground(new java.awt.Color(255, 255, 255));
        JL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL3.setOpaque(true);
        GridNumeros.add(JL3);

        JL4.setBackground(new java.awt.Color(51, 51, 51));
        JL4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL4.setForeground(new java.awt.Color(255, 255, 255));
        JL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL4.setOpaque(true);
        GridNumeros.add(JL4);

        JL5.setBackground(new java.awt.Color(51, 51, 51));
        JL5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL5.setForeground(new java.awt.Color(255, 255, 255));
        JL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL5.setOpaque(true);
        GridNumeros.add(JL5);

        JL6.setBackground(new java.awt.Color(51, 51, 51));
        JL6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL6.setForeground(new java.awt.Color(255, 255, 255));
        JL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL6.setOpaque(true);
        GridNumeros.add(JL6);

        JL7.setBackground(new java.awt.Color(51, 51, 51));
        JL7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL7.setForeground(new java.awt.Color(255, 255, 255));
        JL7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL7.setOpaque(true);
        GridNumeros.add(JL7);

        JL8.setBackground(new java.awt.Color(51, 51, 51));
        JL8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL8.setForeground(new java.awt.Color(255, 255, 255));
        JL8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL8.setOpaque(true);
        GridNumeros.add(JL8);

        JL9.setBackground(new java.awt.Color(51, 51, 51));
        JL9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL9.setForeground(new java.awt.Color(255, 255, 255));
        JL9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL9.setOpaque(true);
        GridNumeros.add(JL9);

        JL10.setBackground(new java.awt.Color(51, 51, 51));
        JL10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL10.setForeground(new java.awt.Color(255, 255, 255));
        JL10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL10.setOpaque(true);
        GridNumeros.add(JL10);

        JL11.setBackground(new java.awt.Color(51, 51, 51));
        JL11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL11.setForeground(new java.awt.Color(255, 255, 255));
        JL11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL11.setOpaque(true);
        GridNumeros.add(JL11);

        JL12.setBackground(new java.awt.Color(51, 51, 51));
        JL12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL12.setForeground(new java.awt.Color(255, 255, 255));
        JL12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL12.setOpaque(true);
        GridNumeros.add(JL12);

        JL13.setBackground(new java.awt.Color(51, 51, 51));
        JL13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL13.setForeground(new java.awt.Color(255, 255, 255));
        JL13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL13.setOpaque(true);
        GridNumeros.add(JL13);

        JL14.setBackground(new java.awt.Color(51, 51, 51));
        JL14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL14.setForeground(new java.awt.Color(255, 255, 255));
        JL14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL14.setOpaque(true);
        GridNumeros.add(JL14);

        JL15.setBackground(new java.awt.Color(51, 51, 51));
        JL15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL15.setForeground(new java.awt.Color(255, 255, 255));
        JL15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL15.setOpaque(true);
        GridNumeros.add(JL15);

        JL16.setBackground(new java.awt.Color(51, 51, 51));
        JL16.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL16.setForeground(new java.awt.Color(255, 255, 255));
        JL16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL16.setOpaque(true);
        GridNumeros.add(JL16);

        JL17.setBackground(new java.awt.Color(51, 51, 51));
        JL17.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL17.setForeground(new java.awt.Color(255, 255, 255));
        JL17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL17.setOpaque(true);
        GridNumeros.add(JL17);

        JL18.setBackground(new java.awt.Color(51, 51, 51));
        JL18.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL18.setForeground(new java.awt.Color(255, 255, 255));
        JL18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL18.setOpaque(true);
        GridNumeros.add(JL18);

        JL19.setBackground(new java.awt.Color(51, 51, 51));
        JL19.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL19.setForeground(new java.awt.Color(255, 255, 255));
        JL19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL19.setOpaque(true);
        GridNumeros.add(JL19);

        JL20.setBackground(new java.awt.Color(51, 51, 51));
        JL20.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL20.setForeground(new java.awt.Color(255, 255, 255));
        JL20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL20.setOpaque(true);
        GridNumeros.add(JL20);

        JL21.setBackground(new java.awt.Color(51, 51, 51));
        JL21.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL21.setForeground(new java.awt.Color(255, 255, 255));
        JL21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL21.setOpaque(true);
        GridNumeros.add(JL21);

        JL22.setBackground(new java.awt.Color(51, 51, 51));
        JL22.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL22.setForeground(new java.awt.Color(255, 255, 255));
        JL22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL22.setOpaque(true);
        GridNumeros.add(JL22);

        JL23.setBackground(new java.awt.Color(51, 51, 51));
        JL23.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL23.setForeground(new java.awt.Color(255, 255, 255));
        JL23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL23.setOpaque(true);
        GridNumeros.add(JL23);

        JL24.setBackground(new java.awt.Color(51, 51, 51));
        JL24.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL24.setForeground(new java.awt.Color(255, 255, 255));
        JL24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL24.setOpaque(true);
        GridNumeros.add(JL24);

        JL25.setBackground(new java.awt.Color(51, 51, 51));
        JL25.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL25.setForeground(new java.awt.Color(255, 255, 255));
        JL25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL25.setOpaque(true);
        GridNumeros.add(JL25);

        JL26.setBackground(new java.awt.Color(51, 51, 51));
        JL26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL26.setForeground(new java.awt.Color(255, 255, 255));
        JL26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL26.setOpaque(true);
        GridNumeros.add(JL26);

        JL27.setBackground(new java.awt.Color(51, 51, 51));
        JL27.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL27.setForeground(new java.awt.Color(255, 255, 255));
        JL27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL27.setOpaque(true);
        GridNumeros.add(JL27);

        JL28.setBackground(new java.awt.Color(51, 51, 51));
        JL28.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL28.setForeground(new java.awt.Color(255, 255, 255));
        JL28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL28.setOpaque(true);
        GridNumeros.add(JL28);

        JL29.setBackground(new java.awt.Color(51, 51, 51));
        JL29.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL29.setForeground(new java.awt.Color(255, 255, 255));
        JL29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL29.setOpaque(true);
        GridNumeros.add(JL29);

        JL30.setBackground(new java.awt.Color(51, 51, 51));
        JL30.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL30.setForeground(new java.awt.Color(255, 255, 255));
        JL30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JL30.setOpaque(true);
        GridNumeros.add(JL30);

        jpMain.add(GridNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 390, 333));

        AdivinarNum.setBackground(new java.awt.Color(51, 51, 51));
        AdivinarNum.setForeground(new java.awt.Color(255, 255, 255));
        AdivinarNum.setText("Adivinar");
        AdivinarNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdivinarNumActionPerformed(evt);
            }
        });
        jpMain.add(AdivinarNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, 30));

        txtIngresarNum.setBackground(new java.awt.Color(255, 255, 255));
        txtIngresarNum.setForeground(new java.awt.Color(51, 51, 51));
        txtIngresarNum.setOpaque(true);
        txtIngresarNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarNumActionPerformed(evt);
            }
        });
        jpMain.add(txtIngresarNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 140, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa un numero");
        jpMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        GridDatos.setBackground(new java.awt.Color(51, 0, 153));
        GridDatos.setOpaque(false);

        jLabelDato2.setBackground(new java.awt.Color(204, 204, 204));
        jLabelDato2.setFont(new java.awt.Font("Sarpanch Black", 1, 18)); // NOI18N
        jLabelDato2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDato2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelDato1.setBackground(new java.awt.Color(204, 204, 204));
        jLabelDato1.setFont(new java.awt.Font("Sarpanch Black", 1, 24)); // NOI18N
        jLabelDato1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDato1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pista:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Intentos:");

        javax.swing.GroupLayout GridDatosLayout = new javax.swing.GroupLayout(GridDatos);
        GridDatos.setLayout(GridDatosLayout);
        GridDatosLayout.setHorizontalGroup(
            GridDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GridDatosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(GridDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelDato1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(GridDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GridDatosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(175, 175, 175))
                    .addComponent(jLabelDato2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        GridDatosLayout.setVerticalGroup(
            GridDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GridDatosLayout.createSequentialGroup()
                .addGroup(GridDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GridDatosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDato2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridDatosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDato1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpMain.add(GridDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 410, 80));

        JLtitulo1.setFont(new java.awt.Font("Sarpanch Black", 1, 24)); // NOI18N
        JLtitulo1.setForeground(new java.awt.Color(255, 255, 255));
        JLtitulo1.setText("ADIVINA EL NUMERO");
        jpMain.add(JLtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 280, 37));

        RregresarAlMenu.setBackground(new java.awt.Color(51, 51, 51));
        RregresarAlMenu.setForeground(new java.awt.Color(255, 255, 255));
        RregresarAlMenu.setText("Volver");
        RregresarAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RregresarAlMenuActionPerformed(evt);
            }
        });
        jpMain.add(RregresarAlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 70, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/imgIntefazJuego.png"))); // NOI18N
        jpMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdivinarNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdivinarNumActionPerformed
        String intento = txtIngresarNum.getText();
        //Validar que sean exactamente 5 números
        if (intento.length() != COLUMNAS || !intento.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa exactamente " + COLUMNAS + " números.");
            return; // Detiene la ejecución si no es válido
        }
        
        intentos--;
        jLabelDato1.setText("" + intentos);
        
        Color colAcertado = Color.decode("#a1d06c");
        Color colIncorrecto = Color.decode("#f4cd79");
        Color colNoExiste = Color.decode("#44475A");

        int turno = filaAct + 1;
         //se recibe los datos ingresados
       
        
        

        //pistas
        int inten = Integer.parseInt(intento);
        int objetive = Integer.parseInt(numeroObjetivo);
        if (objetive > inten) {
            jLabelDato2.setText("El numero es mayor");
        }
        if (objetive < inten) {
            jLabelDato2.setText("El numero es menor");
        }

        ArrayList<Integer> digitos = DividirDigitos(intento);
        ArrayList<Integer> NumObjetivo = DividirDigitos(numeroObjetivo);

        //array para marcar los encontrados
        boolean[] Encontrado = new boolean[COLUMNAS];

        for (int i = 0; i < COLUMNAS; i++) {
            int digIngresado = digitos.get(i); //obtiene el dato ingresado
            int digAdivinar1 = NumObjetivo.get(i);//objetivo
            cuadricula[filaAct][i].setText(String.valueOf(digIngresado));
            
            
            //se compara si los digitos en esa posicion son iguales
            if (digIngresado == digAdivinar1) {
                cuadricula[filaAct][i].setBackground(colAcertado);
                Encontrado[i] = true;// maraca si fue encontrado
                NumObjetivo.set(i, -1);
                //si fue encontrado se cambia de valor para no volver a contar       el digito
            }
        }

        for (int i = 0; i < COLUMNAS; i++) {
            // Solo revisamos si NO fue encontrado
            if (Encontrado[i] == false) {
                int digIngresado = digitos.get(i);
            //analizamos el digito y analizamos si esta contenido en el numObjetivo
                if (NumObjetivo.contains(digIngresado)) {
                    cuadricula[filaAct][i].setBackground(colIncorrecto);
                    int indexAmarillo = NumObjetivo.indexOf(digIngresado);
                    NumObjetivo.set(indexAmarillo, -1);///marcar             para evitar duplicados al colorear
                } else {// si no se encontro el digito se pinta de gris
                    cuadricula[filaAct][i].setBackground(colNoExiste);
                }
            }
        }
        //contador para validar 
        //si todas las opciones son correctas
        int buenas = 0;
        for (boolean bol : Encontrado) {
            if (bol == true) {
                buenas++;
            }
        }
        //validadcion para ganar
        // Lógica simplificada
                //validadcion para ganar
        if (buenas == Encontrado.length) {//ganó
            VentanaGanar Ventana1 = new VentanaGanar(filaAct, Modo);
            Ventana1.setVisible(true);
            this.dispose();
            return; // El return evita que se ejecute lo de abajo
        }
        if (turno >= 6) {//perdio
            VentanPerder Ventana2 = new VentanPerder(numeroObjetivo, Modo);
            Ventana2.setVisible(true);
            this.dispose();
        }




        txtIngresarNum.setText("");
        filaAct++;
    }//GEN-LAST:event_AdivinarNumActionPerformed

    private void txtIngresarNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarNumActionPerformed
        // TODO add your handling code here:
        AdivinarNum.doClick();
    }//GEN-LAST:event_txtIngresarNumActionPerformed

    private void RregresarAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RregresarAlMenuActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
           gameUI Ventana = new gameUI();
        Ventana.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_RregresarAlMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdivinarNum;
    private javax.swing.JPanel GridDatos;
    private javax.swing.JPanel GridNumeros;
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL10;
    private javax.swing.JLabel JL11;
    private javax.swing.JLabel JL12;
    private javax.swing.JLabel JL13;
    private javax.swing.JLabel JL14;
    private javax.swing.JLabel JL15;
    private javax.swing.JLabel JL16;
    private javax.swing.JLabel JL17;
    private javax.swing.JLabel JL18;
    private javax.swing.JLabel JL19;
    private javax.swing.JLabel JL2;
    private javax.swing.JLabel JL20;
    private javax.swing.JLabel JL21;
    private javax.swing.JLabel JL22;
    private javax.swing.JLabel JL23;
    private javax.swing.JLabel JL24;
    private javax.swing.JLabel JL25;
    private javax.swing.JLabel JL26;
    private javax.swing.JLabel JL27;
    private javax.swing.JLabel JL28;
    private javax.swing.JLabel JL29;
    private javax.swing.JLabel JL3;
    private javax.swing.JLabel JL30;
    private javax.swing.JLabel JL4;
    private javax.swing.JLabel JL5;
    private javax.swing.JLabel JL6;
    private javax.swing.JLabel JL7;
    private javax.swing.JLabel JL8;
    private javax.swing.JLabel JL9;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JLabel JLtitulo1;
    private javax.swing.JButton RregresarAlMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDato1;
    private javax.swing.JLabel jLabelDato2;
    private javax.swing.JPanel jpMain;
    private javax.swing.JTextField txtIngresarNum;
    // End of variables declaration//GEN-END:variables
}
