public class Student {
    Course math;
    Course physics;
    Course chemical;
    String name;
    String stuNo;
    int classes;
    double avarage;
    double mathAverage, physicsAverage, chemicalAverage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemical) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemical = chemical;
        calcAvarage();
        this.isPass = false;
    }

    public void addWrittenExamNote(int math, int physics, int chemical) {

        if (math >= 0 && math <= 100) {
            this.math.writtenNote = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.writtenNote = physics;
        }

        if (chemical >= 0 && chemical <= 100) {
            this.chemical.writtenNote = chemical;
        }

    }

    public void addOralExamNote(int math, int physics, int chemical) {

        if (math >= 0 && math <= 100) {
            this.math.oralNote = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.oralNote = physics;
        }

        if (chemical >= 0 && chemical <= 100) {
            this.chemical.oralNote = chemical;
        }

    }

    public void isPass() {
        if ((this.math.writtenNote == 0 && this.math.oralNote == 0)
                || (this.physics.writtenNote == 0 && this.physics.oralNote == 0)
                || (this.chemical.writtenNote == 0 && this.chemical.oralNote == 0)) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("\nOrtalama\t: " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.mathAverage = this.math.writtenNote * 0.7 + this.math.oralNote * 0.3;
        this.physicsAverage = this.physics.writtenNote * 0.7 + this.physics.oralNote * 0.3;
        this.chemicalAverage = this.chemical.writtenNote * 0.7 + this.chemical.oralNote * 0.3;
        this.avarage = (this.mathAverage + this.physicsAverage + this.chemicalAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("==============================");
        System.out.println("=====%70 yazılı %30 sözlü=====");
        System.out.println("Öğrenci\t\t: " + this.name);
        System.out.println("Matematik Notu\t: " + this.mathAverage);
        System.out.println("Fizik Notu\t: " + this.physicsAverage);
        System.out.println("Kimya Notu\t: " + this.chemicalAverage);
    }

}