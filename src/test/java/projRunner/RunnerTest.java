package projRunner;

import cucumber.api.cli.Main;

public class RunnerTest {
	public static byte resultByteCode=0;

	public static void featureRunner(String[] argv) {
		
		resultByteCode =  Main.run(argv, Thread.currentThread().getContextClassLoader());
		
	}
	public static void launch_Runner(String FeatureFolder,String Feature) {
		featureRunner(new String[]{"--threads","1","-g", "stepDefinitions", "src/test/resources/"+FeatureFolder+"/"+Feature});
	
	}
}

