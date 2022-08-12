package Modelo;
import java.sql.*;


public class ModeloVO {

    private String resultado ;
    

    public String  getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    private String repitaCaracter(Character caracter, Integer veces) {

        String respuesta = "";
        for (int i = 0; i < veces; i++) {
            respuesta += caracter;
        }
        return respuesta;
        }


    public String valoresLideres() {

        resultado = "" ;

        
        try {
            ResultSet rs = ModeloDAO.consultaInfoLider();

            resultado += repitaCaracter('=', 20) + " LISTADO INFORMACION DE LIDERES " + repitaCaracter('=', 20 ) + "\n";
            resultado += String.format("%-1s %15s %30s %30s", "ID_LIDER", "NOMBRE", "PRIMER_APELLIDO","CIUDAD_RESIDENCIA") + "\n";
            resultado += repitaCaracter('-', 127) + "\n";


            
            
            while(rs.next()){



                Integer idlider= rs.getInt("ID_LIDER");
                String lider= rs.getString("NOMBRE");
                String papllido = rs.getString("PRIMER_APELLIDO");
                String ciudad = rs.getString("CIUDAD_RESIDENCIA");



                 resultado += String.format(String.format("%-1s %28s %41s %48s", idlider, lider, papllido,ciudad)) + "\n";
                
            }

            

        } catch (Exception e) {
            //TODO: handle exception
        }
        return resultado;
        
        
        
    }

    public String valoresClasificacion() {

        resultado = "" ;

        
        try {
            ResultSet rs = ModeloDAO.consultaInfoClasificacion();

            resultado += repitaCaracter('=', 3) + " LISTADO PROYECTOS DE CASA CAMPESTRE EN SANTA MARTA Y CARTAGENA " + repitaCaracter('=', 3 ) + "\n";
            resultado += String.format("%-1s %15s %30s %15s", "ID_PROYECTO", "CONSTRUCTORA", "NUMERO_HABITACIONES","CIUDAD") + "\n";
            resultado += repitaCaracter('-', 127) + "\n";


            
            
            while(rs.next()){



                Integer idpro= rs.getInt("ID_PROYECTO");
                String constructora= rs.getString("CONSTRUCTORA");
                Integer habitaciones = rs.getInt("NUMERO_HABITACIONES");
                String ciudad = rs.getString("CIUDAD");



                 resultado += String.format(String.format("%5s %40s %35s %42s", idpro, constructora, habitaciones, ciudad)) + "\n";
                
            }

            

        } catch (Exception e) {
            //TODO: handle exception
        }
        return resultado;
        
        
        
    }

    public String valoresProveedor() {

        resultado = "" ;

        
        try {
            ResultSet rs = ModeloDAO.consultaInfoProveedor();

            resultado += repitaCaracter('=', 3) + " LISTADO COMPRAS A HOMECENTER PARA SALENTO " + repitaCaracter('=', 3 ) + "\n";
            resultado += String.format("%-1s %15s %30s ", "ID_COMPRA", "CONSTRUCTORA", "BANCO_VINCULADO") + "\n";
            resultado += repitaCaracter('-', 90) + "\n";


            
            
            while(rs.next()){



                Integer idcom= rs.getInt("ID_COMPRA");
                String constructora= rs.getString("CONSTRUCTORA");
                String banco = rs.getString("BANCO_VINCULADO");



                 resultado += String.format(String.format("%10s %30s %35s", idcom, constructora, banco)) + "\n";
                
            }

            

        } catch (Exception e) {
            //TODO: handle exception
        }
        return resultado;
        
        
        
    }

    

    





}
