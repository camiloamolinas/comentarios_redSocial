/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.*;
import java.io.*;
import Servicio.*;
import comentario_part.*;
/**
 *
 * @author Usuario
 */
public class Usuario implements Serializable {
    
    private String nombre;
    private String nick;   
    private int edad ;
    private transient String clave;
    private String correo;
    private ArrayList<Cometario> comentarios = null;
    
    //public Comentario comentarios
    
    public Usuario(String nombre, String nick, int edad, String clave, String correo) {
        this.nombre = nombre;
        this.nick = nick;
        this.edad = edad;
        this.clave = clave;
        this.correo = correo;
        
        this.comentarios = new ArrayList<Cometario>();
       
    }
        
    public void escribirComentario(Cometario comentario,ObjectOutputStream g_comentario) throws IOException{
        this.comentarios.add(comentario);
        g_comentario.writeObject(comentario);
        
        
    }
    
    public void publicarFotografia(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
