public class Content {
    protected static int n_Content;
    protected static String nombre;
    protected static double peso;
    protected static double volumen;

    public Content(int n_Content, String nombre, double peso, double volumen) {
        this.n_Content = n_Content;
        this.nombre = nombre;
        this.peso = peso;
        this.volumen = volumen;
    }

    public int getN_Content() {
        return n_Content;
    }

    public void setN_Content(int n_Content) {
        this.n_Content = n_Content;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}