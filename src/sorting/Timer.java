package sorting;

public class Timer {
    private Double startTime;
    private Double endTime;

    public Timer() {
    }

    public Double elapsedTime() {
        return endTime-startTime;
    }

    public Double getStartTime() {
        return startTime;
    }

    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    public Double getEndTime() {
        return endTime;
    }

    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }
}
