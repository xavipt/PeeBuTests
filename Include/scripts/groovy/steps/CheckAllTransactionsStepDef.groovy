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


class CheckAllTransactionsStepDef {

	@Then("I verify that there are {int} transactions on the page")
	public void i_verify_that_there_are_transactions_on_the_page(Integer int1) {
		WebUI.verifyElementText(findTestObject('Page_PeeBu/div_'+int1), int1.toString())
	}

	@Then("I verify that there are {int} of transactions in total")
	public void i_verify_that_there_are_of_transactions_in_total(Integer int1) {
		WebUI.verifyTextPresent(int1.toString(), true)
	}

	@Then("I Check if the Quantidade match their {string} of the list")
	public void i_Check_if_the_Quantidade_match_their_of_the_list(String string) {
		WebUI.verifyElementText(findTestObject('Page_PeeBu/td_'+string), '433.10')
	}

	@Then("I Check if the Data match their {string} of the list")
	public void i_Check_if_the_Data_match_their_of_the_list(String string) {
		WebUI.verifyElementText(findTestObject('Page_PeeBu/td_'+string), '2019-09-16T13:19:55.227Z')
	}

	@Then("I Check if the {string} match their {string} of the list")
	public void i_Check_if_the_match_their_of_the_list(String string, String string2) {
		WebUI.verifyElementText(findTestObject('Page_PeeBu/td_'+string2), string2)
	}

	@Then("I Check if the {string} match their {int} of the list")
	public void i_Check_if_the_match_their_of_the_list(String string, Integer int1) {
		WebUI.verifyElementText(findTestObject('Page_PeeBu/td_'+int1), int1.toString())
	}
}