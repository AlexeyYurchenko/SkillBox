import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    private static final String STAFF_TXT = "C:\\Users\\book\\IdeaProjects\\java_basics\\" +
            "AdvancedOOPFeatures\\homework_2\\Employees\\data\\staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {

        Optional<Employee> optional = staff.stream()
                .filter(e -> e.getWorkStart().getYear() == year-1900)
                .max(Comparator.comparing(Employee::getSalary));

        Employee employee = optional.get();

        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year
        return employee;
    }
}