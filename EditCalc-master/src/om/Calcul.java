package om;
import java.util.Scanner;
public class Calcul {
	private int a;
	private int b;
	public Calcul() {
		this.setA(((int)(Math.random()*(9))));
		this.setB(((int)(Math.random()*(9))));
	}

	public int operationCalcul(int rand){
		int somme = getA() + getB();
		System.out.println(somme);
		int diff  = getA() - getB();
		System.out.println(diff);
		if (rand == 1) {
			while(somme > 10) {
				a = (int)(Math.random()*(9));
				b = (int)(Math.random()*(9));
				somme = getA() + getB();
			}
			return somme;
		}
		else {
			while(diff < 0) {
				a = (int)(Math.random()*(9));
				b = (int)(Math.random()*(9));
				diff = getA() - getB();
			}
			return diff;
		}
	}
	public String afficherCalcul(int rand) {
		if (rand == 1) {
			//return this.getA() + " + " + this.getB();
			return " + ";
		}
		else {
			//return this.getA() + " - " + this.getB();
			return " - ";
		}
	}
	
	public int proposerResultat(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Propose une reponse !");
		int j = sc.nextInt();
		sc.close();
		return j;
	}
	public boolean estIlJuste(int c, int r){
		return r == c;
	}
	/*public String afficherResultat(String str){
		int r = Integer.parseInt(str);
		String text = "Vous avez propos� " + r;
		return text;
	}*/
	public String afficherResultat(boolean b){
		if (b) {
			return("Bonne Reponse");
		}
		else {
			return("Mauvaise Reponse");
		}
	}
	public void afficherResultatDeux(boolean b, int r){
		if (b) System.out.println("Bonne Reponse");
		else {
			System.out.println("Mauvaise Reponse");
			System.out.println("La reponse est " + r);
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {

		this.a = a;
	}

	public int getB() {

		return b;
	}

	public void setB(int b) {

		this.b = b;
	}
}