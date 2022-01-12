package Model;


public interface Interface_ListesPermis {
        //Enlève tous les permis
		public void clear();
		
		//Vérifie si la liste est vide ou non
		public boolean isEmpty();
		
		//Donne la taille (nombre de permis) de la liste
		public int size();
		
		//Vérifie si le permis l se trouve dans la liste
		public boolean contains(Licence l);
		
		//Ajoute un permis dans la liste s'il n'existe pas
		public boolean add(Licence l);
		
		//Enlève et retourne le permis l (null sinon)
		public Licence remove(Licence l);
		
}

