package RunnerClassJune;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerWithTestNg {
	
	@CucumberOptions( 
			
			
			features = "D:\\New Workspace\\JuneSelenium2024\\src\\main\\resources\\Feature\\TaggingConcept.feature",    // The path to the feature file is specified by feature options 
					
					glue={"StepDefinationJune"},   // This argument used to provide step definition file location
					
					dryRun=false,      //dryRun compile the feature file and Step Definition 
					
				   monochrome =true , // Display the console outout in readable format 
				   
							//tags= "@SmokeTest or @RegressionTest ",
				   
				      tags= "not @SmokeTest",  // Ignore Test case 
							
							
									// Or : either one  both tags are in  "@SmokeTest or  @RegressionTest",
									
						//And : both    "@SmokeTest and  @RegressionTest",
					
					
							//This option is used create different type of Reports 

				      plugin = {"pretty", "html:target/cucumber-reports.html",
				  			"pretty", "json:target/cucumber-reports.json" ,
				  			"pretty",  "junit:target/cucumber-reports.xml"}  //This option is used create different type of Reports :html report
			
							

					)


			public class TestRunnerWithTestNg extends AbstractTestNGCucumberTests{
				
				
			}

}
