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

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Menu Bar/Menu Register Now'))

WebUI.setText(findTestObject('Page Register/Input Username'), 'arrifqiaziz')

WebUI.setText(findTestObject('Page Register/Input Email'), 'arrifqiaziz@gmail.com')

WebUI.setText(findTestObject('Page Register/Input Phone'), '082111178380')

WebUI.setText(findTestObject('Page Register/Input Password'), 'Arrifqi123!')

WebUI.setText(findTestObject('Page Register/Input Confirm Password'), 'arrifqiaziz')

WebUI.setText(findTestObject('Page Register/Input Address'), 'Bogor')

WebUI.click(findTestObject('Page Register/btn Register'))

WebUI.verifyElementPresent(findTestObject('Page Register/Error Passwords do not Match'), 1)

WebUI.closeBrowser()

