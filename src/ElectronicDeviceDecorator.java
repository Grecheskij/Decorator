public class ElectronicDeviceDecorator implements ElectronicDevice {
    protected ElectronicDevice decoratedDevice;

    public ElectronicDeviceDecorator(ElectronicDevice device) {
        this.decoratedDevice = device;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn();
    }
}

class BluetoothDecorator extends ElectronicDeviceDecorator {
    public BluetoothDecorator(ElectronicDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Bluetooth is now enabled.");
    }
}

class WiFiDecorator extends ElectronicDeviceDecorator {
    public WiFiDecorator(ElectronicDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("WiFi is now connected.");
    }
}
