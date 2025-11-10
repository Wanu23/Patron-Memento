
public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();
        
        editor.mostrarEstado();
        
        historial.guardar(editor.guardar());
        editor.escribir("Hola");
        editor.mostrarEstado();
        
        historial.guardar(editor.guardar());
        editor.escribir(" mundo");
        editor.mostrarEstado();
        
        historial.guardar(editor.guardar());
        editor.cambiarFormato("negrita");
        editor.mostrarEstado();
        
        historial.guardar(editor.guardar());
        editor.escribir("!!!");
        editor.mostrarEstado();
        
        System.out.println("--- Deshaciendo operacion ---");
        EditorMemento estado = historial.deshacer();
        if (estado != null) {
            editor.restaurar(estado);
            editor.mostrarEstado();
        }
        
        System.out.println("--- Deshaciendo operacion ---");
        estado = historial.deshacer();
        if (estado != null) {
            editor.restaurar(estado);
            editor.mostrarEstado();
        }
        
        System.out.println("--- Deshaciendo operacion ---");
        estado = historial.deshacer();
        if (estado != null) {
            editor.restaurar(estado);
            editor.mostrarEstado();
        }
    }
}