package tr.edu.medipol.yazilimaraclari.trakyaUniversitesi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ders")
public class DersApi {
	/**
	 * http://localhost:8080/ders/DersListele
	 */
	@GetMapping("/DersListele")
	public List<Ders> dersListele() {
		return DersVeriServisi.dersleriGetir();
	}
	/**
	 * http://localhost:8080/ders/DersEkle
	 */
	@PostMapping("/DersEkle")
	public Ders dersEkle(@RequestBody Ders ders) {
		DersVeriServisi.dersEkle(ders);
		return ders;
	}
	/**
	 * http://localhost:8080/ders/DersSil/:id
	 */
	@DeleteMapping("/DersSil/{dersId}")
	public int dersSil(@PathVariable("dersId") int dersId) {
		DersVeriServisi.dersSil(dersId);
		return dersId;
	}

		
}
