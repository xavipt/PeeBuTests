package steps
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



class CheckTableAndChartOfTheDashboardDef {

	@When("I get redirected to a different page displaying a fully classified transactions list")
	public void i_get_redirected_to_a_different_page_displaying_a_fully_classified_transactions_list() {
		WebUI.click(findTestObject('Page_PeeBu/health'))
		WebUI.click(findTestObject('Page_PeeBu/button_Validar'))
	}
	
	@Then("I find the {string}")
	public void i_find_the(String string) {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/'+string), 0)
	}
	
	@Then("I see information on the table")
	public void i_see_information_on_the_table() {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/tableInfo'), 0)
	}
	
	@Then("I see information on the chart")
	public void i_see_information_on_the_chart() {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/chartInfo'), 0)
	}
	
	@Then("I see the {string} on the table")
	public void i_see_the_on_the_table(String string) {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/li_'+string), 0)
	}
	
	@Then("I see the {string} on the chart")
	public void i_see_the_on_the_chart(String string) {
		WebUI.verifyElementPresent(findTestObject('Page_PeeBu/chart_'+string), 0)
	}
}
