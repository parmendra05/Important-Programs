package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test03 {
    public static void main(String[] args) {
        //Problem 1: Group strings by first letter
        List<String> list = Arrays.asList("Apple", "Banana", "Blackberry","Avocado", "Orange");

        Map<Character,List<String>> groupedList = list.stream()
                .collect(Collectors.groupingBy(a -> a.charAt(0)));
        System.out.println(groupedList); // {A=[Apple, Avocado], B=[Banana, Blackberry], O=[Orange]}

        //Problem 2: Count how many words per first letter
        Map<Character,Long> groupedListCount = list.stream()
                .collect(Collectors.groupingBy(a -> a.charAt(0) , Collectors.counting()));
        System.out.println(groupedListCount); // {A=2, B=2, O=1}

        //Problem 3: Group numbers by even/odd
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        Map<String , List<Integer>> evenOddMap = numbers.stream().collect(Collectors.groupingBy( n -> n%2==0 ? "Even" : "Odd" ));
        System.out.println(evenOddMap); // Even=[2, 4, 6, 8], Odd=[1, 3, 5, 7]

        //Problem 4: Count Student in each department
        List<Student> students = Arrays.asList(
                new Student(1, "Rahul", "Computer Science", 75000,"A"),
                new Student(2, "Amit", "Computer Science", 45000,"B"),
                new Student(3, "Reena", "Computer Science", 60000,"A"),
                new Student(3, "Priyanka", "Computer Science", 60000,"C"),
                new Student(4, "Sumit", "Electronics", 75000,"A"),
                new Student(5, "Saurabh", "Electronics", 55000,"B"),
                new Student(6, "Shivam", "Electronics", 40000,"B")
        );

        Map<String , Long> studentCountByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student :: getDepartment , Collectors.counting()));
        System.out.println(studentCountByDepartment); // {Computer Science=4, Electronics=3}

        //Problem 5: Sum feesPerSemester by department
        Map<String , Integer> studentsFeesPerSemester = students.stream()
                .collect(Collectors.groupingBy(Student :: getDepartment , Collectors.summingInt(Student ::getFeesPerSemester)));
        System.out.println(studentsFeesPerSemester); // {Computer Science=240000, Electronics=170000}

        //Problem 6: Average salaries by department
        Map<String , Double> studentsAvgFeesPerSemester = students.stream()
                .collect(Collectors.groupingBy(Student :: getDepartment , Collectors.averagingInt(Student ::getFeesPerSemester)));
        System.out.println(studentsAvgFeesPerSemester); // {Computer Science=60000.0, Electronics=56666.666666666664}

        //Problem 7: Group students by Department
        Map<String , List<Student>> groupedStudentByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student :: getDepartment));
        System.out.println(groupedStudentByDepartment); // {Computer Science=[Student{rollNo=1, name='Rahul', department='Computer Science', feesPerSemester=75000}, Student{rollNo=2, name='Amit', department='Computer Science', feesPerSemester=45000}, Student{rollNo=3, name='Reena', department='Computer Science', feesPerSemester=60000}, Student{rollNo=3, name='Priyanka', department='Computer Science', feesPerSemester=60000}], Electronics=[Student{rollNo=4, name='Sumit', department='Electronics', feesPerSemester=75000}, Student{rollNo=5, name='Saurabh', department='Electronics', feesPerSemester=55000}, Student{rollNo=6, name='Shivam', department='Electronics', feesPerSemester=40000}]}

        //  Group student's name by Department
        Map<String , String> groupByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student :: getDepartment , Collectors.mapping(Student ::getName , Collectors.joining(","))));

        System.out.println("Students Name By department :" +groupByDepartment);

        System.out.println("----------------------------");
        //Problem 8: Nested grouping of students (department -> grade)
        Map<String , Map<String , String>> nestedGrouping = students.stream()
                .collect(Collectors.groupingBy(Student ::getDepartment ,
                        Collectors.groupingBy(Student::getGrade , Collectors.mapping(Student ::getName , Collectors.joining(",")))));
        System.out.println(nestedGrouping); // {Computer Science={A=Rahul,Reena, B=Amit, C=Priyanka},
                                           // Electronics={A=Sumit, B=Saurabh,Shivam}}

        //Problem 9: Group words by length, collect as Set
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "orange", "grape", "cat","apple", "banana");
        Map<Integer , Set<String>> wordsMap = words.stream()
                .collect(Collectors.groupingBy(String ::length , Collectors.toSet() ));
        System.out.println( "WordsMap Output > "+wordsMap);

        //Problem 10: Group employees by department, get list of salaries

        }
}
