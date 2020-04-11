/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fran
 */
public class GUISalpicadero2 extends javax.swing.JApplet {
    /**
     * Creates new form GUISalpicadero2
     */
    public GUISalpicadero2() {
        this.gestor = new GestorFiltros();
        this.gestor.run();
        this.palanca = new Palanca();
    }
    /**
     * Initializes the applet GUISalpicadero2
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(GUISalpicadero2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISalpicadero2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISalpicadero2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISalpicadero2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                    
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radial4Lcd1 = new eu.hansolo.steelseries.gauges.Radial4Lcd();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        displayCircular1 = new eu.hansolo.steelseries.gauges.DisplayCircular();
        jToggleButton2 = new javax.swing.JToggleButton();
        radial1Vertical1 = new eu.hansolo.steelseries.gauges.Radial1Vertical();
        displayMulti1 = new eu.hansolo.steelseries.gauges.DisplayMulti();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radial4Lcd1.setLcdDecimals(1);
        radial4Lcd1.setLcdUnitString("km/h");
        radial4Lcd1.setLcdUnitStringVisible(true);
        radial4Lcd1.setMaxValue(200.0);
        radial4Lcd1.setMinimumSize(new java.awt.Dimension(200, 200));
        radial4Lcd1.setThresholdVisible(true);
        radial4Lcd1.setTickLabelPeriod(20);
        radial4Lcd1.setTitle("Velocímetro");
        radial4Lcd1.setUnitString("km/h");
        getContentPane().add(radial4Lcd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 12, 280, 280));

        jButton3.setText("Parar");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 359, -1, -1));

        jButton4.setText("Acelerar");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 299, -1, -1));

        jButton5.setText("Mantener");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 359, -1, -1));

        jButton6.setText("Reiniciar");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 400, -1, -1));

        jToggleButton1.setText("ARRANCAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 100, -1));

        displayCircular1.setUnitString("km   ");
        getContentPane().add(displayCircular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 299, 117, 117));

        jToggleButton2.setText("PISAR FRENO");
        jToggleButton2.setEnabled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));
        getContentPane().add(radial1Vertical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 446, -1, -1));

        displayMulti1.setUnitString("RPM x1000");

        javax.swing.GroupLayout displayMulti1Layout = new javax.swing.GroupLayout(displayMulti1);
        displayMulti1.setLayout(displayMulti1Layout);
        displayMulti1Layout.setHorizontalGroup(
            displayMulti1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        displayMulti1Layout.setVerticalGroup(
            displayMulti1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        getContentPane().add(displayMulti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 324, 215, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        /* Si está seleccionado, podemos seleccionar el resto */
        if(jToggleButton1.isSelected()) {
            if(gestor.getState() == Thread.State.RUNNABLE) {
                ((Thread)gestor).start();
            }
            
            jToggleButton1.setText("APAGAR");
            
            /* Activamos el resto de botones */
            jToggleButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            
            /* Encendemos el led */
            radial4Lcd1.setLedBlinking(true);
        }
        
        /* Si no está seleccionado, decrementamos la velocidad según el rozamiento y el resto de botones dejan de ser seleccionables */
        else {
            jToggleButton1.setText("ARRANCAR");
            
            jToggleButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            
            /* Apagamos el led */
            radial4Lcd1.setLedBlinking(false);
        }
        
        new Thread(){
            public void run() {
                    gestor.peticionFiltros(-1);
                    
                    if(jButton3.isSelected()) {
                        /* Para el cuentakilómetros */
                        double kilometros = Math.round(gestor.salpicadero.getDistancia() * 100.0) / 100.0;
                        displayCircular1.setValue(kilometros);
                        displayCircular1.repaint();
                        
                        /* Para el velocímetro */
                        double redondeada = Math.round(gestor.salpicadero.getVelocidad() * 100.0) / 100.0;
                        radial4Lcd1.setValue(redondeada);
                        radial4Lcd1.repaint();
                        
                        /* Para el cuentarrevoluciones */
                        double revoluciones = Math.round(gestor.salpicadero.getRevoluciones() * 100.0) / 100.0;
                        displayCircular1.setValue(revoluciones);
                        displayCircular1.repaint();
                    }
                    
                    /* Pequeña espera para que tengan margen de actualizarse */
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUISalpicadero2.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }.start();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        new Thread(){
            public void run(){
                while(jToggleButton1.isSelected()) {
                    jToggleButton2.setText("SOLTAR FRENO");

                    gestor.peticionFiltros(1);
                    /* Para el cuentakilómetros */
                    double kilometros = Math.round(gestor.salpicadero.getDistancia() * 100.0) / 100.0;
                    displayCircular1.setValue(kilometros);
                    displayCircular1.repaint();

                    /* Para el velocímetro */
                    double redondeada = Math.round(gestor.salpicadero.getVelocidad() * 100.0) / 100.0;
                    radial4Lcd1.setValue(redondeada);
                    radial4Lcd1.repaint();

                    /* Para el cuentarrevoluciones */
                    double revoluciones = Math.round(gestor.salpicadero.getRevoluciones() * 100.0) / 100.0;
                    displayMulti1.setValue(revoluciones);
                    displayMulti1.repaint();
                    
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUISalpicadero2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /* Botón de frenar */
        new Thread(){
            public void run(){
                while(jButton3.isSelected()) {
                    /* Cuando está seleccionado el botón de frenar, solo podemos movernos a "Acelerar" */
                    jButton4.setEnabled(true);
                    jButton5.setEnabled(false);
                    jButton6.setEnabled(false);
                    
                    /* Cambiamos la palanca a estado "Frenando" */
                    palanca.setEstado(0);
                    
                    /* Aplicamos la opción de frenar a los filtros necesarios */
                    gestor.peticionFiltros(1);
                    
                    /* Para el cuentakilómetros */
                    double kilometros = Math.round(gestor.salpicadero.getDistancia() * 100.0) / 100.0;
                    displayCircular1.setValue(kilometros);
                    displayCircular1.repaint();

                    /* Para el velocímetro */
                    double redondeada = Math.round(gestor.salpicadero.getVelocidad() * 100.0) / 100.0;
                    radial4Lcd1.setValue(redondeada);
                    radial4Lcd1.repaint();

                    /* Para el cuentarrevoluciones */
                    double revoluciones = Math.round(gestor.salpicadero.getRevoluciones() * 100.0) / 100.0;
                    displayMulti1.setValue(revoluciones);
                    displayMulti1.repaint();
                    
                    /* Pequeña espera para que tengan margen de actualizarse */
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUISalpicadero2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /* Botón de acelerar */
        new Thread(){
            public void run(){
                while(jButton4.isSelected()) {
                    /* Cuando está seleccionado el botón de acelerar, solo podemos movernos a "Mantener" */
                    jButton3.setEnabled(false);
                    jButton5.setEnabled(true);
                    jButton6.setEnabled(false);
                    
                    /* Cambiamos la palanca a estado "Acelerando" */
                    palanca.setEstado(1);
                    
                    /* Aplicamos la opción de acelerar a los filtros necesarios */
                    gestor.peticionFiltros(0);
                    
                    /* Para el cuentakilómetros */
                    double kilometros = Math.round(gestor.salpicadero.getDistancia() * 100.0) / 100.0;
                    displayCircular1.setValue(kilometros);
                    displayCircular1.repaint();

                    /* Para el velocímetro */
                    double redondeada = Math.round(gestor.salpicadero.getVelocidad() * 100.0) / 100.0;
                    radial4Lcd1.setValue(redondeada);
                    radial4Lcd1.repaint();

                    /* Para el cuentarrevoluciones */
                    double revoluciones = Math.round(gestor.salpicadero.getRevoluciones() * 100.0) / 100.0;
                    displayMulti1.setValue(revoluciones);
                    displayMulti1.repaint();
                    
                    /* Pequeña espera para que tengan margen de actualizarse */
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUISalpicadero2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        /* Botón de mantener */
        new Thread(){
            public void run(){
                while(jButton5.isSelected()) {
                    /* Cuando está seleccionado el botón de mantener, solo podemos movernos a "Acelerar" o "Frenar" */
                    jButton3.setEnabled(true);
                    jButton4.setEnabled(true);
                    jButton6.setEnabled(false);
                    
                    /* Cambiamos la palanca a estado "Mantener" */
                    palanca.setEstado(2);
                    
                    /* Aplicamos la opción de mantener a los filtros necesarios */
                    gestor.peticionFiltros(0);
                    
                    /* Para el cuentakilómetros */
                    double kilometros = Math.round(gestor.salpicadero.getDistancia() * 100.0) / 100.0;
                    displayCircular1.setValue(kilometros);
                    displayCircular1.repaint();

                    /* Para el velocímetro */
                    double redondeada = Math.round(gestor.salpicadero.getVelocidad() * 100.0) / 100.0;
                    radial4Lcd1.setValue(redondeada);
                    radial4Lcd1.repaint();

                    /* Para el cuentarrevoluciones */
                    double revoluciones = Math.round(gestor.salpicadero.getRevoluciones() * 100.0) / 100.0;
                    displayMulti1.setValue(revoluciones);
                    displayMulti1.repaint();
                    
                    /* Pequeña espera para que tengan margen de actualizarse */
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUISalpicadero2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /* Botón de reiniciar */
        new Thread(){
            public void run(){
                while(jButton6.isSelected()) {
                    /* Cuando está seleccionado el botón de mantener, solo podemos movernos a "Acelerar" o "Frenar" */
                    jButton3.setEnabled(true);
                    jButton4.setEnabled(false);
                    jButton5.setEnabled(false);
                    
                    /* Cambiamos la palanca a estado "Mantener" */
                    palanca.setEstado(3);
                    
                    /* Aplicamos la opción de reiniciar a los filtros necesarios */
                    gestor.peticionFiltros(0);
                    
                    /* Para el cuentakilómetros */
                    double kilometros = Math.round(gestor.salpicadero.getDistancia() * 100.0) / 100.0;
                    displayCircular1.setValue(kilometros);
                    displayCircular1.repaint();

                    /* Para el velocímetro */
                    double redondeada = Math.round(gestor.salpicadero.getVelocidad() * 100.0) / 100.0;
                    radial4Lcd1.setValue(redondeada);
                    radial4Lcd1.repaint();

                    /* Para el cuentarrevoluciones */
                    double revoluciones = Math.round(gestor.salpicadero.getRevoluciones() * 100.0) / 100.0;
                    displayMulti1.setValue(revoluciones);
                    displayMulti1.repaint();
                    
                    /* Pequeña espera para que tengan margen de actualizarse */
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUISalpicadero2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private eu.hansolo.steelseries.gauges.DisplayCircular displayCircular1;
    private eu.hansolo.steelseries.gauges.DisplayMulti displayMulti1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private eu.hansolo.steelseries.gauges.Radial1Vertical radial1Vertical1;
    private eu.hansolo.steelseries.gauges.Radial4Lcd radial4Lcd1;
    // End of variables declaration//GEN-END:variables

    public static GestorFiltros gestor;
    private static Palanca palanca;
}
