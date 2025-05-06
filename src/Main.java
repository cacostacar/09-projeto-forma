import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Cilindro(2, 3, 5, 9));
        lista.add(new Circulo(1, 1, 1));
        lista.add(new Cilindro(3, 3, 3, 3));

        for (Forma f : lista) {
            System.out.println(f.getClass().getSimpleName());
            System.out.println(f); //f.toString()
            System.out.println("área = " + f.calcularArea());
            if (f instanceof Volume) {
                System.out.println("Volume = " + ((Volume) f).calcularVolume());
            }
            System.out.println("---------------------------------------");

        }
    }
}
