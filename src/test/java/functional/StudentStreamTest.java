package functional;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class StudentStreamTest {


    @Test
    public void filterStudents() throws Exception {

        List<Student> students = Arrays.asList(new Student(10), new Student(50), new Student(51), new Student(60));

        List<Student> filtered = getStudents(students);
        System.out.println(filtered);

        assertThat(filtered).hasSize(2);
    }


    private List<Student> getStudents(List<Student> students) {
        List<Student> overFifty = new ArrayList<Student>();

        for (Student student : students) {
            if (student.getScore() > 50) {
                overFifty.add(student);
            }
        }
        return overFifty;
    }


    private List<Student> getStudentsWithStreams(List<Student> students) {
        return students.stream()
                .filter(s -> s.getScore() > 50)
                .collect(Collectors.toList());
    }

    static class Student {

        double score;

        public Student(double score) {
            this.score = score;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer();
            sb.append(getClass().getSimpleName());
            sb.append(" [score=").append(score);
            sb.append(']');
            return sb.toString();
        }
    }
}
