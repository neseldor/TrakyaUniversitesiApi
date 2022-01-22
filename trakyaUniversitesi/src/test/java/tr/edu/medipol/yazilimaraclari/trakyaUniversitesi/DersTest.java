package tr.edu.medipol.yazilimaraclari.trakyaUniversitesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DersTest {

	@Test
	void testGetDersAd() {
		Ders ders = new Ders("Edebiyat", "9");
		String sonuc = ders.getDersAd();
		assertEquals("Edebiyat", sonuc);
	}

	@Test
	void testGetDersId() {
		Ders ders = new Ders("Edebiyat", "9");
		String sonuc = ders.getDersId();
		assertEquals("9", sonuc);
	}

}
