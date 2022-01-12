package Model;

import java.util.*;

public class Vehicule {

    public Vehicule(int numEmatriculation, String marque) {
        this.numEmatriculation = numEmatriculation;
        this.marque = marque;
    }

    public int numEmatriculation;
    public String marque;
    public Licence licence;

    public int getNumEmatricule() {
        return this.numEmatriculation;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String s) {
        this.marque = s;
    }

    public Licence getLicence() {
        return this.licence;
    }

    public void setLicence( Licence l) {
        this.licence= l;
    }

}