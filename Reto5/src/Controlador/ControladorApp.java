package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Modelo.ModeloVO;
import Vista.VistaInterface;
import Vista.VistaApp;

public class ControladorApp implements ActionListener {

    private final VistaInterface view;
    private final ModeloVO model;

    public ControladorApp(VistaInterface view, ModeloVO model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==VistaApp.btn1){

            try {
                
                model.valoresLideres();

                view.setInforme1((model.getResultado().toString()));

                

                
            } catch (Exception ex) {
                //TODO: handle exception
            }

           


        // TODO Auto-generated method stub
        
    }

    if (e.getSource()==VistaApp.btn2){

        try {
            
            model.valoresClasificacion();

            view.setInforme2((model.getResultado().toString()));

            

            
        } catch (Exception ex) {
            //TODO: handle exception
        }

       


    // TODO Auto-generated method stub
    
}

if (e.getSource()==VistaApp.btn3){

    try {
        
        model.valoresProveedor();

        view.setInforme3((model.getResultado().toString()));

        

        
    } catch (Exception ex) {
        //TODO: handle exception
    }

   


// TODO Auto-generated method stub

}

}  
    public void Iniciar() {
        view.iniciar(this);
}
}
