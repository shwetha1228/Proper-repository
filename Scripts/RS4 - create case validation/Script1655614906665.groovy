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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.lsq-staging.com/')

WebUI.setText(findTestObject('Object Repository/Form -create case with validation/Page_LeadSquared Application/input_Please enter your login details_EmailID'), 
    'poonawallaSGP@mailinator.com')

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_LeadSquared Application/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Form -create case with validation/Page_LeadSquared Application/input_Please enter your password_Password'), 
    'hpTj/Kl7/jOfeaRdjLViDw==')

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_LeadSquared Application/button_Next_1'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Welcome/a_Workflow'))

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Welcome/a_Manage Forms'))

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/button_DND Poonawalla SGP_btnRowAction-9deb_22ccab'))

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/a_Test'))

WebUI.setText(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e__tab1__section1__FirstName__Lead__0'), 
    'testlsdh1')

data1 = WebUI.getAttribute(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e__tab1__section1__FirstName__Lead__0'), 
    'value')

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/div_CFS1-Number4'))

WebUI.setText(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e_28279a'), 
    '2')

data2 = WebUI.getAttribute(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e_28279a'), 
    'value')

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/div_CFS1-Datetime1 (1)'))

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/input__mx-custom form-control lsq-form-fiel_39aad4 (2)'))

WebUI.doubleClick(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/span_CFS1-Datetime1 (1)'))

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/label_CFS1-Number1'))

WebUI.click(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/div_CFS1-Number1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/div_CFS1-Number1'))

WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/Form -create case with validation/Page_Manage Forms/div_CFS1-Number1'), 
        'class'), 'mx-custom form-control lsq-form-field-ctrl-text width-95 display-inline-block lsq-form-field-control-initialize  lsq-form-number-spinner entity-numeric-field required', 
    false)

WebUI.closeBrowser()

