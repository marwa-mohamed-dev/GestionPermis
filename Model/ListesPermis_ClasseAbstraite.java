package Model;

import java.util.*;

public abstract class ListesPermis_ClasseAbstraite implements Interface_ListesPermis {
    ArrayList<Licence> licences = new ArrayList<>();
    public void add( Licence l) {
        licences.add(l);
    }

    public void remove(Licence l) {
        licences.remove(l);
    }

    public boolean isEmpty() {
        return (licences.size() == 0);
    }

    public int size() {
        return licences.size();
    }

    public boolean contains(Licence l) {
        return licences.contains(l);

	}

    

}