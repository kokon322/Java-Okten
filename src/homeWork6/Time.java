package homeWork6;

import java.util.Objects;

public class Time {
    private int min;
    private int hour;

    public Time() {
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min <= 59 && min >= 0) {
            this.min = min;
        } else {
            System.out.println("Ты ввел не правельное время");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        } else {
            System.out.println("Ты ввел не правельное время");
        }
    }

    public Time calculateEndTime(Time duration) {
        Time result = new Time();
        result.setMin(this.getMin() + duration.getMin());
        result.setHour(this.getHour() + duration.getHour());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min && hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }

    @Override
    public String toString() {
        return "Time{" +
                "min=" + min +
                ", hour=" + hour +
                '}';
    }
}
