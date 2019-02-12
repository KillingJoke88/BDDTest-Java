package stepDefinitions.createuser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_CreateUserAccount {
	
	@Given("Je n ai pas de compte")
	public void je_n_ai_pas_de_compte() {
		System.out.println("Je n'ai pas de compte");
	}

	@When("Je suis sur l ecran de creation de compte")
	public void je_suis_sur_l_ecran_de_creation_de_compte() {
		System.out.println("Affichage écran d'inscription");
	}

	@Then("Je clique sur la saisie du email")
	public void je_clique_sur_la_saisie_du_email() {
		System.out.println("Clic barre de saisie de mail");
	}

	@Then("Je saisi mon email {string}")
	public void je_saisi_mon_email(String string) {
		System.out.println("Je tape "+ string);
	}

	@Then("Je clique sur la saisie du mot de passe")
	public void je_clique_sur_la_saisie_du_mot_de_passe() {
		System.out.println("Clic barre de saisie de mot de passe");
	}

	@Then("Je saisi mon mot de passe {string}")
	public void je_saisi_mon_mot_de_passe(String string) {
		System.out.println("Je tape "+ string);
	}

	@Then("Je clique sur la saisie validation du mot de passe")
	public void je_clique_sur_la_saisie_validation_du_mot_de_passe() {
		System.out.println("Clic barre de saisie validation de mail");
	}

	@Then("Je clique sur le bouton de validation")
	public void je_clique_sur_le_bouton_de_validation() {
		System.out.println("Clic sur le bouton Valider");
	}
}
