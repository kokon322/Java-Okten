package homeWork6;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule(new TreeSet<Seance>());

        Time timeBorat = new Time();
        timeBorat.setHour(2);
        timeBorat.setMin(25);

        Time timeXXX = new Time();
        timeXXX.setHour(1);
        timeXXX.setMin(15);

        Movie borat = new Movie();
        borat.setDuration(timeBorat);
        borat.setTitle("Borat");

        Movie XXX = new Movie();
        XXX.setDuration(timeXXX);
        XXX.setTitle("XXX");

        Time starsBorat = new Time();
        starsBorat.setHour(12);
        starsBorat.setMin(30);

        Time starsXXX = new Time();
        starsXXX.setHour(15);
        starsXXX.setMin(50);

        Seance one = new Seance(borat, starsBorat);
        Seance two = new Seance(XXX,starsXXX);

        schedule.addSeance(two);
        schedule.addSeance(one);


        schedule.printSchedule();


    }
}
