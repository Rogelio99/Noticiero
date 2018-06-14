package noticiero_;

import com.mysql.jdbc.Statement;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class Principal extends javax.swing.JFrame
{
    Conexion con = new Conexion();
    PreparedStatement p=null;
    ResultSet res, idPConsec=null, kk=null;
    int idP_=0;
    String queryGuardar="";
    

    //QUITAR BOTONES
   // @Override
    
    private void limpiar()
    {
        txtNombre.setText("");
        txtAP.setText("");
        txtAM.setText("");
        txtCE.setText("");
        txtEdad.setText("");
    }

    /** Creates new form Principal */
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox();
        txtNombre = new javax.swing.JTextField();
        txtAP = new javax.swing.JTextField();
        txtAM = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Apellido Materno:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad:");

        jLabel6.setText("Sexo:");

        jLabel7.setText("Correo Electronico:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtAP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAPKeyTyped(evt);
            }
        });

        txtAM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAMKeyTyped(evt);
            }
        });

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEdadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnBuscar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCE, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAM, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, 148, Short.MAX_VALUE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Periodistas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEKeyTyped
        // TODO add your handling code here:
        /*
        char caracter = evt.getKeyChar();
        if (txtCE.getText().length() == 30)
        {
            evt.setKeyChar('\0');
        }
        if (evt.getKeyChar() >= 33 && evt.getKeyChar() <= 64)
        {
            evt.consume();
            System.out.println("Solo letras");
        }
        if (evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96)
        {
            evt.consume();
            System.out.println("Solo letras");
        }
        if (evt.getKeyChar() >= 123 && evt.getKeyChar() <=161)
        {
            evt.consume();
            System.out.println("Solo letras");
        }*/
    }//GEN-LAST:event_txtCEKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        if (evt.getKeyChar() ==32){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se permiten espacios en la edad");
        }
        int num = evt.getKeyChar();
        if (txtEdad.getText().length() == 8){
            evt.setKeyChar('\0');
        }
        if (evt.getKeyChar() >= 58 && evt.getKeyChar() <= 168){
            evt.consume();
            System.out.println("Solo numeros");
        }
        if (evt.getKeyChar() >= 33 && evt.getKeyChar() <= 47){
            evt.consume();
            System.out.println("Solo numeros");
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyPressed

    }//GEN-LAST:event_txtEdadKeyPressed

    private void txtAMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAMKeyTyped
        char caracter = evt.getKeyChar();
        if (txtAM.getText().length() == 30){
            evt.setKeyChar('\0');
        }
        if (evt.getKeyChar() >= 33 && evt.getKeyChar() <= 64){
            evt.consume();
            System.out.println("Solo letras");
        }
        if (evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96){
            evt.consume();
            System.out.println("Solo letras");
        }
        if (evt.getKeyChar() >= 123 && evt.getKeyChar() <=161){
            evt.consume();
            System.out.println("Solo letras");
        }
    }//GEN-LAST:event_txtAMKeyTyped

    private void txtAPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPKeyTyped
        char caracter = evt.getKeyChar();
        if (txtAP.getText().length() == 30){
            evt.setKeyChar('\0');
        }
        if (evt.getKeyChar() >= 33 && evt.getKeyChar() <= 64){
            evt.consume();
            System.out.println("Solo letras");
        }
        if (evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96){
            evt.consume();
            System.out.println("Solo letras");
        }
        if (evt.getKeyChar() >= 123 && evt.getKeyChar() <=161){
            evt.consume();
            System.out.println("Solo letras");
        }
    }//GEN-LAST:event_txtAPKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char caracter = evt.getKeyChar();
        if (txtNombre.getText().length() == 30){
            evt.setKeyChar('\0');
        }
        if (evt.getKeyChar() >= 33 && evt.getKeyChar() <= 64){
            evt.consume();
            System.out.println("Solo letras");
        }
        if (evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96){
            evt.consume();
            System.out.println("Solo letras");
        }
        if (evt.getKeyChar() >= 123 && evt.getKeyChar() <=161){
            evt.consume();
            System.out.println("Solo letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed

    }//GEN-LAST:event_cmbSexoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int cont=0;

        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Vacio, por favor ingrese valores");
            return;
        }
        int n = JOptionPane.showConfirmDialog(btnGuardar, "Confirme si esta seguro de insetar?","Question",JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION)
        {
            //INSERTAR EN PERIODISTAS
            try{
                int guardar;
                p=con.obtenerConexion().prepareStatement("INSERT INTO periodista"
                    + "(nombre,apaterno,amaterno,edad,sexo,correo)"+
                    " values("+"'"+txtNombre.getText()+"','"+txtAP.getText()+"','"+txtAM.getText()+"',"+txtEdad.getText()+",'"+cmbSexo.getSelectedItem()+"','"+txtCE.getText()+"')");
                guardar = p.executeUpdate();
                if (guardar > 0){
                    System.out.println(" SE INSERTO PERIODISTA");
                    JOptionPane.showMessageDialog(null,"Insersión Correcta");
                    limpiar();
                }else{
                    System.out.println("NO SE INSERTO EL PERIODISTA");
                }

            }catch( Exception ex){
                System.out.println("ERROR EN try2");
            }
        }//FIN DEL IF
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String messageselec = JOptionPane.showInputDialog(btnBuscar,"Dame el nombre del Periodista...","Question", JOptionPane.YES_NO_OPTION);
        String nombreP = messageselec;
        try{
            p = con.obtenerConexion().prepareStatement("Select * from periodista where nombre like '%"+nombreP+"%' LIMIT 1");
            res = p.executeQuery();
            while(res.next()){
                txtNombre.setText(res.getString("nombre"));
                txtAP.setText(res.getString("apaterno"));
                txtAM.setText(res.getString("amaterno"));
                txtEdad.setText(res.getString("edad"));
                cmbSexo.setSelectedItem(res.getString("sexo"));
                txtCE.setText(res.getString("correo"));
                btnGuardar.setEnabled(false);
            }
            res.close();
        }catch(SQLException ex){
            System.out.println("Error al hacer la consulta"+ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtCE;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
