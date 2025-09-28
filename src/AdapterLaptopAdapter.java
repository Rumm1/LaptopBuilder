public class AdapterLaptopAdapter implements Laptop.Builder {
    private final AdapteeLaptop legacyLaptop;
    private String gpu;
    private double screenSize;
    private String operatingSystem;

    public AdapterLaptopAdapter(AdapteeLaptop legacyLaptop) {
        this.legacyLaptop = legacyLaptop;
        this.gpu = "Integrated Graphics";
        this.screenSize = 15.6;
        this.operatingSystem = "Windows 10";
    }
    @Override
    public Laptop.Builder withBrand(String brand) {
        return this;
    }

    @Override
    public Laptop.Builder withModel(String model) {
        return this;
    }

    @Override
    public Laptop.Builder withCPU(String cpu) {
        return this;
    }

    @Override
    public Laptop.Builder withRAM(int ram) {
        return this;
    }

    @Override
    public Laptop.Builder withStorage(int storage) {
        return this;
    }

    @Override
    public Laptop.Builder withGPU(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public Laptop.Builder withScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    @Override
    public Laptop.Builder withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public Laptop build() {
        // Convert legacy data to modern Laptop format
        return new Laptop.LaptopBuilder()
                .withBrand(legacyLaptop.getManufacturerInfo())
                .withModel(legacyLaptop.getProductIdentification())
                .withCPU(legacyLaptop.getProcessorSpec())
                .withRAM(convertMBtoGB(legacyLaptop.getMemoryInMB()))
                .withStorage(legacyLaptop.getStorageInGB())
                .withGPU(gpu)
                .withScreenSize(screenSize)
                .withOperatingSystem(operatingSystem)
                .build();
    }

    private int convertMBtoGB(int mb) {
        return mb / 1024;
    }

    public void displayLegacyInfo() {
        legacyLaptop.displayLegacyInfo();
    }
}