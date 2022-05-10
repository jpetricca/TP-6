
package vistas;

import java.util.HashSet;
import negocio.DirectorioTelefonico;


public class MenuView extends javax.swing.JFrame {
    
    public static DirectorioTelefonico directorio = new DirectorioTelefonico();
            
    public MenuView() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAgregarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiBuscarCliente = new javax.swing.JMenuItem();
        jmiBorrarCliente = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setName(""); // NOI18N

        jMenu1.setText("Cliente");

        jmiAgregarCliente.setText("Agregar Cliente");
        jmiAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAgregarCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Directorio");

        jmiBuscarCliente.setText("Buscar Cliente");
        jmiBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmiBuscarCliente);

        jmiBorrarCliente.setText("Borrar Cliente");
        jmiBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBorrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmiBorrarCliente);

        jMenuBar1.add(jMenu2);

        jmSalir.setText("Salir");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmSalir.add(jmiSalir);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarClienteActionPerformed
        escritorio.removeAll();
        BuscarClienteView buscar = new BuscarClienteView();
        buscar.setVisible(true);
        escritorio.add(buscar);
        escritorio.repaint();
    }//GEN-LAST:event_jmiBuscarClienteActionPerformed

    private void jmiAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarClienteActionPerformed
        escritorio.removeAll();
        AgregarClienteView agregar = new AgregarClienteView();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
    }//GEN-LAST:event_jmiAgregarClienteActionPerformed

    private void jmiBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBorrarClienteActionPerformed
        escritorio.removeAll();
        BorrarClienteView borrar = new BorrarClienteView();
        borrar.setVisible(true);
        escritorio.add(borrar);
        escritorio.repaint();
    }//GEN-LAST:event_jmiBorrarClienteActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
         System.exit(WIDTH);
    }//GEN-LAST:event_jmiSalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAgregarCliente;
    private javax.swing.JMenuItem jmiBorrarCliente;
    private javax.swing.JMenuItem jmiBuscarCliente;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables


    
}
