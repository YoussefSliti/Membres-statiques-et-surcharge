package tp4;

public class ex3 {

	public static void main(String[] args) {
		maison m1=new maison("Tunis","un duplex",4,210);
		maison m2=new maison("Nabeul","une villa",5);
		m1.calculPrix();
		m2.setSurface(180);
		m2.calculPrix(1500);
		System.out.println(m1.toChaine());
		System.out.println(m2.toChaine());
	}

}
