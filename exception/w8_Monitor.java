class InvalidRefreshRateException extends Exception {
    public InvalidRefreshRateException() {
        super("Unsupported refresh rate value"); 
    }
}
public class w8_Monitor {
    private double refreshRate;
    public final double MAX_REFRESH_RATE;
    public w8_Monitor(double defaultRate, double max) { 
        MAX_REFRESH_RATE = max;
        refreshRate = defaultRate;
    }

    public double setRefreshRate(double hz) throws InvalidRefreshRateException {
        if(hz < 0 || hz > MAX_REFRESH_RATE)
            throw new InvalidRefreshRateException();
        else
            refreshRate = hz; 
        return refreshRate;
    }
}
