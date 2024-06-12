public class Employee {
    public String fname;
    public String lname;
    public String address;
    public String email;
    public String pesel;
    public int yearStarted;

    public Employee(String fname, String lname, String address, String email, String pesel, int yearStarted) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearStarted = yearStarted;
    }

    public calculateSalary(){
        // salary count
        int basicSalary = 3000;
        return basicSalary;
    }

}
