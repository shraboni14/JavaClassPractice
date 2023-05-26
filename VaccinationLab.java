abstract class Vaccinee {
//    Creating abstract methods
    abstract boolean firstDose(String nationality, int age);
    abstract boolean secondDose();
    abstract boolean boosterDose();
}

//Inheriting the Abstract class
class VaccinationSuccessful extends Vaccinee {

//    Taking boolean value for checking the condition
    boolean firstDoseFlag = false;
    boolean secondDoseFlag = false;
    boolean boosterDoseFlag = false;

//    Implementing first dose Abstract method
    @Override
    boolean firstDose(String nationality, int age) {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("First dose taken successfully!");
            firstDoseFlag= true;

        } else {
            System.out.println("You are not eligible for the first dose.");
        }
        return firstDoseFlag;
    }
//     Implementing second dose Abstract method
    @Override
    boolean secondDose() {
        if (firstDoseFlag) {
            System.out.println("Second dose taken successfully!");
            secondDoseFlag = true;
        } else {
            System.out.println("You need to complete the first dose before taking the second dose.");
        }
        return secondDoseFlag;
    }
    //     Implementing booster dose Abstract method
    @Override
    boolean boosterDose() {
        if (firstDoseFlag && secondDoseFlag) {
            System.out.println("Booster dose taken successfully!");
        } else {
            System.out.println("You need to complete both first and second doses before taking the booster dose.");
        }
        return boosterDoseFlag;
    }
}

public class VaccinationLab {
    public static void main(String[] args) {
        VaccinationSuccessful vaccinationSuccessful = new VaccinationSuccessful();

        // Scenario 1
        vaccinationSuccessful.firstDose("Indian", 20); // Eligible
        vaccinationSuccessful.firstDose("Indian", 15); // Not eligible
        System.out.println(" ");

        // Scenario 2
        vaccinationSuccessful.secondDose(); // Not eligible yet
        vaccinationSuccessful.firstDose("Indian", 25); // Eligible
        vaccinationSuccessful.secondDose(); // Eligible
        System.out.println(" ");

        // Scenario 3
        vaccinationSuccessful.boosterDose(); // Not eligible yet
        vaccinationSuccessful.firstDose("Indian", 30);
        vaccinationSuccessful.secondDose(); // Eligible
        vaccinationSuccessful.boosterDose(); // Eligible
    }
}
