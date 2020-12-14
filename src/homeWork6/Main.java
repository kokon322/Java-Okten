package homeWork6;

public class Main {
    public static void main(String[] args) {
       int minutes = 45;
       int hours = 2;

        Time boratMovieDuration = new Time();
        boratMovieDuration.setMin(minutes);
        boratMovieDuration.setHour(hours);

        Movie borat = new Movie();
        borat.setTitle("Borat");
        borat.setDuration(boratMovieDuration);

        System.out.println("This is movie: "+borat);

        Time startTime = new Time();
        startTime.setHour(23);
        startTime.setMin(40);

        System.out.println("This is start time: " + startTime);
        Seance one = new Seance(borat, startTime);

        System.out.println("This is a season: "+ one);

    }
}
