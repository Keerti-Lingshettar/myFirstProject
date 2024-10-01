package test;

import org.testng.annotations.Test;

import projRunner.RunnerTest;
import stepDefinitions.LaunchSteps;

public class LaunchController extends LaunchSteps{
	@Test()
    public void OfferShift() throws InterruptedException, ClassNotFoundException {
    	
    	String FeatureFolder="myFeatures";
		String Feature= "launch.feature";
		RunnerTest.launch_Runner(FeatureFolder,Feature);
	}

}
