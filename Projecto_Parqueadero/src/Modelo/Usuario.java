package Modelo;
public class Usuario {
//ATRIBUTOS 
    private String name, clave;

    //Getter y Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    /*Implementacion del metodo Validar usuario
    aqui se compara el usuario definido con el usuario introducido
    si la clave introducida es igual ala establecida retorna un 0
    si no un 2 y sino un 1 lo que se hace en este metodo es comparar
      */ 
public int validarUsuario(String n, String c){
        if(this.getName().equals(n)){
            if(this.getClave().equals(c)){
                return 0;
            }
            else{
                return 2;
            }
        }
        else{
            return 1;
        }
    }
}

