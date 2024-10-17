import java.util.Scanner;

class Empleado {
    // Atributos
    String nombre;
    String cargo;
    double salario;
    String fechaIngreso;

    // Constructor
    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    // Método_mostrar información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear tres objetos de Empleado ingresando datos desde el teclado
        Empleado[] empleados = new Empleado[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa los datos del empleado " + (i + 1) + ":");

            System.out.println("Nombre:");
            String nombre = scanner.nextLine();

            System.out.println("Cargo:");
            String cargo = scanner.nextLine();

            System.out.println("Salario:");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            System.out.println("Fecha de Ingreso (dia/mes/año):");
            String fechaIngreso = scanner.nextLine();

            empleados[i] = new Empleado(nombre, cargo, salario, fechaIngreso);
        }

        // Mostrar la información de los empleados
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }

        scanner.close();
    }
}

