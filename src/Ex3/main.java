package Ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class main {

	public static void main(String[] args) throws IOException,ClassNotFoundException, CloneNotSupportedException  {
		String [] auts = {"Zineb","Fadwa","Fati"};
		String [] auts2 = {"Khaoula"};
//		Livre L1=new Livre("Java",arts,"IZN14",1000);
//		System.out.println("L1:"+L1.toString());
//		Livre L2=L1;
//		System.out.println("L2:"+L2.toString());
//		L2.setPrix(2000);
//		System.out.println("L1:"+L1.toString());
//		System.out.println("L2:"+L2.toString());
		System.out.println("USING CLONE");
		Livre L1=new Livre("Java",auts,"IZN14",1000);
		//System.out.println("L1:"+L1.toString());
		//Livre L2=(Livre) L1.clone();
		Livre L2=new Livre("C++",auts2,"I4",1500);
		List<Livre> list1 = new ArrayList<Livre>();
		list1.add(L1);
		list1.add(L2);
		System.out.println("Before");
		System.out.println("List 1 :"+list1.toString());
	
		List<Livre> list2= new ArrayList<Livre>();
		
		for(Livre L : list1)
		{
			Livre Lcloned = (Livre) L.clone();
			list2.add(Lcloned);
		}
	
		
		System.out.println("Remove Object -- After");
		for(Livre L : list2)
		{
			L.setPrix(10);
		}

		System.out.println("List1:"+list1.toString());
		System.out.println("List2:"+list2.toString());
		
		
		/*String [] auts = {"Zineb","Fadwa","Fati"};
		String [] auts2 = {"Khaoula"};
		String [] auts3 = {"Fatin"};
		Livre L1=new Livre("Java",auts,"IZN14",1000);
		Livre L2=new Livre("C++",auts2,"I4",1500);
		Livre L3=new Livre("Linux",auts3,"I54114",2000);*/
//		Scanner clavier = new Scanner(System.in); 
//		Bibliotheque B1= new Bibliotheque(10); 
//		int choix=1;
//		while(choix!=0)
//		{
//			System.out.println("------------------MENU BIBILIOTHEQUE----------------");
//			System.out.println(" 0 : Quitter le menu ");
//			System.out.println(" 1 : Ajouter un livre ");
//			System.out.println(" 2 : Afficher les éléments de bibliothèque ");
//			System.out.println(" 3 : Rechercher les livres d'un auteur ");
//			System.out.println(" 4 : Sérialiser les données ");
//			System.out.println(" 5 : Désérialiser les données ");
//			choix = clavier.nextInt();
//			switch(choix){
//			   case 1: 
//				   System.out.println("--------------Ajouter un livre--------------");
//				   clavier.nextLine();
//				   System.out.println("\t- Titre de Livre : ");
//				   String titre = clavier.nextLine();
//				   
//				   
//	               System.out.println("\t- ISBN : ");
//	               String isbn = clavier.nextLine();
//	               
//	               
//	               System.out.println("\t- Prix : ");
//	               double prix = clavier.nextDouble();
//	               
//	               System.out.println("\t- Nombre des auteurs : ");
//	               
//	               int i=0;
//	               int nbr= clavier.nextInt();
//	               clavier.nextLine();
//	               System.out.println("\t- Liste des auteurs : ");
//	               
//	               String listeAut = clavier.nextLine();
//	               String[] auts = new String[nbr];
//	               
//	               StringTokenizer st = new StringTokenizer(listeAut," ");
//	               
//	               while(st.hasMoreTokens())
//	                {
//	                	 String current = st.nextToken();
//	                	 auts[i] = current;
//	                	 i++;
//	                }
//	              
//	               Livre L=new Livre(titre,auts,isbn,prix);
//	               B1.ajoutLivre(L);   
//			   		
//		           break;
//			   case 2:
//		    	   System.out.println("--------------Afficher les éléments de bibliothéque--------------");
//		    	   System.out.println(B1);
//		           break;
//		       case 3:
//		    	   System.out.println("--------------Rechercher les livres d'un auteur--------------");
//		    	   Vector V = new Vector();
//		    	   clavier.nextLine();
//		   		   System.out.println("\nEntrez nom d'auteur : ");
//		   		   String aut=clavier.nextLine();
//		   		   V=B1.Chercher(aut);
//		   		   System.out.println(V);
//		   		   break;
//		       case 4:
//		    	   System.out.println("--------------Sérialisation des données--------------");
//		    	   ObjectOutputStream oos = null;
//		    	  
//		   			try {
//		   			 FileOutputStream fich = new FileOutputStream("bib.txt");
//		   			 oos = new ObjectOutputStream(fich);
//				     oos.writeObject(B1); 
//				     oos.flush();
//		   			}
//		   			catch(IOException e ) {
//		   				System.out.println(""+e.toString());
//		   			} 
//			   		finally {
//			   			oos.close();
//			   		}
//		   		   break;
//		       case 5:
//		    	   System.out.println("-------------Désérialisation des données--------------");
//		    	   ObjectInputStream ois = null;
//		    	   
//		    	   try {
//		    		   FileInputStream fich = new FileInputStream("bib.txt");
//		    		   ois = new ObjectInputStream(fich);
//		    		   B1 = (Bibliotheque) ois.readObject();
//		    		   System.out.println(B1);
//		    	   }
//		    	   catch(ClassNotFoundException e) {
//		    		   System.out.println(""+e.toString());
//		   			} 
//			   		finally {
//			   			ois.close();
//			   		}
//		    	   break;
//		    	   
//			 }
//		};
//		System.out.println("-------------END-------------");
//		clavier.close();
	}
}
