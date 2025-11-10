
public class EditorMemento {
    private final String contenido;
    private final int cursor;
    private final String formato;
    
    public EditorMemento(String contenido, int cursor, String formato) {
        this.contenido = contenido;
        this.cursor = cursor;
        this.formato = formato;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public int getCursor() {
        return cursor;
    }
    
    public String getFormato() {
        return formato;
    }
}