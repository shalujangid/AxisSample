import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class School {
    private  Map<String, Set<Student>> sch;

    public School() {
        sch=new HashMap<String, Set<Student>>();

    }
    public School(Map<String, Set<Student>> sch) {
        this.sch = sch;
    }

    public Map<String, Set<Student>> getSch() {
        return sch;
    }

    @Override
    public String toString() {
        return "School{" +
                "sch=" + sch +
                '}';
    }
}
