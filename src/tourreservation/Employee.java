package tourreservation;

class Employee {

    public Employee(int id_Employee, String name_Employee, int age_Employee, boolean gender_Employee,String phone_Employee ,String user_Employee, String pass_Employee, int salary_Employee, String func_Employee) {
        this.id_Employee = id_Employee;
        this.name_Employee = name_Employee;
        this.user_Employee = user_Employee;
        this.pass_Employee = pass_Employee;
        this.age_Employee = age_Employee;
        this.salary_Employee = salary_Employee;
        this.func_Employee = func_Employee;
        this.gender_Employee = gender_Employee;
        this.phone_Employee = phone_Employee;
    }

    public int getId_Employee() {
        return id_Employee;
    }

    public String getName_Employee() {
        return name_Employee;
    }

    public String getPass_Employee() {
        return pass_Employee;
    }

    public int getAge_Employee() {
        return age_Employee;
    }

    public int getSalary_Employee() {
        return salary_Employee;
    }

    public String getFunc_Employee() {
        return func_Employee;
    }

    public boolean isGender_Employee() {
        return gender_Employee;
    }

    public String getPhone_Employee() {
        return phone_Employee;
    }
    
    public String getUser_Employee() {
        return user_Employee;
    }
    
    private int id_Employee;
    private String name_Employee;
    private int age_Employee;
    private boolean gender_Employee ;
    private String user_Employee ;
    private String pass_Employee;
    private int salary_Employee;
    private String func_Employee;
    private String phone_Employee;
    

}
