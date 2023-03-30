package runner;

import io.cucumber.core.cli.Main;

public class Runner {

	public static void main(String[] args) {
		try {
			Main.main(new String[]{"-g","stepdef","-g","runner","-g","pom","classpath:feature","-p","json:target/cucumber-reports/cucumber.json","-m"});
		}
        catch(Exception e)
		{
	     System.out.println("Main method exception : "+e);
		}
	}

}