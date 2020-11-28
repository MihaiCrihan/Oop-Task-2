public class Teacher extends UniversityHuman{
    private String name;
    private String faculty;
    private int experience;
    private String domainStudy;

    public Teacher(String name, String faculty, int experience, String domainStudy){
        this.name = name;
        this.faculty = faculty;
        this.experience = experience;
        this.domainStudy = domainStudy;
    }

    public void estimateMark(){
        System.out.println("Calculeaza nota medie");
    }

    public void makeAllStudentsHappy(){
        System.out.println("Pune la toti note bune");
    }

    @Override
    public void startUniversityLife() {
        System.out.println(this.name + " devine profesor in clasa " + this.domainStudy + " in domeniul");
    }

    @Override
    public void comeToUniversity() {
        System.out.println("Vine la universitate");
    }

    @Override
    public void getAwayFromUniversity() {
        System.out.println("Pleaca de la univer");
    }

    @Override
    public void comeToLessons() {
        System.out.println("Vine la lectii");
    }

    @Override
    public void goForRecess() {
        System.out.println("PLeaca la pauza");
    }
}
