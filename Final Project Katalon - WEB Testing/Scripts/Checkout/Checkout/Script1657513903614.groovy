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

WebUI.callTestCase(findTestCase('Add to Cart/Add to Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page Cart/Cart Checkout to Payment'))

WebUI.setText(findTestObject('Page Checkout/Input First Name'), 'Arrifqi')

WebUI.setText(findTestObject('Page Checkout/Input Last Name'), 'Aziz')

WebUI.setText(findTestObject('Page Checkout/Input Company'), 'PT BFI')

WebUI.setText(findTestObject('Page Checkout/Input Email'), 'arrifqi@gmail.com')

WebUI.setText(findTestObject('Page Checkout/Input Phone'), '08211178380')

WebUI.setText(findTestObject('Page Checkout/Input Address 1'), 'Bogor')

WebUI.setText(findTestObject('Page Checkout/Input Address 2'), 'Leuwisadeng')

WebUI.setText(findTestObject('Page Checkout/Input Address Postcode'), '16640')

WebUI.setText(findTestObject('Page Checkout/Input City'), 'Kabupaten Bogor')

WebUI.click(findTestObject('Page Checkout/Select Province'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page Checkout/Select Province Jawa Barat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page Checkout/Total'), 1)

WebUI.click(findTestObject('Page Checkout/Tranfer Bank BRI'))

