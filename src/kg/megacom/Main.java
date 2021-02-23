package kg.megacom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Developer Lebron = new Developer("Lebron James", 34, 2500, DeveloperGrades.JUNIOR);
        Developer Anthony = new Developer("Anthony Davis", 30, 3000, DeveloperGrades.SENIOR);
        Developer Montrazl = new Developer("Montrazl Harris", 21, 3000, DeveloperGrades.TEAMLEAD);
        Developer Shrodder = new Developer("Dennis Shrodder", 28, 1500, DeveloperGrades.MIDDLE);

        for(DeveloperGrades developerGrades : DeveloperGrades.values()){
            developerGrades.printPhrase();
        }
    }
}
