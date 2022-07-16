public class OgrenciNotSistemi {
    public static void main(String[] args) throws Exception {
        Course math = new Course("math", "MAT101", "MAT");
        Course physics = new Course("physics", "FZK101", "FZK");
        Course chemical = new Course("chemical", "KMY101", "KMY");

        Teacher teacher1 = new Teacher("Mahmut Tek", "05001000001", "MAT");
        Teacher teacher2 = new Teacher("Fatma Ayşe", "05001000002", "FZK");
        Teacher teacher3 = new Teacher("Ali Veli", "05001000003", "KMY");

        math.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemical.addTeacher(teacher3);

        Student student1 = new Student("Ali Rıza", 4, "115", math, physics, chemical);
        student1.addWrittenExamNote(50, 20, 40);
        student1.addOralExamNote(40, 50, 60);
        student1.isPass();

        Student student2 = new Student("Kemal Necmi", 4, "133", math, physics, chemical);
        student2.addWrittenExamNote(100, 50, 40);
        student2.addOralExamNote(80, 40, 70);
        student2.isPass();

        Student student3 = new Student("Ahmet İsmail", 4, "312", math, physics, chemical);
        student3.addWrittenExamNote(50, 20, 40);
        student3.addOralExamNote(70, 80, 60);
        student3.isPass();
    }
}
