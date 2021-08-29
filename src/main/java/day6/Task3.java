package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванова Мария Ивановна", "Математика");
        Student student = new Student("Петров Иван Сидорович");
        teacher.evaluate(student);
    }
}

class Teacher {
    private String nameTeacher;
    private String discipline;

    public Teacher(String nameTeacher, String discipline) {
        this.nameTeacher = nameTeacher;
        this.discipline = discipline;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomOcenka = random.nextInt(4) + 2;

        String textovayaOcenka = "";
        switch (randomOcenka) {
            case 2:
                textovayaOcenka = "неудовлетворительно";
                break;
            case 3:
                textovayaOcenka = "удовлетворительно";
                break;
            case 4:
                textovayaOcenka = "хорошо";
                break;
            default:
                textovayaOcenka = "отлично";
        }
        System.out.println("Преподаватель " + nameTeacher + " оценил студента с именем " + student.getNameStudent() + " по предмету " + discipline + " на оценку " + textovayaOcenka + ".");
    }
}

class Student {
    private String nameStudent;

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }
}
