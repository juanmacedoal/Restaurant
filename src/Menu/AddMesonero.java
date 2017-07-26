/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Usuarios.*;
import Control.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import persistencia.xmlEmpleado;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author LOMAC
 */
public class AddMesonero extends javax.swing.JFrame {

    /**
     * Creates new form AddMesonero
     */
    Mesoneros MesoneroN;
    Restaurant res = new Restaurant();
    xmlEmpleado xmlE = new xmlEmpleado();
    
    
    
    public AddMesonero() {
        initComponents();
    }
    
    public AddMesonero(xmlEmpleado xmlE) {
       initComponents();
       setLocationRelativeTo(null);
       this.setResizable(false);
       setTitle("LOMAC");
       Controlador control = new Controlador(lista);
       control.activa_Desactiva(false);
       TextNombre.requestFocus();
       RestrictedTextField restrictcel = new RestrictedTextField(TextTcasa);   restrictcel.setLimit(11);
       RestrictedTextField restrictcasa = new RestrictedTextField(TextTcel); restrictcasa.setLimit(11);
       RestrictedTextField restrictci = new RestrictedTextField(TextCI);      restrictci.setLimit(8);
       this.setIconImage(new ImageIcon("src/imagenes/Restaurant.png").getImage());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextTcasa = new javax.swing.JTextField();
        TextTcel = new javax.swing.JTextField();
        TextApellido = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        TextDireccion = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextCI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        lista = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TextCargo = new javax.swing.JComboBox();
        TextDia = new javax.swing.JComboBox();
        TextMes = new javax.swing.JComboBox();
        TextAno = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Empleado");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Celular:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Casa:");

        TextTcasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTcasaActionPerformed(evt);
            }
        });
        TextTcasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextTcasaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTcasaKeyTyped(evt);
            }
        });

        TextTcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTcelActionPerformed(evt);
            }
        });
        TextTcel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextTcelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTcelKeyTyped(evt);
            }
        });

        TextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextApellidoActionPerformed(evt);
            }
        });
        TextApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextApellidoKeyTyped(evt);
            }
        });

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });
        TextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNombreKeyTyped(evt);
            }
        });

        TextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDireccionActionPerformed(evt);
            }
        });
        TextDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextDireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextDireccionKeyTyped(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GuardarKeyPressed(evt);
            }
        });

        Volver.setText("Atras");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        Volver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VolverKeyPressed(evt);
            }
        });

        jLabel8.setText("Fecha de nacimiento");

        jLabel9.setText("/");

        jLabel10.setText("/");

        TextCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCIActionPerformed(evt);
            }
        });
        TextCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextCIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCIKeyTyped(evt);
            }
        });

        jLabel11.setText("C.I:");

        lista.setText("Lista Empleados");
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });
        lista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaKeyPressed(evt);
            }
        });

        jLabel12.setText("Cargo:");

        TextCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mesonero", "Cajero", "Gerente", " " }));
        TextCargo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TextCargoComponentAdded(evt);
            }
        });
        TextCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCargoActionPerformed(evt);
            }
        });
        TextCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextCargoKeyPressed(evt);
            }
        });

        TextDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        TextDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDiaActionPerformed(evt);
            }
        });
        TextDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextDiaKeyPressed(evt);
            }
        });

        TextMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        TextMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMesActionPerformed(evt);
            }
        });
        TextMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextMesKeyPressed(evt);
            }
        });

        TextAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1989", "1990", "1991", "1992", "1993", "1994", " " }));
        TextAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAnoActionPerformed(evt);
            }
        });
        TextAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextAnoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(TextTcasa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TextTcel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel12))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextCI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(TextDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TextCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextTcasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TextTcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TextCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(TextDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(error)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(lista)
                    .addComponent(Volver))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void guardar(){
        boolean resultado = false;
       try{
        MesoneroN = new Mesoneros();
        Controlador control;
        control = new Controlador(TextNombre, TextApellido, TextTcasa, TextTcel, TextDireccion, TextDia, TextMes, TextAno, TextCI, TextCargo);
        control.datosMesonero(MesoneroN, res); 
        resultado = xmlE.agregarPersona(MesoneroN);
        control = new Controlador(lista);  
        control.activa_Desactiva(true);
        control.inicializarTxt(TextNombre, TextApellido, TextTcasa, TextTcel, TextDireccion,  TextDia, TextMes, TextAno, TextCI, TextCargo);
     
          this.error.setText("INFORMACION REGISTRADA");
        }catch (Exception e){
          JOptionPane.showMessageDialog(null,"Ingreso mal los datos","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
   }
    
    
    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
       guardar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
            gerente ge = new gerente();
            ge.setLocationRelativeTo(null);
            ge.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_VolverActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
        ListaEmpleados lmes = new ListaEmpleados(xmlE);
        lmes.setLocationRelativeTo(null);
        lmes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listaActionPerformed

    private void TextCargoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TextCargoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCargoComponentAdded

    private void TextCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCargoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_TextCargoActionPerformed

    private void TextTcelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTcelKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_TextTcelKeyTyped

    private void TextTcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTcelActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TextTcelActionPerformed

    private void TextCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCIActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextCIActionPerformed

    private void TextCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCIKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_TextCIKeyTyped

    private void TextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=' ')) 
           evt.consume();
        
    }//GEN-LAST:event_TextNombreKeyTyped

    private void TextTcasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTcasaKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TextTcasaKeyTyped

    private void TextTcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTcasaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TextTcasaActionPerformed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_TextNombreActionPerformed

    private void TextApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextApellidoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=' ')) evt.consume();
       
    }//GEN-LAST:event_TextApellidoKeyTyped

    private void TextDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextDireccionKeyTyped
        // TODO add your handling code here:
 
        
    }//GEN-LAST:event_TextDireccionKeyTyped

    private void TextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextApellidoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextApellidoActionPerformed

    private void TextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDireccionActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TextDireccionActionPerformed

    private void TextDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDiaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextDiaActionPerformed

    private void TextMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMesActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_TextMesActionPerformed

    private void TextAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextAnoActionPerformed

    private void TextNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextApellido.requestFocus();
      }
    }//GEN-LAST:event_TextNombreKeyPressed

    private void TextApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextApellidoKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextCargo.requestFocus();
      }
    }//GEN-LAST:event_TextApellidoKeyPressed

    private void TextCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCargoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextTcasa.requestFocus();
      }
    }//GEN-LAST:event_TextCargoKeyPressed

    private void TextTcasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTcasaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextTcel.requestFocus();
      }
    }//GEN-LAST:event_TextTcasaKeyPressed

    private void TextTcelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTcelKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextDireccion.requestFocus();
      }
    }//GEN-LAST:event_TextTcelKeyPressed

    private void TextDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextDireccionKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextCI.requestFocus();
      }
    }//GEN-LAST:event_TextDireccionKeyPressed

    private void TextCIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCIKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextDia.requestFocus();
      }
    }//GEN-LAST:event_TextCIKeyPressed

    private void TextDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextDiaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextMes.requestFocus();
      }
    }//GEN-LAST:event_TextDiaKeyPressed

    private void TextMesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMesKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          TextAno.requestFocus();
      }
    }//GEN-LAST:event_TextMesKeyPressed

    private void TextAnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAnoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          Guardar.requestFocus();
      }
    }//GEN-LAST:event_TextAnoKeyPressed

    private void GuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GuardarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
         guardar();
       
      }
        if(evt.getKeyCode() == KeyEvent.VK_UP) {
         TextNombre.requestFocus();
       
      }
       if(lista.isEnabled()==true) 
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
          lista.requestFocus();
      }
       if(lista.isEnabled()==false) 
          if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
          Volver.requestFocus();
      }
    }//GEN-LAST:event_GuardarKeyPressed

    private void VolverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VolverKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
          lista.requestFocus();
      }
       if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            gerente ge = new gerente();
            ge.setLocationRelativeTo(null);
            ge.setVisible(true);
            this.dispose();
      }
        if(lista.isEnabled()==true) 
        if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
          lista.requestFocus();
      }
       if(lista.isEnabled()==false) 
          if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
          Guardar.requestFocus();
      }
       if(evt.getKeyCode() == KeyEvent.VK_UP) {
         TextNombre.requestFocus();
       
      }
    }//GEN-LAST:event_VolverKeyPressed

    private void listaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
          Guardar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
          Volver.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ListaEmpleados lmes = new ListaEmpleados(xmlE);
            lmes.setLocationRelativeTo(null);
            lmes.setVisible(true);
            this.dispose();
      }
        if(evt.getKeyCode() == KeyEvent.VK_UP) {
         TextNombre.requestFocus();
       
      }
    }//GEN-LAST:event_listaKeyPressed

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
            java.util.logging.Logger.getLogger(AddMesonero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMesonero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMesonero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMesonero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMesonero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JComboBox TextAno;
    private javax.swing.JTextField TextApellido;
    private javax.swing.JTextField TextCI;
    private javax.swing.JComboBox TextCargo;
    private javax.swing.JComboBox TextDia;
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JComboBox TextMes;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTcasa;
    private javax.swing.JTextField TextTcel;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton lista;
    // End of variables declaration//GEN-END:variables
}
