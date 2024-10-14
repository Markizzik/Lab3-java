import java.util.HashMap;

public class Company {
    private HashMap<Integer, Employee> employeeMap;

    public Company() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(int id, Employee employee) {
        employeeMap.put(id, employee);
        System.out.println("Сотрудник добавлен: " + employee);
    }

    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }

    public void removeEmployee(int id) {
        Employee removedEmployee = employeeMap.remove(id);
        if (removedEmployee != null) {
            System.out.println("Сотрудник удален: " + removedEmployee);
        } else {
            System.out.println("Сотрудник с ID " + id + " не найден.");
        }
    }

    public void displayAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("В компании нет сотрудников.");
        } else {
            System.out.println("Список сотрудников компании:");
            for (Integer id : employeeMap.keySet()) {
                System.out.println("ID: " + id + ", " + employeeMap.get(id));
            }
        }
    }

    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new Employee("Иван Иванов", "Менеджер", 50000);
        Employee employee2 = new Employee("Петр Петров", "Разработчик", 60000);
        Employee employee3 = new Employee("Мария Смирнова", "Аналитик", 55000);

        company.addEmployee(101, employee1);
        company.addEmployee(102, employee2);
        company.addEmployee(103, employee3);

        company.displayAllEmployees();

        System.out.println("Поиск сотрудника с ID 102: " + company.getEmployee(102));

        company.removeEmployee(101);

        company.displayAllEmployees();
    }
}
