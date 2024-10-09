package tp4;

public class maison {
	private String adr;
	private String type;
	private int nbchambre;
	private float surface;
	public maison(String adr,String t,int n) {
		this.adr=adr;
		this.type=t;
		this.nbchambre=n;
	}
	public maison(String adr,String t,int n,float s) {
		this.adr=adr;
		this.type=t;
		this.nbchambre=n;
		this.surface=s;
	}
	public void setSurface(float s) {
		this.surface=s;
	}
	public  void calculPrix(float pmc) {
		System.out.println("le prix est " +this.surface * pmc);
	}
	public void calculPrix() {
		System.out.println("le prix est " +this.surface * 2100);
	}
	public String toChaine() {
		return this.type+" de "+this.surface+" a "+this.adr+" avec "+this.nbchambre+" chambres";
	}
	
}
