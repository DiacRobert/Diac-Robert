package Lab4;

public class Carte {
    private final String titlu;
    private final String autor;
    private boolean stareImprumut;

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
        this.stareImprumut = false;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isStareImprumut() {
        if(stareImprumut);
        return stareImprumut;
    }

    public void setStareImprumut(boolean stareImprumut) {
        this.stareImprumut = stareImprumut;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "stareImprumut=" + stareImprumut +
                '}';
    }
}
