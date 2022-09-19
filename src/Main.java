public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        double paper = 763789;
        System.out.println(paper);
// Задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
// Задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 3.5;
        System.out.println(cat);
        paper = (double) (paper - 3.5);
        System.out.println(paper);
        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = (friend / 7);
        System.out.println(friend);
        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача 6
        var weightBoxer =   78.2;
        var weightBoxer2 = 82.7;
        var weightOfBoxers = weightBoxer + weightBoxer2;
        System.out.println(weightOfBoxers);
        var weightOfBoxers2 = weightBoxer2 - weightBoxer;
        System.out.println(weightOfBoxers2);
// Задача 7
        var weightOfBoxers3 = weightBoxer2 - weightBoxer;
        System.out.println(weightOfBoxers3);
        var weightOfBoxers4 = weightBoxer2 % weightBoxer;
        System.out.println(weightOfBoxers4);
// Задача 8
        var time = 640;
        var timeWorkers = 8;
        var workers = time / timeWorkers;
        System.out.println("Всего работают в компании - " + workers + " человек.");
        var fullWorkers = workers + 94;
        var fullTimeWorkes = time / fullWorkers;
        System.out.println("Если в компании работает " + fullWorkers +" человека, то всего " + fullTimeWorkes + " часа работы может быть поделено между сотрудниками.");







    }
}