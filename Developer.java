import java.util.ArrayList;
import java.util.List;
public class Developer extends Employee {
    private List<String> technologies = new ArrayList<>();
    }
    public void addTechnology(String technology, int bonus){
        technologies.add(technology, bonus);
    }
    @Override
    public double calculateSalary() {
        double bonus = technologies.size() * bonus;
        return super.calculateSalary() + bonus;
}
