public class Ravenclaw extends Student {

    Ravenclaw(String name, int wizardry, int transgression, int intelligence, int wisdom, int wit, int fullOfCreativity) {
        super(name, wizardry, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;

    }
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int fullOfCreativity;

    public int getPotential() {
        return intelligence + wisdom + wit + fullOfCreativity;
    }

    public static void findStrongerRavenclawStudent(Ravenclaw student1, Ravenclaw student2) {
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

        return "Ravenclaw Student name: " + super.getName() + ". Wizardry " + super.getWizardry() + ". Transgression: " + super.getTransgression() + ". Intelligence: " + intelligence + ". Wisdom:" + wisdom + ". Wit: " + wit + ". Full Of Creativity: " + fullOfCreativity + ". Sum of faculty specs " + getPotential();
    }
}
