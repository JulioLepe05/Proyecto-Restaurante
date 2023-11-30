

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class FPedidos1 extends javax.swing.JFrame {

    Conexion cnx;

    public FPedidos1() {

        initComponents();
        cnx = new Conexion();
        setLocationRelativeTo(this);
        if (cnx.conectar("localhost", "restaurante", "root", "") == 1) {
            cnx.seleccionar("SELECT CONCAT(menuid, '-', nombre) FROM alimentos", cbProductos);
            cnx.seleccionar("SELECT CONCAT(clienteid, '-', nombre, '-', telefono) FROM clientes", cbCliente);
            cnx.seleccionar("SELECT CONCAT(codigo, '-', nombrec, '-', especialidad) FROM cocinero", cbCocinero);
            cnx.entablar(("SELECT idpedido, comida, cantidad, precio FROM pedido"), tOrden, 10, 30, 30, 30);
            JOptionPane.showMessageDialog(this, "conectado");
        } else {
            JOptionPane.showMessageDialog(this, "sin conexion");
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbProductos = new javax.swing.JComboBox<>();
        tbEntradas = new javax.swing.JToggleButton();
        tbPlatoFuerte = new javax.swing.JToggleButton();
        tbPostre = new javax.swing.JToggleButton();
        tbBebida = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tOrden = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lFoto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lPrecio = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        cbCliente = new javax.swing.JComboBox<>();
        cbCocinero = new javax.swing.JComboBox<>();
        cbEstado = new javax.swing.JComboBox<>();
        bActualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bSelec = new javax.swing.JButton();
        bRemo = new javax.swing.JButton();
        bOrde = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEDIDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductosItemStateChanged(evt);
            }
        });

        buttonGroup1.add(tbEntradas);
        tbEntradas.setText("ENTRADAS");
        tbEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEntradasActionPerformed(evt);
            }
        });

        buttonGroup1.add(tbPlatoFuerte);
        tbPlatoFuerte.setText("PLATO FUERTE");
        tbPlatoFuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPlatoFuerteActionPerformed(evt);
            }
        });

        buttonGroup1.add(tbPostre);
        tbPostre.setText("POSTRE");
        tbPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPostreActionPerformed(evt);
            }
        });

        buttonGroup1.add(tbBebida);
        tbBebida.setText("BEBIDA");
        tbBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBebidaActionPerformed(evt);
            }
        });

        tOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Comida", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tOrden);
        if (tOrden.getColumnModel().getColumnCount() > 0) {
            tOrden.getColumnModel().getColumn(0).setResizable(false);
            tOrden.getColumnModel().getColumn(1).setResizable(false);
            tOrden.getColumnModel().getColumn(2).setResizable(false);
            tOrden.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(tbEntradas)
                            .addGap(18, 18, 18)
                            .addComponent(tbPlatoFuerte)
                            .addGap(18, 18, 18)
                            .addComponent(tbPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tbBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbEntradas)
                    .addComponent(tbPlatoFuerte)
                    .addComponent(tbPostre)
                    .addComponent(tbBebida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("PRECIO");

        lPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jsCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsCantidadStateChanged(evt);
            }
        });

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCliente.setSelectedIndex(-1);
        cbCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbClienteItemStateChanged(evt);
            }
        });

        cbCocinero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCocinero.setSelectedIndex(-1);

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En espera", "Preparacion", "Listo", "Entregado" }));

        bActualizar.setText("ACTUALIZAR");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bActualizar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bSelec.setText("SELECCIONAR");
        bSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelecActionPerformed(evt);
            }
        });

        bRemo.setText("REMOVER");
        bRemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoActionPerformed(evt);
            }
        });

        bOrde.setText("ORDENAR");
        bOrde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrdeActionPerformed(evt);
            }
        });

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bOrde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSelec, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRemo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRemo, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(bSelec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOrde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelecActionPerformed
        //Boton para entablar las cosas en la tabla
        String sel = cbProductos.getSelectedItem().toString();
        String[] partes = sel.split("-");
        String id = partes[0];
        String com = partes[1];

        String cbClien = cbCliente.getSelectedItem().toString();
        String[] partescliente = cbClien.split("-");
        String clienteid = partescliente[0];

        String comida = "SELECT nombre, precio FROM alimentos WHERE menuid = '" + id + "'";
        float precio = (float) Float.parseFloat(lPrecio.getText());
        int cantidad = (int) Integer.parseInt(jsCantidad.getValue().toString());

        //String sql = "INSERT INTO pedido(comida, cantidad, precio, clientes_clienteid) VALUES('"+comida+"', '"+precio+", '"+cantidad+"', '"+clienteid+"')";
        Pedido ped = new Pedido(null, com, cantidad, precio, clienteid);

        if (ped.insertar(cnx) == 1) {
            cnx.entablar("SELECT idpedido, comida, cantidad, precio FROM pedido WHERE clientes_clienteid = '" + clienteid + "'", tOrden, 10, 30, 30, 30);
        } else {
            JOptionPane.showMessageDialog(this, "fallo en la insercion de datos");
        }

    }//GEN-LAST:event_bSelecActionPerformed

    private void cbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductosItemStateChanged

        String sel = cbProductos.getSelectedItem().toString();
        String[] partes = sel.split("-");
        String id = partes[0];
        ImageIcon foto = (ImageIcon) cnx.obtenerValor("SELECT foto FROM alimentos WHERE menuid = '" + id + "'");
        lFoto.setIcon(new ImageIcon(cnx.escalarImagen(foto.getImage(), 187, 135)));
        String precio = cnx.obtenerDato("SELECT precio FROM alimentos WHERE menuid = '" + id + "'");

        int cantidad = (int) jsCantidad.getValue();
        int total = cantidad * Integer.valueOf(precio);
        lPrecio.setText(total + "");
    }//GEN-LAST:event_cbProductosItemStateChanged

    private void jsCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsCantidadStateChanged
        String sel = cbProductos.getSelectedItem().toString();
        String[] partes = sel.split("-");
        String id = partes[0];
        String precio = cnx.obtenerDato("SELECT precio FROM alimentos WHERE menuid = '" + id + "'");

        int cantidad = (int) jsCantidad.getValue();
        int total = cantidad * Integer.valueOf(precio);
        lPrecio.setText(total + "");
    }//GEN-LAST:event_jsCantidadStateChanged

    private void tbEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEntradasActionPerformed
        // ENTRADA
        lFoto.setIcon(null);
        String sel = cbProductos.getSelectedItem().toString();
        String[] partes = sel.split("-");
        String id = partes[0];
        String precio = cnx.obtenerDato("SELECT precio FROM alimentos WHERE menuid = '" + id + "' AND tipo = 'Entrada'");
        cnx.seleccionar("SELECT CONCAT(menuid, '-', nombre) FROM alimentos WHERE tipo = 'Entrada' ", cbProductos);
//        int cantidad = (int) jsCantidad.getValue();
//        int total = cantidad * Integer.valueOf(precio);
//        lPrecio.setText(total+"");
    }//GEN-LAST:event_tbEntradasActionPerformed

    private void tbPlatoFuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPlatoFuerteActionPerformed
        // PLATO FUERTE
        lFoto.setIcon(null);
        String sel = cbProductos.getSelectedItem().toString();
        String[] partes = sel.split("-");
        String id = partes[0];
        String precio = cnx.obtenerDato("SELECT precio FROM alimentos WHERE menuid = '" + id + "' AND tipo = 'Plato fuerte'");
        cnx.seleccionar("SELECT CONCAT(menuid, '-', nombre) FROM alimentos WHERE tipo = 'Plato fuerte' ", cbProductos);
    }//GEN-LAST:event_tbPlatoFuerteActionPerformed

    private void tbPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPostreActionPerformed
        // POSTRE
        lFoto.setIcon(null);
        String sel = cbProductos.getSelectedItem().toString();
        String[] partes = sel.split("-");
        String id = partes[0];
        String precio = cnx.obtenerDato("SELECT precio FROM alimentos WHERE menuid = '" + id + "' AND tipo = 'Postre'");
        cnx.seleccionar("SELECT CONCAT(menuid, '-', nombre) FROM alimentos WHERE tipo = 'Postre' ", cbProductos);
    }//GEN-LAST:event_tbPostreActionPerformed

    private void tbBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBebidaActionPerformed
        // BEBIDA
        lFoto.setIcon(null);
        String sel = cbProductos.getSelectedItem().toString();
        String[] partes = sel.split("-");
        String id = partes[0];
        String precio = cnx.obtenerDato("SELECT precio FROM alimentos WHERE menuid = '" + id + "' AND tipo = 'Bebidas'");
        cnx.seleccionar("SELECT CONCAT(menuid, '-', nombre) FROM alimentos WHERE tipo = 'Bebida' ", cbProductos);
    }//GEN-LAST:event_tbBebidaActionPerformed

    private void bRemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoActionPerformed
        //Remover de la orden
        DefaultTableModel datos = (DefaultTableModel) tOrden.getModel();
        int ren = tOrden.getSelectedRow();
        String sel = cbCliente.getSelectedItem().toString();
        String[] partes = sel.split("-");
        String idcliente = partes[0];

        String idpedido = datos.getValueAt(ren, 0).toString();
        String comida = datos.getValueAt(ren, 1).toString();
        int cantidad = Integer.parseInt(datos.getValueAt(ren, 2).toString());
        float precio = Float.parseFloat(datos.getValueAt(ren, 3).toString());

        Pedido ped = new Pedido(idpedido, comida, cantidad, precio, idcliente);

        if (ped.borrar(cnx) == false) {
            cnx.entablar(("SELECT idpedido, comida, cantidad, precio FROM pedido"), tOrden, 10, 30, 30, 30);
            JOptionPane.showMessageDialog(this, "Producto eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
    }//GEN-LAST:event_bRemoActionPerformed

    private void bOrdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrdeActionPerformed
        // Ordenar
        DefaultTableModel datos = (DefaultTableModel) tOrden.getModel();
        int tot = tOrden.getRowCount();

        String coci = cbCocinero.getSelectedItem().toString();
        String[] partescoci = coci.split("-");
        String idcocinero = partescoci[0];

        String cliente = cbCliente.getSelectedItem().toString();
        String[] partescliente = cliente.split("-");
        String idcliente = partescliente[0];

        String cocinero_codigo = idcocinero;
        String estado = cbEstado.getSelectedItem().toString();
        String cantidad = jsCantidad.getValue().toString();
        
        
        while (tot>0){
            String idcomida = datos.getValueAt(tot-1, 0).toString();
            System.out.println(idcomida);

            
            listaalimentos ped = new listaalimentos(null, idcliente, idcomida, cantidad, cocinero_codigo, estado);
            Pedido pedido = new Pedido(idcomida);
            if (ped.insertar(cnx) == 1) {
                pedido.borrar(cnx);
                cnx.entablar("SELECT idpedido, comida, cantidad, precio FROM pedido WHERE clientes_clienteid = '" + idcliente + "'", tOrden, 10, 30, 30, 30);
            } else {
                JOptionPane.showMessageDialog(this, "fallo en la insercion de datos");
            }
            
            tot = tot-1;
        }
        
        


    }//GEN-LAST:event_bOrdeActionPerformed

    private void cbClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbClienteItemStateChanged
        // seleccionar diferente cliente cambie la tabla
        String cbClien = cbCliente.getSelectedItem().toString();
        String[] partescliente = cbClien.split("-");
        String clienteid = partescliente[0];
        cnx.entablar("SELECT idpedido, comida, cantidad, precio FROM pedido WHERE clientes_clienteid = '" + clienteid + "'", tOrden, 10, 30, 30, 30);
    }//GEN-LAST:event_cbClienteItemStateChanged

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        // Actualizar estado
        String cbClien = cbCliente.getSelectedItem().toString();
        String[] partescliente = cbClien.split("-");
        String orden_idorden = partescliente[0];
        String estado = cbEstado.getSelectedItem().toString();
        listaalimentos la = new listaalimentos(orden_idorden, estado);

        if (la.actualizar(cnx) == false) {
            JOptionPane.showMessageDialog(this, "Se ha actualizado el estado.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el estado.");
        }
    }//GEN-LAST:event_bActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FGerente fge = new FGerente();
        fge.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bOrde;
    private javax.swing.JButton bRemo;
    private javax.swing.JButton bSelec;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbCocinero;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JLabel lFoto;
    private javax.swing.JLabel lPrecio;
    private javax.swing.JTable tOrden;
    private javax.swing.JToggleButton tbBebida;
    private javax.swing.JToggleButton tbEntradas;
    private javax.swing.JToggleButton tbPlatoFuerte;
    private javax.swing.JToggleButton tbPostre;
    // End of variables declaration//GEN-END:variables
}
