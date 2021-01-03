package sample;

public class Clock {
    int hours;
    int minutes;
    int seconds;


    public Clock(int hours, int minutes, int seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);


    }

    private void setMinutes(int minutes) {
        this.minutes = minutes % 60;

    }

    private void setSeconds(int seconds) {
        this.seconds = seconds % 60;
    }

    public void setHours(int hours) {
        this.hours = hours % 24;
    }

    public int getHours() {
        return hours;
    }
}
