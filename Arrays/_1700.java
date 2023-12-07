import java.util.List;
import java.util.ArrayList;
public class _1700{
    public static void main(String[] args){
        int students[] = {1,1,1,0,0,1};
        int sandwiches[] = {1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwiches));
    }
    public static int countStudents(int[] students, int[] sandwiches){
        List<Integer> student = new ArrayList<>();
        List<Integer> sandwich = new ArrayList<>();
        int n = students.length, count = 0;
        for(int i = 0; i < n; i++){
            student.add(students[i]);
            sandwich.add(sandwiches[i]);
        }
        while(student.size() != 0 && sandwich.size() != 0 && count <= student.size()){
            if(student.get(0) == sandwich.get(0)){
                student.remove(0);
                sandwich.remove(0);
                count = 0;
            } else{
                student.add(student.get(0));
                student.remove(0);
                count++;
            }
        }
        return student.size();
    }
}