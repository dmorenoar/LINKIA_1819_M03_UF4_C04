/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf4_c04;

import java.util.Objects;

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
        return "Dinosaurio : " + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dinosaurio other = (Dinosaurio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
