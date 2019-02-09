package Presentacion;

import Modelo.Registrado;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormularioMapa extends javax.swing.JFrame {
   //se hace un arraylist para recorrer los vehiculos registrados
    
    ArrayList<Modelo.Registrado>listregistrados;
    public FormularioMapa() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
            ocultarMapa();
        listregistrados= new ArrayList<>();
        vermapa();
    }
    //se usa para identificar si los puestos estan desocupado y sino se ocultan
    private void ocultarMapa(){
    moto1.setVisible(false);
    moto2.setVisible(false);
    moto3.setVisible(false);
    moto4.setVisible(false);
    moto5.setVisible(false);
    moto6.setVisible(false);
    moto7.setVisible(false);
    moto8.setVisible(false);
    moto9.setVisible(false);
    moto10.setVisible(false);
    moto11.setVisible(false);
    moto12.setVisible(false);
    moto13.setVisible(false);
    moto14.setVisible(false);
    moto15.setVisible(false);
    moto16.setVisible(false);
    carropequeño1.setVisible(false);
    carropequeño2.setVisible(false);
    carropequeño3.setVisible(false);
    carropequeño4.setVisible(false);
    carropequeño5.setVisible(false);
    carropequeño6.setVisible(false);
    carropequeño7.setVisible(false);
    carropequeño8.setVisible(false);
    carropequeño9.setVisible(false);
    carropequeño10.setVisible(false);
    carropequeño11.setVisible(false);
    carropequeño12.setVisible(false);
    carropequeño13.setVisible(false);
    carropequeño14.setVisible(false);
    carropequeño15.setVisible(false);
    carropequeño16.setVisible(false);
    carropequeño17.setVisible(false);
    carropequeño18.setVisible(false);
    carropequeño19.setVisible(false);
    carropequeño20.setVisible(false);
    camion1.setVisible(false);
    camion2.setVisible(false);
    camion3.setVisible(false);
    camion4.setVisible(false);
    camion5.setVisible(false);
    camion6.setVisible(false);
    camion7.setVisible(false);
    camion8.setVisible(false);
    camion9.setVisible(false);
    camion10.setVisible(false);
    camion11.setVisible(false);
    camion12.setVisible(false);
    camion13.setVisible(false);
    camion14.setVisible(false);
    camion15.setVisible(false);
    camion16.setVisible(false);
    camion17.setVisible(false);
    camion18.setVisible(false);
    camion19.setVisible(false);
    camion20.setVisible(false);
    }
    //se usa para ver si los puestos estan ocupados y si no se muestran
    //se usa un try catch para validar
    private void vermapa(){
    try{
    listregistrados=(ArrayList<Registrado>)new Persistencia.Agregararchivo().leerObjeto("persona.bin");
    String[] puesto={"1","2"};
    for(Modelo.Registrado registrado:listregistrados){
    int i=0;
    puesto[i]=registrado.getPuesto();
    if(puesto[i].equals(moto1.getText())){
    moto1.setVisible(true);
    }else if(puesto[i].equals(moto2.getText())){
    moto2.setVisible(true);
    }else if(puesto[i].equals(moto3.getText())){
    moto3.setVisible(true);
    }else if(puesto[i].equals(moto4.getText())){
    moto4.setVisible(true);
    }else if(puesto[i].equals(moto5.getText())){
    moto5.setVisible(true);
    }else if(puesto[i].equals(moto6.getText())){
    moto6.setVisible(true);
    }else if(puesto[i].equals(moto7.getText())){
    moto7.setVisible(true);
    }else if(puesto[i].equals(moto8.getText())){
    moto8.setVisible(true);
    }else if(puesto[i].equals(moto9.getText())){
    moto9.setVisible(true);
    }else if(puesto[i].equals(moto10.getText())){
    moto10.setVisible(true);
    }else if(puesto[i].equals(moto11.getText())){
    moto11.setVisible(true);
    }else if(puesto[i].equals(moto12.getText())){
    moto12.setVisible(true);
    }else if(puesto[i].equals(moto13.getText())){
    moto13.setVisible(true);
    }else if(puesto[i].equals(moto14.getText())){
    moto14.setVisible(true);
    }else if(puesto[i].equals(moto15.getText())){
    moto15.setVisible(true);
    }else if(puesto[i].equals(moto16.getText())){
    moto16.setVisible(true);
    }else if(puesto[i].equals(carropequeño1.getText())){
    carropequeño1.setVisible(true);
    }else if(puesto[i].equals(carropequeño2.getText())){
    carropequeño2.setVisible(true);
    }else if(puesto[i].equals(carropequeño3.getText())){
    carropequeño3.setVisible(true);
    }else if(puesto[i].equals(carropequeño4.getText())){
    carropequeño4.setVisible(true);
    }else if(puesto[i].equals(carropequeño5.getText())){
    carropequeño5.setVisible(true);
    }else if(puesto[i].equals(carropequeño6.getText())){
    carropequeño6.setVisible(true);
    }else if(puesto[i].equals(carropequeño7.getText())){
    carropequeño7.setVisible(true);
    }else if(puesto[i].equals(carropequeño8.getText())){
    carropequeño8.setVisible(true);
    }else if(puesto[i].equals(carropequeño9.getText())){
    carropequeño9.setVisible(true);
    }else if(puesto[i].equals(carropequeño10.getText())){
    carropequeño10.setVisible(true);
    }else if(puesto[i].equals(carropequeño11.getText())){
    carropequeño11.setVisible(true);
    }else if(puesto[i].equals(carropequeño12.getText())){
    carropequeño12.setVisible(true);
    }else if(puesto[i].equals(carropequeño13.getText())){
    carropequeño13.setVisible(true);
    }else if(puesto[i].equals(carropequeño14.getText())){
    carropequeño14.setVisible(true);
    }else if(puesto[i].equals(carropequeño15.getText())){
    carropequeño15.setVisible(true);
    }else if(puesto[i].equals(carropequeño16.getText())){
    carropequeño16.setVisible(true);
    }else if(puesto[i].equals(carropequeño17.getText())){
    carropequeño17.setVisible(true);
    }else if(puesto[i].equals(carropequeño18.getText())){
    carropequeño18.setVisible(true);
    }else if(puesto[i].equals(carropequeño19.getText())){
    carropequeño19.setVisible(true);
    }else if(puesto[i].equals(carropequeño20.getText())){
    carropequeño20.setVisible(true);
    }else if(puesto[i].equals(camion1.getText())){
    camion1.setVisible(true);
    }else if(puesto[i].equals(camion2.getText())){
    camion2.setVisible(true);
    }else if(puesto[i].equals(camion3.getText())){
    camion3.setVisible(true);
    }else if(puesto[i].equals(camion4.getText())){
    camion4.setVisible(true);
    }else if(puesto[i].equals(camion5.getText())){
    camion5.setVisible(true);
    }else if(puesto[i].equals(camion6.getText())){
    camion6.setVisible(true);
    }else if(puesto[i].equals(camion7.getText())){
    camion7.setVisible(true);
    }else if(puesto[i].equals(camion8.getText())){
    camion8.setVisible(true);
    }else if(puesto[i].equals(camion9.getText())){
    camion9.setVisible(true);
    }else if(puesto[i].equals(camion10.getText())){
    camion10.setVisible(true);
    }else if(puesto[i].equals(camion11.getText())){
    camion11.setVisible(true);
    }else if(puesto[i].equals(camion12.getText())){
    camion12.setVisible(true);
    }else if(puesto[i].equals(camion13.getText())){
    camion13.setVisible(true);
    }else if(puesto[i].equals(camion14.getText())){
    camion14.setVisible(true);
    }else if(puesto[i].equals(camion15.getText())){
    camion15.setVisible(true);
    }else if(puesto[i].equals(camion16.getText())){
    camion16.setVisible(true);
    }else if(puesto[i].equals(camion17.getText())){
    camion17.setVisible(true);
    }else if(puesto[i].equals(camion18.getText())){
    camion18.setVisible(true);
    }else if(puesto[i].equals(camion19.getText())){
    camion19.setVisible(true);
    }else if(puesto[i].equals(camion20.getText())){
    camion20.setVisible(true);
    }else{
    }
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Todo esta vacio");
        ocultarMapa();
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moto1 = new javax.swing.JLabel();
        moto2 = new javax.swing.JLabel();
        moto3 = new javax.swing.JLabel();
        moto4 = new javax.swing.JLabel();
        moto5 = new javax.swing.JLabel();
        moto6 = new javax.swing.JLabel();
        moto7 = new javax.swing.JLabel();
        moto8 = new javax.swing.JLabel();
        moto9 = new javax.swing.JLabel();
        moto10 = new javax.swing.JLabel();
        moto11 = new javax.swing.JLabel();
        moto12 = new javax.swing.JLabel();
        moto13 = new javax.swing.JLabel();
        moto14 = new javax.swing.JLabel();
        moto15 = new javax.swing.JLabel();
        moto16 = new javax.swing.JLabel();
        carropequeño1 = new javax.swing.JLabel();
        carropequeño2 = new javax.swing.JLabel();
        carropequeño3 = new javax.swing.JLabel();
        carropequeño4 = new javax.swing.JLabel();
        carropequeño5 = new javax.swing.JLabel();
        carropequeño6 = new javax.swing.JLabel();
        carropequeño7 = new javax.swing.JLabel();
        carropequeño8 = new javax.swing.JLabel();
        carropequeño9 = new javax.swing.JLabel();
        carropequeño10 = new javax.swing.JLabel();
        carropequeño11 = new javax.swing.JLabel();
        carropequeño12 = new javax.swing.JLabel();
        carropequeño13 = new javax.swing.JLabel();
        carropequeño14 = new javax.swing.JLabel();
        carropequeño15 = new javax.swing.JLabel();
        carropequeño16 = new javax.swing.JLabel();
        carropequeño17 = new javax.swing.JLabel();
        carropequeño18 = new javax.swing.JLabel();
        carropequeño19 = new javax.swing.JLabel();
        carropequeño20 = new javax.swing.JLabel();
        camion1 = new javax.swing.JLabel();
        camion2 = new javax.swing.JLabel();
        camion3 = new javax.swing.JLabel();
        camion4 = new javax.swing.JLabel();
        camion5 = new javax.swing.JLabel();
        camion6 = new javax.swing.JLabel();
        camion7 = new javax.swing.JLabel();
        camion8 = new javax.swing.JLabel();
        camion9 = new javax.swing.JLabel();
        camion10 = new javax.swing.JLabel();
        camion11 = new javax.swing.JLabel();
        camion12 = new javax.swing.JLabel();
        camion13 = new javax.swing.JLabel();
        camion14 = new javax.swing.JLabel();
        camion15 = new javax.swing.JLabel();
        camion16 = new javax.swing.JLabel();
        camion17 = new javax.swing.JLabel();
        camion18 = new javax.swing.JLabel();
        camion19 = new javax.swing.JLabel();
        camion20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        MapaParqueadero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto1.setText("moto1");
        getContentPane().add(moto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 100, 70, 40));

        moto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto2.setText("moto2");
        getContentPane().add(moto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 170, 70, 40));

        moto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto3.setText("moto3");
        getContentPane().add(moto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 230, 70, 40));

        moto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto4.setText("moto4");
        getContentPane().add(moto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, 70, 40));

        moto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto5.setText("moto5");
        getContentPane().add(moto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 370, 70, 40));

        moto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto6.setText("moto6");
        getContentPane().add(moto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 430, 70, 40));

        moto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto7.setText("moto7");
        getContentPane().add(moto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 500, 70, 40));

        moto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto8.setText("moto8");
        getContentPane().add(moto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, 70, 40));

        moto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto9.setText("moto9");
        getContentPane().add(moto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 100, 70, 40));

        moto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto10.setText("moto10");
        getContentPane().add(moto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 170, 70, 40));

        moto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto11.setText("moto11");
        getContentPane().add(moto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 230, 70, 40));

        moto12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto12.setText("moto12");
        getContentPane().add(moto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 300, 70, 40));

        moto13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto13.setText("moto13");
        getContentPane().add(moto13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 370, 70, 40));

        moto14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto14.setText("moto14");
        getContentPane().add(moto14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 430, 70, 40));

        moto15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto15.setText("moto15");
        getContentPane().add(moto15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 500, 70, 40));

        moto16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto.jpg"))); // NOI18N
        moto16.setText("moto16");
        getContentPane().add(moto16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 570, 70, 40));

        carropequeño1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño1.setText("carro1");
        getContentPane().add(carropequeño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 40, 80));

        carropequeño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño2.setText("carro2");
        getContentPane().add(carropequeño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 40, 80));

        carropequeño3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño3.setText("carro3");
        getContentPane().add(carropequeño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 40, 80));

        carropequeño4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño4.setText("carro4");
        getContentPane().add(carropequeño4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 40, 80));

        carropequeño5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño5.setText("carro5");
        getContentPane().add(carropequeño5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 40, 80));

        carropequeño6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño6.setText("carro6");
        getContentPane().add(carropequeño6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 40, 80));

        carropequeño7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño7.setText("carro7");
        getContentPane().add(carropequeño7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 40, 80));

        carropequeño8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño8.setText("carro8");
        getContentPane().add(carropequeño8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 40, 80));

        carropequeño9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño9.setText("carrro9");
        getContentPane().add(carropequeño9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 40, 80));

        carropequeño10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño10.setText("carro10");
        getContentPane().add(carropequeño10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 40, 80));

        carropequeño11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño11.setText("carro11");
        getContentPane().add(carropequeño11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, 40, 80));

        carropequeño12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño12.setText("carro12");
        getContentPane().add(carropequeño12, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 80, 40, 80));

        carropequeño13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño13.setText("carro13");
        getContentPane().add(carropequeño13, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 80, 40, 80));

        carropequeño14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño14.setText("carro14");
        getContentPane().add(carropequeño14, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 80, 40, 80));

        carropequeño15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño15.setText("carro15");
        getContentPane().add(carropequeño15, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 80, 40, 80));

        carropequeño16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño16.setText("carro16");
        getContentPane().add(carropequeño16, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 80, 40, 80));

        carropequeño17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño17.setText("carro17");
        getContentPane().add(carropequeño17, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 80, 40, 80));

        carropequeño18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño18.setText("carro18");
        getContentPane().add(carropequeño18, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 80, 40, 80));

        carropequeño19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño19.setText("carro19");
        getContentPane().add(carropequeño19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 40, 80));

        carropequeño20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto Pequeño.jpg"))); // NOI18N
        carropequeño20.setText("carro20");
        getContentPane().add(carropequeño20, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 80, 40, 80));

        camion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion1.setText("camion1");
        getContentPane().add(camion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 60, 140));

        camion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion2.setText("camion2");
        getContentPane().add(camion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 60, 140));

        camion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion3.setText("camion3");
        getContentPane().add(camion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 60, 140));

        camion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion4.setText("camion4");
        getContentPane().add(camion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 60, 140));

        camion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion5.setText("camion5");
        getContentPane().add(camion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 60, 140));

        camion6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion6.setText("camion6");
        getContentPane().add(camion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 60, 140));

        camion7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion7.setText("camion7");
        getContentPane().add(camion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 60, 140));

        camion8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion8.setText("camion8");
        getContentPane().add(camion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 60, 140));

        camion9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion9.setText("camion9");
        getContentPane().add(camion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 60, 140));

        camion10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion10.setText("camion10");
        getContentPane().add(camion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 60, 140));

        camion11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion11.setText("camion11");
        getContentPane().add(camion11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 60, 140));

        camion12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion12.setText("camion12");
        getContentPane().add(camion12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 60, 140));

        camion13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion13.setText("camion13");
        getContentPane().add(camion13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 60, 140));

        camion14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion14.setText("camion14");
        getContentPane().add(camion14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 60, 140));

        camion15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion15.setText("camion15");
        getContentPane().add(camion15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 60, 140));

        camion16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion16.setText("camion16");
        getContentPane().add(camion16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 60, 140));

        camion17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion17.setText("camion17");
        getContentPane().add(camion17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 60, 140));

        camion18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion18.setText("camion18");
        getContentPane().add(camion18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 60, 140));

        camion19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion19.setText("camion19");
        getContentPane().add(camion19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 60, 140));

        camion20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion Grande.jpg"))); // NOI18N
        camion20.setText("camion20");
        getContentPane().add(camion20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 60, 140));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1143, 650, 140, 40));

        MapaParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mapa Del parqueadero.jpg"))); // NOI18N
        getContentPane().add(MapaParqueadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   // se utliza para cerrar ver mapa
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FormularioMenu formularioMenu;
       formularioMenu = new FormularioMenu();
       formularioMenu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    //se utliza para llamar las funciones formulariomapa
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMapa().setVisible(true);
            }
        });
    }
    //botones y labeles utlizados
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MapaParqueadero;
    private javax.swing.JLabel camion1;
    private javax.swing.JLabel camion10;
    private javax.swing.JLabel camion11;
    private javax.swing.JLabel camion12;
    private javax.swing.JLabel camion13;
    private javax.swing.JLabel camion14;
    private javax.swing.JLabel camion15;
    private javax.swing.JLabel camion16;
    private javax.swing.JLabel camion17;
    private javax.swing.JLabel camion18;
    private javax.swing.JLabel camion19;
    private javax.swing.JLabel camion2;
    private javax.swing.JLabel camion20;
    private javax.swing.JLabel camion3;
    private javax.swing.JLabel camion4;
    private javax.swing.JLabel camion5;
    private javax.swing.JLabel camion6;
    private javax.swing.JLabel camion7;
    private javax.swing.JLabel camion8;
    private javax.swing.JLabel camion9;
    private javax.swing.JLabel carropequeño1;
    private javax.swing.JLabel carropequeño10;
    private javax.swing.JLabel carropequeño11;
    private javax.swing.JLabel carropequeño12;
    private javax.swing.JLabel carropequeño13;
    private javax.swing.JLabel carropequeño14;
    private javax.swing.JLabel carropequeño15;
    private javax.swing.JLabel carropequeño16;
    private javax.swing.JLabel carropequeño17;
    private javax.swing.JLabel carropequeño18;
    private javax.swing.JLabel carropequeño19;
    private javax.swing.JLabel carropequeño2;
    private javax.swing.JLabel carropequeño20;
    private javax.swing.JLabel carropequeño3;
    private javax.swing.JLabel carropequeño4;
    private javax.swing.JLabel carropequeño5;
    private javax.swing.JLabel carropequeño6;
    private javax.swing.JLabel carropequeño7;
    private javax.swing.JLabel carropequeño8;
    private javax.swing.JLabel carropequeño9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel moto1;
    private javax.swing.JLabel moto10;
    private javax.swing.JLabel moto11;
    private javax.swing.JLabel moto12;
    private javax.swing.JLabel moto13;
    private javax.swing.JLabel moto14;
    private javax.swing.JLabel moto15;
    private javax.swing.JLabel moto16;
    private javax.swing.JLabel moto2;
    private javax.swing.JLabel moto3;
    private javax.swing.JLabel moto4;
    private javax.swing.JLabel moto5;
    private javax.swing.JLabel moto6;
    private javax.swing.JLabel moto7;
    private javax.swing.JLabel moto8;
    private javax.swing.JLabel moto9;
    // End of variables declaration//GEN-END:variables
}
