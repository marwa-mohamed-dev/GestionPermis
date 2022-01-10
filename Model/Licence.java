package Model;

import java.util.*;

/**
 * 
 */
public class Licence {

    /**
     * Default constructor
     */
    public Licence() {
    }

    /**
     * 
     */
    public String statut;

    /**
     * 
     */
    public Date dateExpiration;

    /**
     * 
     */
    public String policeAssurance;

    /**
     * 
     */
    public ArrayList<Vehicule> listeVehicule;

    /**
     * 
     */
    private int identifiant;

    /**
     * 
     */
    public String typePermis;

    /**
     * 
     */
    public Conducteur Conducteur;

    /**
     * 
     */
    public ListesPermis liste;

    /**
     * 
     */
    public Vehicule listeVehicules;

    /**
     * @return
     */
    public Date getDateExpiration() {
        // TODO implement here
        return null;
    }

    /**
     * @param Date d 
     * @return
     */
    public void setDatExpiration(Date d) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getStatut() {
        // TODO implement here
        return "";
    }

    /**
     * @param String s 
     * @return
     */
    public void setStatut(String s) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getIdentifiant() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String getTypePermis() {
        // TODO implement here
        return "";
    }

    /**
     * @param String s 
     * @return
     */
    public void setTypePermis( String s) {
        // TODO implement here
    }

}