public class Laptop {
    private final String brand;
    private final String model;
    private final String cpu;
    private final int ram;
    private final int storage;
    private final String gpu;
    private final double screenSize;
    private final String operatingSystem;

    private Laptop(LaptopBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.screenSize = builder.screenSize;
        this.operatingSystem = builder.operatingSystem;
    }

    @Override
    public String toString() {
        return String.format(
                "Laptop: %s %s, CPU: %s, RAM: %dGB, Storage: %dGB, GPU: %s, Screen Size: %.1f inch, Operating System: %s",
                brand,
                model,
                cpu,
                ram,
                storage,
                gpu,
                screenSize,
                operatingSystem
        );
    }

    public interface Builder {
        Builder withBrand(String brand);
        Builder withModel(String model);
        Builder withCPU(String cpu);
        Builder withRAM(int ram);
        Builder withStorage(int storage);
        Builder withGPU(String gpu);
        Builder withScreenSize(double screenSize);
        Builder withOperatingSystem(String operatingSystem);
        Laptop build();
    }

    public static class LaptopBuilder implements Builder {
        private String brand;
        private String model;
        private String cpu;
        private int ram;
        private int storage;
        private String gpu;
        private double screenSize;
        private String operatingSystem;

        @Override
        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        @Override
        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        @Override
        public Builder withCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        @Override
        public Builder withRAM(int ram) {
            this.ram = ram;
            return this;
        }

        @Override
        public Builder withStorage(int storage) {
            this.storage = storage;
            return this;
        }

        @Override
        public Builder withGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        @Override
        public Builder withScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        @Override
        public Builder withOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        @Override
        public Laptop build() {
            validate();
            return new Laptop(this);
        }

        private void validate() {
            if (brand == null || brand.isBlank()) {
                throw new IllegalArgumentException("Brand cannot be empty");
            }
            if (model == null || model.isBlank()) {
                throw new IllegalArgumentException("Model cannot be empty");
            }
            if (ram <= 0) {
                throw new IllegalArgumentException("RAM must be greater than 0");
            }
            if (storage <= 0) {
                throw new IllegalArgumentException("Storage must be greater than 0");
            }
        }
    }
}
