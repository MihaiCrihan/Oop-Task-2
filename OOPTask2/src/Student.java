public class Student extends UniversityHuman{
    private String name;
    private String faculty;
    private int  course;
    private boolean isExcellent;

    public Student(String name, String faculty, int course, boolean isExcellent){
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.isExcellent = isExcellent;
    }

    public void checkGrants(){
        if (this.isExcellent){
            System.out.println("Studentul are bursa");
        } else {
            System.out.println("Student nu are");
        }
    }

    public void askForNote(){
        System.out.println("Studentul vrea note bune");
    }

    @Override
    public void startUniversityLife() {
        System.out.println("Devine student");
    }

    @Override
    public void comeToUniversity() {
        System.out.println(this.name + " a venit la universitate");
    }

    @Override
    public void getAwayFromUniversity() {
        System.out.println(this.name + " a plecat de la universitate");
    }

    @Override
    public void comeToLessons() {
        System.out.println(this.name + " a venit la lectie");
    }

    @Override
    public void goForRecess() {
        System.out.println(this.name + " a iesit la repaus");
    }
}
