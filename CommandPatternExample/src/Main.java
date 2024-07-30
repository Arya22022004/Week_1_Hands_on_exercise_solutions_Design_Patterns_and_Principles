public class Main {
    public static void main(String[] args) {
        // Create light
        Light light = new Light();

        // Create commands
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Create remote control
        RemoteControl remoteControl = new RemoteControl();

        // Set command to turn on light
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // Set command to turn off light
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}