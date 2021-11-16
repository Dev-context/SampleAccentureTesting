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

	@E("seleciono na opcao Make:{string}")
	public void seleciono_na_opcao_make(String string) {
		getOptionSelectMake(string);

	}

	@E("preencho o campo Engine Performance [kW]:{string}")
	public void preencho_o_campo_engine_performance_k_w(String string) {
		typeEnginePerformace(string);
	}

	@E("informo a Date of Manufacture:{string}")
	public void informo_a_date_of_manufacture(String string) {

		setDateManufacture(string);
	}

	@E("seleciono na opcao Number of Seats: {int}")
	public void seleciono_na_opcao_number_of_seats(Integer int1) {
	    selectNumberSeats(int1);
	}

	

	@E("seleciono na opcao Fuel Type:{string}")
	public void seleciono_na_opcao_fuel_type(String string) {
		selectFuelType(string);

	}

	@E("informo a List Price [$]{int}")
	public void informo_a_list_price_$(Integer int1) {
		typeListPrice(Integer.toString(int1));
	}

	@E("infomo a License Plate Number:{string}")
	public void infomo_a_license_plate_number(String string) {
		typeLicenseNumber(string);
	}

	@E("informo a Annual Mileage [mi]: {int}")
	public void informo_a_annual_mileage_mi(Integer int1) {
	    typeAnnualMileage(int1);
	}

	@E("clico no botao Next")
	public void clico_no_botao_next() {
		nextPage();
	}

	@Entao("vou para aba Enter Insurant Data")
	public void vou_para_aba_enter_insurant_data() {
		validateNextpage();
	}
	
	@Dado("que esteje na aba enter Insurant Data")
	public void que_esteje_na_aba_enter_insurant_data() {
		setDriver();
		navegateTo();
		confirmPage();
	}

	@Quando("preencho First Name: {string}")
	public void preencho_first_name(String string) {
		typeFistname(string);
	}

	@E("preencho Last Name: {string}")
	public void preencho_last_name(String string) {
		typeLastName(string);
	}

	@E("preencho Date of Birth: {string}")
	public void preencho_date_of_birth(String string) {
		typeDateBirth(string);
	}

	@E("seleciono genero: {string}")
	public void seleciono_genero(String string) {

	}

	@E("preencho Street Adress: {string}")
	public void preencho_street_adress(String string) {
		typeStreetAddress(string);
	}

	@E("seleciono Country: {string}")
	public void seleciono_country(String string) {
		selectCountry(string);
	}

	@E("preencho Zip Code: {string}")
	public void preencho_zip_code(String string) {
		typeZipCode(string);
	}

	@E("preencho City: {string}")
	public void preencho_city(String string) {
		typeCity(string);
	}

	@E("seleciono o Occupation: {string}")
	public void seleciono_o_occupation(String string) {
		selectOccupation(string);
	}

	@E("informo os Hobbies")
	public void informo_os_hobbies() {

	}

	@E("preencho o Website:{string}")
	public void preencho_o_website(String string) {
		typeWebSite(string);
	}

	@E("insiro a Picture")
	public void insiro_a_picture() {
		typePicture();
	}

	@E("clico em Next")
	public void clico_em_next() {
		clickNext();
	}

	@Entao("vou para aba enter Product Data")
	public void vou_para_aba_enter_product_data() {

		confirmNextPage();
	}

}
