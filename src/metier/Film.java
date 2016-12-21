package metier;

public class Film {
    private static final long serialVersionUID = 1L;
    int NoFilm;
    String Titre;
    int Duree;
    String DateSortie;
    long Budget;
    long MontantRecette;
    int NoRea;
    String CodeCat;

    public Film(int noFilm, String film, int duree, String dateSortie, long budget, long montantRecette, int noRea, String codeCat) {
        NoFilm = noFilm;
        Titre = film;
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
        return Titre;
    }
    public void setFilm(String film) {Titre = film;
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
    public Long getBudget() {
        return Budget;
    }
    public void setBudget(Long budget) {
        Budget = budget;
    }
    public Long getMontantRecette() {
        return MontantRecette;
    }
    public void setMontantRecette(Long montantRecette) {
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
