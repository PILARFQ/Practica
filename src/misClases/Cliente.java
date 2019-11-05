/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

/**
 *
 * @author alumno
 */
public class Cliente {
    private String nombreCliente;
    private String nombreDisciplina;
    private float precioEntrada;
    private int cantidadBoletos;

    public Cliente(String nombreCliente, String nombreDisciplina, float precioEntrada, int cantidadBoletos) {
        this.nombreCliente = nombreCliente;
        this.nombreDisciplina = nombreDisciplina;
        this.precioEntrada = precioEntrada;
        this.cantidadBoletos = cantidadBoletos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreDisciplina() {
        return nombreDisciplina;
    }

    public void setNombreDisciplina(String nombreDisciplina) {
        this.nombreDisciplina = nombreDisciplina;
    }

    public float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }


    
   
    
    public  String toString(){
        
        return "\nNombre del Cliente: "+nombreCliente+
                "\nNombre de la disciplina que desea ver: "+nombreDisciplina
                + "\nPrecio de la entrada: "+precioEntrada
                + "\nCantidad de Boletos: "+cantidadBoletos;
    }
}
