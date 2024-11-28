import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Countdown {
    
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate targetDate = LocalDate.of(2025, 1, 1); // Set your target date here

        long daysUntil = ChronoUnit.DAYS.between(today, targetDate);

        System.out.println("Days until " + targetDate + ": " + daysUntil);
    }
}
