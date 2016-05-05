/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comentario_part;
import java.util.*;
import java.io.*;
import Datos.*;
import Servicio.Menu;
/**
 *
 * @author Usuario
 */
public class Comentario_part {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
      
        //Esta clase corresponde al main en "Prinipal"--------------------------------------------
       
        /*FileOutputStream file = new FileOutputStream("comentarios.txt");
        ObjectOutputStream g_comentario = new ObjectOutputStream(file);
        FileInputStream inFile = new FileInputStream("comentarios.txt");
        ObjectInputStream l_comentario = new ObjectInputStream(inFile);  */
        
        File file = new File("comentarios.txt"); 
        PrintStream g_comentario = new PrintStream(file); 
        Scanner l_comentario = new Scanner(file);
        
        Menu menu_1 = new Menu();
        menu_1.menu(g_comentario, l_comentario, file) ;
    
        l_comentario.close();
    
    }
    
}
