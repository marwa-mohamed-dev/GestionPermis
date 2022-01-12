package Model;

import java.util.*;

public class Licence extends ListesPermis_ClasseAbstraite {

    public Licence() {
    }

    public String statut;

    public Date dateExpiration;

    public String policeAssurance;

    public ArrayList<Vehicule> listeVehicule;

    private int identifiant;

    public String typePermis;

    public Conducteur Conducteur;

    public ListesPermis liste;

    public Vehicule listeVehicules;

    public Date getDateExpiration() {
        // TODO implement here
        return null;
    }

    public void setDatExpiration(Date d) {
        // TODO implement here
    }

    public String getStatut() {
        // TODO implement here
        return "";
    }

    public void setStatut(String s) {
        // TODO implement here
    }

    public int getIdentifiant() {
        // TODO implement here
        return 0;
    }

    public String getTypePermis() {
        // TODO implement here
        return "";
    }

    public void setTypePermis( String s) {
        // TODO implement here
    }

}