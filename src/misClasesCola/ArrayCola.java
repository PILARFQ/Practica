package misClasesCola;

public class ArrayCola <E> implements Cola<E>{
    private static final int TAMAÑO=10;
    private E [] arC;
    private int frentec, finalc;

    public ArrayCola() {
        arC=(E[]) new Object[TAMAÑO];
        frentec=-1;
        finalc=-1;        
    }
    
    public boolean colaVacia(){        
        return (frentec==-1 && finalc==-1);          
    }
    public boolean colaLlena(){        
        return ((frentec==0 && finalc==TAMAÑO-1) || frentec==finalc+1);        
    }
    
    public void encolar(E x){        
        if(colaLlena()==false){
            if(colaVacia()==true){
                frentec=0;
             }
             if(finalc==TAMAÑO-1){
                    finalc=0;
             }else{
                    finalc++; ////   acción de inserción
             }
            arC[finalc]=x;                   
        }
         
    }
    
    public E desencolar(){
        E elPrimero=arC[frentec];
        
        if(frentec==finalc){
            frentec=-1;
            finalc=-1;
        }else{
            if(frentec==TAMAÑO-1){
                frentec=0;
            }else{
                frentec++;
            }
        }
        
        return elPrimero;
    }
    
    public E Frente(){        
        return arC[frentec];
    }    
    
}
