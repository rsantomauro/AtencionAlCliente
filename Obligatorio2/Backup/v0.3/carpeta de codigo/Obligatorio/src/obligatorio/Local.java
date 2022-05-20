package obligatorio;


import java.util.*;
/**
 *
 * @author Rodrigo Andre Santomauro Lema (199089)
 */
public class Local {
    private String nombre;
    private String tipo;
    private String direccion;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String unTipo){
        this.tipo = unTipo;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String unaDireccion){
        this.direccion = unaDireccion;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\nTipo: " + this.tipo + "\nDireccion: " + this.direccion + "\n";
    }
}
