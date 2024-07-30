public class Main {
    public static void main(String[] args) {
        
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel Core i3")
                .setRAM(8)
                .setStorage("512 GB SSD")
                .build();

        System.out.println("Basic Computer Configuration:");
        System.out.println("CPU: " + basicComputer.getCpu());
        System.out.println("RAM: " + basicComputer.getRam() + " GB");
        System.out.println("Storage: " + basicComputer.getStorage());
        System.out.println("Graphics Card: " + (basicComputer.isGraphicsCardEnabled() ? "Enabled" : "Disabled"));
        System.out.println("Bluetooth: " + (basicComputer.isBluetoothEnabled() ? "Enabled" : "Disabled"));
        System.out.println();

     
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(16)
                .setStorage("1 TB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println("Gaming Computer Configuration:");
        System.out.println("CPU: " + gamingComputer.getCpu());
        System.out.println("RAM: " + gamingComputer.getRam() + " GB");
        System.out.println("Storage: " + gamingComputer.getStorage());
        System.out.println("Graphics Card: " + (gamingComputer.isGraphicsCardEnabled() ? "Enabled" : "Disabled"));
        System.out.println("Bluetooth: " + (gamingComputer.isBluetoothEnabled() ? "Enabled" : "Disabled"));
    }
}