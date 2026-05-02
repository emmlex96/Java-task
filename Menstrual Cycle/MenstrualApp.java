import java.time.LocalDate;

public class MenstrualApp {

static LocalDate lastPeriodStart = LocalDate.of(2026, 4, 10);
static int cycleLength = 28;  
static int periodDuration = 5; 

static LocalDate getPeriodEndDate() {
    return lastPeriodStart.plusDays(periodDuration - 1);
}

static LocalDate getOvulationDate() {
    return lastPeriodStart.plusDays(cycleLength - 14);
}

static LocalDate getFertileStart() {
    return getOvulationDate().minusDays(5);
}

static LocalDate getFertileEnd() {
    return getOvulationDate().plusDays(1);
}


static LocalDate getNextPeriodStart() {
    return lastPeriodStart.plusDays(cycleLength);
}


static LocalDate getNextPeriodEnd() {
    return getNextPeriodStart().plusDays(periodDuration - 1);
}

static LocalDate getSafePeriod1Start() {
    return getPeriodEndDate().plusDays(1);
}

static LocalDate getSafePeriod1End() {
    return getFertileStart().minusDays(1);
}


static LocalDate getSafePeriod2Start() {
    return getFertileEnd().plusDays(1);
}

static LocalDate getSafePeriod2End() {
    return getNextPeriodStart().minusDays(1);
}


static boolean isFertile(LocalDate date) {
    return !date.isBefore(getFertileStart()) && !date.isAfter(getFertileEnd());
}


static boolean isSafe(LocalDate date) {
    boolean inSafe1 = !date.isBefore(getSafePeriod1Start()) && !date.isAfter(getSafePeriod1End());
    boolean inSafe2 = !date.isBefore(getSafePeriod2Start()) && !date.isAfter(getSafePeriod2End());
    return inSafe1 || inSafe2;
}


public static void main(String[] args) {


    System.out.println("        MENSTRUAL CYCLE TRACKER         ");
  
    System.out.println("Last Period Start : " + lastPeriodStart);
    System.out.println("Cycle Length      : " + cycleLength + " days");
    System.out.println("Period Duration   : " + periodDuration + " days");

    System.out.println("Period End        : " + getPeriodEndDate());
    System.out.println("Ovulation Date    : " + getOvulationDate());
    System.out.println("Fertile Window    : " + getFertileStart() + " to " + getFertileEnd());
    System.out.println("Next Period       : " + getNextPeriodStart() + " to " + getNextPeriodEnd());
    System.out.println("Safe Period 1     : " + getSafePeriod1Start() + " to " + getSafePeriod1End());
    System.out.println("Safe Period 2     : " + getSafePeriod2Start() + " to " + getSafePeriod2End());



    LocalDate dateToCheck = LocalDate.of(2026, 4, 22);
    System.out.println("Checking date     : " + dateToCheck);
    System.out.println("Is Fertile?       : " + isFertile(dateToCheck));
    System.out.println("Is Safe?          : " + isSafe(dateToCheck));

}


}
