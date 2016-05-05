/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.*;
import java.io.*;
/**
 *
 * @author Usuario
 */
public class Cometario implements Serializable {
    
    private Date fechaComentario;
    private String texto;
    

    public Cometario( int anio, int mes, int dia, String texto) {

        //GregorianCalendar calendario=new GregorianCalendar(anio, mes, dia); = calendario.getTime();
        this.fechaComentario = new Date(anio, mes, dia);
        this.texto = texto;
        
    }
    
    public Cometario(){
        this.fechaComentario = null;
        this.texto = null;
    }

    public Date getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
    
    
    
}
