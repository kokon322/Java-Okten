package homeWork6;


import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seances;

    public Schedule(Set<Seance> seances) {
        this.seances = new TreeSet<>();
    }

    public void addSeance(Seance x) {
        this.seances.add(x);
    }

    public void removeSeance(Seance x) {
        this.seances.remove(x);
    }

    public void printSchedule() {
        for (Seance seance : this.seances) {
            System.out.println(seance);
        }
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
