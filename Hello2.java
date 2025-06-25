public lass Person {
    privte String name;
    privte int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static vid main(String[] args) {
        Person person = new Person("Alice", 25);
        person.displayInfo();
    }
}
