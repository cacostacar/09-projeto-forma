// apenas a superclasse é abstrata --> não gera objeto
public abstract class Forma {
    private int coordenadaX;
    private int coordenadaY;
    private double raio;

    public Forma(int coordenadaX, double raio, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.raio = raio;
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Coordenada x: " + coordenadaX + "\n";
        aux += "Coordenada y: " + coordenadaY + "\n";
        aux += "Raio: " + raio + "\n";
        return aux;
    }

    // método abstrato --> método que não tem "corpo" (código)
    public abstract double calcularArea();

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}
