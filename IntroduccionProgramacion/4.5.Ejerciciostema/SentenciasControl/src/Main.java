// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //If que determina si es negativo, positivo o neutro
        int x = 12;
        if (x > 0) {
            System.out.println("El número es positivo");
        } else if (x == 0) {
            System.out.println("El número es 0 neutro");
        }else {
            System.out.println("El número es negativo");
        }

        //While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("Valor while:" + numeroWhile);
            numeroWhile ++;
        }

        //DoWhile
        do {
            System.out.println("Valor dowhile: " + numeroWhile);
        } while (numeroWhile < 3);

        //For
        for (int i=0; i <3; i++) {
            System.out.println("Valor del for: " + i);
        }

        //Switch
        var estacion = "Otoño";
        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estación del año");
        }
    }
}