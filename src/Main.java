public class Main {
    public static void main(String[] args) {

        int result = sumaTriple(10,20,30);
        System.out.println("Resultado: "+result);

        Coche auto = new Coche();
        auto.incrementarPuertas();
        System.out.println("El coche tiene " + auto.getnPuertas() + " puerta");
    }

    public static int sumaTriple (int a, int b, int c) {
        return a+b+c;
    }
}

class Coche {
    private int nPuertas = 0;

    public void incrementarPuertas(){
        nPuertas++;
    }

    public int getnPuertas(){
        return nPuertas;
    }

}
/*
* Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
* */