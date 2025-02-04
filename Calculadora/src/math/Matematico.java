package math;

public class Matematico {
    private static int resultado;
    public int suma (int sumando1, int sumando2 ){
        return sumando1 + sumando2;
    }

    public int resta (int sustraendo, int minuendo ){

        return sustraendo - minuendo;
    }

    public float multiplicacion (int multiplicado, int multiplicador ){
        int mult = multiplicador;
        resultado = 0;
        if(mult == 0){
            mult=Math.abs(multiplicador);
        }

        for(int i = 0; i < mult; i++){
            resultado += multiplicado ;
        }
        return resultado;
        //return multiplicado * multiplicador;
    }

    public float division (int dividendo, int divisor ){

        int cociente = 0;
        int resultado = dividendo;

        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        while (resultado >= divisor) {
            resultado -= divisor;
            cociente++;
        }
        return cociente;
        //return (float) dividendo / divisor;
    }
    public Vectores suma(Vectores v1, Vectores v2 ){
        Vectores resultado = new Vectores();

        float resultadoC1 = v1.getComponente1() + v2.getComponente1();
        float resultadoC2 = v1.getComponente2() + v2.getComponente2();

        return new Vectores(resultadoC1, resultadoC2);
    }
    public Vectores resta(Vectores v1, Vectores v2) {
        Vectores resultado = new Vectores();


        float resultadoC1 = v1.getComponente1() - v2.getComponente1();
        float resultadoC2 = v1.getComponente2() - v2.getComponente2();

        return new Vectores(resultadoC1, resultadoC2);
    }
    public float productoEscalar(Vectores v1, Vectores v2) {
        float componente1 = v1.getComponente1() * v2.getComponente1();
        float componente2 = v1.getComponente2() * v2.getComponente2();


        return componente1 + componente2;
    }


}
