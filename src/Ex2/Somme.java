package Ex2;
public class Somme {

	public static void main(String[] args){
		int i,somme=0;
		
			for(i=0;i<args.length;i++)
			{
				try
				{
					somme+=Integer.parseInt(args[i]);
				}
				catch(NumberFormatException E1)
				{
					System.out.println("Problème de conversion "+args[i]+ " "+ E1.toString());
				}
			}
			System.out.println(" La somme est : "+somme);
	}

}
