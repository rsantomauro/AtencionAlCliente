
package obligatorio;

/**
 *
 * @author Rodrigo Andre Santomauro Lema (199089)
 */
public class Oferta {
    private Local local;
    private Articulo articulo;
    private String textoDescriptivo;
    private int valor;
    private int mesDeVigencia;
    
    public Local getLocal(){
        return local;
    }
    
    public void setLocal(Local unLocal){
        this.local = unLocal;
    }
    
    public Articulo getArticulo(){
        return articulo;
    }
    
    public void setArticulo(Articulo unArticulo){
        this.articulo = unArticulo;
    }
    
    public String getTextoDescriptivo(){
        return textoDescriptivo;
    }
    
    public void setTextoDescriptivo(String unTextoDescriptivo){
        this.textoDescriptivo = unTextoDescriptivo;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int unValor){
        this.valor = unValor;
    }
    
    public int getMesDeVigencia(){
        return mesDeVigencia;
    }
    
    public void setMesDeVigencia(int unMesDeVigencia){
        this.mesDeVigencia = unMesDeVigencia;
    }
    
    @Override
    public String toString(){
        return "El local es: " + this.local + "\nEl articulo es: " + this.articulo + "\nDescripcion: " + this.textoDescriptivo + "\nSu valor es: " + this.valor + "\nSu mes de vigencia es: " + this.mesDeVigencia + "\n";
    }   
}
