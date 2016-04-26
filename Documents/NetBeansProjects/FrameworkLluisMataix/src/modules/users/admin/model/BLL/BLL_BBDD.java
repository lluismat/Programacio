/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.users.admin.model.BLL;


import classes.connectionPool;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modules.users.admin.model.DAO.DAO_BBDD;


/**
 *
 * @author lluis
 */
public class BLL_BBDD {
    
    
    //crear un administrador en la base de datos
    public static int NewAdmin() {

        int correct;
        Connection con;

        //ConnectionBBDD connectionbd = new ConnectionBBDD();

        con = connectionPool.getConexion();

        correct = DAO_BBDD.NewAdmin(con);

        connectionPool.connectionRelease(con);
        
        return correct;
    }
    
    //listar los administradores de la base de datos
    public static void ViewAdmin() {

        Connection con = null;
        //ConnectionBBDD connectionBD = new ConnectionBBDD();

        con = connectionPool.getConexion();
        DAO_BBDD DAOBD=new DAO_BBDD();

        try {
            DAOBD.ViewAdminDAO(con);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error Logger");
        }
        connectionPool.connectionRelease(con);

    }

    // modificar administrador de la base de datos
    public static void modifyAdminBLL() {

        Connection con;

        //ConnectionBBDD connectionBD = new ConnectionBBDD();

        con = connectionPool.getConexion();
        
        //DAO_BBDD DAOBD=new DAO_BBDD();

        DAO_BBDD.modifyAdminDAO(con);
        
        connectionPool.connectionRelease(con);

    }

    // eliminar administrador de la base de datos
    public static boolean DeleteAdminBLL() {

        Connection con;
        boolean correcto;

        //ConnectionBBDD connectionBD = new ConnectionBBDD();

        con = connectionPool.getConexion();
        DAO_BBDD DAOBD=new DAO_BBDD(); 

        correcto = DAOBD.DeleteAdminDAO(con);
       connectionPool.connectionRelease(con);

        return correcto;
    }
}
