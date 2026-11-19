// class Student {
//     int id;
//     String name;
//     String course;
//     String city;

//     public Student(int id, String name, String course, String city) {
//         this.id = id;
//         this.name = name;
//         this.course = course;
//         this.city = city;
//     }
// }

// public class Simple {
//     public static void main(String[] args) {
//         Student std = new Student(101, "Gayatri", "B.Tech", "Solapur");

//         // Print to verify
//         System.out.println(std.id + " " + std.name + " " + std.course + " " + std.city);
//     }
// }

// Using Builder Design pattern
class Student {
    int id;
    String name;
    String course;
    String city;

    public Student(int id, String name, String course, String city) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.city = city;
    }

    // Static Builder Class
    public static class StudentBuilder {
        private int id;
        private String name;
        private String course;
        private String city;

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public Student build() {
            return new Student(id, name, course, city);
        }
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Student std = new Student.StudentBuilder()
                .setId(101)
                .setName("Gayatri")
                .setCourse("B.Tech")
                .setCity("Solapur")
                .build();

        System.out.println(std.name + " " + std.course);
    }
}