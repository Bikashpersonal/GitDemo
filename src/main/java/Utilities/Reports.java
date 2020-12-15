package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	static ExtentReports reporter;
	public static ExtentReports getreports()
	{
		String path=System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Web Report of Client Portal");
		report.config().setDocumentTitle("Regression Result");
		
		reporter=new ExtentReports();
		reporter.attachReporter(report);
		reporter.setSystemInfo("Tester", "Bikash Kuillya");
		return reporter;
		
	}

}
