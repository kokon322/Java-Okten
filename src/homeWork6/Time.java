package homeWork6;

import java.util.Objects;

public class Time {
    private int hour;
    private int min;


    public Time() {
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


    public Time calculateEndTime(Time duration) {
        Time result = new Time();
        int resultMinute = this.getMin() + duration.getMin();
        int resultHour = this.getHour() + duration.getHour();
        if (resultMinute > 59) {
            resultMinute -= 60;
        }
        if (resultHour > 23) {
            resultHour -= 23;
        }
        result.setMin(resultMinute);
        result.setHour(resultHour);
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
