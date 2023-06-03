/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Modelo;

import javax.swing.table.TableModel;

/**
 *
 * @author Marco
 */
public class KaliPanel extends javax.swing.JPanel {
    int row = 0, col = 0;
    /**
     * Creates new form KaliPanel
     */
    public KaliPanel() {
        initComponents();
        
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
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"
            }
        ));

        TableModel tableModel = hoja.getModel();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                System.out.print("\t" + tableModel.getValueAt(i, j));
            }
            System.out.println("");
        }
    }
    
    public javax.swing.JPanel createPane(){
        return this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcion = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        rechazar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        hoja = new javax.swing.JTable();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aceptar)
                        .addGap(18, 18, 18)
                        .addComponent(rechazar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcion)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptar)
                    .addComponent(rechazar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        hoja.getModel().setValueAt(input.getText(), row, col);
    }//GEN-LAST:event_aceptarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel funcion;
    private javax.swing.JTable hoja;
    private javax.swing.JTextField input;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton rechazar;
    // End of variables declaration//GEN-END:variables
}
