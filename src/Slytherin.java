public class Slytherin extends Student {

    public static Object findStrongerSlytherinStudent;
    private int getPotential;

    Slytherin(String name, int wizardry, int transgression, int cunning, int attentiveness, int ambition, int resourcefulness, int thirstForPower) {
        super(name, wizardry, transgression);
        this.cunning = cunning;
        this.attentiveness = attentiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    private final int cunning;
    private final int attentiveness;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public int getPotential() {
        return cunning + attentiveness + ambition + resourcefulness + thirstForPower;
    }

    public static void findStrongerSlytherinStudent(Slytherin student1, Slytherin student2) {
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

        return "Slytherin Student name: " + super.getName() + ". Wizardry " + super.getWizardry() + ". Transgression: " + super.getTransgression() + ". Cunning: " + this.cunning + ". Attentiveness:" + attentiveness + ". Ambition: " + ambition + ". Resourcefulness:" + resourcefulness + ". Thirst For Power: " + thirstForPower + ". Sum of faculty specs " + getPotential();
    }

}
