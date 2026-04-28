package TaskComparator;

import java.util.Comparator;

public class TotalComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return b.getTotal() - a.getTotal();  // 내림차순
    }

}