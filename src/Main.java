public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        var dog = 8.0 + 4;
        var  cat = 3.6 + 4;
        var paper = 763789 + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");

        var dog = 8.0 - 3.5;
        var cat = 3.6 - 1.6;
        var paper = 763789 - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog % 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersWeights = boxer1 + boxer2;
        System.out.println("Общий вес боксёров " + boxersWeights + " кг.");

        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе бойцов равна " + weightDifference + " кг.");

    }

    public static void task7() {
        System.out.println("Задача 7");

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightDifference1 = boxer2 - boxer1;
        System.out.println("Разница в весе бойцов равна " + weightDifference1 + " кг.");
        var weightDifference2 = boxer2 % boxer1;
        System.out.println("Остаток равен " + weightDifference2 + " кг.");
    }

    public static void task8 () {
        System.out.println("Задача 8");

        var workHours = 640;
        var spendTime = 8;
        var workers = workHours / spendTime;
        System.out.println("Всего работников в компании " + workers + " человек.");

        var newWorkers = workers + 94;
        var totalHours = newWorkers * 8;
        System.out.println("Если в компании работает " + newWorkers + " человека," + " то всего "
                + totalHours + " часов работы может быть поделено между сотрудниками.");
    }
}