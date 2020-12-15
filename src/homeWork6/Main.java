package homeWork6;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        Time timeBorat = new Time();
        timeBorat.setHour(2);
        timeBorat.setMin(25);

        Time timeXXX = new Time();
        timeXXX.setHour(1);
        timeXXX.setMin(15);

        Movie borat = new Movie();
        borat.setDuration(timeBorat);
        borat.setTitle("Borat");

        Movie xxx = new Movie();
        xxx.setDuration(timeXXX);
        xxx.setTitle("XXX");

        Time starsBorat = new Time();
        starsBorat.setHour(12);
        starsBorat.setMin(30);

        Time starsXXX = new Time();
        starsXXX.setHour(15);
        starsXXX.setMin(50);

        Seance one = new Seance(borat, starsBorat);
        Seance two = new Seance(xxx,starsXXX);


        Cinema smartCinema = new Cinema();
        smartCinema.addSeances(Days.FRIDAY,two,one);
        smartCinema.addSeances(Days.MONDAY,one,two);
        smartCinema.addSeances(Days.THURSDAY,one,two);


       smartCinema.removeMovie(xxx);
        System.out.println(smartCinema);




    }
}
