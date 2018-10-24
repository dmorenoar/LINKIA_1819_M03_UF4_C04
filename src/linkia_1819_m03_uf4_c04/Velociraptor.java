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
public class Velociraptor extends Dinosaurio {
    
    private int muertesAnyo = 0;

    public Velociraptor(String nombre, String tipo, int muertesAnyo) {
        super(nombre, tipo);
        this.muertesAnyo = muertesAnyo;
    }

    public int getMuertesAnyo() {
        return muertesAnyo;
    }

    public void setMuertesAnyo(int muertesAnyo) {
        this.muertesAnyo = muertesAnyo;
    }
    
    @Override
    public String toString() {
        return "Velociraptor{" + "Nombre" + super.getNombre() + "Tipo" + super.getTipo() + "muertesAnyo=" + muertesAnyo + '}';
    }
    
    
    
}
