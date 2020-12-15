package homeWork6;



import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seances;

    public Schedule() {
        this.seances = new TreeSet<>();
    }

    public void addSeance(Seance seance) {
        this.seances.add(seance);
    }

    public void removeSeance(Seance seance) {
        this.seances.remove(seance);
    }

    public void printSchedule() {
        for (Seance seance : this.seances) {
            System.out.println(seance);
        }
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
