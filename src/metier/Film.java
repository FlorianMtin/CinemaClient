package metier;

public class Film {
    private static final long serialVersionUID = 1L;
    int NoFilm;
    String Titre;
    int Duree;
    String DateSortie;
    int Budget;
    int MontantRecette;
    int NoRea;
    String CodeCat;

    public Film(int noFilm, String titre, int duree, String dateSortie, int budget, int montantRecette, int noRea, String codeCat) {
        NoFilm = noFilm;
        Titre = titre;
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
    public String getTitre() {
        return Titre;
    }
    public void setTitre(String film) {Titre = film;
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
