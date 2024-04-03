package iut.bad;

public class Humain {

	static String nom;
	String prenom;
	int age;
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return"Nom :" + nom + "Prenom :" + prenom + "Age :" + age;
	}
	
	public static void ami(humain humain1, humain humain2) {
		if (humain1 == humain2) {
            System.out.println("Un humain ne peut pas être ami avec lui-même.");
            return;
        }

        System.out.println(humain1.nom + " et " + humain2.nom + " sont maintenant amis !");
    
	}
	
}
