package Model;

import java.util.*;

/**
 * 
 */
public class ListesPermis extends ListesPermis_ClasseAbstraite {

    /**
     * Default constructor
     */
    public ListesPermis() {
    }

    /**
     * 
     */
    public ArrayList<Licence> liste;


    /**
     * @param int identifiantPermis 
     * @param Vehicule v 
     * @return
     */
    public void AjouterVehiculeAuPermis( int identifiantPermis, Vehicule v) {
        // TODO implement here
    }

    /**
     * @param int identifiantPermis 
     * @param Vehicule v 
     * @return
     */
    public void RetirerVehiculeAuPermis( int identifiantPermis, Vehicule v) {
        // TODO implement here
    }

    /**
     * @param int identifiantPermis 
     * @param Date nouvelleDateExpiration 
     * @return
     */
    public void RenouvelerPermis( int identifiantPermis, Date nouvelleDateExpiration) {
        // TODO implement here
    }

    /**
     * @param int identifiantPermis 
     * @return
     */
    public void SuspendrePermis(int identifiantPermis) {
        // TODO implement here
    }

    /**
     * @param int identifiantPermis 
     * @return
     */
    public void SupprimerPermis(int identifiantPermis) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void AfficherListePermis() {
        // TODO implement here
    }

}