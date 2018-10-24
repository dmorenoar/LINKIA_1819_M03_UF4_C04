/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf4_c04;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author dmorenoar
 */
public class LINKIA_1819_M03_UF4_C04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un arrayList vacío
        /*No me preocupo de las posiciones que va a tener
        y además dispongo de un montón de métodos que me facilitan
        la vida*/
        ArrayList<Integer> lista = new ArrayList<>();

        
        lista.add(10);
        lista.add(4);
        lista.add(2);
        
        //Consultar el tamaño
        System.out.println(lista.size()); //Tenemos 10 4 2
        
        //Remover un elemento del array
        lista.remove(0); //Ahora queda 4 2
        
        //Ahora nos muestra una posición menos debido a que hemos borrado un elemento
        System.out.println(lista.size()); //Tamaño 2 -> 4 2
        
        //Acceder a elementos del array
        /*OJO!!!! Cuándo pregunto el tamaño el me dice 2, pero para acceder a 
        posiciones trabajo con 0 1*/
        System.out.println("Quien ocupa la pos 0:" + lista.get(0)); //4
        
        //Guardamos objeto en la posición indicada
        lista.add(0, 10);
        //Introduzco el 10 al inicio y el resto se desplazan -> 10 4 2
        System.out.println("Quien ocupa la pos 0:" + lista.get(0));
        
        //Guardamos un nuevo número
        lista.add(4);
        
        System.out.println(lista.remove(0));
        System.out.println(lista.size());
        
        
        //Reemplaza un elemento
        lista.set(0, 33);
        
        //Nos permite controlar si un elemento está presente en la ArrayList
        if(lista.contains(10)){
            System.out.println("Esta lista contiene el 10");
        }else{
            System.out.println("No contiene el 10");
        }
        
        //Nos devuelve el índice del objeto que buscamos sino está -1
        System.out.println("Su pos es" + lista.indexOf(4));
        
        //Recorrer un ArrayList con bucle for
        for(int i=0; i<lista.size();i++){
            System.out.println("Elem:" + lista.get(i));
        }
        //Recorrer un ArrayList con bucle for-each
        
        //TIPO nombre_a_usar : arrayList
        for(Integer numero: lista){
            System.out.println("ELEMENTO:" + numero);
        }
        
        /*TRABAJANDO CON OBJETOS LOS ARRAYLIST*/
        
        ArrayList<Dinosaurio> jurassicPark = new ArrayList<>();
        
        Velociraptor velociraptor = new Velociraptor("Velociraptor", "Carnívoro",10);
        Dinosaurio triceratops = new Dinosaurio("Triceratops", "Herbívoro");
        
        jurassicPark.add(velociraptor);
        jurassicPark.add(triceratops);
        
        jurassicPark.add(new Dinosaurio("T REX","Carnívoro"));
        
        /*
            jurassicPark -> Contiene la lista de todos los dinosaurios
              Si hago jurassicPark.get(pos) ->Obtengo un Dinosaurio 
                                        -> Cada elemento es un dinosaurio
              Si hago jurassicPark.get(pos).getNombre() -> Obtengo el nombre de ese dinosaruio
                Si hago jurassicPark.get(pos).getNombre().equals("x") -> Comparo el nombre de ese dinosaruiro ocn lo que quiera
        
        */
        //Obtengo el nombre de un dinosarurio por su posición
        System.out.println(jurassicPark.get(0).getNombre());
        
        //Obtengo un dinosaurio por su nombre
        for(int i = 0; i< jurassicPark.size();i++){
            if(jurassicPark.get(i).getNombre().equals("Velociraptor")){
                System.out.println("El dinosaurio existe");
            }
        }
        
        //Con bucle for-each
        for(Dinosaurio dino: jurassicPark){
            if(dino.getNombre().equals("Velociraptor")){
                System.out.println("Si existe");
            }
        }
    }
    
}
