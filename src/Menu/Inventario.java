/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import persistencia.xmlInventario;
import Usuarios.Inventarios;
import Usuarios.Mesoneros;
import Usuarios.Pedidos2;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LOMAC
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    
    
    public Inventario() {
        initComponents();
    }
    xmlInventario xmlI= new xmlInventario();
    Inventarios inv, inv2;
    DefaultTableModel dtm;
    public Inventario(xmlInventario xmlI) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        setTitle("LOMAC");
        this.setIconImage(new ImageIcon("src/imagenes/Restaurant.png").getImage());
        BtnAtras.requestFocus();
        
        llenar(xmlI);
    }
    
    public void llenar(xmlInventario xmlI){
        
        String[] columna = {  "   Producto    ","   Cantidad   "};
        DefaultTableModel dtm = new DefaultTableModel(null,columna);
        ArrayList<Inventarios> Lista = xmlI.todosLosInventarios();
        for (Inventarios inv : Lista){
          String[] row = {inv.getProducto(), Long.toString(inv.getCantidad())};
          dtm.addRow(row);
         }
         TablaInventario.setModel(dtm);
        
        
    }
     public void modificar(){
    int fselc= TablaInventario.getSelectedRow();
    if (fselc==-1){
              JOptionPane.showMessageDialog(null,"Debe seleccionar un producto","Advertencia",JOptionPane.WARNING_MESSAGE);
          }else{
    TxtProducto.setText(TablaInventario.getValueAt(fselc, 0).toString());
 //   TxtCantidad.setValue(TablaInventario.getValueAt(fselc, 1));
    
        ModificaInventario.setSize(470, 250);
        ModificaInventario.setLocationRelativeTo(null);
        ModificaInventario.setModal(true);
        ModificaInventario.setVisible(true); 
     }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ModificaInventario = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnModificarM = new javax.swing.JButton();
        BtnAtrasM = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TxtProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtCantidad = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnAtras = new javax.swing.JButton();
        BtnElimiar = new javax.swing.JButton();
        BtnModificarI = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Nombre del Producto:");

        BtnModificarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Modify.png"))); // NOI18N
        BtnModificarM.setText("Modificar");
        BtnModificarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarMActionPerformed(evt);
            }
        });
        BtnModificarM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnModificarMKeyPressed(evt);
            }
        });

        BtnAtrasM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back.png"))); // NOI18N
        BtnAtrasM.setText("Atras");
        BtnAtrasM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasMActionPerformed(evt);
            }
        });
        BtnAtrasM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnAtrasMKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel9.setText("System LOMAC");

        TxtProducto.setEditable(false);
        TxtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProductoActionPerformed(evt);
            }
        });
        TxtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtProductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtProductoKeyTyped(evt);
            }
        });

        jLabel3.setText("Cant");

        TxtCantidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        TxtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCantidadKeyPressed(evt);
            }
        });

        jLabel4.setText("Modificar Cantidad de Inventario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(135, 135, 135))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(BtnModificarM)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(TxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(BtnAtrasM)
                            .addGap(22, 22, 22)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel9)
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnModificarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAtrasM))
                    .addGap(37, 37, 37)))
        );

        javax.swing.GroupLayout ModificaInventarioLayout = new javax.swing.GroupLayout(ModificaInventario.getContentPane());
        ModificaInventario.getContentPane().setLayout(ModificaInventarioLayout);
        ModificaInventarioLayout.setHorizontalGroup(
            ModificaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ModificaInventarioLayout.setVerticalGroup(
            ModificaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificaInventarioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel6.setText("RESTAURANT O.L.A.M");

        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaInventario);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Inventario");

        BtnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back.png"))); // NOI18N
        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });
        BtnAtras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnAtrasKeyPressed(evt);
            }
        });

        BtnElimiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete.png"))); // NOI18N
        BtnElimiar.setText("Eliminar");
        BtnElimiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimiarActionPerformed(evt);
            }
        });
        BtnElimiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnElimiarKeyPressed(evt);
            }
        });

        BtnModificarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Modify.png"))); // NOI18N
        BtnModificarI.setText("Modificar");
        BtnModificarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarIActionPerformed(evt);
            }
        });
        BtnModificarI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnModificarIKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(BtnElimiar)
                        .addGap(34, 34, 34)
                        .addComponent(BtnModificarI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAtras)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAtras)
                    .addComponent(BtnElimiar)
                    .addComponent(BtnModificarI))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        // TODO add your handling code here:
        gerente ge = new gerente();
        ge.setLocationRelativeTo(null);
        ge.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnAtrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnAtrasKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
            BtnModificarI.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          gerente ge = new gerente();
          ge.setLocationRelativeTo(null);
          ge.setVisible(true);
          this.dispose();
      }
    }//GEN-LAST:event_BtnAtrasKeyPressed

    private void BtnElimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimiarActionPerformed
        // TODO add your handling code here:
         String productoE;
        int fselc= TablaInventario.getSelectedRow();
        if (fselc==-1){
              JOptionPane.showMessageDialog(null,"Debe seleccionar un producto","Advertencia",JOptionPane.WARNING_MESSAGE);
          }else{
                dtm =(DefaultTableModel)TablaInventario.getModel();
                productoE = TablaInventario.getValueAt(fselc,0).toString();
                 inv = new Inventarios(productoE);
                xmlI.borrarInventario(inv);
                dtm.removeRow(fselc);
        }
    }//GEN-LAST:event_BtnElimiarActionPerformed

    private void BtnModificarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarIActionPerformed
      modificar();  // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarIActionPerformed

    private void BtnModificarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarMActionPerformed
        // TODO add your handling code here:
     String producto, productoE;
     int cantidad;
        int fselc= TablaInventario.getSelectedRow();
        if (fselc==-1){
              JOptionPane.showMessageDialog(null,"Debe seleccionar un empleado","Advertencia",JOptionPane.WARNING_MESSAGE);
          }else{
              producto =TxtProducto.getText();
              cantidad =Integer.parseInt(TxtCantidad.getSelectedItem().toString());

              dtm =(DefaultTableModel)TablaInventario.getModel();
              productoE = TablaInventario.getValueAt(fselc,0).toString();
             inv = new Inventarios(productoE);
              dtm.setValueAt(TxtProducto.getText(), TablaInventario.getSelectedRow(), 0);
              dtm.setValueAt(Integer.parseInt(TxtCantidad.getSelectedItem().toString()), TablaInventario.getSelectedRow(), 1);
           
              inv2 = new Inventarios(producto, cantidad);
              xmlI.actualizarInventario(inv,inv2);
              ModificaInventario.dispose();
        
        }
    }//GEN-LAST:event_BtnModificarMActionPerformed

    private void BtnModificarMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnModificarMKeyPressed
        // TODO add your handling code here:
       
        if(evt.getKeyCode() == KeyEvent.VK_UP) {
            TxtCantidad.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            BtnAtrasM.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
         String producto, productoE;
     int cantidad;
        int fselc= TablaInventario.getSelectedRow();
        if (fselc==-1){
              JOptionPane.showMessageDialog(null,"Debe seleccionar un empleado","Advertencia",JOptionPane.WARNING_MESSAGE);
          }else{
              producto =TxtProducto.getText();
              cantidad =Integer.parseInt(TxtCantidad.getSelectedItem().toString());

              dtm =(DefaultTableModel)TablaInventario.getModel();
              productoE = TablaInventario.getValueAt(fselc,0).toString();
             inv = new Inventarios(productoE);
              dtm.setValueAt(TxtProducto.getText(), TablaInventario.getSelectedRow(), 0);
              dtm.setValueAt(Integer.parseInt(TxtCantidad.getSelectedItem().toString()), TablaInventario.getSelectedRow(), 1);
           
              inv2 = new Inventarios(producto, cantidad);
              xmlI.actualizarInventario(inv,inv2);
              ModificaInventario.dispose();
        
        }
    }                        
            
        
    }//GEN-LAST:event_BtnModificarMKeyPressed

    private void BtnAtrasMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasMActionPerformed
        // TODO add your handling code here:
       ModificaInventario.dispose();
    }//GEN-LAST:event_BtnAtrasMActionPerformed

    private void BtnAtrasMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnAtrasMKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
            BtnModificarM.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP) {
            TxtCantidad.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ModificaInventario.dispose();
        }
    }//GEN-LAST:event_BtnAtrasMKeyPressed

    private void TxtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProductoActionPerformed

    private void TxtProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtProductoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            TxtCantidad.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            TxtCantidad.requestFocus();
        }
    }//GEN-LAST:event_TxtProductoKeyPressed

    private void TxtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtProductoKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TxtProductoKeyTyped

    private void TxtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCantidadKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BtnModificarM.requestFocus();
        }
    }//GEN-LAST:event_TxtCantidadKeyPressed

    private void BtnModificarIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnModificarIKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          modificar();
        }
        if(evt.getKeyCode() == KeyEvent.VK_LEFT){
           BtnElimiar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            BtnAtras.requestFocus();
        }
    }//GEN-LAST:event_BtnModificarIKeyPressed

    private void BtnElimiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnElimiarKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            BtnModificarI.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           String productoE;
        int fselc= TablaInventario.getSelectedRow();
        if (fselc==-1){
              JOptionPane.showMessageDialog(null,"Debe seleccionar un producto","Advertencia",JOptionPane.WARNING_MESSAGE);
          }else{
                dtm =(DefaultTableModel)TablaInventario.getModel();
                productoE = TablaInventario.getValueAt(fselc,0).toString();
                 inv = new Inventarios(productoE);
                xmlI.borrarInventario(inv);
                dtm.removeRow(fselc);
        }
        } 
    }//GEN-LAST:event_BtnElimiarKeyPressed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnAtrasM;
    private javax.swing.JButton BtnElimiar;
    private javax.swing.JButton BtnModificarI;
    private javax.swing.JButton BtnModificarM;
    private javax.swing.JDialog ModificaInventario;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JComboBox TxtCantidad;
    private javax.swing.JTextField TxtProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
