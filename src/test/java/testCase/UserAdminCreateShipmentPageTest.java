package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.UserAdminCreateShipmentPage;

public class UserAdminCreateShipmentPageTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	UserAdminCreateShipmentPage uacsp;

	@Test  //(enabled = false)
	public void verifyToCreateShipmentForDHLPacketNational() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("aswani.jayachandran@beo.in");
		lp.sendPassword("Agasthya@1");
		Thread.sleep(1000);
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Ensisheimerstr1");
		uacsp.sendHouseNumber("32165");
		uacsp.sedOnCityZipCodeField("79346:Endingen am Kaiserstuhl");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("DHL paket");
		uacsp.sendReferenceNumber();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.clickOnSaveButton();
		Thread.sleep(2000);
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				":: Reference number not as expected");
	}

	@Test // (enabled = false)
	public void verifyToCreateShipmentForDHLPacketNationalFromAddressBook() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		Thread.sleep(1000);
		lp.clickLoginButton();
		uacsp.clickOnAddressSelectionButton();
		uacsp.clickAddressTableRadioButtonRandomly();
		uacsp.clickOnAddressConfirmButton();
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("pkt");
		uacsp.sendReferenceNumber();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.clickOnSaveButton();
		Thread.sleep(2000);
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				":: Reference number not as expected");
	}

	@Test //(enabled = false)
	public void verifyToCreateShipmentForDHLPacketNationalCreate2Artikel() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Ensisheimerstr1");
		uacsp.sendHouseNumber("32165");
		uacsp.sedOnCityZipCodeField("79346:Endingen am Kaiserstuhl");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("pkt");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(2000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test //(enabled = false)
	public void verifyToCreateShipmentForDHLPacketEuropeB2B_TC55691() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Skärholmen");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Schweden");
		uacsp.sedOnCityZipCodeField("12755:Skärholmen");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("pkt");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnDHLEuropaketB2B();
		uacsp.sendReferenceNumber();
		uacsp.clickOnaddressSaveButton();
		Thread.sleep(2000);
		uacsp.clickOnVerpackenButton();
		Thread.sleep(2000);
		uacsp.sendPackageWeight();
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(2000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test// (enabled = false)
	public void verifyToCreateShipmentForDHLPacketInternational_TC55790() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom Branch");
		uacsp.sendOnStreenFieldName("Nellikunnu");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Indien");
		uacsp.sedOnCityZipCodeField("680005:Nellikunnu");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("pkt");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("DHL Paket International (53 01) ");
		uacsp.sendReferenceNumber();
		uacsp.sendOneinlieferungsstelleField("Palarivattom P O");
		uacsp.clickOnaddressSaveButton();
		Thread.sleep(2000);
		uacsp.clickOnVerpackenButton();
		Thread.sleep(2000);
		uacsp.sendPackageWeight();
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(2000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test //(enabled = false)
	public void verifyToCreateShipmentForDHLExpressNationalCreate2Artikel_TC55806() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Ensisheimerstr1");
		uacsp.sendHouseNumber("32165");
		uacsp.sedOnCityZipCodeField("79346:Endingen am Kaiserstuhl");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("DHL express0");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("EXPRESS DOMESTIC");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnAbholungVonField();
		uacsp.sendAbholungVonField("01:30");
		uacsp.sendOnAbholungsortOffenBisField("23:59");
		uacsp.sendDate("30.06.2023");
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		Thread.sleep(2000);
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(2000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test // (enabled = false)
	public void verifyToCreateShipmentForDHLExpressEuropeExpressWorldWideCreate2Artikel_TC55807()
			throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Stockholm");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Schweiz");
		uacsp.sedOnCityZipCodeField("2333:La Ferrière");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("DHL express0");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("EXPRESS WORLDWIDE");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		Thread.sleep(2000);
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnAbholungVonField();
		uacsp.sendAbholungVonField("10:30");
		uacsp.sendOnAbholungsortOffenBisField("15:30");
		uacsp.sendDate("30.06.2023");
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		Thread.sleep(500);
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(2000);
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test// (enabled = false)
	public void verifyToCreateShipmentForDHLInternationalExpressWorldWideCreate2Artikel_TC55808()
			throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Nellikunnu");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Indien");
		uacsp.sedOnCityZipCodeField("680005:Nellikunnu");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("DHL express0");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("EXPRESS WORLDWIDE");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnAbholungVonField();
		uacsp.sendAbholungVonField("10:30");
		uacsp.sendOnAbholungsortOffenBisField("15:59");
		uacsp.sendDate("30.06.2023");
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(2000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test //(enabled = false)
	public void verifyToCreateShipmentForFedExNationalCreate2Artikel_TC55896() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Ensisheimerstr1");
		uacsp.sendHouseNumber("32165");
		uacsp.sedOnCityZipCodeField("79346:Endingen am Kaiserstuhl");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("FEDEX");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("PRIORITY_OVERNIGHT");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		Thread.sleep(2000);
		for (int i = 0; i < 1; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(4000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test// (enabled = false)
	public void verifyToCreateShipmentForFedExEuropeCreate2Artikel_TC55897() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Stockholm");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Schweiz");
		uacsp.sedOnCityZipCodeField("2333:La Ferrière");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("FEDEX");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("INTERNATIONAL_ECONOMY");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		Thread.sleep(2000);
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		Thread.sleep(500);
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(3000);
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test//(enabled = false)
	public void verifyToCreateShipmentForFedExWorldWideCreate2Artikel_TC55898() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Nellikunnu");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Indien");
		uacsp.sedOnCityZipCodeField("680005:Nellikunnu");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("FEDEX");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("INTERNATIONAL_ECONOMY");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		for (int i = 0; i < 1; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(3000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test  //(enabled = false)
	public void verifyToCreateShipmentForGLSNationalCreate2Artikel_TC55906() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Ensisheimerstr1");
		uacsp.sendHouseNumber("32165");
		uacsp.sedOnCityZipCodeField("79346:Endingen am Kaiserstuhl");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("GLS");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("BusinessParcel");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		Thread.sleep(2000);
		for (int i = 0; i < 1; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(4000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test //(enabled = false)
	public void verifyToCreateShipmentForGLSEuropeCreate2Artikel_TC55907() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Stockholm");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Schweiz");
		uacsp.sedOnCityZipCodeField("2333:La Ferrière");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("GLS");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("BusinessParcel");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		Thread.sleep(2000);
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		Thread.sleep(500);
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(3000);
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test //(enabled = false)
	public void verifyToCreateShipmentForGLSWorldWideCreate2Artikel_TC55908() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Nellikunnu");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Indien");
		uacsp.sedOnCityZipCodeField("680005:Nellikunnu");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("GLS");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("BusinessParcel");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		for (int i = 0; i < 1; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(3000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test //(enabled = false)
	public void verifyToCreateShipmentForDPDNationalCreate2Artikel_TC55945() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Ensisheimerstr1");
		uacsp.sendHouseNumber("32165");
		uacsp.sedOnCityZipCodeField("79346:Endingen am Kaiserstuhl");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("DPD");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("DPD Classic");
		uacsp.sendReferenceNumber();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		Thread.sleep(2000);
		for (int i = 0; i < 2; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(4000);
		uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test // (enabled = false)
	public void verifyToCreateShipmentForDPDEuropeCreate2Artikel_TC55946() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Sequeiro");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Spanien");
		uacsp.sedOnCityZipCodeField("33718:Sequeiro");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("DPD");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("DPD EXPRESS");
		uacsp.sendReferenceNumber();
		uacsp.clickOnaddressSaveButton();
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();

		uacsp.clickOnAbweichendeRechnungsadresseDropDown();
		uacsp.clickOnAbweichendeRechnungsadresseAddressBook();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbweichendeRechnungsadresseAddressSaveButton();
		uacsp.clickOnAbweichendeRechnungsadresseDropDown();
		Thread.sleep(1000);
		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		Thread.sleep(500);
		for (int i = 0; i < 1; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}
		uacsp.clickOnDruckenButton();
		Thread.sleep(3000);
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");
	}

	@Test // (enabled = false)
	public void verifyToCreateShipmentForDPDWorldWideCreate2Artikel_TC55947() throws InterruptedException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		uacsp = new UserAdminCreateShipmentPage(driver);
		lp.sendUserName("sreehari.r@beo.in");
		lp.sendPassword("Tester@123");
		lp.clickLoginButton();
		uacsp.sendOntxtTAnsprechPartnerField("Beo Palarivattom Kochi");
		uacsp.sendOnFirmaField("Beo Software India Pvt Ltd");
		uacsp.sendOnFirmaNameField2("Palarivattom");
		uacsp.sendOnStreenFieldName("Nellikunnu");
		uacsp.sendHouseNumber("32165");
		uacsp.clickOnLandDropDown();
		uacsp.selectLand("Indien");
		uacsp.sedOnCityZipCodeField("680005:Nellikunnu");
		uacsp.sendTelephoneAreaCode("0484");
		uacsp.sendTelephoneNumber("2567894");
		uacsp.sendMobileNumber("9874563210");
		uacsp.sendEmailId("abc@hotmail.com");
		uacsp.clickOnFrachtfuhrer();
		uacsp.selectFrachtfuhrerFromDropBox("DPD");
		uacsp.clickOnProduktNameDropDown();
		uacsp.clickOnProduktName("DPD EXPRESS");
		uacsp.sendReferenceNumber();
		
		uacsp.clickOnAbholungDropButton();
		uacsp.clickOnAbholungAddressBookIcon();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbholungAddressConfirmButton();
	

		uacsp.clickOnAbweichendeRechnungsadresseDropDown();
		uacsp.clickOnAbweichendeRechnungsadresseAddressBook();
		uacsp.clickabholungAddressTableRadioButton(2);
		uacsp.clickOnAbweichendeRechnungsadresseAddressSaveButton();
		uacsp.clickOnAbweichendeRechnungsadresseDropDown();

		uacsp.clickOnVerpackenButton();
		uacsp.sendPackageWeight();
		uacsp.sendLength();
		uacsp.sendBreite();
		uacsp.sendHeight();
		for (int i = 0; i < 1; i++) {
			uacsp.sendArlartPosition();
			uacsp.sendArlartNummer();
			uacsp.sendArlartBezeichnung();
			uacsp.sendarlartStuck();
			uacsp.sendarlartEinzelpreis();
			uacsp.sendarlartPositionswert();
			uacsp.sendarlartGewichtArtikel();
			uacsp.sendWarennummer();
			uacsp.clickOnArticlePlusButton();
		}		
		uacsp.clickOnDruckenButton();
		Thread.sleep(3000);
		/*uacsp.clickOnVersandButton();
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 2), uacsp.getReferenceNumber(),
				"::Referance number not as expected");
		Assert.assertEquals(uacsp.getTableElementTextOfShipmentOverView(1, 10), "Gedruckt",
				"::Printing status not as expected");*/
	}
}
