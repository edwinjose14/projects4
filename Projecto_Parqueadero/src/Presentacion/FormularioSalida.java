package Presentacion;

import Modelo.Registrado;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormularioSalida extends javax.swing.JFrame {
    ArrayList<Registrado>listaauAutomovilsalida;
    ArrayList<Registrado>listapersonasalida;
    String persanasalida="personasalida.bin";
    public FormularioSalida() {
        initComponents();
        llenartbla();
    }
   private void llenartbla(){
    try{
        DefaultTableModel modelo;
    listapersonasalida =(ArrayList<Registrado>) new Persistencia.Agregararchivo().leerObjeto(persanasalida);
    modelo=new DefaultTableModel();
     String[] columnas={"Cedula","Placa","Celular","Nombre y apellido"
            ,"Tipo de vehiculo","Hora entrada","Hora salida"};
    modelo.setColumnIdentifiers(columnas);
    for(Registrado registrados:listapersonasalida){
        String[] filas= new String[columnas.length];
        filas[0]= String.valueOf(registrados.getDocumento());
        filas[1]=registrados.getPlaca();
        filas[2]=String.valueOf(registrados.getCelular());
        filas[3]= registrados.getNombreApellido();
        filas[4]= registrados.getTipo();
        filas[5]= String.valueOf(registrados.getHoraentrada());
        filas[6]= String.valueOf(registrados.getHorasalida());
        modelo.addRow(filas);  
    }
    TablaPersona.setModel(modelo);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"No hay personal registrado","Vacio", HEIGHT);
    }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPersona = new javax.swing.JTable();
        botoncerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaPersona.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaPersona);

        botoncerrar.setText("Cerrar");
        botoncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(botoncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(botoncerrar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncerrarActionPerformed
       FormularioMenu formularioMenu;
       formularioMenu= new FormularioMenu();
       formularioMenu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_botoncerrarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPersona;
    private javax.swing.JButton botoncerrar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
