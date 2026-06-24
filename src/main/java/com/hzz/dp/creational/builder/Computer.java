package com.hzz.dp.creational.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String cooling;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.cooling = builder.cooling;
    }

    @Override
    public String toString() {
        return "Computer{cpu='" + cpu + "', ram='" + ram + "', storage='" + storage + "', gpu='" + gpu + "', cooling='" + cooling + "'}";
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String cooling;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder cooling(String cooling) {
            this.cooling = cooling;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
