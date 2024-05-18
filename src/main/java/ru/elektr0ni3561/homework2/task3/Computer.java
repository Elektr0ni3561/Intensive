package ru.elektr0ni3561.homework2.task3;

public class Computer {

    static class Processor {

        private String model = "INTEL CORE I7";

        public Processor() {
        }

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return model;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }

    class RAM {

        /**
         * <p>Size in GB</p>
         */
        private int size = 4;

        public RAM() {
        }

        public RAM(int size) {
            this.size = size;
        }

        public String getDetails() {
            return "" + size;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}
