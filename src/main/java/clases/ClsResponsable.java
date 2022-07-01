
package clases;

import interfaces.*;

/**
 *
 * @author davidperezarias
 */
public class ClsResponsable implements IEmpleado {
    
    String id;
    String nombre;
    String cargo;
    String telefono;
    String correo;

    public ClsResponsable(String id, String nombre, String cargo, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public double CalcularSalario() {
       return 0;
    }

    @Override
    public void Renunciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
    
    
}
