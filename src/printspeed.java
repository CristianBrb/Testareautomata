public class printspeed {
    public void printSpeedInMetric(int meters, int hours, int minutes, int seconds) {
        //V = D/T
        int timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double speedMeters = meters / timeInSeconds;
        System.out.println("The speed in m/s" + speedMeters);

        Double kmPerHour = speedMeters * 3.6;
        System.out.println("the speed in km/h" + kmPerHour);
        double milesPerHour = kmPerHour / 1.609;
        System.out.println("The speed in m/h" + milesPerHour);
    }
}