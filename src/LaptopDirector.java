public class LaptopDirector {
    public Laptop createGamingLaptop() {
        return new Laptop.LaptopBuilder()
                .withBrand("Asus")
                .withModel("ROG Strix G18")
                .withCPU("Intel Core i9-14900HX")
                .withRAM(32)
                .withStorage(2000)
                .withGPU("NVIDIA RTX 4090")
                .withScreenSize(18.0)
                .withOperatingSystem("Windows 11 Pro")
                .build();
    }

    public Laptop createUltrabook() {
        return new Laptop.LaptopBuilder()
                .withBrand("Dell")
                .withModel("XPS 13 Plus")
                .withCPU("Intel Core i7-1360P")
                .withRAM(16)
                .withStorage(512)
                .withGPU("Intel Iris Xe Graphics")
                .withScreenSize(13.4)
                .withOperatingSystem("Windows 11 Home")
                .build();
    }

    public Laptop createWorkstationLaptop() {
        return new Laptop.LaptopBuilder()
                .withBrand("Lenovo")
                .withModel("ThinkPad P1 Gen 6")
                .withCPU("Intel Xeon W-11855M")
                .withRAM(64)
                .withStorage(4000)
                .withGPU("NVIDIA RTX A5000")
                .withScreenSize(16.0)
                .withOperatingSystem("Windows 11 Pro for Workstations")
                .build();
    }
}
