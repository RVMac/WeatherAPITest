package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utilities.commonFunctions;

public class BaseClass {
//	public ExtentHtmlReporter htmlReporter;
//	public ExtentReports extent;
//	public ExtentTest test;
	commonFunctions commFunc = new commonFunctions();
	
//	@BeforeTest
//	public void setExtentReport() {
////		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport.html");
//		htmlReporter = new ExtentHtmlReporter("./test-output/myReport.html");
//		htmlReporter.config().setDocumentTitle("API Automation Report");
//		htmlReporter.config().setReportName("Weatherbit IO API Automation Test Report");
//		
//		extent = new ExtentReports();
//		
//		extent.attachReporter(htmlReporter);
//	}
//	
//	@AfterTest
//	public void endExtentReport() {
//		extent.flush();
//	}
//	
//	@AfterMethod
//	public void testDown(ITestResult result) {
//		if (result.getStatus() == ITestResult.FAILURE) {
//			test.log(Status.FAIL, "Test case FAILED is " + result.getName());
//			test.log(Status.FAIL, "Test case FAILED is " + result.getThrowable());
//		} else if (result.getStatus() == ITestResult.SKIP){
//			test.log(Status.SKIP, "Test case SKIPPED is " + result.getName());
//		} else if (result.getStatus() == ITestResult.SUCCESS) {
//			test.log(Status.PASS, "Test case PASSED is " + result.getName());
//		}
//	}
	
}
