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

WebUI.navigateToUrl('http://192.168.20.21:8058/')

WebUI.setText(findTestObject('Object Repository/Page_Packing Desktop Web/input_Username_username'), 'ella')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Packing Desktop Web/input_Password_password'), 'jHBudJbg7iE=')

WebUI.click(findTestObject('Object Repository/Page_Packing Desktop Web/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Packing Desktop Web/input_Packing Komplit_ant-input ant-input-l_802407'))

WebUI.setText(findTestObject('Object Repository/Page_Packing Desktop Web/input_Packing Komplit_ant-input ant-input-l_802407'), 
    'OH070923004')

WebUI.sendKeys(findTestObject('Object Repository/Page_Packing Desktop Web/input_Packing Komplit_ant-input ant-input-l_802407'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Packing Desktop Web/row_noOrder'))

WebUI.sendKeys(null, Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Page_Packing Desktop Web/body'), Keys.chord(Keys.ENTER))

