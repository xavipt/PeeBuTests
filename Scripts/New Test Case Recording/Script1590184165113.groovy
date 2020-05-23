import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://52.30.237.186/')

WebUI.click(findTestObject('Page_PeeBu/button_bank account_btn buttonDimensions btn-light border border-dark'))

WebUI.click(findTestObject('Page_PeeBu/test1'))

WebUI.click(findTestObject('Page_PeeBu/button_bank account_btn buttonDimensions btn-light border border-dark'))


//WebUI.modifyObjectProperty((findTestObject('Page_PeeBu/test'), 'xpath', 'equals', '//div[@id='app']/div/div[2]/div/div[3]/table/tbody/tr/td[6]/div/div/div[4]/button', false)
//TestObject dynamicObject = WebUI.removeObjectProperty('Page_PeeBu/test1', xpath)



//removeObjectProperty(findTestObject('Page_PeeBu/test'), ‘xpath’)

dynamicObject.addProperty('xpath', ConditionType.CONTAINS, '//div[@id=\'app\']/div/div[2]/div/div[3]/table/tbody/tr/td[6]/div/div/div[4]/button')

//dynamicObject.addProperty("xpath", ConditionType.EQUALS, "//div[@id='app']/div/div[2]/div/div[3]/table/tbody/tr/td[6]/div/div/div[4]/button")
//addProperty(‘xpath’, com.kms.katalon.core.testobject.ConditionType.EQUALS, '//div[@id='app']/div/div[2]/div/div[3]/table/tbody/tr/td[6]/div/div/div[4]/button')
WebUI.verifyElementPresent(findTestObject(dynamicObject), 0)

WebUI.verifyElementPresent(findTestObject('Page_PeeBu/test'), 0)

