package tr.edu.medipol.yazilimaraclari.trakyaUniversitesi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class DersApiTest {

	public DersApi dersApi = new DersApi();
	@Test
	public void testDersListele() {
		List<Ders> sonuc = dersApi.dersListele();
		assertEquals(dersApi.dersListele(),sonuc);
	}

	@Test
	public void testDersEkle() {
		Ders ders = new Ders("Ders1","8");
		Ders sonuc = dersApi.dersEkle(ders);
		assertEquals(ders,sonuc);
	}

	@Test
	public void testDersSil() {
		int dersId = 5;
		int sonuc = dersApi.dersSil(dersId);
		assertEquals(dersId,sonuc);
	}
}
