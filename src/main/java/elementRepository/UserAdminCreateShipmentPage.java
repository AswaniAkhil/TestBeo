package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class UserAdminCreateShipmentPage {
	WebDriver driver;
	String referenceNumber;
	GeneralUtilities gu = new GeneralUtilities();

	public UserAdminCreateShipmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='card']//div//div//div[@class='col-sm-3']//a//i[@class='fa-solid fa-user pe-0']")
	WebElement addressSelectionIcon;
	@FindBy(id = "txtTAnsprechpartner")
	WebElement ansprechPartnerField;
	@FindBy(id = "txtTFirma")
	WebElement firmaField;
	@FindBy(id = "txtTFirmenname2")
	WebElement firmaNameField2;
	@FindBy(id = "txtTStreet")
	WebElement streenFieldName;
	@FindBy(id = "txtTHouseno")
	WebElement houseNumberField;
	@FindBy(id = "txtTStadtPlz")
	WebElement cityZipCodeField;
	@FindBy(id = "txtTAreacode")
	WebElement telephoneAreaCode;
	@FindBy(id = "txtTTelefon")
	WebElement telephoneNumberField;
	@FindBy(id = "txtTMobile")
	WebElement mobileNumberField;
	@FindBy(id = "txtTEmail")
	WebElement emailField;
	@FindBy(xpath = "//div[@class='card-body pb-3']//div[2]//div//div//div[text()='Kein Frachtführer']")
	WebElement frachtfuhrer;
	@FindBy(xpath = "//a[text()='Verpacken']")
	WebElement verpackenButton;
	@FindBy(id = "txtPkgWeight1")
	WebElement packageWeight;
	@FindBy(xpath = "//div[@class='tool-icon']//a[@class='btn mb-1 mb-md-0']//span[text()='Speichem']")
	WebElement saveButton;
	@FindBy(id = "txtReferenzNr")
	WebElement referenceNumberField;
	@FindBy(xpath = "//div[@class='card']//div//div[@class='row mb-2']//div[@class='col-sm-3']//a[2]")
	WebElement addressSaveButton;
	@FindBy(xpath = "//div[@class='card']//div//div[@class='row mb-2']//div[@class='col-sm-3']//a[1]")
	WebElement addressSelectionButton;
	@FindBy(xpath = "//table[@class='col-12']//tbody//tr//td[1]")
	List<WebElement> addressTableRadioButton;
	@FindBy(id = "btnRectBestatigen")
	WebElement addressConfirmButton;
	@FindBy(xpath = "//div[@id='dvNoCarrier']//div//label//a")
	WebElement frachtfuhrerDropButton;
	@FindBy(xpath = "//div[@id='dvNoCarrier']//div//div//div//div//a//i[@class='fa-solid fa-user pe-0']")
	WebElement frachtfuhrerAddressBookIcon;
	@FindBy(xpath = "//div[@class='col-md-12 col-lg-5 col-xxl-5']//div[5]//div//label//a//i")
	WebElement abholungDropButton;
	@FindBy(xpath = "//div[@id='AbholungBlock']//div//div//a[@class='btn px-2']//i")
	WebElement abholungAddressBookIcon;
	@FindBy(id = "txtArlPosition")
	WebElement arlartPositionField;
	@FindBy(id = "txtArlartNumber")
	WebElement arlartNummerField;
	@FindBy(id = "txtArlartBezeichnung")
	WebElement arlartBezeichnungField;
	@FindBy(id = "txtArlStuck")
	WebElement arlartStuckField;
	@FindBy(id = "btnArticlePlus")
	WebElement articlePlusButton;
	@FindBy(xpath = "//span[text()='Drucken']")
	WebElement druckenButton;
	@FindBy(id = "btnAbholungBestatigen")
	WebElement abholungAddressConfirmButton;
	@FindBy(id = "txtArlEinzelpreis")
	WebElement arlartEinzelpreisField;
	@FindBy(id = "txtArlPositionswert")
	WebElement arlartPositionswertField;
	@FindBy(id = "txtArlwtproArtikel")
	WebElement arlartGewichtArtikelField;
	@FindBy(id = "txtArlWarennummer")
	WebElement warennummerField;
	@FindBy(xpath = "//div[@id='Menu_dvMenuHolder']//ul//li[1]//a")
	WebElement versandButton;
	@FindBy(xpath = "//div[@class='card-body pb-3']//div[3]//div//div//div[2]")
	WebElement produktNameDropDown;
	@FindBy(xpath = "//div[@class='select-block']//ul//li[text()='DHL Europaket(B2B) (54 01) ']")
	WebElement dhlEuropaketB2B;
	@FindBy(xpath = "//div[@class='card-body']//div[8]//div//div[@class='select-main']//div[@class='select-set']")
	WebElement landDropDown;
	@FindBy(xpath = "//div[@class='select-main z-index']//div//ul//li[text()='Schweiz']")
	WebElement schweizLand;
	@FindBy(id = "txtPostigOffice")
	WebElement einlieferungsstelleField;
	@FindBy(id="txtAbholdatum")
	WebElement dateField;
	@FindBy(id="txtAbholungVon")
	WebElement abholungVonField;
	@FindBy(id="txtAbholungBis")
	WebElement abholungsortOffenBis;
	@FindBy(id="txtPkgLength1")
	WebElement lengthField;
	@FindBy(id="txtPkgWidth1")
	WebElement breiteField;
	@FindBy(id="txtPkgHeight1")
	WebElement heightField;
	@FindBy(id="RechnungsadresseClass")
	WebElement abweichendeRechnungsadresseDropDown; 
	@FindBy(xpath="//div[@id='RechnungsadresseBlock']//div//div[2]//a[1]//i")
	WebElement abweichendeRechnungsadresseAddressBook;
	@FindBy(id="btnRechnungsBestatigen")
	WebElement abweichendeRechnungsadresseAddressSaveButton;
	
	public void clickOnAbweichendeRechnungsadresseAddressSaveButton() {
		abweichendeRechnungsadresseAddressSaveButton.click();
	}
	public void clickOnAbweichendeRechnungsadresseAddressBook() {
		abweichendeRechnungsadresseAddressBook.click();
	}
	public void clickOnAbweichendeRechnungsadresseDropDown() {
		abweichendeRechnungsadresseDropDown.click();
	}
	public void sendHeight() {
		heightField.sendKeys("1");
	}
	public void sendBreite() {
		breiteField.sendKeys("1");
	}
	public void sendLength() {
		lengthField.sendKeys("1");
	}
	
	public void sendOnAbholungsortOffenBisField(String time) {
		abholungsortOffenBis.sendKeys(time);
	}
	public void clickOnAbholungVonField() {
		abholungVonField.click();
	}
	public void sendAbholungVonField(String time) {
		abholungVonField.sendKeys(time);
	}
	public void sendDate(String date) {
		dateField.sendKeys(date);
	}
	public void selectFrachtfuhrerFromDropBox(String carrier) {
		String elementPath = "//ul//li[text()='" + carrier + "']";
		WebElement element = driver.findElement(By.xpath(elementPath));
		element.click();
	}

	public void clickOnProduktName(String ProduktName) {
		String elementPath = "//div[@class='select-block']//ul//li[text()='" + ProduktName + "']";
		WebElement element = driver.findElement(By.xpath(elementPath));
		element.click();
	}

	public void sendOneinlieferungsstelleField(String postingOffice) {
		einlieferungsstelleField.sendKeys(postingOffice);
	}

	public void clickOnSchweizLand() {
		schweizLand.click();
	}

	public void selectLand(String land) {
		String elementPath = "//div[@class='select-main z-index']//div//ul//li[text()='" + land + "']";
		WebElement landElement = driver.findElement(By.xpath(elementPath));
		landElement.click();
	}

	public void clickOnLandDropDown() {
		landDropDown.click();
	}

	public void clickOnDHLEuropaketB2B() {
		dhlEuropaketB2B.click();
	}

	public void clickOnProduktNameDropDown() {
		produktNameDropDown.click();
	}

	public void clickOnVersandButton() {
		versandButton.click();
	}

	public String getCurrentUrlOfPrint() {
		return gu.getCurrentUrlOfPage(driver);
	}

	public void sendWarennummer() {
		warennummerField.sendKeys("38260090");
	}

	public void sendarlartGewichtArtikel() {
		arlartGewichtArtikelField.sendKeys("1");
	}

	public void sendarlartPositionswert() {
		arlartPositionswertField.sendKeys("1");
	}

	public void sendarlartEinzelpreis() {
		arlartEinzelpreisField.sendKeys("1");
	}

	public void clickOnAbholungAddressConfirmButton() {
		abholungAddressConfirmButton.click();
	}

	public void clickOnDruckenButton() {
		druckenButton.click();
	}

	public void clickOnArticlePlusButton() {
		articlePlusButton.click();
	}

	public void sendarlartStuck() {
		arlartStuckField.sendKeys("1");
	}

	public void sendArlartBezeichnung() {
		arlartBezeichnungField.sendKeys("Arlart Bezeichnung");
	}

	public void sendArlartNummer() {
		arlartNummerField.sendKeys("ArtNo" + gu.randon(1000));
	}

	public void sendArlartPosition() {
		arlartPositionField.sendKeys("Position");
	}

	public void clickOnAbholungAddressBookIcon() {
		abholungAddressBookIcon.click();
	}

	public void clickOnAbholungDropButton() {
		abholungDropButton.click();
	}

	public void clickOnFrachtfuhrerAddressBookIcon() {
		frachtfuhrerAddressBookIcon.click();
	}

	public void clickOnFrachtfuhrerDropButton() {
		frachtfuhrerDropButton.click();
	}

	public void clickOnAddressSelectionIcon() {
		addressSelectionIcon.click();
	}

	public void sendOntxtTAnsprechPartnerField(String contactPerson) {
		ansprechPartnerField.sendKeys(contactPerson);
	}

	public void sendOnFirmaField(String firmaName) {
		firmaField.sendKeys(firmaName);
	}

	public void sendOnFirmaNameField2(String firmaName2) {
		firmaNameField2.sendKeys(firmaName2);
	}

	public void sendOnStreenFieldName(String streetName) {
		streenFieldName.sendKeys(streetName);
	}

	public void sendHouseNumber(String houseNumber) {
		houseNumberField.sendKeys(houseNumber);
	}

	public void sedOnCityZipCodeField(String zipCode) {
		cityZipCodeField.sendKeys(zipCode);
	}

	public void sendTelephoneAreaCode(String areaCode) {
		telephoneAreaCode.sendKeys(areaCode);
	}

	public void sendTelephoneNumber(String telephoneNumber) {
		telephoneNumberField.sendKeys(telephoneNumber);
	}

	public void sendMobileNumber(String mobileNumber) {
		mobileNumberField.sendKeys(mobileNumber);
	}

	public void sendEmailId(String email) {
		emailField.sendKeys(email);
	}

	public void clickOnFrachtfuhrer() {
		frachtfuhrer.click();
	}

	public void clickOnVerpackenButton() {
		verpackenButton.click();
	}

	public void sendPackageWeight() {
		packageWeight.sendKeys("10");
	}

	public void clickOnSaveButton() {
		saveButton.click();
	}

	public String getTableElementTextOfShipmentOverView(int row, int column) {
		String Path = "//table[@class='content-table ']//tbody//tr[" + row + "]//td[" + column + "]";
		WebElement element = driver.findElement(By.xpath(Path));
		return element.getText();
	}

	public void sendReferenceNumber() {
		String referenceNumber = "RFNCNO" + gu.randon(100) + "" + gu.randon(100) + "" + gu.randon(100);
		this.referenceNumber = referenceNumber;
		referenceNumberField.sendKeys(referenceNumber);
	}

	public String getReferenceNumber() { 
		return referenceNumber;
	}

	public void clickOnaddressSaveButton() {
		addressSaveButton.click();
	}

	public void clickOnAddressSelectionButton() {
		addressSelectionButton.click();
	}

	public void clickAddressTableRadioButtonRandomly() {
		String elementPath = "//table[@class='col-12']//tbody//tr[" + gu.randon(addressTableRadioButton.size())
				+ "]//td[1]";
		WebElement element = driver.findElement(By.xpath(elementPath));
		element.click();
	}

	public void clickabholungAddressTableRadioButton(int row) {
		String elementPath = "//table[@class='col-12']//tbody//tr[" + row + "]//td[1]";
		WebElement element = driver.findElement(By.xpath(elementPath));
		element.click();
	}

	public void clickOnAddressConfirmButton() {
		addressConfirmButton.click();
	}
}
