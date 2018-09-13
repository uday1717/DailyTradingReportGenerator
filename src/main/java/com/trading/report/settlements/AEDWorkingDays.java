package com.trading.report.settlements;

import java.time.DayOfWeek;

public class AEDWorkingDays extends WorkingDays {

    private static AEDWorkingDays instance = null;

    public static AEDWorkingDays getInstance() {
        if (instance == null) {
            instance = new AEDWorkingDays();
        }
        return instance;
    }

    private AEDWorkingDays() {
        super();
    }

    @Override
    protected void setupWorkingDays() {
        this.isWorkingDayMap.put(DayOfWeek.SUNDAY, true);
        this.isWorkingDayMap.put(DayOfWeek.MONDAY, true);
        this.isWorkingDayMap.put(DayOfWeek.TUESDAY, true);
        this.isWorkingDayMap.put(DayOfWeek.WEDNESDAY, true);
        this.isWorkingDayMap.put(DayOfWeek.THURSDAY, true);
        this.isWorkingDayMap.put(DayOfWeek.FRIDAY, false); // not working day
        this.isWorkingDayMap.put(DayOfWeek.SATURDAY, false); // not working day
    }
}
