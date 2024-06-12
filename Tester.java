import java.util.ArrayList;
import java.util.List;
public class Tester extends Employee{
    private List<String> testTypes = new ArrayList<String>();
    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public double calculateSalary() {
        double bonus = testTypes.size() * 300;
        return super.calculateSalary() + bonus;
    }
}
}
