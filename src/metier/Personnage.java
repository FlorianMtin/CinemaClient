package metier;

/**
 * Created by Florian on 19/12/2016.
 */
public class Personnage {
    private static final long serialVersionUID = 1L;
    int NoFilm;
    int NoAct;
    String NomPers;

    public Personnage(int noFilm, int noAct, String nomPers) {
        NoFilm = noFilm;
        NoAct = noAct;
        NomPers = nomPers;
    }

    public Personnage() {
    }

    public int getNoFilm() {
        return NoFilm;
    }
    public void setNoFilm(int noFilm) {
        NoFilm = noFilm;
    }
    public int getNoAct() {
        return NoAct;
    }
    public void setNoAct(int noAct) {
        NoAct = noAct;
    }
    public String getNomPers() {
        return NomPers;
    }
    public void setNomPers(String nomPers) {
        NomPers = nomPers;
    }
}
