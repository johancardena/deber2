import java.util.Scanner;
class Jugador {
    // Atributos
    String nombre;
    String posicion;
    int edad;
    int numeroCamiseta;

    // Constructor
    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    // Método para mostrar la información del jugador
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numeroCamiseta);
        System.out.println();
    }

    public static void main(String[] args) {
        // Datos quemados
        Jugador jugador1 = new Jugador("Lionel Messi", "Delantero", 36, 10);
        Jugador jugador2 = new Jugador("Sergio Ramos", "Defensor", 38, 4);

        // Usar Scanner para registrar datos del tercer jugador
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del tercer jugador:");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa la posición del tercer jugador:");
        String posicion = scanner.nextLine();

        System.out.println("Ingresa la edad del tercer jugador:");
        int edad = scanner.nextInt();

        System.out.println("Ingresa el número de camiseta del tercer jugador:");
        int numeroCamiseta = scanner.nextInt();

        Jugador jugador3 = new Jugador(nombre, posicion, edad, numeroCamiseta);

        // Mostrar información de los tres jugadores
        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();

        scanner.close();
    }
}
