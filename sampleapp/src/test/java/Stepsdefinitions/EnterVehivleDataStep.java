package Stepsdefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.EnterVehicledataPage;

public class EnterVehivleDataStep extends EnterVehicledataPage {

	
	@Dado("que estou acensando a aplicacao")
	public void que_estou_acensando_a_aplicacao() {
		 openPage();
	}

	@Quando("clico em Automobilie")
	public void clico_em_automobilie() {
		clickAutomobile();
	}

	@Quando("seleciono na opcao Make:{string}")
	public void seleciono_na_opcao_make(String string) {
		getOptionSelectMake(string);
	}

	@Quando("preencho o campo Engine Performance [kW]:{string}")
	public void preencho_o_campo_engine_performance_k_w(String string) {
		typeEnginePerformace(string);
	}

	@Quando("informo a Date of Manufacture:{string}")
	public void informo_a_date_of_manufacture(String string) {
		setDateManufacture(string);
	}

	@Quando("seleciono na opcao Number of Seats: {int}")
	public void seleciono_na_opcao_number_of_seats(Integer int1) {
		selectNumberSeats(int1);
	}

	@Quando("seleciono na opcao Fuel Type:{string}")
	public void seleciono_na_opcao_fuel_type(String string) {
		selectFuelType(string);
	}

	@Quando("informo a List Price [$]:{int}")
	public void informo_a_list_price_$(Integer int1) {
		typeListPrice(int1.toString());
	}

	@Quando("infomo a License Plate Number:{string}")
	public void infomo_a_license_plate_number(String string) {
		typeLicenseNumber(string);
	}

	@Quando("informo a Annual Mileage [mi]: {int}")
	public void informo_a_annual_mileage_mi(Integer int1) {
		typeAnnualMileage(int1);
	}

	@Quando("clico no botao Next")
	public void clico_no_botao_next() {
		nextPage();
	}

	@Quando("vou para aba Enter Insurant Data")
	public void vou_para_aba_enter_insurant_data() {
		//validateNextpage();
	}

	@Quando("preencho First Name: {string}")
	public void preencho_first_name(String string) {
		typeFistname(string);
	}

	@Quando("preencho Last Name: {string}")
	public void preencho_last_name(String string) {
		typeLastName(string);
	}

	@Quando("preencho Date of Birth: {string}")
	public void preencho_date_of_birth(String string) {
		typeDateBirth(string);
	}

	@Quando("seleciono genero: {string}")
	public void seleciono_genero(String string) {
		selectGender(string);
	}

	@Quando("preencho Street Adress: {string}")
	public void preencho_street_adress(String string) {
		typeStreetAddress(string);
	}

	@Quando("seleciono Country: {string}")
	public void seleciono_country(String string) {
		selectCountry(string);
	}

	@Quando("preencho Zip Code: {string}")
	public void preencho_zip_code(String string) {
		typeZipCode(string);
	}

	@Quando("preencho City: {string}")
	public void preencho_city(String string) {
		typeCity(string);
	}

	@Quando("seleciono o Occupation: {string}")
	public void seleciono_o_occupation(String string) {
		selectOccupation(string);
	}

	@Quando("informo os Hobbies")
	public void informo_os_hobbies() {
		selectHobbies("teste");
	}

	@Quando("preencho o Website:{string}")
	public void preencho_o_website(String string) {
		typeWebSite(string);
	}

	@Quando("insiro a Picture")
	public void insiro_a_picture() {
		//typePicture();
	}

	@Quando("clico em Next")
	public void clico_em_next() {
		clickNext();
	}

	@Quando("vou para aba Enter Product Data")
	public void vou_para_aba_enter_product_data() {
		// CONFIRMAR ABA DE FATO
	}

	@Quando("insiro a Start Date:{string}")
	public void insiro_a_start_date(String string) {
		typeStartDate(string);
	}

	@Quando("seleciono Insurance Sum [$]:{string}")
	public void seleciono_insurance_sum_$(String string) {
		selectInsuranceSum(string);
	}

	@Quando("seleciono Merit Rating:{string}")
	public void seleciono_merit_rating(String string) {
		selectMeritRating(string);
	}

	@Quando("seleciono Damage Insurance: {string}")
	public void seleciono_damage_insurance(String string) {
		selectDamageInsurance(string);
	}

	@Quando("marco a opcao Optional Products")
	public void marco_a_opcao_optional_products() {
		selectOptionalProduct();
	}

	@Quando("seleciono Courtesy Car:{string}")
	public void seleciono_courtesy_car(String string) {
		selectCourstesyCar(string);
	}

	@Quando("clico no botao Next ir para price Option")
	public void clico_no_botao_next_ir_para_price_option() {
		clickNext1();
	}

	@Quando("vou para aba Select Price Option")
	public void vou_para_aba_select_price_option() {
	  
	}

	@Quando("marcar a opcao: {string}")
	public void marcar_a_opcao(String string) {
		selectPriceOption(string);
	}

	@Quando("clico em Next para ir para Send quote")
	public void clico_em_next_para_ir_para_send_quote() {
		 NextSend();
	}

	@Quando("vou para proxima aba Send Quote")
	public void vou_para_proxima_aba_send_quote() {
	    
	}

	@Quando("insiro o E-mail: {string}")
	public void insiro_o_e_mail(String string) {
		typeEmail(string);
	}

	@Quando("insiro o Phone:{string}")
	public void insiro_o_phone(String string) {
		typePhone(string);
	}

	@Quando("insiro o Username:{string}")
	public void insiro_o_username(String string) {
		typeUsername(string);
	}

	@Quando("insiro o Password:{string}")
	public void insiro_o_password(String string) {
		typePassword(string);
	}

	@Quando("insiro o Confirm Password:{string}")
	public void insiro_o_confirm_password(String string) {
		typeConfirmPassword(string);
	}

	@Quando("insiro o comments:{string}")
	public void insiro_o_comments(String string) {
		typeComments(string);
	}

	@Quando("clico em Send")
	public void clico_em_send() {
		 sendEmail();
	}

	@Entao("o sistema exibe uma mensagem de sucesso: {string}")
	public void o_sistema_exibe_uma_mensagem_de_sucesso(String string) {
     confirmMensagem();
	}
	
	

}
