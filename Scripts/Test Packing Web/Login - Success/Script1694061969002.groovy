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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.21.23:8058/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Packing Desktop Web/input_Username'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Packing Desktop Web/input_Username'), 'ella')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Packing Desktop Web/input_Password'), '9NLz+4tGZcQ=')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Packing Desktop Web/input_Password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Packing Desktop Web/input_Password'), 'jHBudJbg7iE=')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Packing Desktop Web/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Packing Desktop Web/button_Login'))

