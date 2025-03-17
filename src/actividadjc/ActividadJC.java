/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadjc;

import Conexiones.conexiones;

/**
 *
 * @author Estudiantes
 */
public class ActividadJC {

    public static void main(String[] args) {
      conexiones c = conexiones.getInstancia();
      c.conectar();
      c.desconectar();
      
      boolean rpta = c instanceof conexiones;
      System.out.println(rpta);
    }
    
}
