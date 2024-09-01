public class Hufflepuff extends Student {


    Hufflepuff(String name, int wizardry, int transgression, int hardworking, int loyalty, int honesty) {
        super(name, wizardry, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    private final int hardworking;
    private final int loyalty;
    private final int honesty;

    public int getPotential() {
        return hardworking + loyalty + honesty;
    }

    public static void findStrongerHufflepuffStudent(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getPotential() > student2.getPotential()) {
            System.out.println(student1.getName() + " has higher potential than " + student2.getName());
        } else if (student1.getPotential() < student2.getPotential()) {
            System.out.println(student2.getName() + " has higher potential than " + student1.getName());
        } else {
            System.out.println(student1.getName() + "'s potential equal with " + student2.getName());
        }
    }

    @Override
    public String toString() {

        return "Hufflepuff Student name: " + super.getName() + ". Wizardry " + super.getWizardry() + ". Transgression: " + super.getTransgression() + ". Hardworking: " + hardworking + ". Honesty:" + honesty + ". Loyalty: " + loyalty + ". Sum of faculty specs " + getPotential();
    }
}
