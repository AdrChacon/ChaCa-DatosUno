
package plantas;

public class Angiospermas extends Plantas{
    /*
    Aqui se da un ejemplo de herencia, la clase hija Angiospermas tiene todos 
    los metodos de la clase padre Plantas, ademas de otros metodos que son 
    especificos de la clase Angiospermas.
    */
    private int floresCantidad, colorFlores;
    private int frutoCantidad, frutoForma;
    
    public Angiospermas(int FruitShape){
        /*
        Aqui hay otro ejemplo de herencia, la clase Angiospermas hereda los
        atributos de la clase padre Plantas, ademas de utilizar otros atributos
        propios de la clase.
        */
        super(FruitShape);
        floresCantidad = 0;
        frutoCantidad = 0;
        frutoForma = FruitShape;
        colorFlores = 0;
        if (frutoForma  == 0){
            sizeMax = 100;}
        if (frutoForma == 1){
            sizeMax = 2500;}
    }
    public Angiospermas(int FruitShape, int AlturaMax){
        /*
        Este es un ejemplo de sobre-carga, esta sirve para que el usuario pueda
        ingresar la altura maxima a la que una planta puede llegar a crecer.
        */
        super(FruitShape);
        floresCantidad = 0;
        frutoCantidad = 0;
        frutoForma = FruitShape;
        sizeMax = AlturaMax;
    }
    
    public void getFormaFruto(){
        // Metodo, para ver la forma que tienen los frutos de la planta.
        if(frutoForma == 0){
            System.out.println("La fruta de la planta es pequeña, está envuelta en una cascara negra.");
                    }
        if(frutoForma == 1){
            System.out.println("El fruto de la planta es grande, esferico, de color naranja.");
        }
    }
    public void getFormaHojas(){
        // Metodo, para ver la forma que tienen las hojas de la planta.
        if(hojasForma == 0){
            System.out.println("La hoja de la planta es grande, de forma triangular.");
        }
        if(hojasForma == 1){
            System.out.println("La hoja de la planta es pequeña, de forma ovalada.");
        }
    }
    public void getColorFlores(){
        // Metodo, para ver el color que tienen las flores de la planta.
        if(frutoForma == 0){
            System.out.println("El color de la flor es amarillo.");
        }
        if(frutoForma == 1){
            System.out.println("El color de la flor es blanco.");
        }
    }
    public void getCantidadFlores(){
        // Metodo, para ver la cantidad de flores que tiene la planta
        System.out.println("La cantidad de flores de la planta es: " + floresCantidad);
    }
    
    public void crecer(int Crecimiento){
        /*
        Aqui hay un ejemplo de sobre-escritura y polimorfismo, el metodo crecer
        ya existia en la clase padre Plantas, sin embargo, el metodo crecer de
        la clase Angiospermas la modifica para que sirva especificamente para
        plantas angiospermas, de esta forma, esta sigue siendo una planta, pero
        es una planta angiosperma.
        */
        if(size < sizeMax){
        hojasCantidad = hojasCantidad + (size * 2);
        size = size + Crecimiento;
        if(estado == 1){
            if(size > (sizeMax * 1/4)){
                estado = 2;
                frutoCantidad = frutoCantidad + (size / 4);
            }
        }
        if(estado == 2){
            if(size > (sizeMax * 2/4)){
                estado = 3;
                frutoCantidad = frutoCantidad + (size / 2);
            }
        }
        if(estado == 3){
            if(size > (sizeMax * 3/4)){
                estado = 4;
                frutoCantidad = frutoCantidad + (size);
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
        Plantas, pero en la clase Angiospermas esta escrito especificamente para
        que funcione con las plantas angiospermas.
        */
        plantaCantidad = plantaCantidad + 1;
        floresCantidad = floresCantidad + 2;
        System.out.println("Se ha dado una reproduccion de planta angiosperma, la cantidad de flores es: " + floresCantidad);
    }
}
