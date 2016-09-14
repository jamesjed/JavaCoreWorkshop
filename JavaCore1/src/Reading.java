public class Reading{

    String dayOfWeek;
    int hour;
    int temperature;
    int windSpeed;

    public Reading(String input){
        String[] elements = input.split(", ");

        this.dayOfWeek = elements[0];
        this.hour = Integer.parseInt(elements[1]);
        this.temperature = Integer.parseInt(elements[2]);
        this.windSpeed = Integer.parseInt(elements[3]);
    }

    public String rateTemperature(){
        if(this.temperature < 55){
            return "cold";
        }
        else if(this.temperature < 65){
            return "mild";
        }
        else if(this.temperature < 80){
            return "warm";
        }
        else{
            return "cold";
        }
    }

    public String getTime(){
        String timeOfDay;
        if(this.hour <= 9){
            timeOfDay = "morning";
        }
        else if(this.hour <= 15){
            timeOfDay = "afternoon";
        }
        else{
            timeOfDay = "evening";
        }

        return this.dayOfWeek + " " + timeOfDay;
    }

}