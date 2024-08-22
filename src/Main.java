public class Main {
    public static void main(String[] args) {
        byte firstNumbers = 3;
        short secondNumbers = 200;
        int thirdNumbers = 5000;
        long fourthNumbers = 12231499999L;
        float fifthNumbers = 2.2f;
        double sixthNumbers = 666.666;
        System.out.println("Значение переменной firstNumbers с типом byte = " + firstNumbers);
        System.out.println("Значение переменной secondNumbers с типом short = " + secondNumbers);
        System.out.println("Значение переменной thirdNumbers с типом int = " + thirdNumbers);
        System.out.println("Значение переменной fourthNumbers с типом long = " + fourthNumbers);
        System.out.println("Значение переменной fifthNumbers с типом float = " + fifthNumbers);
        System.out.println("Значение переменной sixthNumbers с типом double = " + sixthNumbers);
        System.out.println("Первая задача выполнена");


        System.out.println("Выполнение второй задачи");
        float blue = 27.12f;
        long red = 987678965549L;
        float orange = 2.786f;
        int pink = 569;
        short yellow = -159;
        int green = 27897;
        byte white = 67;


        System.out.println("Выполнение третьей задачи");
        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        int lists = 480;
        int count;
        System.out.println("На каждого ученика рассчитано " + (count = (lists / (ludmilaP+annaS+ekaterinaA))) + " листов бумаги");


        System.out.println("Выполнение четвертой задачи");
        byte perfomance = 16/2;
        int toTwentyminutes = perfomance * 20;
        int oneDay = perfomance * (24 * 60);
        int thereDays = perfomance * (3 * 24 *60);
        int oneMonth = perfomance * (30 * 24 * 60);
        System.out.println("За 20 минут машина произвела " + toTwentyminutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + thereDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок");

        System.out.println("Выполнение пятой задачи");
        byte total = 120;
        byte colorWhite = 2;
        byte colorBrown = 4;
        int classes = total / (colorBrown + colorWhite);
        System.out.println("В школе, где " + classes + " классов, нужно " + (classes * colorWhite) + " банок белой краски и " + (classes * colorBrown) + " банок коричневой краски");

        System.out.println("Выполнение шестой задачи");
        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        double mixGram = ((5*bananas)+(2*milk)+(2*iceCream)+(4*eggs));
        double mixKilogram = mixGram / 1000;
        System.out.println("Вес спортзавтрака в граммах = " + mixGram);
        System.out.println("Вес спортзавтрака в килограммах = " + mixKilogram);

        System.out.println("Выполнение седьмой задачи");
        byte mass = 7;
        int minGram = 250;
        int maxGram = 500;
        int daysMax = (7*1000/250);
        int daysMin = (7*1000/500);
        int averageDays = ((daysMin + daysMax) / 2);
        System.out.println("Спортсмену потребуется " + daysMax + " дней, если он будет худеть по 250 грамм каждый день");
        System.out.println("Спортсмену потребуется " + daysMin + " дней, если он будет худеть по 500 грамм каждый день");
        System.out.println("В среднем спортсмену потребуется " + averageDays + " дней чтобы похдеть на 7 кг");

        System.out.println("Выполнение восьмой задачи");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float increase = 1.1f;
        byte month = 12;
        float newMasha = masha * increase;
        float newDenis = denis * increase;
        float newKristina = kristina * increase;
        int revenueMasha = masha * 12;
        int revenueDenis = denis * 12;
        int revenueKristina = kristina * 12;
        float revenueNewMasha = newMasha * 12;
        float revenueNewDenis = newDenis * 12;
        float revenueNewKristina = newKristina * 12;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход  вырос на " + (revenueNewMasha-revenueMasha) + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход  вырос на " + (revenueNewDenis-revenueDenis) + " рублей");
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход  вырос на " + (revenueNewKristina-revenueKristina) + " рублей");

    }
}