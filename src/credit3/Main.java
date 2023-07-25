package credit3;

public class Main {
    //На некотором предприятии инженер Петров создал устройство,
    // на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
    // Когда рабочий день начинается ровно в 9:00 часов утра — табло отображает 28800 (т.е. остаётся 8 часов).
    // Когда время 14:30 — на табло 9000 (т.е. остаётся два с половиной часа).
    // А когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
    //
    //Программист Иванов заметил,
    // как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
    // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить
    // на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
    // Например: осталось 7 часов, осталось 4 часа, остался 1 час, осталось менее часа.
    //
    //Итак, в переменную n должно записываться случайное (на время тестирования программы)
    // целое число из промежутка [0;28800]. Далее оно должно выводиться на экран (для Петрова)
    // и на следующей строке (для сотрудниц) должна выводиться фраза о количестве полных часов,
    // содержащихся в n секундах.
    public static void main(String[] args) {

        int time = (int)(Math.random() * 28800 + 1);

        System.out.println(time);

//        switch (time/3600){
//            case 0:
//                System.out.println("Осталось меньше часа");
//                break;
//            case 1:
//                System.out.println("Остался 1 час");
//                break;
//            case 2:
//                System.out.println("Осталось 2 часа");
//                break;
//            case 3:
//                System.out.println("Осталось 3 часа");
//                break;
//                System.out.println("Осталось 4 часа");
//                System.out.println("Осталось 5 часов");
//                System.out.println("Осталось 5 часов");
//                System.out.println("Осталось 6 часов");
//                System.out.println("Осталось 7 часов");
//                System.out.println("Осталось более 7 часов");
//                break;
//        }
        int hour = time/3600;
        int minute = (time - hour*3600) / 60;
        if(hour<1){
            System.out.println("Осталось менее часа");
        } else {
            System.out.println("Остальсь часов " + hour);
        }

    }
}