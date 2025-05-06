public class Cilindro extends Forma implements Volume {
    private double altura;

    public Cilindro(int coordenadaX, double raio, int coordenadaY, double altura) {
        super(coordenadaX, raio, coordenadaY);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return -1;
    }

    public double calcularVolume() {
        return -2;
    }


    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Altura: " + altura + "\n";
        return aux;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
