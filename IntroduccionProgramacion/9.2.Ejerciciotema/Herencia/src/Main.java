// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("CLIENTE");
        Cliente Marlon = new Cliente();
        Marlon.setEdad(21);
        Marlon.setNombre("Marlon Fco P");
        Marlon.setTelefono("3204846551");
        Marlon.setCredito(true);

        System.out.println(Marlon.getNombre());
        System.out.println(Marlon.getEdad());
        System.out.println(Marlon.getTelefono());
        System.out.println(Marlon.isCredito());

        System.out.println("TRABAJADOR");
        Trabajador Luis = new Trabajador();
        Luis.setEdad(54);
        Luis.setNombre("Luis Fco P");
        Luis.setTelefono("3201111111");
        Luis.setSalario(250);

        System.out.println(Luis.getNombre());
        System.out.println(Luis.getEdad());
        System.out.println(Luis.getTelefono());
        System.out.println(Luis.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    //Edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
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

class Cliente extends Persona {
    private boolean credito;
    //credito
    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    public boolean isCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private int salario;
    //salario
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
    }
}