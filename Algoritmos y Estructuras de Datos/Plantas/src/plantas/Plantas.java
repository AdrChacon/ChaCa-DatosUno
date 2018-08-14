
package plantas;
/*
Aqui se indica el uso de clases, la clase planta define los atributos y metodos
generales que las plantas creadas utilizando la clase van a tener.
*/
public class Plantas {
    /*
    Aqui se ejemplifica el uso de encapsulacion, de esta forma se esconden
    estas variables de objetos que no sean hijas de la clase planta
    */
    protected int energia, energiaNeed;
    protected int agua, aguaNeed, aguaMax;
    protected int size;
    protected int sizeMax;
    protected int hojasCantidad;
    protected int estado;
    protected int plantaCantidad;
    protected int hojasForma;
    
    
    public Plantas(int LeafShape){
        /* 
        Aqui se aplica la abstraccion, es una forma general de ver las
        caracteristicas generales de las plantas, ejemplo, aguaMax es una 
        forma de definir la cantidad de agua que una planta necesita, todas las
        plantas necesitan agua, pero demasiada agua puede causar que la planta
        se "ahogue".
        
        Aqui tambien se muestra el uso de atributos al asignar variables al
        objeto planta, que luego serviran como los datos del objeto.
        */
        energia = 0;
        agua = 0;
        energiaNeed = 100;
        aguaNeed = 50;
        aguaMax = 100;
        estado = 1;
        size = 5;
        hojasCantidad = 0;
        plantaCantidad = 1;
        hojasForma = LeafShape;
        }
    
    public void fotosintesis(){
        /*
        Esto es un ejemplo de un metodo, es una accion de la clase planta que
        produce cambios en los atributos del objeto.
        */
        energia = energia + 25;
    }
    
    public void getEnergia(){
        /*
        Esto es un metodo, sirve para ver la energia y la energia necesaria de
        la planta.
        */
        System.out.println("La energia actual de la planta es: " + energia);
        System.out.println("Energia necesaria para crecer: " + energiaNeed);
    }
    
    public void getCantidadPlantas(){
        System.out.println("La cantidad de plantas es: " + plantaCantidad);
    }
    
    public void nutrientes(){
        /*
        Esto es un ejemplo de un metodo, es una accion de la clase planta que
        produce cambios en los atributos del objeto.
        */
        agua = agua + 25;
    }
    
    public void getAgua(){
        /*
        Esto es un metodo, sirve para ver el agua y el agua necesaria de la 
        planta.
        */
        System.out.println("El agua actual de la planta es: " + agua);
        System.out.println("Cantidad necesaria para crecer: " + aguaNeed);
    }
    
    public void crecer(int Crecimiento){
        /*
        Este es un metodo, sirve para modificar la altura actual y la cantidad
        de hojas de la planta.
        */
        if(size < sizeMax){
        hojasCantidad = hojasCantidad + (size * 2);
        size = size + Crecimiento;
        if (size > sizeMax){
            size = sizeMax;
            }
        }
        
    }
    
    public void getCantidadHojas(){
        // Metodo, sirve para ver la cantidad de hojas que tiene una planta.
        System.out.println("La cantidad de hojas de la planta es: " + hojasCantidad);
    }
    
    public void getSize(){
        // Metodo, para ver la altura actual de la planta.
        System.out.println("El tamaño actual de la planta es: " + size + " cm");
    }
    
    public void cambioFase(){
        /*
        Esto es un ejemplo de abstraccion, este metodo sirve para indicar que la
        planta ha entrado a otro estado de madurez cuando ha llegado a cierta
        altura.
        */
        estado = estado + 1;
    }
    
    public void getFase(){
        // Metodo, sirve para ver el estado actual de la planta.
        if(estado == 1){
            System.out.println("La planta es un brote.");
        }
        if(estado == 2){
            System.out.println("La planta es una planta joven.");
        }
        if(estado == 3){
            System.out.println("La planta esta en una etapa de crecimiento.");
        }
        if(estado == 4){
            System.out.println("La planta ha crecido completamente.");
        }
        if(estado == 5){
            System.out.println("La planta ha muerto.");
        }
    }
    
    public void reproduccion(){
        /* 
        Metodo, sirve para "reproducir" una planta, realiza cambios en el
        atributo que indica la cantidad de plantas actuales.
        */
        plantaCantidad = plantaCantidad + 1*plantaCantidad;
    }
    
    
    
    
    
}
