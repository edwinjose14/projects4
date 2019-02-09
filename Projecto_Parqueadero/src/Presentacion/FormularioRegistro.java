package Presentacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modelo.*;

public class FormularioRegistro extends javax.swing.JFrame {
    ArrayList<Registrado>listapersona;
    ArrayList<Registrado>listadepuesto;
    String puesto="-1";
    public FormularioRegistro() {
        initComponents();
        listapersona = new ArrayList<>();
        listadepuesto=new ArrayList<>();
        llenarcombo();
    }
    public void llenarcombo(){
    combotipo.removeAllItems();
    combotipo.addItem("Seleccionar");
    String[] Vehiculo={"Moto","Carro Pequeño","Camion Grande"};
    for(String veiculo:Vehiculo){
    combotipo.addItem(veiculo);
    }
        combohoraentrada.removeAllItems();
        combohoraentrada.addItem("Seleccionar");
        for(int i=1;i<25;i++){
        combohoraentrada.addItem(""+i);
        }
        ComboHorasalida.removeAllItems();
        ComboHorasalida.addItem("Seleccionar");
        for(int i=1;i<25;i++){
        ComboHorasalida.addItem(""+i);
        }
    }
    private void opciones(){
    if(!combotipo.getSelectedItem().equals("Seleccionar")&&!txtcelular.getText().equals("")
     &&!txtnombreapellido.getText().equals("")&&!txtnumerodeplaca.getText().equals("")&&
       !ComboHorasalida.getSelectedItem().equals("Seleccionar")
     &&!combohoraentrada.getSelectedItem().equals("Seleccionar")&&
       !comboasignarpuesto.getSelectedItem().equals("Seleccionar")){
        Registrado registrados;
        registrados = new Registrado();
        try{
            listapersona= (ArrayList<Registrado>)new Persistencia.Agregararchivo().leerObjeto("persona.bin");
            listadepuesto= (ArrayList<Registrado>)new Persistencia.Agregararchivo().leerObjeto("persona.bin");
            String[] puesto2={"1","2"};
            for(Registrado registrado:listadepuesto){
            int i=0;
            i++;
                puesto2[i]=registrado.getPuesto();
                if(puesto2[i].equals(comboasignarpuesto.getSelectedItem())){
                puesto=registrado.getPuesto();
                }else{
                
                }
                
            }
            
      if(!puesto.equals(comboasignarpuesto.getSelectedItem())){
            registrados.setNombreApellido(txtnombreapellido.getText());
            registrados.setCelular(Integer.parseInt(txtcelular.getText()));
            registrados.setDocumento(Integer.parseInt(txtcelular.getText()));
            registrados.setHoraentrada(Integer.parseInt(combohoraentrada.getSelectedItem().toString()));
            registrados.setHorasalida(Integer.parseInt(ComboHorasalida.getSelectedItem().toString()));
            registrados.setPropietario(Integer.parseInt(txtnumerodecedula.getText()));
            registrados.setPlaca(txtnumerodeplaca.getText());
            registrados.setTipo(combotipo.getSelectedItem().toString());
            registrados.setPuesto(comboasignarpuesto.getSelectedItem().toString());
            listapersona.add(registrados);
            new Persistencia.Agregararchivo().agregarRegistrada(listapersona);
            FormularioMenu formularioMenu;
            formularioMenu = new FormularioMenu();
            formularioMenu.setVisible(true);
            this.dispose(); 
                }else{ 
          JOptionPane.showMessageDialog(null,"Este puesto ya esta ocupado busque otro","Error",0);
                }
            
        }catch(Exception e){
                    try{
      if(!puesto.equals(comboasignarpuesto.getSelectedItem())){
            registrados.setNombreApellido(txtnombreapellido.getText());
            registrados.setCelular(Integer.parseInt(txtcelular.getText()));
            registrados.setDocumento(Integer.parseInt(txtcelular.getText()));
            registrados.setHoraentrada(Integer.parseInt(combohoraentrada.getSelectedItem().toString()));
            registrados.setHorasalida(Integer.parseInt(ComboHorasalida.getSelectedItem().toString()));
            registrados.setPropietario(Integer.parseInt(txtnumerodecedula.getText()));
            registrados.setPlaca(txtnumerodeplaca.getText());
            registrados.setTipo(combotipo.getSelectedItem().toString());
            registrados.setPuesto(comboasignarpuesto.getSelectedItem().toString());
            listapersona.add(registrados);
            new Persistencia.Agregararchivo().agregarRegistrada(listapersona);
            FormularioMenu formularioMenu;
            formularioMenu = new FormularioMenu();
            formularioMenu.setVisible(true);
            this.dispose();
                }else{
              JOptionPane.showMessageDialog(null,"Este puesto ya esta ocupado busque otro","Error",0);  
                }
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex,"Error",0);
            }    
            
        }
            
    }else{
        JOptionPane.showMessageDialog(null,"Faltan datos","Advertencia",2);
    }
    }
    private void opcionesDeparqueo(){
    if(combotipo.getSelectedItem().equals("Moto")){
        comboasignarpuesto.removeAllItems();
        comboasignarpuesto.addItem("Seleccionar");
        for(int i=1;i<17;i++){
        comboasignarpuesto.addItem("moto"+i);
        }
    }else if(combotipo.getSelectedItem().equals("Carro Pequeño")){
    comboasignarpuesto.removeAllItems();
        comboasignarpuesto.addItem("Seleccionar");
        for(int i=1;i<21;i++){
        comboasignarpuesto.addItem("carro"+i);
        }
    }else if(combotipo.getSelectedItem().equals("Camion Grande")){
    comboasignarpuesto.removeAllItems();
        comboasignarpuesto.addItem("Seleccionar");
        for(int i=1;i<21;i++){
        comboasignarpuesto.addItem("camion"+i);
        }
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnumerodecedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnumerodeplaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombreapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();
        botoncontinuar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combohoraentrada = new javax.swing.JComboBox<>();
        botonregresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ComboHorasalida = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboasignarpuesto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero De Cedula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 30, 158, 54));

        txtnumerodecedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerodecedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumerodecedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 37, 288, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero De Celular");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 150, 158, 54));

        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        getContentPane().add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 156, 288, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero De Placa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 90, 158, 54));

        txtnumerodeplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerodeplacaActionPerformed(evt);
            }
        });
        txtnumerodeplaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerodeplacaKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumerodeplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 96, 288, 42));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Primer Nombre y Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 210, 158, 54));

        txtnombreapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreapellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombreapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 210, 288, 44));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo De Vehiculo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 270, 158, 54));

        combotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotipoActionPerformed(evt);
            }
        });
        getContentPane().add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 270, 137, 54));

        botoncontinuar.setText("Continuar");
        botoncontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncontinuarActionPerformed(evt);
            }
        });
        getContentPane().add(botoncontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 510, 96, 36));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora De entrada");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 158, 54));
        getContentPane().add(combohoraentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 330, 68, 54));

        botonregresar.setText("Regresar");
        botonregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 510, 99, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora De salida");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 390, 158, 54));
        getContentPane().add(ComboHorasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 390, 68, 54));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Asignar puesto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 450, 158, 54));

        comboasignarpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        getContentPane().add(comboasignarpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 450, 137, 54));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 567, 479, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_640903.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 480, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumerodeplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerodeplacaActionPerformed

    }//GEN-LAST:event_txtnumerodeplacaActionPerformed

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed

    }//GEN-LAST:event_txtcelularActionPerformed

    private void botoncontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncontinuarActionPerformed
        opciones();
    }//GEN-LAST:event_botoncontinuarActionPerformed

    private void botonregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregresarActionPerformed
     FormularioMenu formularioMenu;
     formularioMenu = new FormularioMenu();
     formularioMenu.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_botonregresarActionPerformed

    private void txtnumerodeplacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerodeplacaKeyTyped
    int limite;
    limite =6;
    char c = evt.getKeyChar();
    if((c<'0'||c>'9')&&(c<'a'||c>'z')&&(c<'A'||c>'Z')){evt.consume();}
    if(txtnumerodeplaca.getText().length()==limite){
    evt.consume();
    }
    }//GEN-LAST:event_txtnumerodeplacaKeyTyped

    private void txtnumerodecedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerodecedulaKeyTyped
    int limite;
    limite =10;
    char c = evt.getKeyChar();
    if((c<'0'||c>'9')){evt.consume();}
    if(txtnumerodecedula.getText().length()==limite){
    evt.consume();
    JOptionPane.showMessageDialog(null,"No se reciben mas de 10 caracteres");
    }
    }//GEN-LAST:event_txtnumerodecedulaKeyTyped

    private void txtnombreapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreapellidoKeyTyped
    char c = evt.getKeyChar();
    if((c<'A'||c>'Z'&&c<'a'||c>'z')){evt.consume();}   
    }//GEN-LAST:event_txtnombreapellidoKeyTyped

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
    int limite;
    limite =10;
    char c = evt.getKeyChar();
    if((c<'0'||c>'9')){evt.consume();}
    if(txtcelular.getText().length()==limite){
    evt.consume();
    JOptionPane.showMessageDialog(null,"No se reciben mas de 10 caracteres");
    }
    }//GEN-LAST:event_txtcelularKeyTyped

    private void combotipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotipoActionPerformed
        opcionesDeparqueo();
    }//GEN-LAST:event_combotipoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboHorasalida;
    private javax.swing.JButton botoncontinuar;
    private javax.swing.JButton botonregresar;
    private javax.swing.JComboBox<String> comboasignarpuesto;
    private javax.swing.JComboBox<String> combohoraentrada;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtnombreapellido;
    private javax.swing.JTextField txtnumerodecedula;
    private javax.swing.JTextField txtnumerodeplaca;
    // End of variables declaration//GEN-END:variables
}
