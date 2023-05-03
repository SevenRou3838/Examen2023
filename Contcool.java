public class Contcool extends Content {
    String toxic;
    String expl;

    public Contcool(int n_Content, String nombre, double peso, double volumen, String toxic, String expl) {
        super(n_Content, nombre, peso, volumen);
        this.toxic = toxic;
        this.expl = expl;
    }

    public String getToxic() {
        return toxic;
    }

    public void setToxic(String toxic) {
        this.toxic = toxic;
    }

    public String getExpl() {
        return expl;
    }

    public void setExpl(String expl) {
        this.expl = expl;
    }

}