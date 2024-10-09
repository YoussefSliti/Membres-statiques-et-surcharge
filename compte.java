package tp4;

public class compte {
		private int num;
		private float sold=0;
		public static int ref=0;
		public compte() {
			ref++;
			this.num=ref;
			sold=0;
		}
		public void deposer(float m) {
			this.sold+=m;
		}
		public void retirer(float m) {
			this.sold-=m;
		}
		public float avoirSold() {
			return this.sold;
		}
		public void transferer(float m, compte c) {
			c.sold+=m;
		}
		public void enrouge() {
			if(this.sold<0) {
				System.out.println("le compte en rouge");
			}
			else {
				System.out.println("compte valid");
			}
		}
}
