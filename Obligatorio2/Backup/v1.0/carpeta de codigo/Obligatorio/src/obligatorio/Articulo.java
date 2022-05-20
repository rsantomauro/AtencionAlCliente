package obligatorio;

/**
 *
 * @author Rodrigo Andre Santomauro Lema (199089)
 */
public class Articulo {
    private String descripcion;
    private long codigoDeBarras;
    private int rubro;
    private double precioDeReferencia;
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setDescripcion(String unaDescripcion){
        this.descripcion = unaDescripcion;
    }
    
    public long getCodigoDeBarras(){
        return this.codigoDeBarras;
    }
    
    public void setCodigoDeBarras(long unCodigoDeBarras){
        this.codigoDeBarras = unCodigoDeBarras;
    }
    
    public int getRubro(){
        return this.rubro;
    }
    
    public void setRubro(int unRubro){
        this.rubro = unRubro;
    }
    
    public double getPrecioDeReferencia(){
        return this.precioDeReferencia;
    }
    
    public void setPrecioDeReferencia(double unPrecioDeReferencia){
        this.precioDeReferencia = unPrecioDeReferencia;
    }
    @Override
    public String toString(){
        return "Descripcion: " + this.descripcion +"\nCodigo de Barras: " + this.codigoDeBarras + "\nRubro: " + this.rubro + "\nPrecio de referencia: " + this.precioDeReferencia + "\n";
    }
}
