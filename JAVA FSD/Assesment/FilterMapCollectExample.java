import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapCollectExample {
    public static void main(String[] args) {

        List<HashMap<String, Object>> students = new ArrayList<>();

        HashMap<String, Object> s1 = new HashMap<>();
        s1.put("name", "Rahul");
        s1.put("marks", 85);

        HashMap<String, Object> s2 = new HashMap<>();
        s2.put("name", "Priya");
        s2.put("marks", 55);

        HashMap<String, Object> s3 = new HashMap<>();
        s3.put("name", "Amit");
        s3.put("marks", 72);

        HashMap<String, Object> s4 = new HashMap<>();
        s4.put("name", "Sneha");
        s4.put("marks", 48);

        HashMap<String, Object> s5 = new HashMap<>();
        s5.put("name", "Kiran");
        s5.put("marks", 90);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        List<String> result = students.stream()
                .filter(student -> (Integer) student.get("marks") > 60)
                .map(student -> (String) student.get("name"))
                .collect(Collectors.toList());

        System.out.println("Students with marks > 60:");
        System.out.println(result);
    }
}