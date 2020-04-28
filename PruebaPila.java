
package EjercicioPilas;

import java.util.Random;


public class PruebaPila {
    
    public static void main(String args[]){
    
    Random gen = new Random();
    PilaMadera Pila =new PilaMadera(30);
    PilaHilo PilaH =new PilaHilo(30);
    PilaResina PilaR =new PilaResina(30);
     int m= 1+gen.nextInt(15);
     int h= 1+gen.nextInt(15);
     int r= 1+gen.nextInt(5);
     
     for(int i=1;i<=30;i++){
     
         System.out.println("**************Dia "+ i+"******************");
     

     
    try{
    Pila.apilar(m);
    PilaH.apilar(h);
    PilaR.apilar(r);
    
    
   
    int elem=Pila.sacar();
    int hilo=PilaH.sacar();
    int res=PilaR.sacar();
    
    
    if(elem>=4){
    System.out.println("Tienes "+elem+" de madera");
    System.out.println("Tienes "+hilo+" de hilo");
    System.out.println("Tienes "+res+" de resina");
    
    elem= elem-4;
    System.out.println("\n Mesa adquirida, quedan "+elem+" de madera");
    
  
    } if(elem>=2 ){
        elem=elem-2;
    System.out.println("\n Baston adquirido, quedan "+elem+" de madera");
    
    }if(elem >=5){
        elem=elem-5;
    System.out.println("\n Barco adquirido, quedan "+elem+" de madera");
    }if(hilo>=1 && res>=1){
         
     hilo=hilo-4;
     res=res-1;
    System.out.println("\n Cuerda adquirida, quedan "+res+" de resina");
    
     System.out.println("\n Caña adquirida");
    }
    
    }catch(DesbordamientoPila err){
    System.out.println(err.getMessage());
    }catch(SubdesbordamientoPila er){
    System.out.println(er.getMessage());
    }
    
         }
     
    
    

 
    
   
    
    }
      
}
