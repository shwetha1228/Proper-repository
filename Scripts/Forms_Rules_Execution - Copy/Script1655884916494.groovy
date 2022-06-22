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

WebUI.setText(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_LeadSquared Application/input_Please enter your login details_EmailID'), 
    'poonawallaSGP@mailinator.com')

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_LeadSquared Application/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_LeadSquared Application/input_Please enter your password_Password'), 
    'hpTj/Kl7/jOfeaRdjLViDw==')

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_LeadSquared Application/button_Next_1'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Welcome/a_Workflow'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Welcome/a_Manage Forms'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/button_DND Poonawalla SGP_btnRowAction-9deb_22ccab'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/a_Test'))

WebUI.setText(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e__tab1__section1__FirstName__Lead__0 (2)'), 
    'recordA')

'Storing the value in variable'
data1 = WebUI.getAttribute(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e__tab1__section1__FirstName__Lead__0 (2)'), 
    'value')

system.out.println(data1)

'Number 4'
WebUI.setText(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e_28279a (2)'), 
    '3.00')

data2 = WebUI.getAttribute(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e_28279a (2)'), 
    'value')

println(data2)

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__mx-custom form-control lsq-form-fiel_39aad4 (2)'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/span_PM'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__mx-custom form-control lsq-form-fiel_39aad4 (2)'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/div_Rule 1, 2, 3, 4                        _53b991'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/span_CFS1-Number1 (1)'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/div_CFS1-Number1 (1)'))

'Show Rule'
WebUI.verifyElementVisible(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/div_CFS1-Number1 (1)'))

'Make Mandatory'
data3 = WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/div_CFS1-Number1'), 
        'class'), 'lsq-form-field-item  lsq-form-one-col span6     lsq-form-field-cfs-subfield lsq-make-mandatory-applied', 
    false)

println(data3)

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/div_CFS1-Number2'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e_3c2e2d'))

'Data from mavis'
data4 = WebUI.getAttribute(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e_3c2e2d'), 
    'value')

println(data4)

'verifying the Data from set from mavis is proper or not?'
statement1 = WebUI.verifyMatch(object1, data4, false)

println('Data set via mavis is proper' + statement1)

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/div_CFS1-Number3'))

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e_a23db6'))

'Data from LAPP along with POST data'
data5 = WebUI.getAttribute(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/input__9deb642d-728c-4671-a6aa-83e68313187e_a23db6'), 
    'value')

println(data5)

'Verifying data set via LAPP with post data is proper or not'
statement2 = WebUI.verifyMatch(data2, data5, false)

println('Data set via LAPP with post data is proper' + statement2)

WebUI.click(findTestObject('Object Repository/Obj_Forms_Rules_Execution/Page_Manage Forms/button_Save'))

WebUI.closeBrowser()

