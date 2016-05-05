/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import java.util.*;
import java.io.*;
import Datos.*;
import comentario_part.*;
/**
 *
 * @author Usuario
 */
public class Menu {

    
    public void menu(PrintStream g_comentario, Scanner l_comentario, File file) throws IOException, ClassNotFoundException{
        
        String continuar = "si" ;
        
        while(continuar.equalsIgnoreCase("si")){
            
            File respaldo = new File("respaldo.txt");
            Scanner buscador = new Scanner(respaldo);
            PrintStream respaldar = null;
            Scanner sc = new Scanner(System.in);
            Usuario usuario1 = null;
            Cometario comentario = null;
            String listarComentario = null;
            String buscar = null;
            String almacenado = null;
            String desicion = null;
            boolean error = true;
            int opcion = 0;
            int count = 0;
            int numeroLinea = 0;
            
            System.out.println("Menu 5.5 : " + '\n' );
            System.out.println("Seleccione una opcion :");
            System.out.println("1. Ingrese Usuario " + '\n' + "2. Listar Comentarios Existentes" + '\n' + "3. Buscar Comentario");
    sc = new Scanner(System.in);
    opcion = sc.nextInt();
    
            if(opcion == 1){
            System.out.println("Ingrese : nombre - nick - edad - clave - correo ");        
    String nombre = sc.next();
    String nick = sc.next();   
    int edad = sc.nextInt();
    String clave = sc.next();
    String correo = sc.next();
    
    usuario1 = new Usuario(nombre, nick, edad, clave, correo);
    
    
    error = true;
          while(error == true){  
            System.out.println("Desea ingresar comentaro : si o no ");         
        desicion = sc.next();
        if(desicion.equalsIgnoreCase("si") || desicion.equalsIgnoreCase("no")){
            error = false;
        }else{
            System.out.println("Ingrese unicamente si o no");
        }
        
       
        
        
          }
            
    
    
    if(desicion.equalsIgnoreCase("si")){
         
        
    
        System.out.println("Ingrese la Fecha : ");
        System.out.println("Ingrese el año : ");
    int y = sc.nextInt() - 1900;
        System.out.println("Ingrese el mes : ");
    int m = sc.nextInt() - 1;
        System.out.println("Ingrese el dia : ");
    int d = sc.nextInt();
        
    
    
        System.out.println("Ingrese el Comentario : " + '\n');
    sc = new Scanner(System.in);
    String texto = sc.nextLine();
                 
    comentario = new Cometario(y, m, d,texto);
    
    g_comentario.println(usuario1.getNombre());
    g_comentario.println(comentario.getFechaComentario());
    g_comentario.println(comentario.getTexto());
    
    //usuario1.escribirComentario(comentario, g_comentario);
    
    
    }
//       g_comentario.close();
    
        
            } //Fin opcion 1.
            
            //-------------------------------------------------------------------
            
      if(opcion == 2){      
         
         if(file.length() != 0){
         System.out.println("Comentarios : " + '\n'); 
         count = 0;
    while(l_comentario.hasNextLine() == true){
    
    numeroLinea++;
    listarComentario = l_comentario.nextLine();
    
    if(numeroLinea == 1){
        count++;
        System.out.println("Comentario " + count );
        
    }
        System.out.println(listarComentario);
    
    if(numeroLinea == 3){
        System.out.println('\n');
        numeroLinea = 0;
    }
        
    }
         }else{
            System.out.println("El archivo no contiene Informacion. " + '\n' + "Ingrese nuevos comentarios");
        }
   
    
      }   // Fin Opcion 2

      //------------------------------------------------------------------
      
    if(opcion == 3){
        
        if(file.length() != 0){
        g_comentario.close();
        System.out.println("Buscador. " + '\n' + "Ingrese una palabra contenida en el Comentario :" );
        Scanner leer = new Scanner(file);
        sc = new Scanner(System.in);       
        buscar = sc.next();
        almacenado = null;
        count = 0;
              
        numeroLinea = 0;
        
     
        while(leer.hasNextLine() == true){
            
            respaldar = new PrintStream(respaldo);
            numeroLinea = 0;
            while(numeroLinea != 3){     //almacena en archivo de respaldo
                almacenado = leer.nextLine();
                respaldar.println(almacenado);
                numeroLinea++;
                
            }
            while(buscador.hasNext() == true ){   // Buscador palabra por palabra
                almacenado = null;
                almacenado = buscador.next();
                
                if(buscar.equalsIgnoreCase(almacenado)){
                    count++;
                    buscador = new Scanner(respaldo);
                    System.out.println("Comentario encontrado numero " + count);
                   while(buscador.hasNextLine() == true ){
                       almacenado = buscador.nextLine();
                       System.out.println(almacenado);
                       
                   }
                    System.out.println("");
                }
            
            
                
            }
            buscador = new Scanner(respaldo);
            
            
           
            
            
        }
        
        leer.close();
        System.out.println( '\n' + "Numero de comentarios encontrados = " + count);
        }else{
            System.out.println("El archivo no contiene Informacion. " + '\n' + "Ingrese nuevos comentarios");
        }
        
    } //Fin opcion 3 
      
    //------------------------------------------------------------------------
            
    error = true;
          while(error == true){  
            System.out.println("Desea continuar : si o no?");           
        continuar = sc.next();
        if(continuar.equalsIgnoreCase("si") || continuar.equalsIgnoreCase("no")){
            error = false;
        }else{
            System.out.println("Ingrese unicamente si o no");
        }
        
       
        
        
          }
    }
           
     
        
            
        }
        
    }
    

