interface LaptopFactoryAbstract {
    Laptop createGamingLaptop();
    Laptop createBusinessLaptop();
}

class DellFactory implements LaptopFactoryAbstract {
    @Override
    public Laptop createGamingLaptop() {
        return new Laptop.LaptopBuilder()
                .withBrand("Dell")
                .withModel("Alienware X17")
                .withCPU("Intel i9")
                .withRAM(32)
                .withStorage(2000)
                .withGPU("NVIDIA RTX 4090")
                .withScreenSize(17.3)
                .withOperatingSystem("Windows 11")
                .build();
    }

    @Override
    public Laptop createBusinessLaptop() {
        return new Laptop.LaptopBuilder()
                .withBrand("Dell")
                .withModel("Latitude 7430")
                .withCPU("Intel i7")
                .withRAM(16)
                .withStorage(512)
                .withGPU("Integrated")
                .withScreenSize(14.0)
                .withOperatingSystem("Windows 11 Pro")
                .build();
    }

}

class AsusFactory implements LaptopFactoryAbstract {
    @Override
    public Laptop createGamingLaptop() {
        return new Laptop.LaptopBuilder()
                .withBrand("Asus")
                .withModel("ROG Strix")
                .withCPU("AMD Ryzen 9")
                .withRAM(32)
                .withStorage(1000)
                .withGPU("NVIDIA RTX 4080")
                .withScreenSize(17.3)
                .withOperatingSystem("Windows 11")
                .build();
    }

    @Override
    public Laptop createBusinessLaptop() {
        return new Laptop.LaptopBuilder()
                .withBrand("Asus")
                .withModel("ExpertBook")
                .withCPU("Intel i7")
                .withRAM(16)
                .withStorage(512)
                .withGPU("Integrated")
                .withScreenSize(14.0)
                .withOperatingSystem("Windows 11 Pro")
                .build();
    }
}