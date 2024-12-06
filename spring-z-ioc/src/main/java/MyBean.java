import org.springframework.stereotype.Component;

@Component
public class MyBean {

	private String myName;

	private int myAge;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}


	/**
	 * 业务方法
	 */
	public String sayHello(String name) {
		return "Hello"+name;
	}
}