package metier;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;
    private double solde;
    private Date dateCreation;

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    @Override
    public String toString() {
        return "Compte [code=" + code + ", solde=" + solde
                + ", dateCreation=" + dateCreation + "]";
    }
}
