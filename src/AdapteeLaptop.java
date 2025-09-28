public class AdapteeLaptop {
    private final String manufacturer;
    private final String productName;
    private final String processorType;
    private final int memorySize;
    private final int diskCapacity;

    public AdapteeLaptop(String manufacturer, String productName,
                         String processorType, int memorySize, int diskCapacity) {
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.processorType = processorType;
        this.memorySize = memorySize;
        this.diskCapacity = diskCapacity;
    }

    public String getManufacturerInfo() {
        return manufacturer;
    }

    public String getProductIdentification() {
        return productName;
    }

    public String getProcessorSpec() {
        return processorType;
    }

    public int getMemoryInMB() {
        return memorySize;
    }

    public int getStorageInGB() {
        return diskCapacity;
    }

    public void displayLegacyInfo() {
        System.out.println("Legacy Laptop: " + manufacturer + " " + productName +
                ", Processor: " + processorType +
                ", Memory: " + memorySize + "MB" +
                ", Storage: " + diskCapacity + "GB");
    }
}