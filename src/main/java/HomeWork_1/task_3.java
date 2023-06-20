package HomeWork_1;

//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalDateTime;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String text = scanner.next();
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if (hour >= 5 && hour < 12) System.out.printf("Доброе утро, " + text +"!");
        if (hour >= 12 && hour < 18) System.out.printf("Добрый день, " + text +"!");
        if (hour >= 18 && hour < 23) System.out.printf("Добрый вечер, " + text +"!");
        if (hour >= 23 || (hour>=0 && hour < 5)) System.out.printf("Доброе утро, " + text +"!");
    }
}
