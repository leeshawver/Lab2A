
public class Lab2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 14;
		boolean hasLicense = true;
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 16);
		
		if (age >=16 && hasLicense == true) {
			System.out.println("You can drive -- yippee!");
		} else {
			System.out.println("You cannot drive -- sorry, pal.");
		}
		
		double costOfMilk = 1.50;
		int thirstLevel = 5;
				
		if (costOfMilk < 2.50 || thirstLevel > 5) {
			System.out.println("Milk please");
		} else {
			System.out.println("No thanks");
		}
		
		int numberOfCookies = 41;
		int numberOfChildren = 6;
		double remainingCookies = numberOfCookies % numberOfChildren;
		System.out.println(remainingCookies);
		if (remainingCookies == 0) {
			System.out.println("Sad face :(");
		} else if (remainingCookies == 1) {
			System.out.println("Yes!");
		} else if (remainingCookies < 5) {
			System.out.println("Whoohoo!");
		} else if (remainingCookies >= 5) {
			System.out.println("Jackpot!");
		}
	}

}
