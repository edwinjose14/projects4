package Presentacion;

import Modelo.Registrado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormularioMenu extends javax.swing.JFrame {
     DefaultTableModel modelo;
    ArrayList<Registrado>listpersona;
    ArrayList<Registrado>listapersonasalida;
    ArrayList<Registrado>listaFiltrada;
    String Persona="persona.bin";
    String persanasalida="personaSalida.bin";
    public FormularioMenu() {
        initComponents();
        listpersona= new ArrayList<>();
        listapersonasalida= new ArrayList<>();
        listaFiltrada= new ArrayList<>();
        llenartbla();
        llenarcombo();
        ocultar();
    }
    private void llenartbla(){
    try{
       
    listpersona =(ArrayList<Registrado>) new Persistencia.Agregararchivo().leerObjeto(Persona);
    modelo=new DefaultTableModel();
    String[] columnas={"Cedula","Placa","Celular","Nombre y apellido"
            ,"Tipo de vehiculo","Hora entrada","Hora salida","Deuda"};
    String[] Vehiculo={"Moto","Carro Pequeño","Camion Grande"};
    float valor = 0;
    float valor1,valor2;
    modelo.setColumnIdentifiers(columnas);
    String [] tipodevehiculo={"1","2"};
    for(Registrado registrados:listpersona){
         int i=0;
            i++;
        String[] filas= new String[columnas.length];
        filas[0]= String.valueOf(registrados.getDocumento());
        filas[1]=registrados.getPlaca();
        filas[2]=String.valueOf(registrados.getCelular());
        filas[3]= registrados.getNombreApellido();
        filas[4]= registrados.getTipo();
        filas[5]= String.valueOf(registrados.getHoraentrada());
        filas[6]= String.valueOf(registrados.getHorasalida());
        tipodevehiculo[i]=registrados.getTipo();
        valor1=registrados.getHoraentrada();
        valor2=registrados.getHorasalida();
        valor=valor+(valor1-valor2);
        if(valor<0){
            valor=valor*-1;
        if(tipodevehiculo[i].equals(Vehiculo[0])){
        filas[7]=String.valueOf(valor*500);
        }else if(tipodevehiculo[i].equals(Vehiculo[1])){
          filas[7]=String.valueOf(valor*1000);  
        }else{
        filas[7]=String.valueOf(valor*1500);
        }
        }else{
        if(tipodevehiculo[i].equals(Vehiculo[0])){
        filas[7]=String.valueOf(valor*500);
        }else if(tipodevehiculo[i].equals(Vehiculo[1])){
          filas[7]=String.valueOf(valor*1000);  
        }else{
        filas[7]=String.valueOf(valor*1500);
        }
        
        
        }
        modelo.addRow(filas);
        }
        
        TablaPersona.setModel(modelo);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e,"Vacio", HEIGHT);
    }
    
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
    if(!ComboHorasalida.getSelectedItem().equals("Seleccionar")&&
       !combotipo.getSelectedItem().equals("Seleccionar")&&!txtcelular.getText().equals("")
     &&!txtnombreapellido.getText().equals("")&&!txtnumerodeplaca.getText().equals("")&&
        !combohoraentrada.getSelectedItem().equals("Seleccionar")&&
         !comboasignarpuesto.getSelectedItem().equals("Seleccionar")){
        Registrado registrados;
        registrados = new Registrado();
        try{
            registrados.setCelular(Integer.parseInt(txtcelular.getText()));
            registrados.setNombreApellido(txtnombreapellido.getText());
            registrados.setDocumento(Integer.parseInt(txtcelular.getText()));
            registrados.setPropietario(Integer.parseInt(txtcelular.getText()));
            registrados.setPlaca(txtnumerodeplaca.getText());
            registrados.setHoraentrada(Integer.parseInt(combohoraentrada.getSelectedItem().toString()));
            registrados.setHorasalida(Integer.parseInt(ComboHorasalida.getSelectedItem().toString()));
            registrados.setTipo(combotipo.getSelectedItem().toString());
            registrados.setPuesto(comboasignarpuesto.getSelectedItem().toString());
            listpersona.add(registrados);
            new Persistencia.Agregararchivo().agregarRegistrada(listpersona);
            ocultar();
            llenartbla();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Se solicta en este campo solo valores numericos","Error",0);
        }
    }else{
        JOptionPane.showMessageDialog(null,"Faltan datos","Advertencia",2);
    }
    }
    private void ocultar(){
    txtcelular.setVisible(false);
    txtnombreapellido.setVisible(false);
    txtnumerodeplaca.setVisible(false);
    ComboHorasalida.setVisible(false);
    combohoraentrada.setVisible(false);
    combotipo.setVisible(false);
    txtnumerodecedula.setVisible(false);
    botonconfirmar.setVisible(false);
    }
    private void ver(){
    txtcelular.setVisible(true);
    txtnombreapellido.setVisible(true);
    txtnumerodeplaca.setVisible(true);
    combohoraentrada.setVisible(true);
    ComboHorasalida.setVisible(true);
    combotipo.setVisible(true);
    txtnumerodecedula.setVisible(true);
    botonconfirmar.setVisible(true);
    }
    private void eliminar(){
    listpersona =(ArrayList<Registrado>) new Persistencia.Agregararchivo().leerObjeto(Persona);
    if(TablaPersona.getSelectedRow()>=0){
    listpersona.remove(TablaPersona.getSelectedRow());
    new Persistencia.Agregararchivo().agregarRegistrada(listpersona);
    llenartbla();
    }else{
    JOptionPane.showMessageDialog(null,"Debe seleccionar para poder eliminar","Advertencia", HEIGHT);
    }
    }
    private void salida(){
        if(TablaPersona.getSelectedRow()>=0){
    listpersona =(ArrayList<Registrado>) new Persistencia.Agregararchivo().leerObjeto(Persona);
    try{listapersonasalida=(ArrayList<Registrado>)new Persistencia.Agregararchivo().leerObjeto(persanasalida);
    }catch(Exception e){}
        for(Registrado registrados:listpersona){
          registrados.getDocumento();
          registrados.getCelular();
          registrados.getNombreApellido();
          registrados.getTipo();
          registrados.getHorasalida();
          registrados.getHoraentrada();
          registrados.getPlaca();
          registrados.getPropietario();
          listapersonasalida.add(registrados);
        }
    new Persistencia.Agregararchivo().agregarRegistrodoSalido(listapersonasalida);
    eliminar();
        }else{
        JOptionPane.showMessageDialog(null,"Debe seleccionar para poder eliminar","Advertencia", HEIGHT);
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
    private void buscar(){
        DefaultTableModel modelo2;
        modelo2 =new DefaultTableModel();
        String filtro = txtbuscar.getText();
        listaFiltrada= new ArrayList<>();
        for(Registrado registrado:listpersona){
            if(registrado.getPlaca().toUpperCase().contains(filtro.toUpperCase())){
              listaFiltrada.add(registrado);
            }
        }
    String[] columnas={"Cedula","Placa","Celular","Nombre y apellido"
            ,"Tipo de vehiculo","Hora entrada","Hora salida","Factura"};
       String [] tipodevehiculo={"1","2"};
        modelo2.setColumnIdentifiers(columnas);
        String[] filas;
        float valor = 0;
        float valor1,valor2;
        String[] Vehiculo={"Moto","Carro Pequeño","Camion Grande"};
         for(Registrado registrados:listaFiltrada){
            filas = new String[columnas.length];
            int i=0;
            i++;
        filas[0]= String.valueOf(registrados.getDocumento());
        filas[1]=registrados.getPlaca();
        filas[2]=String.valueOf(registrados.getCelular());
        filas[3]= registrados.getNombreApellido();
        filas[4]= registrados.getTipo();
        filas[5]= String.valueOf(registrados.getHoraentrada());
        filas[6]= String.valueOf(registrados.getHorasalida());
        tipodevehiculo[i]=registrados.getTipo();
        valor1=registrados.getHoraentrada();
        valor2=registrados.getHorasalida();
        valor=valor+(valor1-valor2);
        if(valor<0){
            valor=valor*-1;
        if(tipodevehiculo[i].equals(Vehiculo[0])){
        filas[7]=String.valueOf(valor*500);
        }else if(tipodevehiculo[i].equals(Vehiculo[1])){
          filas[7]=String.valueOf(valor*1000);  
        }else{
        filas[7]=String.valueOf(valor*1500);
        }
        }else{
        if(tipodevehiculo[i].equals(Vehiculo[0])){
        filas[7]=String.valueOf(valor*500);
        }else if(tipodevehiculo[i].equals(Vehiculo[1])){
          filas[7]=String.valueOf(valor*1000);  
        }else{
        filas[7]=String.valueOf(valor*1500);
        }
        }
        modelo2.addRow(filas);
                }
            TablaPersona.setModel(modelo2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPersona = new javax.swing.JTable();
        botonmodificar = new javax.swing.JButton();
        botoneliminar = new javax.swing.JButton();
        botonagregarnuevo = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();
        botonconfirmar = new javax.swing.JButton();
        botonversalido = new javax.swing.JButton();
        botonVermapa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        comboasignarpuesto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ComboHorasalida = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        combohoraentrada = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtnombreapellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnumerodeplaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtnumerodecedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        botonbuscar = new javax.swing.JButton();
        botonrestaurar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(TablaPersona);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 606, 415));

        botonmodificar.setText("Modificar");
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 130, 30));

        botoneliminar.setText("Eliminar");
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botoneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 130, 30));

        botonagregarnuevo.setText("Agregar Nuevo");
        botonagregarnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(botonagregarnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 130, 30));

        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, 130, 30));

        botonconfirmar.setText("confirmar");
        botonconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonconfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(botonconfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 110, 50));

        botonversalido.setText("Ver listado salida");
        botonversalido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonversalidoActionPerformed(evt);
            }
        });
        getContentPane().add(botonversalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 280, 140, 39));

        botonVermapa.setText("Ver Mapa");
        botonVermapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVermapaActionPerformed(evt);
            }
        });
        getContentPane().add(botonVermapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 130, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Asignar puesto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 441, 158, 54));

        comboasignarpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        getContentPane().add(comboasignarpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 90, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora De salida");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 158, 54));
        getContentPane().add(ComboHorasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 56, 54));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora De entrada");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 158, 54));
        getContentPane().add(combohoraentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 56, 54));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo De Vehiculo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 158, 54));

        combotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotipoActionPerformed(evt);
            }
        });
        getContentPane().add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 130, 54));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Primer Nombre y Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 158, 54));

        txtnombreapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreapellidoActionPerformed(evt);
            }
        });
        txtnombreapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreapellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombreapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero De Celular");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 158, 54));

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
        getContentPane().add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero De Placa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 158, 54));

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
        getContentPane().add(txtnumerodeplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 240, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero De Cedula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 158, 54));

        txtnumerodecedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerodecedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumerodecedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 240, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 66, 42));
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 261, 30));

        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 90, 30));

        botonrestaurar.setText("Restaurar");
        botonrestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrestaurarActionPerformed(evt);
            }
        });
        getContentPane().add(botonrestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, 130, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_640903.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
       salida();
    }//GEN-LAST:event_botoneliminarActionPerformed

    private void botonagregarnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarnuevoActionPerformed
       FormularioRegistro formularioRegistro;
       formularioRegistro= new FormularioRegistro();
       formularioRegistro.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_botonagregarnuevoActionPerformed

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
       if(TablaPersona.getSelectedRow()>=0){
       txtnumerodecedula.setText(modelo.getValueAt(TablaPersona.getSelectedRow(),0).toString());
       txtnumerodeplaca.setText(modelo.getValueAt(TablaPersona.getSelectedRow(),1).toString());
       txtcelular.setText(modelo.getValueAt(TablaPersona.getSelectedRow(),2).toString());
       txtnombreapellido.setText(modelo.getValueAt(TablaPersona.getSelectedRow(),3).toString());
       combotipo.setSelectedItem(modelo.getValueAt(TablaPersona.getSelectedRow(),4).toString());
       combohoraentrada.setSelectedItem(modelo.getValueAt(TablaPersona.getSelectedRow(),5).toString());
       ComboHorasalida.setSelectedItem(modelo.getValueAt(TablaPersona.getSelectedRow(),6).toString());
       ver();
       }else{
       JOptionPane.showMessageDialog(null,"debe seleccionar primero","Advertencia",2);
       }
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void botonconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonconfirmarActionPerformed
        if(TablaPersona.getSelectedRow()>=0){
        opciones();
        }else{
        JOptionPane.showMessageDialog(null,"Debe seleccionar primero","Advertencia",2);
        }
    }//GEN-LAST:event_botonconfirmarActionPerformed

    private void botonversalidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonversalidoActionPerformed
        FormularioSalida formularioSalida;
        formularioSalida= new FormularioSalida();
        formularioSalida.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonversalidoActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonsalirActionPerformed

    private void botonVermapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVermapaActionPerformed
       FormularioMapa formularioMapa;
       formularioMapa = new FormularioMapa();
       formularioMapa.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_botonVermapaActionPerformed

    private void combotipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotipoActionPerformed
        opcionesDeparqueo();
    }//GEN-LAST:event_combotipoActionPerformed

    private void txtnombreapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreapellidoKeyTyped
        char c = evt.getKeyChar();
        if((c<'A'||c>'Z'&&c<'a'||c>'z')){evt.consume();}
    }//GEN-LAST:event_txtnombreapellidoKeyTyped

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed

    }//GEN-LAST:event_txtcelularActionPerformed

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

    private void txtnumerodeplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerodeplacaActionPerformed

    }//GEN-LAST:event_txtnumerodeplacaActionPerformed

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

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
       buscar();
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botonrestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrestaurarActionPerformed
       llenartbla();
    }//GEN-LAST:event_botonrestaurarActionPerformed

    private void txtnombreapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreapellidoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboHorasalida;
    private javax.swing.JTable TablaPersona;
    private javax.swing.JButton botonVermapa;
    private javax.swing.JButton botonagregarnuevo;
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botonconfirmar;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JButton botonmodificar;
    private javax.swing.JButton botonrestaurar;
    private javax.swing.JButton botonsalir;
    private javax.swing.JButton botonversalido;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtnombreapellido;
    private javax.swing.JTextField txtnumerodecedula;
    private javax.swing.JTextField txtnumerodeplaca;
    // End of variables declaration//GEN-END:variables
}
