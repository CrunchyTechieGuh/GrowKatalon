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


//calls method to open grow.com and log in
CustomKeywords.'globalMethods.BrowserAndNavigationUI.NavigatetoGrow'(GlobalVariable.growUrl)
//calls method to log in to Dashboard
CustomKeywords.'globalMethods.BrowserAndNavigationUI.LogInToGrow'(GlobalVariable.email, GlobalVariable.password)
//hovers over metric details
WebUI.mouseOver(findTestObject('Page_Grow  Bonnie Sales Dashboard/metricDetails'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)
//selects metric menu and copies metric
WebUI.click(findTestObject('Object Repository/Page_Grow  Bonnie Sales Dashboard/metricMenu'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Grow  Bonnie Sales Dashboard/copyMetric'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Grow  Bonnie Sales Dashboard/selectDashboardDropDown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Grow  Bonnie Sales Dashboard/newDashboardSelect'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Grow  Bonnie Sales Dashboard/button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent("Copy of Sales by Month", false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)
//shows dashboard side bar 
WebUI.click(findTestObject('Object Repository/Page_Grow Dashboard Side Bar/dashboardSideBar'), FailureHandling.STOP_ON_FAILURE)
//selects original dashboard to verify metric is still present on original
WebUI.click(findTestObject('Object Repository/Page_Grow Dashboard Side Bar/bonnieSalesDashboardSelect'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Grow  Bonnie Sales Dashboard/salesByMonthMetric'), 5, FailureHandling.STOP_ON_FAILURE)

