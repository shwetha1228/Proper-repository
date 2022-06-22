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

WebUI.setText(findTestObject('Object Repository/Regression suite/Page_LeadSquared Application/input_Please enter your login details_EmailID'), 
    'poonawallaSGP@mailinator.com')

WebUI.click(findTestObject('Object Repository/Regression suite/Page_LeadSquared Application/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Regression suite/Page_LeadSquared Application/input_Please enter your password_Password'), 
    'hpTj/Kl7/jOfeaRdjLViDw==')

WebUI.click(findTestObject('Object Repository/Regression suite/Page_LeadSquared Application/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Welcome/a_Goals_application-menu-icon pull-right'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Welcome/a_Workflow'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Welcome/a_Manage Forms'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Regression suite/Page_Manage Forms/button_DND Poonawalla SGP_btnRowAction-c0e9_c14f41'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Manage Forms/button_DND Poonawalla SGP_btnRowAction-c0e9_c14f41'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Manage Forms/a_Test'))

WebUI.setText(findTestObject('Object Repository/Regression suite/Page_Manage Forms/input__c0e9a917-c459-4fe4-9726-632b08e8b0ce__tab1__section2__mx_Custom_18mx_CustomObject_4__Activity__201 (1)'), 
    '3.00')

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Manage Forms/span_CFS1 -Number4'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Manage Forms/span_CFS1 -Number4'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Manage Forms/input__mx-custom form-control lsq-form-fiel_39aad4 (2)'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Manage Forms/div_CFS1 -Datetime1'))

WebUI.click(findTestObject('Object Repository/Regression suite/Page_Manage Forms/label_CFS1 -Datetime1'))

WebUI.closeBrowser()

