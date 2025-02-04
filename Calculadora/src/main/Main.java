package main;


import input.Input;
import math.Matematico;
import math.Vectores;
import output.Output;
import validators.Validador;

import java.sql.SQLOutput;

public class Main {
    private static Vectores vector1 = new Vectores();
    private static Vectores vector2 = new Vectores();
    private static int opcionMenu;
    private static int num1;
    private static int num2;
    private static double resultado;
    private static Output output = new Output();
    private static Input input = new Input();

    public static void main(String[] args) {
        int noVectores = 4; //opciones del 1 al 4, el 4 es de referencia
        int opcionVectores = 5; //opciones 5, 6 y 7, el 5 es de referencia
        int usuarioQuiereSalir = 8;

        do{
            procesoValidacion();

            if (opcionMenu != usuarioQuiereSalir && opcionMenu <= noVectores){
                pedirRecogerNumeros();
                ejecutarOperacion();
                mostrarResultado();
            }

            if ((opcionMenu != usuarioQuiereSalir) && (opcionMenu >= opcionVectores)){
                pedirRecogerVectores();
                ejecutarOperacion();
                mostrarResultado();
            }

        }while(opcionMenu != usuarioQuiereSalir );

        if(opcionMenu == usuarioQuiereSalir){
            exit();
            System.exit(0);
        }

    }

    private static void procesoValidacion(){
        boolean esValido;

        do {
            mostrarMenu();

            recogerOpcionMenu();

            esValido = validarOpcionMenu();
            if (!esValido) {
                System.out.println("Opción no válida. Por favor, elige una opción válida (1-7).");
            }

        } while (!esValido);
    }
    private static void mostrarMenu(){
        output.mostrarMenu();
    }
    private static void recogerOpcionMenu(){
        opcionMenu =  input.recogerOpcionMenu();
    }
    private static boolean validarOpcionMenu(){
        Validador validador = new Validador();
        boolean esValido = validador.validar(opcionMenu);
        return esValido;
    }
    private static void pedirRecogerNumeros(){
        output.pedirNumero1();
        num1 = input.recogerNumeros();
        output.pedirNumero2();
        num2 = input.recogerNumeros();
    }
    private static void pedirRecogerVectores() {
        Vectores[] vectores = new Vectores[2];

        for (int i = 0; i < vectores.length; i++) {
            System.out.println("Completando el vector " + (i + 1) + ".");

            output.pedirComponente1();
            float componente1 = input.recogerComponentes();

            output.pedirComponente2();
            float componente2 = input.recogerComponentes();

            vectores[i] = new Vectores(componente1, componente2);
        }
        vector1 = vectores[0];
        vector2 = vectores[1];
    }

    private static void ejecutarOperacion(){
        Matematico matematico = new Matematico();

        if (opcionMenu == 1) {
            resultado = matematico.suma(num1, num2);
        } else if (opcionMenu == 2) {
            resultado = matematico.resta(num1, num2);
        } else if (opcionMenu == 3) {
            resultado = matematico.multiplicacion(num1, num2);
        } else if (opcionMenu == 4) {
            resultado = matematico.division(num1, num2);
        } else if (opcionMenu == 5) {
            resultado = matematico.productoEscalar(vector1, vector2);
        }else if (opcionMenu == 6) {
            Vectores sumaVectores = matematico.suma(vector1, vector2);
            System.out.println("\nEl resultado es: ("+ sumaVectores.getComponente1() + " , "+ sumaVectores.getComponente2() + ")");
            resultado = sumaVectores.getComponente1() + sumaVectores.getComponente2();
        }else if(opcionMenu == 7) {
            Vectores restaVectores = matematico.resta(vector1, vector2);
            System.out.println("\nEl resultado es: ("+ restaVectores.getComponente1() + " , "+ restaVectores.getComponente2() + ")");
            resultado = restaVectores.getComponente1() + restaVectores.getComponente2();
        }
    }
    private static void mostrarResultado(){
        output.mostrarResultado();
        System.out.print(resultado + "\n");
    }
    private static void exit() {
        output.salirDeLaCalculadora();
    }
}