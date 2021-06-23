package operatorsExercises;

public class Examsexercise {
	public static void main(String[] args) {
		int biologymark = 86;
		int chemistrymark = 104;
		int physicsmark = 90;
		
		displayscore(biologymark,chemistrymark,physicsmark);
		displaypercentage(biologymark,chemistrymark,physicsmark);
	}

	private static void displaypercentage(double biologymark, double chemistrymark, double physicsmark) {
		// TODO Auto-generated method stub
		double percentage = (biologymark+chemistrymark+physicsmark)*100/450;
		System.out.print("The overall percentage score is ");
		System.out.print(percentage);
		System.out.println("%");
	}

	private static void displayscore(int biologymark, int chemistrymark, int physicsmark) {
		// TODO Auto-generated method stub
		System.out.print("The biology score is ");
		System.out.println(biologymark);
		System.out.print("The chemistry score is ");
		System.out.println(chemistrymark);
		System.out.print("The physics score is ");
		System.out.println(physicsmark);
		System.out.print("The total score is ");
		System.out.println(biologymark+chemistrymark+physicsmark);
	}

}
