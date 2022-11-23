import java.util.*;

public class Company {

    private String companyName;
    private ArrayList<Employee> employeesList = new ArrayList<>();
    private int income;

    public Company(){
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void hire(Employee employee) {
        employeesList.add(employee);
        if (employee instanceof Manager){
            income+=((Manager)employee).getIncomeForCompany();
        }
    }

    public void hireAll(Collection<Employee> employees){
        getEmployeesList().remove(employees);
    }

    public void fire(Employee employee){
        this.employeesList.remove(employee);

    }

    public List<Employee> getTopSalaryStaff(int count) {
        return getFilteredLimitedList(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getMonthSalary() - o1.getMonthSalary());
            }
        });
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return getFilteredLimitedList(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getMonthSalary() - o2.getMonthSalary());
            }
        });
    }

    private List<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        List<Employee> copyList = new ArrayList<Employee>(employeesList);
        Collections.sort(copyList, comparator);
        List<Employee> result = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            result.add(copyList.get(i));
        }
        return result;
    }

    public int countEmployeesList() {
        return employeesList.size();
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getIncome() {
        return income;
    }
}
