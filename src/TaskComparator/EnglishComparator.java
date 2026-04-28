package TaskComparator;

import java.util.Comparator;

public class EnglishComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return b.english - a.english;  // 내림차순
    }

}
