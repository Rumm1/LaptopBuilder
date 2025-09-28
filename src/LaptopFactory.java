interface LaptopFactory {
    Laptop createLaptop();
}

class GamingLaptopFactory implements LaptopFactory {
    @Override
    public Laptop createLaptop() {
        return new Laptop.LaptopBuilder()
                .withBrand("Generic")
                .withModel("GamerX")
                .withCPU("Intel i9")
                .withRAM(32)
                .withStorage(1000)
                .withGPU("NVIDIA RTX 4080")
                .withScreenSize(17.3)
                .withOperatingSystem("Windows 11")
                .build();
    }
}

class BusinessLaptopFactory implements LaptopFactory {
    @Override
    public Laptop createLaptop() {
        return new Laptop.LaptopBuilder()
                .withBrand("Generic")
                .withModel("BizPro")
                .withCPU("Intel i7")
                .withRAM(16)
                .withStorage(512)
                .withGPU("Integrated")
                .withScreenSize(15.6)
                .withOperatingSystem("Windows 11 Pro")
                .build();
    }
}