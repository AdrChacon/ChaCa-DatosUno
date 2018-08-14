
package plantas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    Angiospermas Girasol = null;
    Angiospermas Naranjo;
    Gimnospermas Pino;
    Gimnospermas Tejo = null;
    int PlantType = 0;
    System.out.println("Menu principal");
    System.out.println("1.- Plantar una angiosperma.");
    System.out.println("2.- Plantar una gimnosperma.");
    int Opcion = entrada.nextInt();
    if(Opcion == 1){
        System.out.println("Ingrese la planta angiosperma que quiere plantar.");
        System.out.println("1.- Girasol.");
        System.out.println("2.- Naranjo.(No usar)");
        int Planta = entrada.nextInt();
        if(Planta == 1){
            PlantType = 1;
            System.out.println("Ingrese si desea elegir la altura de la planta.");
            System.out.println("1.- Al azar");
            System.out.println("2.- Elegir");
            int Azar = entrada.nextInt();
            if(Azar == 1){
                Girasol = new Angiospermas(0);
                /*
                Aqui hay un ejemplo de instancia, aqui se define Girasol como un
                objeto especifico de la clase Angiospermas, este tiene los atributos
                que tiene la clase Angiospermas.
                */
                System.out.println("Se ha plantado un girasol.");}
            if(Azar == 2){
                System.out.println("Ingrese la altura maxima en centimetros de la planta.");
                int Altura = entrada.nextInt();
                Girasol = new Angiospermas(0, Altura);
                System.out.println("Se ha plantado un girasol.");
            }
        }
        
    }
    if(Opcion == 2){
        System.out.println("Ingrese la planta gimnosperma que quiere plantar.");
        System.out.println("1.- Pino.(No usar)");
        System.out.println("2.- Tejo.");
        int Planta = entrada.nextInt();
        if(Planta == 2){
            PlantType = 2;
            System.out.println("Ingrese si desea elegir la altura de la planta.");
            System.out.println("1.- Al azar");
            System.out.println("2.- Elegir");
            int Azar = entrada.nextInt();
            if(Azar == 1){
                Tejo = new Gimnospermas(1);
                System.out.println("Se ha plantado un tejo.");
            }
            if(Azar == 2){
                System.out.println("Ingrese la altura maxima en centimetros de la planta.");
                int Altura = entrada.nextInt();
                Tejo = new Gimnospermas(1, Altura);
            }
        }
    }
    
   /**/
   boolean Inicio = true;
   while(Inicio){
       System.out.println("  ");
       System.out.println("  ");
       System.out.println("  ");
       if(PlantType == 1){
            Girasol.getFase();
            Girasol.getAgua();
            Girasol.getEnergia();
            Girasol.getCantidadPlantas();
            System.out.println("Que desea hacer?");
            System.out.println("1.- Crecer.");
            System.out.println("2.- Alimentar");
            System.out.println("3.- Reproducir");
            System.out.println("4.- Ver Especificaciones.");
            int Orden = entrada.nextInt();
            if(Orden == 1){
                Girasol.crecer(15);
            }
            if(Orden == 2){
                Girasol.fotosintesis();
                Girasol.nutrientes();
            }
            if(Orden == 3){
                Girasol.reproduccion();
            
            }
            if(Orden == 4){
                Girasol.getCantidadFlores();
                Girasol.getColorFlores();
                Girasol.getSize();
                Girasol.getCantidadHojas();
                Girasol.getFormaHojas();
                Girasol.getFormaFruto();
            
            }
       }
       if(PlantType == 2){
           Tejo.getFase();
           Tejo.getAgua();
           Tejo.getEnergia();
           Tejo.getCantidadPlantas();
           System.out.println("Que desea hacer?");
           System.out.println("1.- Crecer.");
           System.out.println("2.- Alimentar");
           System.out.println("3.- Reproducir");
           System.out.println("4.- Ver Especificaciones.");
           int Orden = entrada.nextInt();
           if(Orden == 1){
               Tejo.crecer(100);
           }
           if(Orden == 2){
               Tejo.fotosintesis();
               Tejo.nutrientes();
           }
           if(Orden == 3){
               Tejo.reproduccion();
           }
           if(Orden == 4){
               Tejo.getCantidadConos();
               Tejo.getFormaConos();
               Tejo.getformaArbol();
               Tejo.getSize();
               Tejo.getCantidadHojas();
           }
       }
   }
   
    }
    
    }

