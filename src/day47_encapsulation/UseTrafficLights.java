package day47_encapsulation;

public class UseTrafficLights {
    public static void main(String[] args) {

        TrafficLights light = new TrafficLights("grey");
//        System.out.println(light.color());
//
//        light.color = "pink";
//
        TrafficLights light2 = new TrafficLights("red");
        System.out.println(light2.getColor());

        light2.setColor("grey");
        System.out.println(light2.getColor());

        TrafficLights light3 = new TrafficLights("Black");
        System.out.println(light3.getColor());
    }
}
