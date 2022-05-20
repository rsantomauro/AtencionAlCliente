package obligatorio;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Andre Santomauro Lema (199089)
 */
public class Prueba {

    public static void main(String[] args) {
        //INGRESOS
        Local local1 = Prueba.crearLocal(); //Se ingresa un local
        Articulo articulo1 = Prueba.crearArticulo(); //Se ingresa un articulo
               
        MenuPrincipal(local1,articulo1);
    }
    
    public static Local crearLocal(){
        Scanner in = new Scanner(System.in);
        String nombre;
        String tipo="Otro";
        String direccion;
        boolean correcto = false;
        
        do{
        System.out.println("Ingresar nombre del local: ");
        nombre=in.nextLine();
        }while(nombre.length() < 1);
        
        int opcion;
        System.out.println("Ingrese el tipo de local: ");
        
        do {            
            System.out.println("1- Almacen");
            System.out.println("2- Supermercado");
            System.out.println("3- Hipermercado");
            System.out.println("4- Kiosco");
            System.out.println("5- Otro");
            opcion = in.nextInt();
               
            switch(opcion)
            {
                case 1:
                    tipo= "1- Almacen";
                    correcto=true;
                    break;
                case 2:
                    tipo= "2- Supermercado";
                    correcto=true;
                    break;
                case 3:
                    tipo= "3- Hipermercado";
                    correcto=true;
                    break;
                case 4:
                    tipo= "4- Kiosco";
                    correcto=true;
                    break;
                case 5:
                    tipo= "5- Otro";
                    correcto=true;
                    break;
                default:
                        System.out.println("Opcion no es correcta. Reintente");
                    break;
            }
        }
        while (!correcto);
        in.nextLine();
        
        do{
        System.out.println("Ingresar la direccion del local: ");
        direccion=in.nextLine();
        }while(nombre.length() < 1);
        
        Local local1 = new Local();
        local1.setNombre(nombre);
        local1.setTipo(tipo);
        local1.setDireccion(direccion);
        
        return local1;
    }
    
    public static Articulo crearArticulo(){
        Scanner in = new Scanner(System.in);
        String descripcion;
        String rubro="";
        long codigoDeBarras;
        double precioDeReferencia;
        
        do{
            System.out.println("Ingrese la descripcion del articulo: ");
            descripcion = in.nextLine();
        }while(descripcion.length() < 1);
        
        do{
        System.out.println("Ingrese el codigo de barras del articulo: ");
        codigoDeBarras = in.nextLong();
        }while(codigoDeBarras < 1);
        
        int opcion;
        System.out.println("Ingrese el rubro del articulo: ");
        do {            
            System.out.println("1- Congelado");
            System.out.println("2- Bebida sin alcohol");
            System.out.println("3- Bebida con alcohol");
            System.out.println("4- Fruta/Verdura");
            System.out.println("5- Alimento");
            System.out.println("6- Producto para bebes");
            System.out.println("7- Limpieza");
            System.out.println("8- Otro");
            opcion = in.nextInt();
               
            switch(opcion)
            {
                case 1:
                    rubro= "1- Congelado";
                    break;
                case 2:
                    rubro= "2- Bebida sin alcohol";
                    break;
                case 3:
                    rubro= "3- Bebida con alcohol";
                    break;
                case 4:
                    rubro= "4- Fruta/Verdura";
                    break;
                case 5:
                    rubro= "5- Alimento";
                    break;
                case 6:
                    rubro= "6- Producto para bebes";
                    break;
                case 7:
                    rubro= "7- Limpieza";
                    break;
                case 8:
                    rubro= "8- Otro";
                    break;
                default:
                        System.out.println("Opcion no es correcta. Reintente");
                    break;
            }
        }
        while ((opcion<1) || (opcion>8));
        
        in.nextLine();        
        do{
            System.out.println("Ingresa el precio de referencia del articulo: ");
            precioDeReferencia = in.nextInt();
        }while(precioDeReferencia < 1);
        
        Articulo articulo1 = new Articulo();
        articulo1.setDescripcion(descripcion);
        articulo1.setCodigoDeBarras(codigoDeBarras);
        articulo1.setRubro(rubro);
        articulo1.setPrecioDeReferencia(precioDeReferencia);
        
        return articulo1;
    }
    
    public static Oferta crearOferta(Local local1, Articulo articulo1){
        Scanner in = new Scanner(System.in);
        String textoDescriptivo="";
        int valor;
        int mesDeVigencia;
        int opcion;
        boolean correcto = false;
        
        System.out.println("Ingrese el texto descriptivo: ");
        do {            
            System.out.println("1- Voucher");
            System.out.println("2- Efectivo");
            System.out.println("3- Tarjeta");
            opcion = in.nextInt();
               
            switch(opcion)
            {
                case 1:
                    textoDescriptivo= "Voucher";
                    correcto=true;
                    break;
                case 2:
                    textoDescriptivo= "Efectivo";
                    correcto=true;
                    break;
                case 3:
                    textoDescriptivo= "Tarjeta";
                    correcto=true;
                    break;
                default:
                        System.out.println("Opcion no es correcta. Reintente");
                    break;
            }
        }
        while (!correcto);
        
        do{
            System.out.println("Ingrese el valor de la oferta: ");
            valor = in.nextInt();
        }while(valor < 1);
        
        System.out.println("Ingrese el mes de vigencia: ");
        mesDeVigencia = in.nextInt();
        while ((mesDeVigencia<1)||(mesDeVigencia>12))
        {
            System.out.println("La opcion es invalida, ingresar nuevamente.");
            mesDeVigencia = in.nextInt();
        }
        
        Oferta oferta = new Oferta();
        oferta.setLocal(local1);
        oferta.setArticulo(articulo1);
        oferta.setTextoDescriptivo(textoDescriptivo);
        oferta.setValor(valor);
        oferta.setMesDeVigencia(mesDeVigencia);
        
        return oferta;
    }
    
    public static void MenuPrincipal(Local local1, Articulo articulo1){
        Scanner in = new Scanner(System.in);
        int opcion;
        String direccion;
        System.out.println("Menu principal, elija una opcion:");
        
        do {            
            System.out.println("1- Actualizar el precio del producto");
            System.out.println("2- Actualizacion del local");
            System.out.println("3- Ingresar 3 ofertas");
            System.out.println("4- Terminar");
            opcion = in.nextInt();
            in.nextLine();
               
            switch(opcion)
            {
                case 1:
                    CambiarPrecioReferencia(articulo1);
                    MenuPrincipal(local1, articulo1);
                    break;
                case 2:
                    do{
                        System.out.println("Ingrese la nueva direccion del local");//Cambiar la direccion para un local
                        direccion=in.nextLine();
                    }while(direccion.length() < 1);
                    
                    local1.setDireccion(direccion);
                    MenuPrincipal(local1, articulo1);
                    break;
                case 3:
                    System.out.println("Ingrese la primera oferta: ");
                    Oferta oferta1 = Prueba.crearOferta(local1,articulo1); //Se ingresa una oferta
                    System.out.println("Ingrese la segunda oferta: ");
                    Oferta oferta2 = Prueba.crearOferta(local1,articulo1); //Se ingresa una oferta
                    System.out.println("Ingrese la tercera oferta: ");
                    Oferta oferta3 = Prueba.crearOferta(local1,articulo1); //Se ingresa una oferta
                    
                    menuOpcion3(local1,articulo1, oferta1, oferta2, oferta3);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no es correcta. Reintente");
                    break;
            }
        }
        while ((opcion<1) || (opcion>4));
        
    }
    
    public static void CambiarPrecioReferencia(Articulo articulo1){
        Scanner in = new Scanner(System.in);
        double nuevoPrecioDeReferencia;
        double PrecioDeReferencia;
        
        do{
            System.out.println("Agregue el nuevo valor de articulo"); //En el caso de que sea solo un articulo, sino crear metodo
            nuevoPrecioDeReferencia=in.nextDouble();
        }while(nuevoPrecioDeReferencia < 0.09);
        PrecioDeReferencia = articulo1.getPrecioDeReferencia();
        
        articulo1.setPrecioDeReferencia(nuevoPrecioDeReferencia); //Guardo el nuevo precio
        
        if (PrecioDeReferencia == nuevoPrecioDeReferencia){
            System.out.println("El precio de referencia ingresado es igual al anterior.");
        }
        else if (nuevoPrecioDeReferencia < PrecioDeReferencia){
            System.out.println("El precio de referencia es menor al anterior");
        }
        else
        {
            System.out.println("El precio de refencia es mayor al anterior");
        }
    }
    
    public static void menuOpcion3(Local local1, Articulo articulo1, Oferta oferta1, Oferta oferta2, Oferta oferta3){
        Scanner in = new Scanner(System.in);
        String opcion;
        boolean correcto = false;
        
        System.out.println("Submenu- elija la opcion que desee: ");
        
        do {            
            System.out.println("a- Consulta de articulo");
            System.out.println("b- Consulta de precio promedio");
            System.out.println("c- Consulta de infraccion");
            System.out.println("d- Volver al menu principal");
            opcion = in.nextLine();
            
            switch(opcion)
            {
                case "a":
                    RangoDePrecios(oferta1,oferta2,oferta3);
                    menuOpcion3(local1,articulo1, oferta1, oferta2, oferta3);
                    correcto = true;
                    break;
                case "b":
                    PromedioDeOfertas(oferta1,oferta2,oferta3);
                    menuOpcion3(local1,articulo1, oferta1, oferta2, oferta3);
                    correcto = true;
                    break;
                case "c":
                    VerificarInfraccion(articulo1, oferta1, oferta2, oferta3);
                    menuOpcion3(local1,articulo1, oferta1, oferta2, oferta3);
                    correcto = true;
                    break;
                case "d":
                    MenuPrincipal(local1, articulo1);
                    correcto = true;
                    break;
                default:
                    if((opcion.length() > 1) || (opcion.length() == 0))
                    {
                        System.out.println("Opcion no es correcta. Reintente");
                    }
                    System.out.println("Opcion no es correcta. Reintente");
                    break;
            }
        }
        while (!correcto);
    }
    
    public static void RangoDePrecios(Oferta oferta1,Oferta oferta2,Oferta oferta3){
        int valor1, valor2, valor3, maximo, minimo;
        valor1 = oferta1.getValor();
        valor2 = oferta2.getValor();//Esta tres revisar si no son double
        valor3 = oferta3.getValor();
        
        maximo = Math.max(valor1, valor2);
        maximo = Math.max(maximo, valor3);
        
        minimo = Math.min(valor1, valor2);
        minimo = Math.min(minimo, valor3);
        
        System.out.println("El rango de los valores son: " + minimo + " - " + maximo);
    }
    
    public static void PromedioDeOfertas(Oferta oferta1, Oferta oferta2, Oferta oferta3){ //Si, tendria que estar en oferta
        int valor1, valor2, valor3;//Esta tres revisar si no son double
        double promedio;
        valor1 = oferta1.getValor();
        valor2 = oferta2.getValor();//Esta tres revisar si no son double
        valor3 = oferta3.getValor();
        
        promedio=((valor1+valor2+valor3)/3);
        
        System.out.println("El promedio es: " + promedio);
    }
    
    public static void VerificarInfraccion(Articulo articulo1, Oferta oferta1, Oferta oferta2, Oferta oferta3){
        int valor1, valor2, valor3;//Esta tres revisar si no son double
        double precioPromedio;
        boolean existe = false;
        valor1 = oferta1.getValor();
        valor2 = oferta2.getValor();//Esta tres revisar si no son double
        valor3 = oferta3.getValor();
        precioPromedio = articulo1.getPrecioDeReferencia();
        
        if ((valor1 / 2) > precioPromedio){
            System.out.println("DATOS DE OFERTA EN INFRACCION:\n" + oferta1.toString());
            existe = true;
        }
        
        if ((valor2 / 2) > precioPromedio){
            System.out.println("DATOS DE OFERTA EN INFRACCION:\n" + oferta2.toString());
            existe = true;
        }
        
        if ((valor3 / 2) > precioPromedio){
            System.out.println("DATOS DE OFERTA EN INFRACCION:\n" + oferta3.toString());
            existe = true;
        }
        
        if (!existe){
            System.out.println("No existe infraccion.");
        }
    }
}