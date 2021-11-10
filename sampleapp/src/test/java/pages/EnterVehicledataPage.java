package pages;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.openqa.selenium.By;

public class EnterVehicledataPage extends BaseClases {

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
	private By next = By.id("nextenterinsurantdata");
	
	
	
	private By EnterInsurantData=By.id("enterinsurantdata");
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By dateBirth = By.id("birthdate");
	private By groupgender = By.xpath("");
	private By streetAddress = By.id("streetaddress");
	private By country = By.id("country");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By groupHobbies = By.xpath("");
	private By website = By.id("website");
	private By picture = By.id("picture");
	private By nextdata=By.id("nextenterproductdata");
    private By itemMenuEnterProductData=By.id("nextenterproductdata");
    
    
    
    
    
    
    
	@Before
	public void openPage() {
		setDriver();
		navegateTo();

	}

	public void clickAutomobile() {
		driver.findElement(ClickMenuAtomobilie).click();
	}

	public void getOptionSelectMake(String opcao) {
		driver.findElement(make).findElements(By.tagName("option")).get(1).click();

	}

	public void typeEnginePerformace(String kw) {
		driver.findElement(enginePerformace).sendKeys(kw);
	}

	public void setDateManufacture(String date) {
		driver.findElement(dateOfManufacture).sendKeys(date);

	}

	public void selectNumberSeats(int seat) {
		driver.findElement(numberOfSeats).findElements(By.tagName("option")).get(seat).click();
	}

	public void selectFuelType(String fueltype) {
		driver.findElement(fuelType).findElements(By.tagName("option")).get(1).click();
	}

	public void typeListPrice(String price) {
		driver.findElement(listPrice).sendKeys(price);
	}

	public void typeLicenseNumber(String license) {
		driver.findElement(licensePlateNumber).sendKeys(license);
	}

	public void typeAnnualMileage(Integer mileage) {
		driver.findElement(annualmileage).sendKeys(mileage.toString());
	}

	public void nextPage() {
		driver.findElement(next).click();
	}

	public void validateNextpage() {
		 driver.findElement(By.id("enterinsurantdata")).getText();
	}
	public void confirmPage() {
		
		driver.findElement(EnterInsurantData).click();;
		
	}
	public void typeFistname(String name) {
		driver.findElement(firstName).sendKeys(name);
	}

	public void typeLastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}

	public void typeDateBirth(String birth) {
		driver.findElement(dateBirth).sendKeys(birth);
	}

	public void selectGender(String gender) {
		driver.findElement(groupgender ).findElements(By.tagName("option")).get(1).click();

	}

	public void typeStreetAddress(String address) {
		driver.findElement(streetAddress).sendKeys(address);
	}

	public void selectCountry(String country) {
		driver.findElement(this.country).findElements(By.tagName("option")).get(1).click();
	}

	public void typeZipCode(String zipCode) {
		driver.findElement(this.zipCode).sendKeys(zipCode);
	}

	public void typeCity(String city) {
		driver.findElement(this.city).sendKeys(city);
	}

	public void selectOccupation(String option) {
		driver.findElement(occupation).findElements(By.tagName("option")).get(1).click();
	}

	public void selectHobbies(String hobbie) {
		driver.findElement(groupHobbies).findElements(By.tagName("option")).get(1).click();

		
	}

	public void typeWebSite(String site) {
		driver.findElement(website).sendKeys(site);
	}

	public void typePicture() {
		driver.findElement(picture).sendKeys("c://");
	}
	
	
	public void clickNext() {
		driver.findElement(next).click();
	}
	
	
	public void confirmNextPage() {
		driver.findElement(nextdata).getText();
	}
	
	
	
	
	
}
