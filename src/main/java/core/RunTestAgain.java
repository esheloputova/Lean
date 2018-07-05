package core;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RunTestAgain implements IRetryAnalyzer {
	private int nowCount=0;
	private int maxCount=1;


	@Override
	public boolean retry(ITestResult iTestResult) {
		if (nowCount<maxCount) {
			nowCount++;
			return true; //пока истина перезапускаем
		}
		System.out.println("ТЕСТ ПРОВАЛЕН ДВАЖДЫ!!! "); // пишем в лог или делаем скриншот
		nowCount=0;
		return false;
	}
}

//использование
//@Test(priority = 2, retryAnalyzer = RunTestAgain.class)
//public class SimpleTest {