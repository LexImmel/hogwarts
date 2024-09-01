public class Gryffindor extends Student {


    Gryffindor(String name, int wizardry, int transgression, int pride, int nobility, int bravery) {
        super(name, wizardry, transgression);
        this.pride = pride;
        this.nobility = nobility;
        this.bravery = bravery;
    }


    private final int pride;
    private final int nobility;
    private final int bravery;

    public int getPotential() {
        return pride + nobility + bravery;
    }

    public static void findStrongerGryffindorStudent(Gryffindor student1, Gryffindor student2) {
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

        return "Gryffindor Student name: " + super.getName() + ". Wizardry " + super.getWizardry() + ". Transgression: " + super.getTransgression() + ". Pride: " + pride + ". Nobility:" + nobility + ". Bravery: " + bravery + ". Sum of faculty specs " + getPotential();
    }
}
