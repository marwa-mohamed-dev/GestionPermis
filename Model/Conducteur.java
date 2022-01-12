package Model;
import java.util.*;

public class Conducteur {

    public Conducteur(String n, String p, Date d) {
        this.Nom = n;
        this.Prenom = p;
        this.DateNaissance = d;
    }

    public String Nom;
    public String Prenom;
    public Date DateNaissance;
    public int identifiant;
    public Licence licence;

    public int getIdentifiant() {
        return this.identifiant;
    }

    public Licence getLicence() {
        return this.licence;
    }

    public void setLicence( Licence l) {
        this.licence= l;
    }

}