package org.kartashov.part11_io.usb;

import net.samuelcampos.usbdrivedetector.USBDeviceDetectorManager;
import net.samuelcampos.usbdrivedetector.USBStorageDevice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class USBDetector {

    private static final long POLLING_INTERVAL = 1000;

    public static void main(String[] args) throws IOException {
        USBDeviceDetectorManager manager = new USBDeviceDetectorManager();
//        USBDeviceDetectorManager manager2 = new USBDeviceDetectorManager(POLLING_INTERVAL);
        List<USBStorageDevice> usbStorageDevices = manager.getRemovableDevices();

        for (USBStorageDevice usbStorageDevice : usbStorageDevices) {
            System.out.println(usbStorageDevice.getSystemDisplayName());
            System.out.println(usbStorageDevice.getDeviceName());
            System.out.println(usbStorageDevice.canRead());
            System.out.println(usbStorageDevice.canWrite());
            System.out.println(usbStorageDevice.canExecute());
            Files.walk(Path.of(usbStorageDevice.getRootDirectory().getPath()))
//                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(System.out::println);
            System.out.println(usbStorageDevice.getRootDirectory());

        }
    }
}
