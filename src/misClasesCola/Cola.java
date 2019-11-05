package misClasesCola;

public interface Cola <E>{
    void encolar(E x);
    E desencolar();
    E Frente();  // para consulta
    boolean colaVacia();
    boolean colaLlena();
}
