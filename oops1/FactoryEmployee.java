class Employee {
    int emp_id;
    String emp_name;

    Employee(int id, String name) {
        emp_id = id;
        emp_name = name;
    }
}

class FactoryEmployee extends Employee {
    int bus_no;
    String emp_boards;

    FactoryEmployee(int id, String name, int bus, String board) {
        super(id, name);
        bus_no = bus;
        emp_boards = board;
    }
}

