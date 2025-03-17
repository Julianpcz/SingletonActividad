/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexiones;

public class conexiones {
    private static conexiones instancia;
    
    private conexiones(){
    
    }
    public static conexiones getInstancia(){
          if(instancia == null) {
                 instancia = new conexiones();
          }
          return instancia;
    }
    public void conectar (){
            System.out.println("Me conecte a la base de datos");   
    }
    public void desconectar(){
       System.out.println("Me desconecte a la base de datos");
    }
}


