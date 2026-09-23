interface RemoteControl {
void turnOn();
void turnOff();
}
abstract class Appliance {
abstract void displayAppliance();
}
class SmartTV extends Appliance implements RemoteControl {
public void displayAppliance() {
System.out.println("Appliance: Smart TV");
}
public void turnOn() {
System.out.println("Smart TV is turned ON");
}
public void turnOff() {
System.out.println("Smart TV is turned OFF");
}
}
public class Main {
public static void main(String[] args) {
// Dynamic Method Dispatch
Appliance a = new SmartTV();
a.displayAppliance();
// Type casting to access interface methods
RemoteControl r = (SmartTV) a;
r.turnOn();
r.turnOff();
}
}