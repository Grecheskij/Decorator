// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ElectronicDevice television = new Television();
        ElectronicDevice bluetoothTV = new BluetoothDecorator(television);
        ElectronicDevice wifiBluetoothTV = new WiFiDecorator(bluetoothTV);

        System.out.println("Using decorated TV with Bluetooth and WiFi:");
        wifiBluetoothTV.turnOn();
    }
}