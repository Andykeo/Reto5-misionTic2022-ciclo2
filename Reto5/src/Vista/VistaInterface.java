package Vista;

import Controlador.ControladorApp;

public interface VistaInterface {

    //metodos que tendra la clase VistaApp

    public void setInforme1(String resultado);

    public void setInforme2(String resultado);

    public void setInforme3(String resultado);

    public void iniciar(ControladorApp controller);

    public void mostrarExcepcion(Exception ex);
    
}
