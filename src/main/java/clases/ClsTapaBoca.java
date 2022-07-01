
package clases;

/**
 *
 * @author davidperezarias
 */
public class ClsTapaBoca extends ClsProducto{
    
    
    private String certificado;
    

    public ClsTapaBoca(String certificado, String codigo, String material, String vencimiento, String color, String estado, int precio, double iva) {
        super(codigo, material, vencimiento, color, estado, precio, iva);
        this.certificado = certificado;
    }
    
    
    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
    
    
    
    
   
    
    
}
