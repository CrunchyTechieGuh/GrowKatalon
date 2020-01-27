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
import globalMethods.BrowserAndNavigationUI as RESTMethods


//calls method to open grow.com and log in
CustomKeywords.'globalMethods.BrowserAndNavigationUI.NavigatetoGrow'(GlobalVariable.growUrl)
//calls method to log in to Dashboard
CustomKeywords.'globalMethods.BrowserAndNavigationUI.LogInToGrow'(GlobalVariable.email, GlobalVariable.password)
//mouses over metric options
WebUI.mouseOver(findTestObject('Page_Grow  Bonnie Sales Dashboard/metricDetails'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Object Repository/Page_Grow  Bonnie Sales Dashboard/metricInfo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Object Repository/Page_Grow  Bonnie Sales Dashboard/metricMenu'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)
//expands and closes metric
WebUI.click(findTestObject('Page_Grow  Bonnie Sales Dashboard/expand_Metric'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Grow  Bonnie Sales Dashboard/closeMetric'), FailureHandling.STOP_ON_FAILURE)