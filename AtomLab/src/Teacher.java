public class Teacher extends Person {
    private String numberClass;

    private String lesson;

    public Teacher(int id, String name, String surname, int age, String login, String password, String numberClass, String lesson) {
        super(id, name, surname, age, login, password);
        this.lesson = lesson;
        this.numberClass = numberClass;
    }


    public String getNumberClass() {
        return numberClass;
    }

    public void setNumberClass(String numberClass) {
        this.numberClass = numberClass;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
