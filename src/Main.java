public class Main {
    public static void main(String[] args) {
        LaptopDirector director = new LaptopDirector();

        Laptop gamingLaptop = director.createGamingLaptop();
        Laptop ultrabook = director.createUltrabook();
        Laptop workstation = director.createWorkstationLaptop();

        System.out.println(gamingLaptop);
        System.out.println(ultrabook);
        System.out.println(workstation);
    }
}
