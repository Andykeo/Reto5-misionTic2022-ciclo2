package Vista;

import javax.swing.*;
//import java.awt.*;
import Controlador.ControladorApp;



public class VistaApp extends JFrame implements VistaInterface {

    //Definicion de variables de tipo JFrame

    public static JButton btn1;
    public static JButton btn2;
    public static JButton btn3;
    private JPanel paneltexto;
    private JTextArea texto;
    
   

    public VistaApp(){

        setTitle("Informes de Proyectos de Construccion");
        this.setSize(700, 800);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        paneltexto = new JPanel();
        paneltexto.setLayout(null);

        texto = new JTextArea();
        texto.setEditable(false);

        JScrollPane scroll = new JScrollPane(texto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(140, 60, 540, 765-60);
        paneltexto.add(scroll);

        btn1 = new JButton("Informe1");
        btn1.setBounds(20,200-60,100,30);
        
        btn2 = new JButton("Informe2");
        btn2.setBounds(20,400-30,100,30);
        btn3 = new JButton("Informe3");
        btn3.setBounds(20,600-15,100,30);

    
        paneltexto.add(btn1);

        
        paneltexto.add(btn2);

        
        paneltexto.add(btn3);

        JLabel titulo = new JLabel("Bienvenido");

        titulo.setBounds(700/2-50,0,100,30);

        JLabel titulo2 = new JLabel("Esta Aplicacion le ayuda a generar los reportes solicitados a traves de los botones de su izquierda");
        titulo2.setBounds(700/10,30,700,30);



        


        paneltexto.add(titulo);
        paneltexto.add(titulo2);





        this.add(paneltexto);
        
        setResizable(false);


    }




    @Override
    public void setInforme1(String resultado) {
        // TODO Auto-generated method stub
        texto.setText(resultado);
    }

    @Override
    public void setInforme2(String resultado) {
        // TODO Auto-generated method stub
        texto.setText(resultado);
    }

    @Override
    public void setInforme3(String resultado) {
        // TODO Auto-generated method stub

        texto.setText(resultado);
        
    }

    @Override
    public void iniciar(ControladorApp controller) {
        // TODO Auto-generated method stub

        btn1.addActionListener(controller);
        btn2.addActionListener(controller);
        btn3.addActionListener(controller);

        setVisible(true);
        
    }

    @Override
    public void mostrarExcepcion(Exception ex) {
        // TODO Auto-generated method stub
        
    }
    
}
