import java.util.List;

public class Main {

    public static final String STAFF_TXT = "C:\\Users\\book\\IdeaProjects\\java_basics" +
            "\\AdvancedOOPFeatures\\homework_1\\data\\staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);

    }


    public static void sortBySalaryAndAlphabet(List<Employee> staff) {

        staff.sort((e1, e2) -> {
            int comparison =
                    e1.getSalary().compareTo(e2.getSalary());
            if (comparison == 0) {
                return e1.getName().compareTo(e2.getName());
            }
            return comparison;
        });
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }
}