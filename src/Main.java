public class Main {
    public static void main(String[] args) {
        LaptopFactory gamingFactory = new GamingLaptopFactory();
        Laptop businessLaptop = new BusinessLaptopFactory().createLaptop();
        System.out.println("Gaming: " + gamingFactory.createLaptop());
        System.out.println("Business: " + businessLaptop);
        LaptopFactoryAbstract dell = new DellFactory();
        LaptopFactoryAbstract asus = new AsusFactory();
        System.out.println("Dell Gaming: " + dell.createGamingLaptop());
        System.out.println("Asus Business: " + asus.createBusinessLaptop());

        LegacyLaptop oldDell = new LegacyLaptop("Dell", "Inspiron", "Intel P4", 2048, 160);
        LegacyLaptop oldThinkpad = new LegacyLaptop("IBM", "ThinkPad", "Core 2 Duo", 4096, 320);

        oldDell.displayLegacyInfo();
        oldThinkpad.displayLegacyInfo();

        Laptop adaptedDell = new LegacyLaptopAdapter(oldDell)
                .withGPU("Intel GMA 950")
                .withScreenSize(15.4)
                .build();
        System.out.println("Adapted: " + adaptedDell);
        Laptop modern = new LaptopDirector().createGamingLaptop();
        Laptop adapted = new LegacyLaptopAdapter(
                new LegacyLaptop("Alienware", "Area-51m", "i7", 16384, 1000))
                .withGPU("GTX 1080")
                .build();

        processLaptop(modern);
        processLaptop(adapted);
    }
    private static void processLaptop(Laptop laptop) {
        System.out.println("Processing: " + laptop);
    }
}
