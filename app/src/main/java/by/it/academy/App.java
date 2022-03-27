/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package by.it.academy;

import java.time.LocalDate;
import java.util.Random;

public class App {
    public String getGreeting() {
        return String.format("Hello World! Today is %s. Your lucky number is %d. Your the luckiest month is %s!",
                LocalDate.now(), getRandomNumber(), getRandomMonth());
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public String getRandomMonth(){
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                           "August", "September", "October", "November", "December"};
        return months[(int) (Math.random() * 12)];
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
