public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        }
        // Задача 2
        System.out.println("Задача 2");
        int temperature = 7;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        //Задача 3
        System.out.println("Задача 3");
        int speed = 90;
        if (speed > 60) {
            System.out.println("Ваша скорость- " + speed + " ,придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Превышения нет-можно ездить спокойно");
        }
        //Задача 4
        System.out.println("Задача 4");
        int age1 = 21;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Вам нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Вам нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Вам нужно ходить в университет");
        } else if (age1 > 24) {
            System.out.println("Вам нужно ходить на работу");
        }
        //Задача 5
        System.out.println("Задача 5");
        int childsAge=11;
        if (childsAge<5) {
            System.out.println("Ребенку нельзя кататься");
        }
        else if (childsAge>=5&&childsAge<=14) {
            System.out.println("Ребенок может кататься в сопровождении взрослых");
        }
        else {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
        //Задача 6
        System.out.println("Задача 6");
        int seatPlaces=60;
        int standingPlaces=42;
        int occupiedPlaces=88;
        int totalPlaces=102;
        if (occupiedPlaces<60) {
            System.out.println("В вагоне есть "+(seatPlaces-occupiedPlaces)+
                    " сидячих мест и "+standingPlaces+" стоячих мест");
        }
        else if (occupiedPlaces>=60&&occupiedPlaces<102) {
            System.out.println("В вагоне есть "+(totalPlaces-occupiedPlaces)+" стоячих мест");
        }
        else {
            System.out.println("Свободных мест нет");
        }
        //Задача 7
        System.out.println("Задача 7");
        int one=1;
        int two=2;
        int three=3;
        if (one>two) {
            System.out.println("Наибольшее число one");
        }
        else if (two>three) {
            System.out.println("Наибольшее число two");
        }
        else {
            System.out.println("Наибольшее число three");
        }

    }
}