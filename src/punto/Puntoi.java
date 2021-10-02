/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

import javax.swing.JTextField;

/**
 *
 * @author Angela
 */
public class Puntoi extends javax.swing.JFrame {

    Punto p, p3;
    Punto3d p1, p4;
    Linea2d p2;
    public Puntoi() {
        initComponents();
        p= new Punto();
        p3= new Punto();
        p1 =new Punto3d();
        p4 =new Punto3d();
        p2 = new Linea2d();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        vx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vy = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vz = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        distacia2d = new javax.swing.JButton();
        origen2d = new javax.swing.JButton();
        horizontal2d = new javax.swing.JButton();
        vertical2d = new javax.swing.JButton();
        diagonal2d = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        distancia3d = new javax.swing.JButton();
        horizontal3d = new javax.swing.JButton();
        diagonal3d = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        longitud = new javax.swing.JButton();
        linead = new javax.swing.JButton();
        lineah = new javax.swing.JButton();
        lineav = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cresultado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dv = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        da = new javax.swing.JTextField();
        rlinea = new javax.swing.JTextField();
        dxy = new javax.swing.JTextField();
        duy = new javax.swing.JTextField();
        gt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("X");

        vx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vxActionPerformed(evt);
            }
        });

        jLabel2.setText("Y");

        jLabel3.setText("Z");

        jLabel4.setText("Punto 2D");

        distacia2d.setText("Distancia");
        distacia2d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distacia2dActionPerformed(evt);
            }
        });

        origen2d.setText("D. al Origen");
        origen2d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origen2dActionPerformed(evt);
            }
        });

        horizontal2d.setText("Mover Horizontal");
        horizontal2d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontal2dActionPerformed(evt);
            }
        });

        vertical2d.setText("Mover Vertical");
        vertical2d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertical2dActionPerformed(evt);
            }
        });

        diagonal2d.setText("Mover Diagonal");
        diagonal2d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonal2dActionPerformed(evt);
            }
        });

        jLabel5.setText("Punto 3D");

        distancia3d.setText("Distancia");
        distancia3d.setToolTipText("");
        distancia3d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distancia3dActionPerformed(evt);
            }
        });

        horizontal3d.setText("Mover Altura");
        horizontal3d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontal3dActionPerformed(evt);
            }
        });

        diagonal3d.setText("Mover Diagonal");
        diagonal3d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonal3dActionPerformed(evt);
            }
        });

        jLabel6.setText("Linea 2D");

        longitud.setText("Longitud");
        longitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longitudActionPerformed(evt);
            }
        });

        linead.setText("Mover Diagonal");
        linead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineadActionPerformed(evt);
            }
        });

        lineah.setText("Mover Horizontal");
        lineah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineahActionPerformed(evt);
            }
        });

        lineav.setText("Mover Vertical");
        lineav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineavActionPerformed(evt);
            }
        });

        jLabel7.setText("Resultado");

        jLabel8.setText("Cantidades a mover:");

        jLabel9.setText("D. Vertical");

        jLabel10.setText("D. Horizontal");

        jLabel11.setText("D. Altura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel4)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel5)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(vx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dxy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(distacia2d, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vy)
                                    .addComponent(vz))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(duy)
                                    .addComponent(gt))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(origen2d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horizontal2d)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(cresultado)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vertical2d, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diagonal2d, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(distancia3d, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horizontal3d, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diagonal3d, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(linead, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lineah)
                                    .addComponent(lineav, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(dh, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rlinea, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(distacia2d)
                    .addComponent(distancia3d)
                    .addComponent(longitud)
                    .addComponent(vx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origen2d)
                    .addComponent(linead)
                    .addComponent(duy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horizontal3d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horizontal2d)
                    .addComponent(lineah)
                    .addComponent(gt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diagonal3d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vertical2d)
                    .addComponent(lineav)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diagonal2d)
                    .addComponent(cresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rlinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vxActionPerformed

    private void distacia2dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distacia2dActionPerformed
       cresultado.setText(" ");
       String fx = vx.getText();
       double x = Double.parseDouble(fx);
       String fy = vy.getText();
        double y = Double.parseDouble(fy);
       p.leer(x, y);
       String gx = dxy.getText();
       double x1 = Double.parseDouble(gx);
       String gy = duy.getText();
       double y1 = Double.parseDouble(gy);
       p3.leer(x1, y1);
       
       cresultado.setText( p3.distancia(p).imprimir());
    }//GEN-LAST:event_distacia2dActionPerformed

    private void origen2dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origen2dActionPerformed
       cresultado.setText(" ");
       String f = vx.getText();
       double x = Double.parseDouble(f);
       String fi = vy.getText();
       double y = Double.parseDouble(fi);
       p.leer(x, y);
       p.distancia();
       cresultado.setText(p.imprimir());
    }//GEN-LAST:event_origen2dActionPerformed

    private void horizontal2dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horizontal2dActionPerformed
        cresultado.setText(" ");
        String f = dh.getText();
        double vh = Double.parseDouble(f);
        p.moverH(vh);
        cresultado.setText(p.imprimir());
    }//GEN-LAST:event_horizontal2dActionPerformed

    private void vertical2dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertical2dActionPerformed
        cresultado.setText(" ");
        String f = dv.getText();
        double vv = Double.parseDouble(f);
        p.moverV(vv);
        cresultado.setText(p.imprimir());
    }//GEN-LAST:event_vertical2dActionPerformed

    private void diagonal2dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonal2dActionPerformed
        cresultado.setText(" ");
        String fv = dv.getText();
        double vd = Double.parseDouble(fv);
        String fh = dh.getText();
        double hd = Double.parseDouble(fh);
        p.moverD(hd, vd);
        cresultado.setText(p.imprimir());
    }//GEN-LAST:event_diagonal2dActionPerformed

    private void distancia3dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distancia3dActionPerformed
       cresultado.setText(" ");
       String f = vz.getText();
       double z = Double.parseDouble(f);
       p1.leer(z);
       String gz = gt.getText();
       double z1 = Integer.parseInt(gz);
       p4.leer(z1);
       String fx = vx.getText();
       double x = Double.parseDouble(fx);
       String fi = vy.getText();
       double y = Double.parseDouble(fi);
       p.leer(x, y);
       cresultado.setText(p4.distancia(p).imprimir());
    }//GEN-LAST:event_distancia3dActionPerformed

    private void horizontal3dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horizontal3dActionPerformed
        cresultado.setText(" ");
        String f = da.getText();
        double va = Double.parseDouble(f);
        p1.moverZ(va);
        cresultado.setText(p1.imprimir());
    }//GEN-LAST:event_horizontal3dActionPerformed

    private void diagonal3dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonal3dActionPerformed
        cresultado.setText(" ");
        String fv = dv.getText();
        double vd = Double.parseDouble(fv);
        String fh = dh.getText();
        double hd = Double.parseDouble(fh);
        String fa = da.getText();
        double ad = Double.parseDouble(fa);
        p1.moverD(hd, vd, ad);
        cresultado.setText(p1.imprimir());
    }//GEN-LAST:event_diagonal3dActionPerformed

    private void longitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudActionPerformed
       cresultado.setText(" ");
       String fx = vx.getText();
       double x = Double.parseDouble(fx);
       String fy = vy.getText();
       double y = Double.parseDouble(fy);
       //ventana para que ingrese los otros datos
       String gx = dxy.getText();
       double x1 = Double.parseDouble(gx);
       String gy = duy.getText();
       double y1 = Double.parseDouble(gy);
       p2.leer(x, y, x1, y1);
       p3.leer(x, y);
       cresultado.setText(p2.longitudLinea(p3).imprimir());
    }//GEN-LAST:event_longitudActionPerformed

    private void lineadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineadActionPerformed
        cresultado.setText(" ");
        String fv = dv.getText();
        double vd = Double.parseDouble(fv);
        String fh = dh.getText();
        double hd = Double.parseDouble(fh);
        p2.moverD(hd, vd);
        cresultado.setText(p2.imprimir());
        rlinea.setText(p2.imprimir1());
    }//GEN-LAST:event_lineadActionPerformed

    private void lineahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineahActionPerformed
        cresultado.setText(" ");
        String fv = dv.getText();
        double vd = Double.parseDouble(fv);
        String fh = dh.getText();
        double hd = Double.parseDouble(fh);
        p2.moverH(hd, vd);
        cresultado.setText(p2.imprimir());
        rlinea.setText(p2.imprimir1());
    }//GEN-LAST:event_lineahActionPerformed

    private void lineavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineavActionPerformed
        cresultado.setText(" ");
        String fv = dv.getText();
        double vd = Double.parseDouble(fv);
        String fh = dh.getText();
        double hd = Double.parseDouble(fh);
        p2.moverH(vd, hd);
        cresultado.setText(p2.imprimir());
        rlinea.setText(p2.imprimir1());
    }//GEN-LAST:event_lineavActionPerformed

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
            java.util.logging.Logger.getLogger(Puntoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puntoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puntoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puntoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puntoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cresultado;
    private javax.swing.JTextField da;
    private javax.swing.JTextField dh;
    private javax.swing.JButton diagonal2d;
    private javax.swing.JButton diagonal3d;
    private javax.swing.JButton distacia2d;
    private javax.swing.JButton distancia3d;
    private javax.swing.JTextField duy;
    private javax.swing.JTextField dv;
    private javax.swing.JTextField dxy;
    private javax.swing.JTextField gt;
    private javax.swing.JButton horizontal2d;
    private javax.swing.JButton horizontal3d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton linead;
    private javax.swing.JButton lineah;
    private javax.swing.JButton lineav;
    private javax.swing.JButton longitud;
    private javax.swing.JButton origen2d;
    private javax.swing.JTextField rlinea;
    private javax.swing.JButton vertical2d;
    private javax.swing.JTextField vx;
    private javax.swing.JTextField vy;
    private javax.swing.JTextField vz;
    // End of variables declaration//GEN-END:variables
}