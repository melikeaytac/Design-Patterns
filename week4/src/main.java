public class main {
    public static void main(String[] args) {

        Course course =new Course("CS101");
        Library library = new Library("Main Library");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Teacher mrSmith = new Teacher("Smith");
        Teacher msJones = new Teacher("Jones");

        library.registerObserver(bob);
        course.registerObserver(alice);
        library.registerObserver(bob);
        course.registerObserver(mrSmith);
        course.notifyObserver("  from CS101 - new assignment: Complete Observer Pattern Exercise\n");
        library.notifyObserver("grade update: Midterm Grades Posted");
        System.out.println(course);
        System.out.println(library);

    }
}
