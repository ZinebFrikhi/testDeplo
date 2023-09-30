package Ex3;
import Ex3.Livre;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Vector;


public class Bibliotheque implements Serializable {
	private int nbrMax;
	private Livre[]Biblio;
	public Bibliotheque(int nbr)
	{
		nbrMax=nbr;
		Biblio=new Livre[nbr];
	}
	public int capacite()
	{
		return nbrMax;
	}
	public boolean ajoutLivre(Livre L)
	{
		if(Biblio.length<=nbrMax)
		{
			Biblio[size()]=L;
			return true;
		}
		
		return false;
	}
	public int size()
	{
		int i=0;
		for (Livre L : Biblio) // pour chaque Livre L de tableau Biblio
			if (L!=null) i++;
		return i;
	}

	public String toString() {
		String show="Bibliotheque : [ Nbr Max = "+nbrMax+" ] \n LA LISTE DES LIVRES : ";
		for ( Livre L : Biblio )
		{
			if (L!=null)
			{
				show+=L.toString();
			}
		}
		show+="\n La capacité : "+capacite();
		show+="\n La taille : "+size();
		return show;
	}
	
	Vector Chercher(String auteur)
	{
		Vector V=new Vector(); 
		for(Livre L : Biblio) 
		{
			if(L!=null)
			{
				for(String A : L.getAuts())
				{
					if(A.equals(auteur) || A.startsWith(auteur)) V.add(L.getTitre());
				}
			}
			
		}
		return V;
	}

	
}
