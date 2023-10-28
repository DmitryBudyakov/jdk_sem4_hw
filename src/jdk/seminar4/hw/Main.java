package jdk.seminar4.hw;

/*
    Создать справочник сотрудников
    Необходимо:
    1. Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
    - Табельный номер
    - Номер телефона
    - Имя
    - Стаж
    2. Добавить метод, который ищет сотрудника по стажу (может быть список)
    3. Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    4. Добавить метод, который ищет сотрудника по табельному номеру
    5. Добавить метод добавление нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100,"Иванов", "1234567",10);
        Employee emp2 = new Employee(10,"Петров", "7654321",3);
        Employee emp3 = new Employee(15,"Петров", "2314567",8);
        Employee emp4 = new Employee(110,"Смирнов", "7652341",10);
        Employee emp5 = new Employee(50,"Андреев", "3217654",3);
        Employee emp6 = new Employee(50,"Антонов", "1111123",5);

        EmployeesBook empBook = new EmployeesBook();
        System.out.println("--- 5. Добавление новых сотрудников ---");
        empBook.addNewEmployee(emp1);
        empBook.addNewEmployee(emp2);
        empBook.addNewEmployee(emp3);
        empBook.addNewEmployee(emp4);
        empBook.addNewEmployee(emp5);
        empBook.addNewEmployee(emp6);
        System.out.println("Все сотрудники:");
        System.out.println(empBook);

        int exp1 = 10;
        int exp2 = 3;
        int exp3 = 5;
        System.out.println("--- 2. Поиск сотрудника по стажу ---");
        System.out.println("Поиск по стажу " + exp1 + ":");
        System.out.println(empBook.searchByExperience(exp1));
        System.out.println("Поиск по стажу " + exp2 + ":");
        System.out.println(empBook.searchByExperience(exp2));
        System.out.println("Поиск по стажу " + exp3 + ":");
        System.out.println(empBook.searchByExperience(exp3));

        String name1 = "Иванов";
        String name2 = "Смирнов";
        String name3 = "Сидоров";
        System.out.println("--- 3. Номер телефона сотрудника по имени ---");
        System.out.println("Телефон сотрудника по имени \"" + name1 + "\":");
        System.out.println(empBook.searchPhoneNumberByName(name1));
        System.out.println("Телефон сотрудника по имени \"" + name2 + "\":");
        System.out.println(empBook.searchPhoneNumberByName(name2));
        System.out.println("Телефон сотрудника по имени \"" + name3 + "\":");
        System.out.println(empBook.searchPhoneNumberByName(name3));

        int id1 = 100;
        int id2 = 10;
        int id3 = 20;
        System.out.println("--- 4. Поиск сотрудника по табельному номеру ---");
        System.out.println("Сотрудник с табельным номером " + id1 + ":");
        System.out.println(empBook.searchEmployeeById(id1));
        System.out.println("Сотрудник с табельным номером " + id2 + ":");
        System.out.println(empBook.searchEmployeeById(id2));
        System.out.println("Сотрудник с табельным номером " + id3 + ":");
        System.out.println(empBook.searchEmployeeById(id3));
    }
}
