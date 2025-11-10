
public class EditorTexto {
    private String contenido;
    private int cursor;
    private String formato;
    
    public EditorTexto() {
        this.contenido = "";
        this.cursor = 0;
        this.formato = "normal";
    }
    
    public void escribir(String texto) {
        contenido += texto;
        cursor = contenido.length();
        System.out.println("Texto escrito: " + texto);
    }
    
    public void borrar(int numCaracteres) {
        if (numCaracteres > contenido.length()) {
            System.out.println("Error: no hay suficientes caracteres para borrar");
            return;
        }
        contenido = contenido.substring(0, contenido.length() - numCaracteres);
        cursor = contenido.length();
        System.out.println("Caracteres borrados: " + numCaracteres);
    }
    
    public void cambiarFormato(String nuevoFormato) {
        this.formato = nuevoFormato;
        System.out.println("Formato cambiado a: " + nuevoFormato);
    }
    
    public void moverCursor(int posicion) {
        if (posicion < 0 || posicion > contenido.length()) {
            System.out.println("Error: posicion invalida");
            return;
        }
        this.cursor = posicion;
        System.out.println("Cursor movido a posicion: " + posicion);
    }
    
    public EditorMemento guardar() {
        return new EditorMemento(contenido, cursor, formato);
    }
    
    public void restaurar(EditorMemento memento) {
        this.contenido = memento.getContenido();
        this.cursor = memento.getCursor();
        this.formato = memento.getFormato();
    }
    
    public void mostrarEstado() {
        System.out.println("\nEstado del editor:");
        System.out.println("Contenido: " + contenido);
        System.out.println("Cursor en posicion: " + cursor);
        System.out.println("Formato: " + formato);
        System.out.println();
    }
}