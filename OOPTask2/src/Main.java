public class Main {
    public static void main(String[] args){
        UniversityHuman student = new Student("Nicaloe Sirbu", "SREM", 4, true);
        student.startUniversityLife();
        student.comeToUniversity();
        student.comeToLessons();
        student.goForRecess();
        ((Student) student).askForNote();
        ((Student) student).checkGrants();
        student.getAwayFromUniversity();

        UniversityHuman teacher = new Teacher("Vasilie Vieru", "SREM", 4, "IT");
        teacher.startUniversityLife();
        teacher.comeToUniversity();
        teacher.comeToLessons();
        teacher.goForRecess();
        teacher.comeToLessons();
        teacher.getAwayFromUniversity();
        ((Teacher) teacher).estimateMark();
        ((Teacher) teacher).makeAllStudentsHappy();
    }
}
