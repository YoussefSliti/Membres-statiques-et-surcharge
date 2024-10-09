
package tp4;
public class entier {
	public static int att=0;
	int att1=0;
	public  entier() {
		
	}
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static void absolu(int n) {
		if(n>=0) {
			System.out.println(n);
		}
		else {
			System.out.println(n *-1);
		}
	}
	public static void compare(int e1,int e2) {
		if(e1>e2) {
			System.out.println(e1 +"plus grand de "+e2);
		}
		else {
			System.out.println(e2 +"plus grand de "+e1);
		}
	}
	public static void premier(int n) {
		int nb=1;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				nb++;
			}
		}
		if(nb==1) {
			System.out.println("nombre "+n+" est premier");
		}
		else {
			System.out.println("nombre "+n+" n'est pas premier");
		}
	}
	
	

}
