package Model;

import java.util.*;

public class Licence  {

    public Licence(Date d, Conducteur c) {

    }

    public String statut;
    public Date dateExpiration;
    public String policeAssurance;
    public ArrayList<Vehicule> listeVehicule;
    private int identifiant;
    public String typePermis;
    public Conducteur Conducteur;
    public ArrayList<Licence> ListesPermis;
    public Vehicule listeVehicules;

    public Date getDateExpiration() {
        return this.dateExpiration;
    }

    public void setDatExpiration(Date d) {
        this.dateExpiration = d;
    }

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String s) {
        this.statut = s;
    }

    public int getIdentifiant() {
        return this.identifiant;
    }

    public String getTypePermis() {
        return this.typePermis;
    }

    /// a modifier
    public void setTypePermis( String s) {
        this.typePermis = s;
    }

    

}