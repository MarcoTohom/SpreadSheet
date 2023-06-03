package Vista;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.table.TableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marco
 */
public class KaliExcel extends javax.swing.JFrame {

    int row = 0, col = 0, numeroHoja = 2;
    JTabbedPane pestañas;

    /**
     * Creates new form KaliExcel
     */
    public KaliExcel() {

        initComponents();
        setLocationRelativeTo(null);

        setTitle("KaliExcel");

        hoja.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"", "        1", "        2", "         3", "          4", null, null},
                    {"1", "", null, null, null, null, null},
                    {"2", null, null, null, null, null, null},
                    {"3", null, null, null, null, null, null},
                    {"4", null, null, null, null, null, null},
                    {"5", null, null, null, null, null, null},
                    {"6", null, null, null, null, null, null},
                    {"7", null, null, null, null, null, null},
                    {"8", null, null, null, null, null, null},
                    {"9", null, null, null, null, null, null},
                    {"10", null, null, null, null, null, null},
                    {"11", null, null, null, null, null, null},
                    {"12", null, null, null, null, null, null},
                    {"13", null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null}
                },
                new String[]{
                    "A", "B", "C", "D", "E", "F", "Title 7", "H", "I", "J", "K"
                }
        ));

        setTitle("Kali Excel");

        TableModel tableModel = hoja.getModel();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                System.out.print("\t" + tableModel.getValueAt(i, j));
            }
            System.out.println("");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanel = new javax.swing.JTabbedPane();
        ventana = new javax.swing.JPanel();
        funcion = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        rechazar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        hoja = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenu();
        hojaCalculo = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));

        tabPanel.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        funcion.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        funcion.setText("f(x)");

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        rechazar.setText("Rechazar");
        rechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechazarActionPerformed(evt);
            }
        });

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        hoja.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        hoja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        hoja.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        hoja.setCellSelectionEnabled(true);
        hoja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hoja.setGridColor(new java.awt.Color(153, 153, 153));
        hoja.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        hoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hojaMouseClicked(evt);
            }
        });
        hoja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hojaKeyPressed(evt);
            }
        });
        jScrollPane.setViewportView(hoja);
        hoja.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        hoja.getAccessibleContext().setAccessibleParent(input);

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana);
        ventana.setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addComponent(funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aceptar)
                        .addGap(18, 18, 18)
                        .addComponent(rechazar)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcion)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptar)
                    .addComponent(rechazar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPanel.addTab("Hoja 1", ventana);

        menuArchivo.setText("Archivo");

        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        menuArchivo.add(abrir);

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        menuArchivo.add(guardar);

        menu.add(menuArchivo);

        menuInsertar.setText("Insertar");

        hojaCalculo.setText("Hoja de calculo");
        hojaCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hojaCalculoActionPerformed(evt);
            }
        });
        menuInsertar.add(hojaCalculo);

        menu.add(menuInsertar);

        menuAyuda.setText("Ayuda");
        menu.add(menuAyuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hojaCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hojaCalculoActionPerformed
        JPanel panel = new Modelo.KaliPanel();
        tabPanel.add("Hoja " + numeroHoja, panel);
        numeroHoja++;
    }//GEN-LAST:event_hojaCalculoActionPerformed

    private void hojaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hojaKeyPressed
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        System.out.println("key pressed: " + key);

        String texto = input.getText();
        if (hoja.getModel().getValueAt(row, col) != null) {
            texto = texto.concat(String.valueOf(key));
        } else {
            texto = "";
        }
        input.setText(texto);
    }//GEN-LAST:event_hojaKeyPressed

    private void hojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hojaMouseClicked
        // TODO add your handling code here:
        row = hoja.rowAtPoint(evt.getPoint());
        col = hoja.columnAtPoint(evt.getPoint());

        System.out.println("\nRow: " + row + ". Col: " + col + ".");
        String texto;
        if (hoja.getModel().getValueAt(row, col) != null) {
            texto = hoja.getModel().getValueAt(row, col).toString();
        } else {
            texto = "";
        }
        input.setText(texto);
    }//GEN-LAST:event_hojaMouseClicked

    private void rechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechazarActionPerformed
        // TODO add your handling code here:
        input.setText("");
        hoja.getModel().setValueAt(null, row, col);
        // Eliminar modelo y for, es solo para debug
        TableModel tableModel = hoja.getModel();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                System.out.print("\t" + tableModel.getValueAt(i, j));
            }
            System.out.println("");
        }
    }//GEN-LAST:event_rechazarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        hoja.getModel().setValueAt(input.getText(), row, col);
    }//GEN-LAST:event_aceptarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                System.out.println(file.getAbsolutePath());
                PrintWriter os = new PrintWriter(file);
                os.println("");
                for (int col = 0; col < hoja.getColumnCount(); col++) {
                    os.print(hoja.getColumnName(col) + "\t");
                }

                os.println("");
                os.println("");

                for (int iRow = 0; iRow < hoja.getRowCount(); iRow++) {
                    for (int iColumn = 0; iColumn < hoja.getColumnCount(); iColumn++) {
                        String texto = "";
                        if (hoja.getValueAt(iRow, iColumn) != null) {
                            texto = hoja.getValueAt(iRow, iColumn).toString();
                        } else {
                            texto = "null";
                        }
                        os.print(texto + "\t");

                    }
                    os.println("");
                }
                os.close();
                System.out.println("Done!");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(KaliExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaliExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaliExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaliExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new MetalLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.err.println("Error de Look and Feel");
                }
                new KaliExcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel funcion;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JTable hoja;
    private javax.swing.JMenuItem hojaCalculo;
    private javax.swing.JTextField input;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JButton rechazar;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JPanel ventana;
    // End of variables declaration//GEN-END:variables
}
