
package clases;

import interfaces.*;

/**
 *
 * @author davidperezarias
 */
public class ClsResponsable implements IEmpleado {
    
    private String id;
    private String nombre;
    private String cargo;
    private String telefono;
    private String correo;

    public ClsResponsable(String id, String nombre, String cargo, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public double CalcularSalario(String tipo) {
       return 0;
    }

    @Override
    public void Renunciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    


    
    
    
}
