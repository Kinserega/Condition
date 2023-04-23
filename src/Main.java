public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 66;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 13;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int numberPassengers = 103;
        if (numberPassengers > 0 && numberPassengers <= 60) {
            System.out.println("Количество пассажиров " + numberPassengers + ", есть место в вагоне, сидячее");
        } else if (numberPassengers > 60 && numberPassengers <= 102) {
            System.out.println("Количество пассажиров " + numberPassengers + ", есть место в вагоне, стоячее");
        } else {
            System.out.println("Количество пассажиров " + numberPassengers + ", на такое количество пассажиров мест нет");
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 8;
        int two = 8;
        int three = 8;
        if (one > two ) {
            if (one >=three){
                System.out.println("Максимальное число " + one);
            }else {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else {
            if (one > three){
            System.out.println("Максимальное число " + one);
        } else if (three > one){
            System.out.println("Максимальное число " + three);
        } else {
                System.out.println("Все три числа равны");
            }
    }
}}
