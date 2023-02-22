public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        String NumPuertas = "Puertas del coche:";
        System.out.println(NumPuertas + miCoche.puertas);
    }
}

class Coche {
    public int puertas = 4;

    public void SumarPuerta(){
        this.puertas++;
    }
}