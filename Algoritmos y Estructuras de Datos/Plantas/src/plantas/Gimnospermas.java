
package plantas;

public class Gimnospermas extends Plantas{
    /*
    Aqui se da un ejemplo de herencia, la clase hija Gimnospermas tiene todos 
    los metodos de la clase padre Plantas, ademas de otros metodos que son 
    especificos de la clase Gimnospermas.
    */
    private int conosCantidad, conosForma;
    private int formaArbol;
    
    public Gimnospermas(int ConeShape){
        /*
        Aqui hay otro ejemplo de herencia, la clase Gimnospermas hereda los
        atributos de la clase padre Plantas, ademas de utilizar otros atributos
        propios de la clase.
        */
        super(ConeShape);
        conosCantidad = 0;
        conosForma = ConeShape;
        formaArbol = ConeShape;
        sizeMax = 2500;
    }
    public Gimnospermas(int ConeShape, int AlturaMax){
        /*
        Este es un ejemplo de sobre-carga, esta sirve para que el usuario pueda
        ingresar la altura maxima a la que una planta puede llegar a crecer.
        */
        super(ConeShape);
        conosCantidad = 0;
        conosForma = ConeShape;
        formaArbol = ConeShape;
        sizeMax = AlturaMax;
    }
    
    public void getFormaConos(){
        // Metodo, para ver la forma de los conos de la planta.
        if(conosForma == 0){
            System.out.println("Los conos son pequeños, de forma ovalada");
        }
        if(conosForma == 1){
            System.out.println("Los conos son pequeños, envueltos por un cascarón rojo parecido a una fruta.");
        }
    }
    public void getCantidadConos(){
        // Metodo, para ver la cantidad de conos de la planta.
        System.out.println("La cantidad actual de conos de la planta es de: " + conosCantidad);
    }
    public void getformaArbol(){
        // Metodo, para ver la forma del arbol.
        if(formaArbol == 0){
            System.out.println("La forma del arbol es piramidal.");
        }
        if(formaArbol == 1){
            System.out.println("La forma del arbol es coronada.");
        }
    }
    
    public void crecer(int Crecimiento){
        /*
        Aqui hay un ejemplo de sobre-escritura y polimorfismo, el metodo crecer
        ya existia en la clase padre Plantas, sin embargo, el metodo crecer de
        la clase Gimnospermas la modifica para que sirva especificamente para
        plantas gimnospermas, de esta forma, esta sigue siendo una planta, pero
        es una planta gimnosperma.
        */
        if(size < sizeMax){
        hojasCantidad = hojasCantidad + (size * 2);
        size = size + Crecimiento;
        if(estado == 1){
            if(size > (sizeMax * 1/4)){
                estado = 2;
                conosCantidad = conosCantidad + (size / 4);
            }
        }
        if(estado == 2){
            if(size > (sizeMax * 2/4)){
                estado = 3;
                conosCantidad = conosCantidad + (size / 2);
            }
        }
        if(estado == 3){
            if(size > (sizeMax * 3/4)){
                estado = 4;
                conosCantidad = conosCantidad + (size);
            }
        }
        if (size > sizeMax){
            size = sizeMax;
            }
        }
        
    }
    
    public void reproduccion(){
        /*
        Este es otro ejemplo de sobre-carga, este metodo ya existia en la clase
        Plantas, pero en la clase Gimnospermas esta escrito especificamente para
        que funcione con las plantas gimnospermas.
        */
        plantaCantidad = plantaCantidad + (conosCantidad / 2);
        System.out.println("Se ha dado una reproduccion de una planta gimnosperma, la cantidad de conos ahora es de: " + conosCantidad);
    }
}
