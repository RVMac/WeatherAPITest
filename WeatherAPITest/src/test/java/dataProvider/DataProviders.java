package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider (name = "AC2_CorrectData")
	public Object[][] AC2_CorrectData(){
		
		return new Object[][] {
			{"4487042", "US", "NC", "Raleigh"},
			{"4487042", "US", "NC", "Raleigh"},
			{"4487042", "US", "NC", "Raleigh"},
		};
	}
	
	@DataProvider (name = "AC2_IncorrectData")
	public Object[][] AC2_IncorrectData(){
		
		return new Object[][] {
			{"9999999"},
			{"xxxxxxx"},
			{"123xcv!@#"},
		};
	}
}
