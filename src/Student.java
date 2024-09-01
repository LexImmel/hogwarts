public class Student {
    private String name;
    int wizardry;
    int transgression;


    public Student(String name, int wizardry, int transgression) {
        this.name = name;
        this.wizardry = wizardry;
        this.transgression = transgression;

    }

    public String getName() {
        return name;
    }

    public int getWizardry() {
        return wizardry;
    }

    public void setWizardry(int wizardry) {
        this.wizardry = wizardry;
    }

    public int getTransgression() {
        return transgression;
    }

    public static void setTransgression(int transgression) {
    }

    public void printStudent() {
        System.out.println("Student: " + name + "Magic: " + wizardry + ", transgression" + transgression);
    }
    public static void powerOfMagicTransgression(Student student1, Student student2){
        int comparison1 = student1.getWizardry() + student1.getTransgression();
        int comparison2 = student2.getWizardry() + student2.getTransgression();
        if (comparison1 > comparison2){
            System.out.println(student1.getName() + " has more magic potency than " + student2.getName());
        } else if (comparison1 < comparison2) {
            System.out.println(student2.getName() + " has more magic potency than " + student1.getName());
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " are equal in magic");
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + " Magic: " + wizardry + " , transgression " + transgression;
    }
}
