package dev.paie;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import dev.paie.controller.EntrepriseDTO;

public class EntrepriseApiTest {

	@Test
	public void listeEntreprise() {
		RestTemplate rt = new RestTemplate();
		EntrepriseDTO[] result = rt.getForObject("https://paie-apii.herokuapp.com/entreprises", EntrepriseDTO[].class);

		for (EntrepriseDTO entrepriseDTO : result) {
			Assert.assertNotNull(entrepriseDTO.getCode());
			Assert.assertNotNull(entrepriseDTO.getDenomination());
		}
	}

}
