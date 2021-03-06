package pages;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterVehicledataPage extends BaseClases {

	// Aba Vehicle
	private By ClickMenuAtomobilie = By.id("nav_automobile");
	private By abaEnterVehicleData = By.id("entervehicledata");
	private By make = By.id("make");
	private By enginePerformace = By.id("engineperformance");
	private By model = By.id("model");
	private By dateOfManufacture = By.id("dateofmanufacture");
	private By numberOfSeats = By.id("numberofseats");
	private By fuelType = By.id("fuel");
	private By listPrice = By.id("listprice");
	private By licensePlateNumber = By.id("licenseplatenumber");
	private By annualmileage = By.id("annualmileage");
	private By nextEnterInsurantdata = By.id("nextenterinsurantdata");

	// aba Enter Insurant Data
	private By EnterInsurantData = By.id("enterinsurantdata");
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By dateBirth = By.id("birthdate");
	private By groupgender = By.xpath("//label[contains(.,'Male')]");
	private By streetAddress = By.id("streetaddress");
	private By country = By.id("country");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By groupHobbies = By.xpath("//div[10]/p");
	private By website = By.id("website");
	private By picture = By.id("picture");
	private By nextEnterProductdata = By.id("nextenterproductdata");

	// Aba Enter Product data

	private By startDate = By.id("startdate");
	private By insuranceSum = By.id("insurancesum");
	private By meritRating = By.id("meritrating");
	private By damageInsurance = By.id("damageinsurance");
	private By GroupOptionalProduct = By.xpath("//div[5]/p");
	private By courtesyCar = By.id("courtesycar");
	private By nextSelectpriceOption = By.id("nextselectpriceoption");

	// Aba Select price Option

	private By table = By.id("priceTable");
	private By nextSendquote = By.id("nextsendquote");

	// Send Quote
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By userName = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By comments = By.id("Comments");
	private By sendEmail = By.id("sendemail");
	private By mensagem = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");

	@Before
	public void openPage() {
		setDriver();
		navegateTo();

	}

	// entervehicledata
	public void clickAutomobile() {
		dsl.click(ClickMenuAtomobilie);
	}

	public void getOptionSelectMake(String opcao) {
		assertEquals(true, dsl.selectOption(make, opcao));

	}

	public void typeEnginePerformace(String kw) {
		assertThat(Integer.parseInt(kw), allOf(greaterThanOrEqualTo(1), lessThanOrEqualTo(2000)));
		dsl.write(enginePerformace, kw);

	}

	public void setDateManufacture(String date) {

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		dateFormat.format(cal.getTime());

		try {
			// String to data parameter
			assertThat(df.parse(date), allOf(lessThanOrEqualTo(cal.getTime())));
			dsl.write(dateOfManufacture, date);
		} catch (ParseException e) {

		}

	}

	public void selectNumberSeats(Integer seat) {
		assertEquals(true, dsl.selectOption(numberOfSeats, seat.toString()));

	}

	public void selectFuelType(String fueltype) {
		assertEquals(true, dsl.selectOption(fuelType, fueltype));

	}

	public void typeListPrice(String price) {
		dsl.write(listPrice, price);
	}

	public void typeLicenseNumber(String license) {
		dsl.write(licensePlateNumber, license);
	}

	public void typeAnnualMileage(Integer mileage) {
		dsl.write(annualmileage, mileage.toString());

	}

	public void nextPage() {
		dsl.click(nextEnterInsurantdata);
	}

	// Insurant data

	public void validateNextpage() {
		driver.findElement(By.id("enterinsurantdata")).getText();
	}

	public void confirmPage() {

		dsl.click(EnterInsurantData);

	}

	public void typeFistname(String name) {
		dsl.write(firstName, name);
	}

	public void typeLastName(String lastname) {
		dsl.write(lastName, lastname);

	}

	public void typeDateBirth(String birth) {
		dsl.write(dateBirth, birth);
	}

	public void selectGender(String gender) {
		driver.findElement(By.xpath("//label[contains(.,'" + gender + "')]")).click();

	}

	public void typeStreetAddress(String address) {
		dsl.write(streetAddress, address);
	}

	public void selectCountry(String country) {
		assertEquals(true, dsl.selectOption(this.country, country));

	}

	public void typeZipCode(String zipCode) {
		dsl.write(this.zipCode, zipCode);
	}

	public void typeCity(String city) {
		dsl.write(this.city, city);
	}

	public void selectOccupation(String option) {

		assertEquals(true, dsl.selectOption(occupation, option));
	}

	public void selectHobbies(String hobbie) {

		ArrayList<WebElement> hobbies = (ArrayList<WebElement>) driver.findElement(groupHobbies)
				.findElements(By.tagName("label"));

		hobbies.forEach(e -> e.click());

	}

	public void typeWebSite(String site) {
		dsl.write(website, site);
	}

	public void typePicture() {
		driver.findElement(picture).sendKeys("c://");
	}

	public void clickNext() {
		dsl.click(nextEnterProductdata);

	}

	// Enter Product Data

	public void typeStartDate(String date) {
		dsl.write(startDate, date);
	}

	public void selectInsuranceSum(String option) {
		assertEquals(true, dsl.selectOption(insuranceSum, option));

	}

	public void selectMeritRating(String option) {
		assertEquals(true, dsl.selectOption(meritRating, option));
	}

	public void selectDamageInsurance(String option) {
		assertEquals(true, dsl.selectOption(damageInsurance, option));
	}

	public void selectOptionalProduct() {
		ArrayList<WebElement> optionalProducts = (ArrayList<WebElement>) driver.findElement(GroupOptionalProduct)
				.findElements(By.tagName("label"));

		optionalProducts.forEach(e -> e.click());

	}

	public void selectCourstesyCar(String option) {
		assertEquals(true, dsl.selectOption(courtesyCar, option));
	}

	public void clickNext1() {
		dsl.click(nextSelectpriceOption);
	}

	// Select Price Option

	public void selectPriceOption(String option) {

		ArrayList<WebElement> priceOption = (ArrayList<WebElement>) driver
				.findElement(By.xpath("//*[@id=\"priceTable\"]/thead/tr")).findElements(By.xpath("th"));
		int position = 0;
		for (int i = 0; i < priceOption.size(); i++) {

			if (priceOption.get(i).getText().equals(option)) {

				position = i;
			}
		}

		driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label" + "[" + position + "]")).click();

	}

	public void NextSend() {
		dsl.click(nextSendquote);
	}

	public void typeEmail(String email) {
		dsl.write(this.email, email);
	}

	public void typePhone(String phone) {
		dsl.write(this.phone, phone);
	}

	public void typeUsername(String userName) {
		dsl.write(this.userName, userName);
	}

	public void typePassword(String password) {
		dsl.write(this.password, password);
	}

	public void typeConfirmPassword(String password) {
		dsl.write(confirmPassword, password);
	}

	public void typeComments(String comments) {
		dsl.write(this.comments, comments);
	}

	public void sendEmail() {
		dsl.click(sendEmail);
	}

	public void confirmMensagem() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("LoadingPDF")));
		assertEquals("Sending e-mail success!", driver.findElement(mensagem).getText());
		closeDriver();
	}

}
