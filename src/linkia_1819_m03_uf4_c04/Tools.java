/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf4_c04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dmorenoar
 */
public class Tools {
    
     public static int pideEntero() {
        int num = 0;
        System.out.println("Introduce un numero");
        boolean estado = true;

        while (estado) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String op = br.readLine();
                num = Integer.parseInt(op);
                estado = false;

            } catch (Exception e) {
                System.out.println("Numero incorrecto, vuelve a introducir un num");
            }
        }

        return num;
    }
}
