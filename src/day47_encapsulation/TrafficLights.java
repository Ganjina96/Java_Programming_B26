package day47_encapsulation;

public class TrafficLights {

    private String color;

    public TrafficLights(String color){
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color){
            case "red":
            case "yellow":
            case "green":
                this.color = color;
        }

    }
}
