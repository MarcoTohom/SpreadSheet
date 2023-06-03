/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Marco
 */
public class FactorySheet {
    public static void main(String[] args) {
        System.out.println("test");
    }
    
    public javax.swing.JPanel createJPanel(){
        javax.swing.JPanel jPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabel = new javax.swing.JLabel();
        jPanel.setVisible(true);
        jLabel.setVisible(true);
        jLabel.setText("Hello world");
        jPanel.add(jLabel);
        return jPanel;
    } 
}
