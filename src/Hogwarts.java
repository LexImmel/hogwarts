public class Hogwarts {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 50, 55, 35, 45, 40);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 80, 65, 60, 70, 85);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 50, 70, 40, 80, 90);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 80, 60, 80, 50, 90, 65, 95);
        Slytherin grahamMontegue = new Slytherin("Graham Montegue", 80, 60, 30, 50, 90, 65, 45);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 80, 60, 20, 50, 40, 65, 35);

        Hufflepuff zahariaSmith = new Hufflepuff("Zaharia Smith", 60, 50, 80, 60, 70);
        Hufflepuff cedericDiggory = new Hufflepuff("Cederic Diggory", 60, 50, 60, 90, 75);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch Fletchley", 60, 50, 40, 75, 75);

        Ravenclaw chowChang = new Ravenclaw("Chow Chang", 50, 70, 55, 65, 85, 70);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 70, 80, 55, 85, 65, 70);
        Ravenclaw marcusBelby = new Ravenclaw("MarcusBelby", 50, 90, 75, 75, 75, 75);
        //Сделайте метод, который выводит на экран описание студента.
        // В описание надо включать качества, которые присущи всем студентам,
        // плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
        System.out.println(harryPotter);
        System.out.println(grahamMontegue);
        System.out.println(zahariaSmith);
        System.out.println(chowChang);
        System.out.println("");

        System.out.println(dracoMalfoy);
        Student.setTransgression(dracoMalfoy.transgression = 77);
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontegue);
        System.out.println("");
        //Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой
        // двух учеников одного факультета по свойствам. Чтобы сравнить учеников,
        // нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
        // Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
        // Метод должен выводить в консоль результат сравнения учеников.
        Gryffindor.findStrongerGryffindorStudent(harryPotter, hermioneGranger);
        Slytherin.findStrongerSlytherinStudent(dracoMalfoy, gregoryGoyle);
        Hufflepuff.findStrongerHufflepuffStudent(cedericDiggory, justinFinchFletchley);
        Ravenclaw.findStrongerRavenclawStudent(chowChang, padmaPatil);
        System.out.println("");
        //Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
        Student.powerOfMagicTransgression(ronWeasley, marcusBelby);
    }
}
