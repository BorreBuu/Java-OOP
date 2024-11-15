
public class Tulostin {
	public void tulostaMonesti(Object object, int kertaa) {
		int i = 0;
		while (i < kertaa) {
			System.out.println(object);
			i ++;
		}
	}
	
	public void tulostaMerkit(CharSequence charSequence) {
		int i = 0;
		while (i < charSequence.length()) {
			System.out.println(charSequence.charAt(i));
			i++;
		}
	}
	
	public static void main(String[] args) {
		Tulostin tulostin = new Tulostin();
		String mjono = "tulee pötkö";
		tulostin.tulostaMerkit(mjono);
	}

}
