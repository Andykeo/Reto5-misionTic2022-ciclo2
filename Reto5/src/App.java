import Vista.VistaInterface;
import Vista.VistaApp;
import Modelo.ModeloVO;
import Controlador.ControladorApp;
public class App {
    public static void main(String[] args) throws Exception {
        
        VistaInterface view = new VistaApp();

        var model = new ModeloVO();
        var controller = new ControladorApp(view, model);

        controller.Iniciar();
    }
}
