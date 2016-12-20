package metier;

/**
 * Created by Florian on 19/12/2016.
 */
public class Film {
    private static final long serialVersionUID = 1L;
    int NoFilm;
    String Film;
    int Duree;
    String DateSortie;
    int Budget;
    int MontantRecette;
    int NoRea;
    String CodeCat;

    public Film(int noFilm, String film, int duree, String dateSortie, int budget, int montantRecette, int noRea, String codeCat) {
        NoFilm = noFilm;
        Film = film;
        Duree = duree;
        DateSortie = dateSortie;
        Budget = budget;
        MontantRecette = montantRecette;
        NoRea = noRea;
        CodeCat = codeCat;
    }

    public Film() {    }

    public int getNoFilm() {
        return NoFilm;
    }
    public void setNoFilm(int noFilm) {
        NoFilm = noFilm;
    }
    public String getFilm() {
        return Film;
    }
    public void setFilm(String film) {
        Film = film;
    }
    public int getDuree() {
        return Duree;
    }
    public void setDuree(int duree) {
        Duree = duree;
    }
    public String getDateSortie() {
        return DateSortie;
    }
    public void setDateSortie(String dateSortie) {
        DateSortie = dateSortie;
    }
    public int getBudget() {
        return Budget;
    }
    public void setBudget(int budget) {
        Budget = budget;
    }
    public int getMontantRecette() {
        return MontantRecette;
    }
    public void setMontantRecette(int montantRecette) {
        MontantRecette = montantRecette;
    }
    public int getNoRea() {
        return NoRea;
    }
    public void setNoRea(int noRea) {
        NoRea = noRea;
    }
    public String getCodeCat() {
        return CodeCat;
    }
    public void setCodeCat(String codeCat) {
        CodeCat = codeCat;
    }
}
