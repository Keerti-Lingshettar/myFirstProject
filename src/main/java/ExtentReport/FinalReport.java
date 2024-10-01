package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class FinalReport {
	private static ExtentReports extent;
	private static ExtentTest test;
	
	public static void main(String[] args) throws ClassNotFoundException {
		String ExtentReportPath= System.getProperty("user.dir")+"/src/test/resources/extentreports/";
	String reportName = "ExtentReport.html";
		ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter(ExtentReportPath+reportName);
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest feature = extent.createTest(Feature.class, "Setting the chrome");
		ExtentTest scenario = feature.createNode(Scenario.class, "Launching the chrome");
		scenario.createNode(new GherkinKeyword("Given"), "Launch chrome").pass("User has successfully Launched");
		
		
		feature = extent.createTest(Feature.class, "Launching the Workjam URL");
		scenario = feature.createNode(Scenario.class, "Oepn dashboard");
		scenario.createNode(new GherkinKeyword("Then"), "Navigate to Why workjam").pass("I am able to successfully navigate to the page");
		scenario.createNode(new GherkinKeyword("Then"), "close tab").fail("Unable to close");
		
        
	
		extent.flush();
	}
}
