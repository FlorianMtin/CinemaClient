package metier;

/**
 * Created by Florian on 19/12/2016.
 */
public class Categorie {

    private static final long serialVersionUID = 1L;
    String CodeCat;
    String LibelleCat;

    public Categorie(String codeCat, String libelleCat) {
        CodeCat = codeCat;
        LibelleCat = libelleCat;
    }

    public Categorie() {    }

    public String getCodeCat() {
        return CodeCat;
    }
    public void setCodeCat(String codeCat) {
        CodeCat = codeCat;
    }
    public String getLibelleCat() {
        return LibelleCat;
    }
    public void setLibelleCat(String libelleCat) {
        LibelleCat = libelleCat;
    }
}
