package Ex3;

import java.io.Serializable;
import java.util.Arrays;

public class Livre implements Serializable, Cloneable {
	private String titre;
	private String auteurs[];
	private String numISBN;
	private double prix;
	
	public Livre(String titre, String[] auteurs, String numISBN, double prix) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.numISBN = numISBN;
		this.prix = prix;
	}
	
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String toString()
	{
		String show="\n Livre : [ Nom = "+titre+"  NumISBN : "+numISBN+"  prix : " +prix+ " ]";
		show+="\n Liste des auteurs : [  ";
		for (String A : auteurs) // 
			show+=A+"  ";
		show+=" ]";
		return show;
	}
	/*public String toString() {
		return "Livre [titre=" + titre + ", auteurs=" + Arrays.toString(auteurs) + ", numISBN=" + numISBN + ", prix="
				+ prix + "]";
	}*/
	String[] getAuts()
	{
		return auteurs;
	}
	
	String getTitre()
	{
		return titre;
	}
	
	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	
	
}
