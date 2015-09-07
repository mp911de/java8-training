package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class StudentStreamTest {

    @Test
    public void filterStudents() throws Exception {

        List<Student> students = Arrays.asList(new Student(52, 2014), new Student(51, 2013), new Student(60, 2013));

        int highScore2014 = getHighScoreWithForLoop(students);
        Optional<Integer> highScore2014Optional = getHighScoreWithStreams(students);

        System.out.println(highScore2014);
        System.out.println(highScore2014Optional.get());
    }


    private int getHighScoreWithForLoop(List<Student> students) {

        int highScore2014 = Integer.MIN_VALUE;
        for (Student student : students) {
            if (student.getGradYear() == 2014 && student.getScore() > highScore2014) {
                highScore2014 = student.getScore();
            }
        }
        return highScore2014;
    }

    private Optional<Integer> getHighScoreWithStreams(List<Student> students) {
        return students.stream().filter(s -> s.getGradYear() == 2014).map(s -> s.getScore()).max(Comparator.<Integer>naturalOrder());
    }

    @Test
    public void collectors() throws Exception {
        List<Student> students = Arrays.asList(new Student(52, 2014), new Student(51, 2013), new Student(60, 2013));

        Map<Student, Integer> map = students.stream().filter(s -> s.getGradYear() == 2014).collect(Collectors.toMap(keyInput ->
                keyInput, valueInput -> valueInput.getScore()));

        System.out.println(map);
    }

    @Test
    public void sequential() throws Exception {

        List<Student> students = Arrays.asList(new Student(52, 2014), new Student(52, 2014), new Student(52, 2014), new Student(52, 2014), new Student(51, 2013), new Student(60, 2013));
        long start = System.currentTimeMillis();

        Optional<Integer> optional = students.stream().filter(s -> s.getGradYear() == 2014).map(s -> s.getScore()).max(Comparator.<Integer>naturalOrder());
        optional.get();
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void parallel() throws Exception {

        List<Student> students = Arrays.asList(new Student(52, 2014), new Student(52, 2014), new Student(52, 2014), new Student(52, 2014), new Student(51, 2013), new Student(60, 2013));
        long start = System.currentTimeMillis();

        Optional<Integer> optional = students.parallelStream().filter(s -> s.getGradYear() == 2014).map(s -> s.getScore()).max(Comparator.<Integer>naturalOrder());
        optional.get();
        System.out.println(System.currentTimeMillis() - start);
    }

    static class Student {

        int score;
        int gradYear;


        public Student(int score, int gradYear) {
            this.score = score;
            this.gradYear = gradYear;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getGradYear() {
            return gradYear;
        }

        public void setGradYear(int gradYear) {
            this.gradYear = gradYear;
        }
    }
}
