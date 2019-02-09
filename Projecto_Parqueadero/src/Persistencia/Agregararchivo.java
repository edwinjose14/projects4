package Persistencia;
import java.io.*;
import java.util.ArrayList;
import Modelo.*;

public class Agregararchivo{
//declarar archivos
  private File archivo; 
  private FileInputStream  aEsc;
  private FileOutputStream aLec;
  // array list para agregar los registrados
  public void agregarRegistrada(ArrayList<Registrado> registradoses){
    archivo = new File("persona.bin");  
    ObjectOutputStream escritor = null;
    //uso de try catch para verificar que escriba en el archivo
    try{      
        escritor = new ObjectOutputStream(new FileOutputStream(archivo));
        escritor.writeObject(registradoses);
    }catch(IOException ex){}
    
    finally{
    //si el escrito es direferente de null osea que el archivo sea correcto ;
   // el archivo se cierra si no manda una excepcion por medio de un try catch
    try{
        if(escritor != null){
            escritor.close();
                }
    }catch(IOException e){
            }
        }
    }
  //array list para recorrer los registrado y usar el archivo"persona.bin"
  //ademas un uso de try catch para cmprobar que leyo bien el archivo
  //sino manda excepcion
  public ArrayList<Registrado> getRegistrado(){
      archivo = new File("persona.bin"); 
    ArrayList<Registrado> listaPersona = new ArrayList<>();
    ObjectInputStream lector = null;
    try{
    lector = new ObjectInputStream(new FileInputStream(archivo));
    listaPersona = (ArrayList<Registrado>) lector.readObject();
    }catch(Exception ex){
            System.out.println(ex);
        }
    finally{
    try{
    if(lector != null){
       lector.close();
                }
    }catch(Exception e){
     }
    }
    return listaPersona;
    }
  //se agrega un registro de salida para el archivo se crea un archivo nuevo llamada personasalida.bin
 //tambien se crea un array list para recorrer el archivo
  //se hace un try cacth para verificar que el archivo haya sido leido
  public void agregarRegistrodoSalido(ArrayList<Registrado>registradoses ){
      archivo = new File("personaSalida.bin"); 
    ObjectOutputStream escritor = null;
    try{
    escritor = new ObjectOutputStream(new FileOutputStream(archivo));
    escritor.writeObject(registradoses);
    }catch(IOException ex){}
    finally{
    try{
    if(escritor != null){
        escritor.close();
                }
    }catch(IOException e){
            }
        }
    }
  //se recorre por medio de una array list el archivo personalsalida se hace un try catch
  //para comprobar el lector del archivo
  public ArrayList<Registrado>getRegistradosalido(){
      archivo = new File("personaSalida.bin"); 
    ArrayList<Registrado> listaPersona = new ArrayList<>();
    ObjectInputStream lector = null;
    try{
    lector = new ObjectInputStream(new FileInputStream(archivo));
    listaPersona = (ArrayList<Registrado>) lector.readObject();
    }catch(Exception ex){
            System.out.println(ex);
        }
    finally{
    try{
    if(lector != null){
       lector.close();
                }
    }catch(Exception e){
     }
    }
    return listaPersona;
    }
  //lee el archivo y usar un try cacth para comprobacion
  public Object leerObjeto(String archivo){
      
        Object objeto = new Object();
        ObjectInputStream lector = null;
        try {
            lector = new ObjectInputStream(new FileInputStream(archivo));
            objeto =  lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {
            }
        }
        return objeto;
    }
}
