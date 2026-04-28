package TaskComparator;

import java.util.Comparator;

public class MathComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return b.math - a.math;  // 내림차순
    }

}