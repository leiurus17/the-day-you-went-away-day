import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        findTheDayYouWentAwayDays();
    }

    private static void findTheDayYouWentAwayDays() {

        for (int x = 1970; x <= 2100; x++) { // adjust to your preference

            LocalDate septemberTwentySecond = LocalDate.of(x, 9, 22);

            if (septemberTwentySecond.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                System.out.println("Year " + x + " has a The Day You Went Away day!");
            }
        }
    }
}
