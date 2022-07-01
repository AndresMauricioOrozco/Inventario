package abstractas;

/**
 *
 * @author davidperezarias
 */
public abstract class AbsFondoAhorro {
    
    double cuenta;
    
    
    public abstract double ingresarAhorro();
    
    public abstract double retirarDinero();
    
    
    public double obtenerValorCuenta(){
        return this.cuenta;
    }
    
}
