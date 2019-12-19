package be.iris.testJunit.services;

public class IsItFridayService {
	public String isIt(String day) {
		return day.equals("Friday") ? "YES" : "NO";
	}
}
