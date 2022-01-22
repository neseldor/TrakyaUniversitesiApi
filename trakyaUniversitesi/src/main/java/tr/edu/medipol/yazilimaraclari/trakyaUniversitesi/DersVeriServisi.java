package tr.edu.medipol.yazilimaraclari.trakyaUniversitesi;

import java.util.ArrayList;
import java.util.List;

public class DersVeriServisi {
	private static final List<Ders> DERSLER = new ArrayList<>();
	static {
		DERSLER.add(new Ders("Matematik","1"));
		DERSLER.add(new Ders("Programlamaya Giris","2"));
		DERSLER.add(new Ders("C Programlama","3"));
		DERSLER.add(new Ders("Python","4"));
		DERSLER.add(new Ders("Java Programlama","5"));
		DERSLER.add(new Ders("Mobil Yazilimlar","6"));
		
	}
	public static List<Ders> dersleriGetir(){
		return DERSLER;
	}
	public static void dersEkle(Ders ders) {
		DERSLER.add(ders);
	}
	public static void dersSil(int dersId) {
		DERSLER.remove(dersId-1);
	}
}
