package homeWork6;

import java.util.*;

public class Cinema {
    private Map<Days, Schedule> scheduleByDays;
    private Time open;
    private Time close;

    public Cinema() {
        this.scheduleByDays = new TreeMap<Days, Schedule>();
    }

    public void addSeances(Days day, Seance... seances) {
        if (scheduleByDays.isEmpty() || !scheduleByDays.containsKey(day)) {
            Schedule schedule = new Schedule();
            for (Seance seance : seances) {
                schedule.addSeance(seance);
            }
            this.scheduleByDays.put(day, schedule);
        } else {
            for (Map.Entry<Days, Schedule> daysScheduleEntry : scheduleByDays.entrySet()) {
                if (daysScheduleEntry.getKey().equals(day)) {
                    for (Seance seance : seances) {
                        daysScheduleEntry.getValue().addSeance(seance);
                    }
                }
            }
        }
    }

    public void addSeance(Seance seance, Days day) {
        if (scheduleByDays.isEmpty() || !scheduleByDays.containsKey(day)) {
            Schedule schedule = new Schedule();
            schedule.addSeance(seance);
            this.scheduleByDays.put(day, schedule);
        } else {
            for (Map.Entry<Days, Schedule> daysScheduleEntry : scheduleByDays.entrySet()) {
                if (daysScheduleEntry.getKey().equals(day)) {
                    daysScheduleEntry.getValue().addSeance(seance);
                }
            }
        }
    }

    public void removeMovie(Movie movie) {
        Map<Days, Schedule> mapa = new TreeMap<>(scheduleByDays);
        for (Map.Entry<Days, Schedule> daysScheduleEntry : mapa.entrySet()) {
            Schedule schedule = daysScheduleEntry.getValue();
            Set<Seance> seances = new TreeSet<>(schedule.getSeances());
            for (Seance seance : seances) {
                if (seance.getMovie().equals(movie)) {
                    scheduleByDays.get(daysScheduleEntry.getKey()).removeSeance(seance);
                }
            }
        }
    }

    public void removeSeance(Seance seance, Days day) {
        for (Map.Entry<Days, Schedule> daysScheduleEntry : scheduleByDays.entrySet()) {
            if (daysScheduleEntry.getKey().equals(day)) {
                daysScheduleEntry.getValue().removeSeance(seance);
            }
        }
    }

    ////////////////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(scheduleByDays, cinema.scheduleByDays) && Objects.equals(open, cinema.open) && Objects.equals(close, cinema.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleByDays, open, close);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "ScheduleByDays=" + scheduleByDays +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}
