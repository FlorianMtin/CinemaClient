package metier;

/**
 * Created by Florian on 19/12/2016.
 */
public class Acteur {
    private static final long serialVersionUID = 1L;
    int NoAct;
    String NomAct;
    String PrenAct;
    String DateNaiss;
    String DateDeces;

    public Acteur(int noAct, String nomAct, String prenAct, String dateNaiss, String dateDeces) {
        NoAct = noAct;
        NomAct = nomAct;
        PrenAct = prenAct;
        DateNaiss = dateNaiss;
        DateDeces = dateDeces;
    }

    public Acteur() {
    }
    public int getNoAct() {
        return NoAct;
    }

    public void setNoAct(int noAct) {
        NoAct = noAct;
    }
    public String getNomAct() {
        return NomAct;
    }
    public void setNomAct(String nomAct) {
        NomAct = nomAct;
    }
    public String getPrenAct() {
        return PrenAct;
    }
    public void setPrenAct(String prenAct) {
        PrenAct = prenAct;
    }
    public String getDateNaiss() {
        return DateNaiss;
    }
    public void setDateNaiss(String dateNaiss) {
        DateNaiss = dateNaiss;
    }
    public String getDateDeces() {
        return DateDeces;
    }
    public void setDateDeces(String dateDeces) {
        DateDeces = dateDeces;
    }
}

