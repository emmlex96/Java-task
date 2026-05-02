import java.time.LocalDate;

public class MenstrualAppTest {


static int passed = 0;
static int failed = 0;

public static void main(String[] args) {

    System.out.println("RUNNING TESTS");

    
    check("Period End Date",
            MenstrualApp.getPeriodEndDate(),
            LocalDate.of(2026, 4, 14));


    check("Ovulation Date",
            MenstrualApp.getOvulationDate(),
            LocalDate.of(2026, 4, 24));

    check("Fertile Window Start",
            MenstrualApp.getFertileStart(),
            LocalDate.of(2026, 4, 19));


    check("Fertile Window End",
            MenstrualApp.getFertileEnd(),
            LocalDate.of(2026, 4, 25));


    check("Next Period Start",
            MenstrualApp.getNextPeriodStart(),
            LocalDate.of(2026, 5, 8));


    check("Next Period End",
            MenstrualApp.getNextPeriodEnd(),
            LocalDate.of(2026, 5, 12));


    check("Safe Period 1 Start",
            MenstrualApp.getSafePeriod1Start(),
            LocalDate.of(2026, 4, 15));


    check("Safe Period 1 End",
            MenstrualApp.getSafePeriod1End(),
            LocalDate.of(2026, 4, 18));


    check("Safe Period 2 Start",
            MenstrualApp.getSafePeriod2Start(),
            LocalDate.of(2026, 4, 26));


    check("Safe Period 2 End",
            MenstrualApp.getSafePeriod2End(),
            LocalDate.of(2026, 5, 7));


    checkBoolean("April 22 is Fertile",
            MenstrualApp.isFertile(LocalDate.of(2026, 4, 22)), true);


    checkBoolean("April 16 is NOT Fertile",
            MenstrualApp.isFertile(LocalDate.of(2026, 4, 16)), false);


    checkBoolean("April 16 is Safe",
            MenstrualApp.isSafe(LocalDate.of(2026, 4, 16)), true);


    checkBoolean("April 22 is NOT Safe",
            MenstrualApp.isSafe(LocalDate.of(2026, 4, 22)), false);


    System.out.println("RESULTS");
    System.out.println("Passed : " + passed);
    System.out.println("Failed : " + failed);
    System.out.println("Total  : " + (passed + failed));
    if (failed == 0) {
        System.out.println("\nAll tests passed!");
    }

}

static void check(String name, LocalDate actual, LocalDate expected) {
    if (actual.equals(expected)) {
        System.out.println("[PASS] " + name + " => " + actual);
        passed++;
    } else {
        System.out.println("[FAIL] " + name + " => Expected: " + expected + " | Got: " + actual);
        failed++;
    }
}

static void checkBoolean(String name, boolean actual, boolean expected) {
    if (actual == expected) {
        System.out.println("[PASS] " + name);
        passed++;
    } else {
        System.out.println("[FAIL] " + name + " => Expected: " + expected + " | Got: " + actual);
        failed++;
    }
}


}
