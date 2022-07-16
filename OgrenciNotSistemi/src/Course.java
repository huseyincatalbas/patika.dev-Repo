public class Course {
    Teacher cteacher;
    String name;
    String code;
    String prefix;
    int writtenNote;
    int oralNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.writtenNote = 0;
        this.oralNote = 0;
    }

    public void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.cteacher=teacher;
            System.out.println("Öğretmen Başarıyla Eklendi.");
         }
         else{
            System.out.println(teacher.name+" Akademisyeni bu dersi veremez.");
         }
    }
    public void printTeacher(Teacher teacher) {
        if (cteacher != null) {
            System.out.println(this.name + " Dersinin Akademisyeni:" + cteacher.name);
        } else {
            System.out.println("Dersin Akademisyeni yoktur.");
        }
    }

}
