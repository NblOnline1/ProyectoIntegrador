/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Empleado;
import ec.edu.intsuperior.vista.InterfazAdministrador;
import ec.edu.intsuperior.vista.Invitado;
import ec.edu.intsuperior.vista.Loggin;


/**
 *
 * @author Nbl
 */
public class Controlador {
    
    
    Loggin loggin= new Loggin(this);
    Administrador administrador= new Administrador(this);
    Empleado empleado= new Empleado(this);
    Invitado invitado= new Invitado(this);
    

    public Controlador() {
        
    }
    
    public void showLoggin(){
        loggin.setVisible(true);
    }    
    public void closeLoggin(){
        loggin.setVisible(false);
    }    
    
    public void showAdministrador(){
        administrador.setVisible(true);
    }
    public void closeAdministrador(){
         administrador.setVisible(false);
    }
    public void showEmpleado(){
        empleado.setVisible(true);
    }     
    public void showInvitado(){
        invitado.setVisible(true);    
    }

    public void showInterfazAdministrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
    }

