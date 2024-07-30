public class Main {
    public static void main(String[] args) {

        Student model = new Student("Arya BHaradwaj Mishra", 13147, 76.7);

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.setStudentName("Jane Doe");
        controller.setStudentGrade(90.0);
        controller.updateView();
    }
}