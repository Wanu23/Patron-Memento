
import java.util.Stack;

public class Historial {
    private Stack<EditorMemento> historial;
    private final int LIMITE = 10;
    
    public Historial() {
        this.historial = new Stack<>();
    }
    
    public void guardar(EditorMemento memento) {
        if (historial.size() >= LIMITE) {
            historial.remove(0);
        }
        historial.push(memento);
    }
    
    public EditorMemento deshacer() {
        if (historial.isEmpty()) {
            System.out.println("No hay operaciones para deshacer");
            return null;
        }
        return historial.pop();
    }
}