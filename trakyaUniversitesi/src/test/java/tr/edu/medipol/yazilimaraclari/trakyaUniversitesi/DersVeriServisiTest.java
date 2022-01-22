package tr.edu.medipol.yazilimaraclari.trakyaUniversitesi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class DersVeriServisiTest {

	@Test
	void testDersleriGetir() {
		List<Ders> sonuc = DersVeriServisi.dersleriGetir();
		assertEquals(DersVeriServisi.dersleriGetir(),sonuc);
	}

}
