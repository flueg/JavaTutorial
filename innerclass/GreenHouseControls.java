// This produces a specific application of the 
// control system. All in a single class. Inner
// classes allow you to encapsulate different
// functionality for each type of event;

import innerclass.controller.*;

public class GreenHouseControls extends Controller {
    // Control the light.
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here
            light = true;
        }
        public String toString() {return "Light is on";}
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here
            light = false;
        }
        public String toString() {return "Light is off";}
    }

    // Control the water resource
    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {super(delayTime);}
        public void action() {
            // Put hardware control code here
            water = true;
        }
        public String toString(){return "Greenhouse water is on";}
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {super(delayTime);}
        public void action() {
            // Put hardware control code here
            water = false;
        }
        public String toString(){return "Greenhouse water is false";}
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {super(delayTime);}
        public void action(){ 
            // Put hardware control code here
            thermostat = "Night";
        }
        public String toString(){return "Themostat on night setting";}
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {super(delayTime);}
        public void action(){ 
            // Put hardware control code here
            thermostat = "Day";
        }
        public String toString(){return "Themostat on day setting";}
    }

    // An example of an action() that inserts a
    // new one of itself into the event list.
    public class Bell extends Event {
        public Bell(long delayTime) {super(delayTime);}
        public void action() { addEvent(new Bell(delayTime)); }
        public String toString() {return "Bing!!!!";}
    }

    // Restart the Greenhouse controller.
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e: eventList)
                addEvent(e);
        }
        public void action() {
            // Add this event
            start();
            addEvent(this);
            for(Event e: eventList) {
                // rerun each event.
                e.start(); 
                addEvent(e);
            }
        }
        public String toString(){return "Restarting system...";}
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {super(delayTime);}
        public void action(){System.exit(0);}
        public String toString(){return "Terminatint...";}
    }

    // Testing code
    public static class Test {
        public static void main(String[] args) {
            GreenHouseControls gc = new GreenHouseControls();
            // Note that the Bell is inner the GreenHouseControls
            gc.addEvent(gc.new Bell(900000000));
            Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200000000),
                gc.new LightOff(400000000),
                gc.new WaterOn(600000000),
                gc.new WaterOff(800000000),
                gc.new ThermostatDay(1400000000),
            };

            gc.addEvent(gc.new Restart(2000000000, eventList));
            // Note that Terminate is a static class.
            if (args.length == 1)
                gc.addEvent(
                    new GreenHouseControls.Terminate(new Long(args[0])));
            gc.run();
        }
    }
}
