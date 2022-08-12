package Modelo;
import java.sql.*;
import Utilidades.JDBCUtilities;

public class ModeloDAO {

    public static ResultSet consultaInfoLider(){

            ResultSet rs=null;
    
            try {
                var conn = JDBCUtilities.getConnection();
    
                Statement stmt=null;
    
                
    
                String csql = "SELECT ID_Lider , Nombre , Primer_Apellido, Ciudad_Residencia  FROM Lider ORDER BY Ciudad_Residencia"; 
                stmt =  conn.createStatement();
    
                rs = stmt.executeQuery(csql);
    
                
                
            } catch (Exception e) {
                //TODO: handle exception
            }   
    
            return rs;
    
    
        
    }

    public static ResultSet consultaInfoClasificacion(){

        ResultSet rs=null;

        try {
            var conn = JDBCUtilities.getConnection();

            Statement stmt=null;

            

            String csql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad  From Proyecto p WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Santa Marta', 'Cartagena')"; 
            stmt =  conn.createStatement();

            rs = stmt.executeQuery(csql);

            
            
        } catch (Exception e) {
            //TODO: handle exception
        }   

        return rs;

    }

    public static ResultSet consultaInfoProveedor(){

        ResultSet rs=null;

        try {
            var conn = JDBCUtilities.getConnection();

            Statement stmt=null;

            

            String csql = "SELECT ID_Compra, Constructora, Banco_Vinculado  FROM Proyecto JOIN Compra USING(ID_Proyecto) WHERE Proveedor = 'Homecenter' AND Ciudad = 'Salento'"; 
            stmt =  conn.createStatement();

            rs = stmt.executeQuery(csql);

            
            
        } catch (Exception e) {
            //TODO: handle exception
        }   

        return rs;

    }


}

    
    

