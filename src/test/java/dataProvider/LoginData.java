package dataProvider;
import org.testng.annotations.DataProvider;
import com.clearcode.utils.ExcelUtils;


public class LoginData {
	int a=2;
	@DataProvider
	public Object[][] negativeLogin(){
		return ExcelUtils.getData("TestData.xls", "NegativeLogin");
	}
	
	@DataProvider
	public Object[][] AddNewFeature(){
		return new Object[][] { ExcelUtils.data("SuiteData.xls", "Sheet1", "RETC_079").toArray() };
//		return new Object[][] { 
			
//			new Object[] {
//			ExcelUtils.data("SuiteData.xls", "Sheet1", "RETC_079").toArray() }
//			}
	}
	
	@DataProvider
	public Object[][] CreateUser(){
		return new Object[][] { ExcelUtils.data("SuiteData.xls", "Sheet1", "RETC_078").toArray() };
	}
}
