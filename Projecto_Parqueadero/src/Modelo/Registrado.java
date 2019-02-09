
package Modelo;
import java.io.Serializable;
public class Registrado implements Serializable {
    
    //defino atributos
    private String placa;
    private String tipo;
    private int propietario;
    private int Horaentrada;
    private int horasalida;
    private int documento;
    private int celular;
    private String nombreApellido;
    private String puesto;
//getter y setter
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public Registrado() {
    }
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }

    public int getHoraentrada() {
        return Horaentrada;
    }

    public void setHoraentrada(int Horaentrada) {
        this.Horaentrada = Horaentrada;
    }

    public int getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(int horasalida) {
        this.horasalida = horasalida;
    }
    
}
