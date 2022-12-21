package SeleniumPractice;

public class Main extends Main1 {
	
	static Main1 m1 = new Main1();
	
//	static Main1 m1;

	public static void main(String[] args) {
		m1.myMethod();
	}
}

//11338 [main] ERROR  -     Cannot invoke "net.thucydides.core.pages.Pages.getDriver()" because "this.pages" is null
