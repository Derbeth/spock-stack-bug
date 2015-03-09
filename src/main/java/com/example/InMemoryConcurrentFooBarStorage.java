package com.example;

public class InMemoryConcurrentFooBarStorage {

    public Abc createAbc(Abc abc) {
        System.out.println("Created " + abc.getName());
        return null;
    }

    public static class Abc {
        private String name;

        private String nameNamespace;

        public String getName() {
            return name;
        }

        public String getNameNamespace() {
            return nameNamespace;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNameNamespace(String nameNamespace) {
            this.nameNamespace = nameNamespace;
        }

    }
}
