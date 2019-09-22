import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        findDayYouWentAwayDays();
    }

    private static void findDayYouWentAwayDays() {

        for (int x = 1970; x <= 2100; x++) {

            LocalDate septemberTwentySecondSunday = LocalDate.of(x, 9, 22);

            if (septemberTwentySecondSunday.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                System.out.println("Year " + x + " has a Day You Went Away day!");
            }
        }
    }
}
