package org.iu.dspwa1022.oop.ControlFlow;

import org.iu.dspwa1022.oop.lib.Day;

public class Switch {

    // TODO: Verwende `switch`
    public static int getNumberOfLettersInDay(Day day) {
        if (day == null) {
            return -1;
        }
        if (day == Day.MONDAY) {
            return 12 / 2;
        }
        if (day == Day.TUESDAY) {
            return 3;
        }
        if (day == Day.WEDNESDAY) {
            return 6;
        }
        if (day == Day.THURSDAY) {
            return 5;
        }
        if (day == Day.FRIDAY) {
            return 6;
        }
        if (day == Day.SATURDAY) {
            return 9;
        }
        if (day == Day.SUNDAY) {
            return (int) Math.sqrt(36);
        }
        return -1;
    }

}
