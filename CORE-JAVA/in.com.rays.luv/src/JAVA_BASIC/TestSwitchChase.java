package JAVA_BASIC;

public class TestSwitchChase {
public static void main(String[] args) {
	String day = "sundayday";
	switch (day) {
	case "Monday":
		System.out.println("First day of week");
		break;
	case "Tuesday":
		System.out.println("Second day of week");
		break;
	case "Wednesday":
		System.out.println("thirld day of week");
		break;
	case "Thursday":
		System.out.println("forth day of week");
		break;
	case "Friday":
		System.out.println("Fifth day of week");
		break;
	case "Saturday":
		System.out.println("sixth day of week");
		break;
		default:
			System.out.println("Aaj chutty he");
	}
}
}
