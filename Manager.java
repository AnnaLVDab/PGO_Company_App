import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private List<String> goals = new ArrayList<String>();

    public Goal(int year, int month, int day, String name, int bonus);

    public void addGoals(String goal) {
        goals.add(goal);
    }

    public void checkGoalsAndAddBonus() {
        double bonus = goals.size() * 1000;
        if (bonus > 0) {
            System.out.println(Salary += bonus);
        }
    }

}

