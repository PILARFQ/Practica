/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases.gestion;

import javax.swing.JOptionPane;
import misClases.Cliente;
import misClasesCola.ArrayCola;

/**
 *
 * @author alumno
 */
public class GestionarEspectaculoD {
    private ArrayCola<Cliente> listaC;
    private float montoTotalRecaudacion;

    public GestionarEspectaculoD() {
        listaC = new ArrayCola<Cliente>();
        montoTotalRecaudacion = 0.0f;
    }

    public ArrayCola<Cliente> getListaC() {
        return listaC;
    }

    public float getMontoTotalRecaudacion() {
        return montoTotalRecaudacion;
    }
    
    
    public void encolarCliente(Cliente refC){
        ArrayCola<Cliente> listaAuxC = new ArrayCola<Cliente>();
        boolean estado = false;
        while(listaC.colaVacia()==false){
            Cliente c = listaC.desencolar();
            if(c.getNombreCliente().equalsIgnoreCase(refC.getNombreCliente())){
                estado = true;
            }
            listaAuxC.encolar(c);
        }
        while (listaAuxC.colaVacia()==false){
            listaC.encolar(listaAuxC.desencolar());
        }
        if(!estado){
            listaC.encolar(refC);
        }else{
            JOptionPane.showMessageDialog(null, "El nombre ya esta registrado");
        }
    }
    public String VerListadoClientes(){
        ArrayCola<Cliente> listaAuxC = new ArrayCola<Cliente>();
        String cad = "";
    
        while(listaC.colaVacia()==false){
            Cliente c=listaC.desencolar();
            
            cad=cad+c.toString()+"\n";
            listaAuxC.encolar(c);          
        }
        while(listaAuxC.colaVacia()==false){
            listaC.encolar(listaAuxC.desencolar());
        }       
        return cad;
    }
    public float CalcularMontoTotalR(){
        float monto = 0.0f;
        float descuento = 0.0f;
        while(listaC.colaVacia()==false){
            Cliente c = listaC.desencolar();
            if(c.getCantidadBoletos()>5){
                descuento = monto * 0.1f;
            }
            monto = (c.getPrecioEntrada()*c.getCantidadBoletos())-descuento;
            montoTotalRecaudacion +=monto;
            
        }
        return monto ;
    }
}
