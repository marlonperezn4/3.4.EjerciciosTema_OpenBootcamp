// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Se crea el objeto
        Coche miCoche = new Coche();
        //Se llama la función para añadirle una puerta
        miCoche.AgregarPuerta();
        //Se muestra el número de puertas que tiene el objeto
        System.out.println(miCoche.puertas);
    }
}
//Se crea la clase coche
class Coche {
    //Se declara la cantidad de puertas
    public int puertas = 4;
    // Función para agregar puertas (Se usa void si no se retorna ningún valor)
    public void AgregarPuerta() {
        //Se le suma una puerta cada que se llama la función
        this.puertas++;
    }
}