
package EjercicioPilas;


public class PilaHilo {
      private int Esquina[];
    private int indice;
    
    //constructor     
    public PilaHilo(int n){
        //n es la cantidad de elementos que puede guardaar mi pila 
     Esquina = new int[n];
     indice=0;
    }
    public void apilar(int num)throws DesbordamientoPila{
        if(this.llena()){
        throw new DesbordamientoPila();
        }
    Esquina[indice]=num;
    indice++;
    }
    
    public int sacar()throws SubdesbordamientoPila{
        
        if (this.vacia()){
        throw new SubdesbordamientoPila();
        }
    int esacar;
    esacar=Esquina[indice-1];
    indice--;
    /*
    indice--;
    esacar = Esquina[indice];
    */
    return esacar;
    }
    
    public boolean vacia(){
     if(indice==0){
       return true;
     }
       return false;
    
    
    }
    
    public boolean llena(){
    if(indice==Esquina.length){
    return true;
    }
    return false;
    
    }
    
    public int capacidad(){
    return Esquina.length;
    }
    
    public int cantidad(){
    return indice-1;
    }
}
