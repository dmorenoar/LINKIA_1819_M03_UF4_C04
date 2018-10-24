/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf4_c04;

/**
 *
 * @author dmorenoar
 */
public class Dinosaurio {
    
    //VARIABLE COMÚN A TODOS LOS OBJETOS DE LA CLASE
    private String nombre = "";
    private String tipo = "";

    public Dinosaurio(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        //incrementar el objeto común
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
}
