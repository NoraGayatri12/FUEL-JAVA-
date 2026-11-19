class override {
    String name;
    int age;
    override() {
        name = "Nora";
        age = 10;
    }

    override(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        override s1 = new override();            
        override s2 = new override("Gayatri", 20);  

        s1.display();
        s2.display();
    }
}