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

WebUI.openBrowser('')


WebUI.navigateToUrl('http://52.30.237.186/')


WebUI.verifyElementPresent(findTestObject('Page_PeeBu/a_PeeBu'), 0)

WebUI.verifyElementText(findTestObject('Page_PeeBu/a_PeeBu'), 'PeeBu')

WebUI.verifyTextPresent('Home', true)

WebUI.click(findTestObject('Page_PeeBu/a_Dropdown'))

WebUI.verifyElementPresent(findTestObject('Page_PeeBu/div_Action Another action  Something else here'), 0)

WebUI.closeBrowser()

