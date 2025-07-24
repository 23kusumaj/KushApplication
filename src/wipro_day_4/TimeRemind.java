package wipro_day_4;

public class TimeRemind {
    public static void main(String[] args) {
        String[] tasks = {
            "Wake up",
            "Do exercise",
            "Have your Breakfast",
            "Join the session",
            "Start Project Work"
        };

        String[] times = {
            "5:00 AM",
            "5:30 AM",
            "7:00 AM",
            "8:00 AM",
            "8:45 AM"
        };

        for (int i = 0; i < tasks.length; i++) {
            System.out.println("Now the time is: " + times[i]);
            System.out.println("So your task is: " + tasks[i]);
            System.out.println("---------------------------");
        }
    }
}


