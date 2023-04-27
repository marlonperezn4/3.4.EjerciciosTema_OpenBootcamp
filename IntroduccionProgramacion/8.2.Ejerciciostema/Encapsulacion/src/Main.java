// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        persona Marlon = new persona();
        Marlon.setEdad(21);
        Marlon.setNombre("Marlon");
        Marlon.setTelefono("3204846551");

        System.out.println(Marlon.getNombre());
        System.out.println(Marlon.getEdad());
        System.out.println(Marlon.getTelefono());
    }
}
//Se crea la clase persona
class persona {
    //Variables PRIVADAS
    private String nombre;
    private int edad;
    private String telefono;

    //Set fijar un  Edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Get obtener un valor Edad
    public int getEdad() {
        return this.edad;
    }

    //Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    //telefono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}