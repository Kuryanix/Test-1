import java.util.Arrays;

public class Main {

    public static final Employee[] employees = new Employee[10];

    public static void printFullInfo() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("ФИО: " + employee.getName() + ", Департамент: "
                        + employee.getDepartment() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public static float getTotalSalary() {
        float totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary = totalSalary + employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee getEmployeeWithMinSalary() {
        float min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getEmployeeWithMaxSalary() {
        float max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static float getAverageSalary() {
        int i = 0;
        float totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary = totalSalary + employee.getSalary();
                i++;
            }
        }
        float averageSalary = totalSalary / i;
        return averageSalary;
    }

    public static void printEmployeesNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    // МЕТОДЫ ДЛЯ ЗАДАНИЯ ПОВЫШЕННОЙ СЛОЖНОСТИ

    public static void indexSalary(float persentage) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * (1 + persentage / 100));
            }
        }
    }

    public static Employee getMinSalaryInDepartment(int department) {
        float min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
            if (min == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("В отделе " + department + " нет работников");
            }
        return targetEmployee;
    }

    public static Employee getMaxSalaryInDepartment(int department) {
        float max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("В отделе " + " нет сотрудников");
        }
        return targetEmployee;
    }

    public static float getTotalSalaryInDepartment(int department) {
        float totalSalary = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                totalSalary = totalSalary + employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static float getAverageSalaryInDepartment(int department) {
        int numberEmployees = 0;
        for (Employee employee : employees) {
            if (employee==null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                numberEmployees++;
            }
        }
        return getTotalSalaryInDepartment(department) / numberEmployees;
    }

    public static void indexSalaryInDepartment(int indexation, int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * (1 + indexation / 100));
            }
        }
    }

    public static void getInformationDepartment(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println("Сотрудники департамента " + department + ": " + "ФИО: " + employee.getName() + ",Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void sortSalarySmaller(float parameter) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < parameter) {
                System.out.println("Сотрудник:" + employee.getName() + ", id:" +
                        employee.getId() + ", зарплата:" + employee.getSalary());
            }
        }
    }

    public static void sortSalaryBigger(float parameter) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= parameter) {
                System.out.println("Сотрудник:" + employee.getName() + ", id:" +
                        employee.getId() + ", зарплата:" + employee.getSalary());
            }
        }
    }


    public static void main(String[] args) {

        employees[0] = new Employee("Курьян Максим Геннадьевич", 1, 57_600);
        employees[1] = new Employee("Иванов Иван Иванович", 2, 49_000);
        employees[2] = new Employee("Пушкин Александр Сергеевич", 1, 100_000);
        employees[3] = new Employee("Малышев Илья Александрович", 3, 75_350);
        employees[4] = new Employee("Котова Елена Игоревна", 4, 93_100);
        employees[5] = new Employee("Власова Евгения Альбертовна", 4, 34_000);
        employees[6] = new Employee("Галимова Надежда Валерьевна", 2, 75_500);
        employees[7] = new Employee("Кузьмина Анна Юрьевна", 5, 52_080);
        employees[8] = new Employee("Косова Юлия Павловна", 3, 28_700);
        employees[9] = new Employee("Бурблис Вадим Михайлович", 1, 83_000);
        printFullInfo();
        System.out.println("Общая сумма заработной платы: " + getTotalSalary());
        System.out.println("Сотрудник с наименьшей зарплатой: " +
                getEmployeeWithMinSalary());
        System.out.println("Сотрудник с наибольшей зарплатой: " +
                getEmployeeWithMaxSalary());
        System.out.println("Средння заработная плата в месяц составляет: " +
                getAverageSalary());
        printEmployeesNames();

        // ПОВЫШЕННАЯ СЛОЖНОСТЬ
        System.out.println();
        System.out.println("ПОВЫШЕННАЯ СЛОЖНОСТЬ");
        System.out.println();

        int department = 4;
        int indexation = 8;
        float parameter = 63_000;
        indexSalary(13);
        System.out.println("Минимальная зарплата сотрудника в отделе " +
                department + ": " + getMinSalaryInDepartment(department));
        System.out.println("Максимальная зарплата сотрудника в отделе: " +
                department + ": " + getMaxSalaryInDepartment(department));
        System.out.println("Общая сумма заработной платы в отделе " + department
                + ": " + getTotalSalaryInDepartment(department));
        System.out.println("Средняя заработная плата в отделе " + department +
                ": " + getAverageSalaryInDepartment(department));
        indexSalaryInDepartment(indexation, department);
        getInformationDepartment(department);
        sortSalarySmaller(parameter);
        System.out.println();
        sortSalaryBigger(parameter);
    }
}

