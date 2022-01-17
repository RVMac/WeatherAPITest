package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider (name = "AC1_CorrectData")
	public Object[][] AC1_CorrectData(){
		return new Object[][] {
			{200, "-78.543", "38.123", "US", "VA", "Free Union"},
			{200, "21.78896", "40.30069", "GR", "ESYE13", "Koz�ni"},
			{200, "120.9822", "14.6042", "PH", "NCR", "Manila"},
			{200, "120.9833", "14.6", "PH", "NCR", "Quiapo"},
		};
	}
	
	@DataProvider (name = "AC1_IncorrectData")
	public Object[][] AC1_IncorrectData(){
		return new Object[][] {
			{"asdfsdf3", "12dd2123as", 400},
			{"-78.543", "asdfsdf3", 400},
			{"asdfsdf3", "38.123", 400},
			{"-78.543", "", 400},
			{"", "38.123", 400},
			{"", "", 400},
		};
	}

	@DataProvider (name = "AC2_CorrectData")
	public Object[][] AC2_CorrectData(){
		return new Object[][] {
			{200, "735563", "GR", "ESYE13", "Koz�ni"},
			{200, "4487042", "US", "NC", "Raleigh"},
			{200, "1701668", "PH", "NCR", "Manila"},
		};
	}
	
	@DataProvider (name = "AC2_IncorrectData")
	public Object[][] AC2_IncorrectData(){
		return new Object[][] {
			{204, "9999999"},
			{204, "xxxxxxx"},
			{204, "123xcv!@#"},
		};
	}
	
	@DataProvider (name = "AC3_CorrectData")
	public Object[][] AC3_CorrectData(){
		return new Object[][] {
			{200, "28546", "Onslow", "US", "NC"},
			{200, "28546", "Onslow", "US", "NC"},
			{200, "28546", "Onslow", "US", "NC"},
		};
	}
	
	@DataProvider (name = "AC3_IncorrectData")
	public Object[][] AC3_IncorrectData(){
		return new Object[][] {
			{204, "x1234asdfasdfsdfdf"},
			{400, ""},
		};
	}
}
