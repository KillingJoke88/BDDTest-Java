package stepDefinitions.createuser;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_CreateUserAccount {
	
	
	@Given("Je n'ai pas de compte")
	public void je_n_ai_pas_de_compte() {
		System.out.println("Je n'ai pas de compte");
	}

	@When("Je suis sur l'écran de création de compte")
	public void je_suis_sur_l_écran_de_création_de_compte() {
		System.out.println("Affichage écran d'inscription");
	}

	@Then("Je clique sur la saisie du email")
	public void je_clique_sur_la_saisie_du_email() {
		System.out.println("Clic barre de saisie de mail");
	}

	@Then("Je saisi mon email : abv@yahoo.fr")
	public void je_saisi_mon_email_abv_yahoo_fr() {
		System.out.println("Je tape abv@yahoo.fr");
	}

	@Then("Je clique sur la saisie du mot de passe")
	public void je_clique_sur_la_saisie_du_mot_de_passe() {
		System.out.println("Clic barre de saisie de mot de passe");
	}

	@Then("Je saisi mon mot de passe : {int}")
	public void je_saisi_mon_mot_de_passe(Integer int1) {
		System.out.println("Je tape "+int1);
	}

	@Then("Je clique sur la saisie validation du mot de passe")
	public void je_clique_sur_la_saisie_validation_du_mot_de_passe() {
		System.out.println("Clic barre de saisie validation de mail");
	}

	@Then("Je clique sur le bouton de validation")
	public void je_clique_sur_le_bouton_de_validation() {
		System.out.println("Clic sur le bouton Valider");
	}

	@Then("Je saisi mon email : test@gmail.com")
	public void je_saisi_mon_email_test_gmail_com() {
		System.out.println("Je tape test@gmail.com");
	}

	@Then("Je saisi mon mot de passe : somePassWithVeryLongValue")
	public void je_saisi_mon_mot_de_passe_somePassWithVeryLongValue() {
		System.out.println("Je tape somePassWithVeryLongValue");
	}

	@Then("Je saisi mon email : abv@yahoo.f")
	public void je_saisi_mon_email_abv_yahoo_f() {
		System.out.println("Je tape abv@yahoo.f");
		throw new PendingException("nom de domaine invalide dans le mail saisi");
	}

	@Then("Je saisi mon email : ab*v@yahoo.fr")
	public void je_saisi_mon_email_ab_v_yahoo_fr() {
		System.out.println("Je tape ab*v@yahoo.fr");
	    throw new PendingException("caractère invalide dans le mail saisi");
	}

	@Then("Je saisi mon email : t@gmail.com")
	public void je_saisi_mon_email_t_gmail_com() {
		System.out.println("Je tape t@gmail.com");
		throw new PendingException("texte avant @ trop court dans le mail saisi");
	}

	@Then("Je saisi mon email : µetatest@gmail.com")
	public void je_saisi_mon_email_etatest_gmail_com() {
		System.out.println("Je tape µetatest@gmail.com");
		throw new PendingException("caractère invalide dans le mail saisi");
	}

	@Then("Je saisi mon mot de passe : M{int}tDe")
	public void je_saisi_mon_mot_de_passe_M_tDe(Integer int1) {
		System.out.println("Je tape M"+int1+"tDe");
		throw new PendingException("Erreur: mot de passe minimum 8 caractères");
	}

	@Then("Je saisi mon mot de passe : m{int}tdep@sse")
	public void je_saisi_mon_mot_de_passe_m_tdep_sse(Integer int1) {
		System.out.println("Je tape m"+int1+"tdep@sse");
		throw new PendingException("Erreur: mot de passe ne contenant pas une lettre majuscule");
	}

	@Then("Je saisi mon mot de passe : M{int}TDEP@SSE")
	public void je_saisi_mon_mot_de_passe_M_TDEP_SSE(Integer int1) {
		System.out.println("Je tape M"+int1+"TDEP@SSE");
		throw new PendingException("Erreur: mot de passe ne contenant pas une lettre minuscule");
	}

	@Then("Je saisi mon mot de passe : MotDeP@sse")
	public void je_saisi_mon_mot_de_passe_MotDeP_sse() {
		System.out.println("Je tape MotDeP@sse");
		throw new PendingException("Erreur: mot de passe ne contenant pas de chiffre");
	}

	@Then("Je saisi mon mot de passe : M{int}tDePasse")
	public void je_saisi_mon_mot_de_passe_M_tDePasse(Integer int1) {
		System.out.println("Je tape M"+int1+"tDePasse");
		throw new PendingException("Erreur: mot de passe ne contenant pas un caractère spécial");
	}

}
