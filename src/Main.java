public class Main {

    public static void main(String[] args) {
        //Задача 1
        int[] payments = {2700, 5400, 1100, 4300, 2200};
        int sum = 0;

        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");
        System.out.println();

        //Задача 2
        payments = new int[]{4200, 3600, 8100, 2700, 5100};
        int min = Integer.MAX_VALUE; //Представим, что у нас не может быть больше 2147483647 сумма трат в неделю
        int max = 0;

        for (int payment : payments) {
            min = Math.min(min, payment);
            max = Math.max(max, payment);
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        //Задача 3
        payments = new int[]{3700, 4500, 5200, 1400, 3100};
        double averageValue = 0;

        for (int payment : payments) {
            averageValue += payment;
        }
        averageValue = averageValue / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
        System.out.println();

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}