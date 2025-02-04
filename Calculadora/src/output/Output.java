package output;


public class Output {


    public void mostrarMenu(){

        System.out.println("\nMENU");
        System.out.println("---------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Producto escalar");
        System.out.println("6. Suma de vectores");
        System.out.println("7. Resta de vectores");
        System.out.println("8. Salir");
        System.out.println("\n");

    }
    public void pedirNumero1(){
        System.out.print("\nEscriba el primer numero:");
    }

    public void pedirNumero2(){
        System.out.print("\nEscriba el segundo numero:");
    }

    public void mostrarResultado(){

        System.out.print("\nEl resultado de la operación es: ");
    }
    public void pedirComponente1() {
        System.out.print("Introduce el valor de la componente 1: ");
    }

    public void pedirComponente2() {
        System.out.print("Introduce el valor de la componente 2: ");
    }
    public void salirDeLaCalculadora(){
        System.out.println("Saliendo de la calculadora. ¡Muchas gracias!");
    }
}
