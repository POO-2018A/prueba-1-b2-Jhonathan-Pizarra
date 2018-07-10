
package prueba;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class GUIPrueba extends javax.swing.JFrame {

    String[][] clientes;
    String [][] registrosClientes;
    String [][] registrosFrutas;
    DefaultTableModel modeloTablaClientes;
    DefaultTableModel modeloTablaRegistrosCliente;
    DefaultTableModel modeloTablaRegistrosFruta;
    
    ArrayList<Clientes> listaClientes = new ArrayList();
    ArrayList<Fruta> listaFrutas = new ArrayList();
    
    DefaultComboBoxModel modeloComboBoxFrutas = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloComboBoxClientes= new DefaultComboBoxModel();
    DefaultComboBoxModel modeloComboBoxCedula = new DefaultComboBoxModel();
    
    int contadorManzas, contadorPeras, contadorPiñas, contadorUvas, contadorSandias = 0;
    /**
     * Creates new form GUIPrueba
     */
    public GUIPrueba() {
        initComponents();
        
        String[] titulosTablaClientes = new String[]{"N#","Cedula","Nombre"};
         modeloTablaClientes = new DefaultTableModel(clientes, titulosTablaClientes);
        tableClientes.setModel(modeloTablaClientes);
        
        
        String [] listaFrutas = new String[]{" ","Manzas","Peras","Uvas","Piña","Sandía"};
        for(int i=0; i<listaFrutas.length; i++){
        
            modeloComboBoxFrutas.addElement(listaFrutas[i]);
        }
        comboBoxFrutas.setModel(modeloComboBoxFrutas);
        
        
       String[] titulosTablaRegistroClientes = new String[]{"N#","Cedula","Nombre"};
       modeloTablaRegistrosCliente = new DefaultTableModel(registrosClientes, titulosTablaRegistroClientes);
       tableRegistroCliente.setModel(modeloTablaRegistrosCliente);
       
       String[] titulosTablaRegistroFrutas = new String[]{"N#","Fruta","Cantidad"};
       modeloTablaRegistrosFruta = new DefaultTableModel(registrosFrutas, titulosTablaRegistroFrutas);
       tableRegistroFrutas.setModel(modeloTablaRegistrosFruta);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        labelListaFrutas = new javax.swing.JLabel();
        labelCodigoFrutas = new javax.swing.JLabel();
        labelNombreFruta = new javax.swing.JLabel();
        labelPrecioFruta = new javax.swing.JLabel();
        buttonRegistrarPedido = new javax.swing.JButton();
        comboBoxFrutas = new javax.swing.JComboBox<>();
        textCodigoFrutas = new javax.swing.JTextField();
        textNombreFruta = new javax.swing.JTextField();
        textPrecioFruta = new javax.swing.JTextField();
        labelFiltroCliente = new javax.swing.JLabel();
        comboBoxCliente = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        labelRegistros = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        comboBoxCedula = new javax.swing.JComboBox<>();
        buttonMostrar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableRegistroFrutas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableRegistroCliente = new javax.swing.JTable();
        panelClientes = new javax.swing.JPanel();
        labelNombreCliente = new javax.swing.JLabel();
        labelCedulaCliente = new javax.swing.JLabel();
        textNombreCliente = new javax.swing.JTextField();
        textCedulaCliente = new javax.swing.JTextField();
        buttonRegistrarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelListaFrutas.setText("Lista de frutas:");

        labelCodigoFrutas.setText("Código:");

        labelNombreFruta.setText("Nombre:");

        labelPrecioFruta.setText("Precio:");

        buttonRegistrarPedido.setText("Registrar");
        buttonRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarPedidoActionPerformed(evt);
            }
        });

        comboBoxFrutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxFrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFrutasActionPerformed(evt);
            }
        });

        labelFiltroCliente.setText("Cliente:");

        comboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelListaFrutas)
                                    .addComponent(labelCodigoFrutas)
                                    .addComponent(labelFiltroCliente)))
                            .addComponent(labelNombreFruta))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCodigoFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxFrutas, 0, 100, Short.MAX_VALUE)
                            .addComponent(textNombreFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(textPrecioFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelPrecioFruta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(buttonRegistrarPedido)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFiltroCliente)
                    .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelListaFrutas)
                    .addComponent(comboBoxFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoFrutas)
                    .addComponent(textCodigoFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombreFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreFruta))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPrecioFruta)
                    .addComponent(textPrecioFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(buttonRegistrarPedido)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Frutas", jPanel2);

        labelRegistros.setText("Pedidos Registrados");

        labelCedula.setText("Cedula:");

        comboBoxCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonMostrar.setText("Mostrar");
        buttonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarActionPerformed(evt);
            }
        });

        tableRegistroFrutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableRegistroFrutas);

        tableRegistroCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tableRegistroCliente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelCedula)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(buttonMostrar))
                    .addComponent(labelRegistros))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelRegistros)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedula)
                    .addComponent(comboBoxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMostrar))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registros", jPanel3);

        labelNombreCliente.setText("Nombre:");

        labelCedulaCliente.setText("Cédula:");

        buttonRegistrarCliente.setText("Registrar");
        buttonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarClienteActionPerformed(evt);
            }
        });

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableClientes);

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCedulaCliente)
                            .addComponent(labelNombreCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRegistrarCliente)))
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreCliente)
                    .addComponent(textNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedulaCliente)
                    .addComponent(textCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(buttonRegistrarCliente)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", panelClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarClienteActionPerformed
        // TODO add your handling code here:
        String nombre = textNombreCliente.getText();
        String cedula = textCedulaCliente.getText();
        
        Clientes comprador = new Clientes(nombre, cedula);
        listaClientes.add(comprador);
        
        modeloTablaClientes.addRow(new String[]{"xxy",cedula,nombre});
        modeloComboBoxClientes.addElement(nombre);
        modeloComboBoxCedula.addElement(cedula);
        comboBoxCliente.setModel(modeloComboBoxClientes);
        comboBoxCedula.setModel(modeloComboBoxCedula);
        
        
    }//GEN-LAST:event_buttonRegistrarClienteActionPerformed

    private void comboBoxFrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFrutasActionPerformed
        // TODO add your handling code here:
    
        String clienteSeleccionado = (String) comboBoxCliente.getSelectedItem();
        String frutaSeleccionada = (String) comboBoxFrutas.getSelectedItem();
        
        if(frutaSeleccionada.equals("Manzas")){
           contadorManzas++;
           textCodigoFrutas.setText("1");
           textNombreFruta.setText("Manzas");
           textPrecioFruta.setText("0.25");
           textCodigoFrutas.enable(false);  textNombreFruta.enable(false);  textPrecioFruta.enable(false);
           String precio = textPrecioFruta.getText();
           String codigo = textCodigoFrutas.getText();
           int codigoToInt = Integer.parseInt(codigo);
           String nombreFruta = textNombreFruta.getText();
           double precioToDouble = Double.parseDouble(precio);
           
           Fruta fruit = new Fruta(codigoToInt, nombreFruta, precioToDouble);
           listaFrutas.add(fruit);
        
        }
        
        if(frutaSeleccionada.equals("Peras")){
            
           contadorPeras++;
           textCodigoFrutas.setText("2");
           textNombreFruta.setText("Peras");
           textPrecioFruta.setText("0.55");
           textCodigoFrutas.enable(false);  textNombreFruta.enable(false);  textPrecioFruta.enable(false);
           String precio = textPrecioFruta.getText();
           String codigo = textCodigoFrutas.getText();
           int codigoToInt = Integer.parseInt(codigo);
           String nombreFruta = textNombreFruta.getText();
           double precioToDouble = Double.parseDouble(precio);
           
           Fruta fruit = new Fruta(codigoToInt, nombreFruta, precioToDouble);
           listaFrutas.add(fruit);
        
        }
        
        if(frutaSeleccionada.equals("Uvas")){
            
           contadorUvas++;
           textCodigoFrutas.setText("3");
           textNombreFruta.setText("Uvas");
           textPrecioFruta.setText("0.75");
           textCodigoFrutas.enable(false);  textNombreFruta.enable(false);  textPrecioFruta.enable(false);
           String precio = textPrecioFruta.getText();
           String codigo = textCodigoFrutas.getText();
           int codigoToInt = Integer.parseInt(codigo);
           String nombreFruta = textNombreFruta.getText();
           double precioToDouble = Double.parseDouble(precio);
           
           Fruta fruit = new Fruta(codigoToInt, nombreFruta, precioToDouble);
           listaFrutas.add(fruit);
        
        }
        
        if(frutaSeleccionada.equals("Piña")){
           
           contadorPiñas++;
           textCodigoFrutas.setText("4");
           textNombreFruta.setText("Piña");
           textPrecioFruta.setText("1.00");
           textCodigoFrutas.enable(false);  textNombreFruta.enable(false);  textPrecioFruta.enable(false);
           String precio = textPrecioFruta.getText();
           String codigo = textCodigoFrutas.getText();
           int codigoToInt = Integer.parseInt(codigo);
           String nombreFruta = textNombreFruta.getText();
           double precioToDouble = Double.parseDouble(precio);
           
           Fruta fruit = new Fruta(codigoToInt, nombreFruta, precioToDouble);
           listaFrutas.add(fruit);
        
        }
        
        if(frutaSeleccionada.equals("Sandía")){
            
           contadorSandias++;
           textCodigoFrutas.setText("5");
           textNombreFruta.setText("Sandía");
           textPrecioFruta.setText("1.50");
           textCodigoFrutas.enable(false);  textNombreFruta.enable(false);  textPrecioFruta.enable(false);
           String precio = textPrecioFruta.getText();
           String codigo = textCodigoFrutas.getText();
           int codigoToInt = Integer.parseInt(codigo);
           String nombreFruta = textNombreFruta.getText();
           double precioToDouble = Double.parseDouble(precio);
           
           Fruta fruit = new Fruta(codigoToInt, nombreFruta, precioToDouble);
           listaFrutas.add(fruit);
        
        }
        
        
    }//GEN-LAST:event_comboBoxFrutasActionPerformed

    private void buttonRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarPedidoActionPerformed
        // TODO add your handling code here:
        String frutaSeleccionada = (String) comboBoxFrutas.getSelectedItem();
       
        
        
    }//GEN-LAST:event_buttonRegistrarPedidoActionPerformed

    private void buttonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarActionPerformed
        // TODO add your handling code here:
        String cedulaSeleccionada = (String) comboBoxCedula.getSelectedItem();
        for(Clientes item: listaClientes){
        
            for(Fruta item2: listaFrutas){
                if(item.getCedula().equals(cedulaSeleccionada)){
           
                 modeloTablaRegistrosCliente.addRow(new String[]{"xxy",item.getCedula(),item.getNombre()});
                 modeloTablaRegistrosFruta.addRow(new String[]{"xxy",item2.getNombre()});
            }
            
            }
           
        }
    }//GEN-LAST:event_buttonMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMostrar;
    private javax.swing.JButton buttonRegistrarCliente;
    private javax.swing.JButton buttonRegistrarPedido;
    private javax.swing.JComboBox<String> comboBoxCedula;
    private javax.swing.JComboBox<String> comboBoxCliente;
    private javax.swing.JComboBox<String> comboBoxFrutas;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCedulaCliente;
    private javax.swing.JLabel labelCodigoFrutas;
    private javax.swing.JLabel labelFiltroCliente;
    private javax.swing.JLabel labelListaFrutas;
    private javax.swing.JLabel labelNombreCliente;
    private javax.swing.JLabel labelNombreFruta;
    private javax.swing.JLabel labelPrecioFruta;
    private javax.swing.JLabel labelRegistros;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTable tableRegistroCliente;
    private javax.swing.JTable tableRegistroFrutas;
    private javax.swing.JTextField textCedulaCliente;
    private javax.swing.JTextField textCodigoFrutas;
    private javax.swing.JTextField textNombreCliente;
    private javax.swing.JTextField textNombreFruta;
    private javax.swing.JTextField textPrecioFruta;
    // End of variables declaration//GEN-END:variables
}
