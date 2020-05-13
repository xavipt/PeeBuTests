import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import static org.assertj.core.api.Assertions.*


class CheckTransactionsStepDef {
	/*@Given("I have the browser open")
	public void i_have_the_browser_open() {
		WebUI.openBrowser('')
	}

	@When("I navigate to the home page")
	public void i_navigate_to_the_home_page() {
		WebUI.navigateToUrl('http://52.30.237.186')
	}
	*/

	@And("The API is operational")
	public void the_API_is_operational() {
		// tested on the setup of the test suite
	}

	@Then("I Check if the {string} match their {int}")
	public void i_Check_if_the_match_their(String string, Integer int1) {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/th_'+string), 0)

		WebUI.verifyElementText(findTestObject('Page_PeeBu/td_'+int1), int1.toString())
	}


	@Then("I Check if the Quantidade match their {string}")
	public void i_Check_if_the_Quantidade_match_their(String string) {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/th_Quantidade'), 0)

		WebUI.verifyElementText(findTestObject('Page_PeeBu/td_'+string), '269.10')
	}

	@Then("I Check if the Data match their {string}")
	public void i_Check_if_the_Data_match_their(String string) {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/th_Data'), 0)

		WebUI.verifyElementText(findTestObject('Page_PeeBu/td_'+string), '2019-06-16T21:09:14.933Z')
	}

	@Then("I Check if the {string} match their {string}")
	public void i_Check_if_the_match_their(String string, String string2) {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/th_'+string), 0)

		WebUI.verifyElementText(findTestObject('Page_PeeBu/td_'+string2), string2)
	}


	@Then("I see that the {string} details are shown")
	public void i_see_that_the_details_are_shown(String string) {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/th_'+string), 0)
	}
}