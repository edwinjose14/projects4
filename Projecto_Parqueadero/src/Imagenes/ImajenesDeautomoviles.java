package Imagenes;
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class ImajenesDeautomoviles {
    ImageIcon asignaturas;        
   String[] Ruta={"/Imajenes/"};
   String[] Iconos = {"Bueno.png","Malo.png","flecha.png"};
   public void RespuestaBuena(Graphics c){
   asignaturas = new ImageIcon(new ImageIcon(getClass().getResource(Ruta[1]+Iconos[0])).getImage());
   c.drawImage(asignaturas.getImage(), 0, 0, 37,37,null);
   }
   public void RespuestaMala(Graphics c){
   asignaturas = new ImageIcon(new ImageIcon(getClass().getResource(Ruta[1]+Iconos[1])).getImage());
   c.drawImage(asignaturas.getImage(), 0, 0, 37,37,null);
   }
   public void Fleha(Graphics c){
   asignaturas = new ImageIcon(new ImageIcon(getClass().getResource(Ruta[1]+Iconos[2])).getImage());
   c.drawImage(asignaturas.getImage(), 0, 0, 37,37,null);
   }
}