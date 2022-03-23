package five.kyu;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String strHours = "";
        String strMinutes = "";
        String strSeconds = "";
        int hour = seconds / 3600;
        int min = seconds / 60;
        while (min >= 60){
            min %= 60;
        }
        int sec = seconds % 60;
        if (sec < 10){
            strSeconds += "0";
        }
        if (min < 10){
            strMinutes += "0";
        }
        if (hour < 10){
            strHours += "0";
        }
        return strHours + seconds / 3600 + ":" + strMinutes + min
                + ":" + strSeconds + sec;
    }
}