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

WebUI.navigateToUrl('https://login.lsq-staging.com/')

WebUI.setText(findTestObject('Object Repository/get value of an object/Page_LeadSquared Application/input_Please enter your login details_EmailID'), 
    'poonawallaSGP@mailinator.com')

WebUI.click(findTestObject('Object Repository/get value of an object/Page_LeadSquared Application/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/get value of an object/Page_LeadSquared Application/input_Please enter your password_Password'), 
    'hpTj/Kl7/jOfeaRdjLViDw==')

WebUI.click(findTestObject('Object Repository/get value of an object/Page_LeadSquared Application/button_Next_1'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/get value of an object/Page_Welcome/a_Workflow'))

WebUI.click(findTestObject('Object Repository/get value of an object/Page_Welcome/a_Manage Forms'))

WebUI.click(findTestObject('Object Repository/get value of an object/Page_Manage Forms/button_DND Poonawalla SGP_btnRowAction-c0e9_c14f41'))

WebUI.click(findTestObject('Object Repository/get value of an object/Page_Manage Forms/a_Test'))

WebUI.setText(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce__tab1__section1__FirstName__Lead__0 (1)'), 
    'testjhg')

WebUI.verifyElementText(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce__tab1__section1__FirstName__Lead__0 (1)'), 
    '')

Object1 = WebUI.getAttribute(findTestObject('get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce__tab1__section1__FirstName__Lead__0 (1)'), 
    'value')

println(Object1)

WebUI.setText(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce__tab1__section1__FirstName__Lead__0 (1)'), 
    'testjhg')

WebUI.waitForElementPresent(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce__tab1__section1__FirstName__Lead__0 (1)'), 
    0)

WebUI.setText(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce_2cc1e9 (1)'), 
    '2')

WebUI.verifyElementText(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce_2cc1e9 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce_2cc1e9 (1)'), 
    '2.00')

WebUI.rightClick(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce_2cc1e9 (1)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce_2cc1e9 (1)'), 
    0)

Object2 = WebUI.getText(findTestObject('get value of an object/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce_2cc1e9 (1)'))

println(Object2)

WebUI.closeBrowser()

