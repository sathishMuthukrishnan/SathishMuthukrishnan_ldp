package org.sathish.assignment12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StudentStream {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
                new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
                new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
                new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),
                new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70),
                new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70),
                new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70),
                new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80),
                new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85),
                new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82),
                new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83),
                new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4),
                new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6),
                new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8),
                new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4),
                new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4),
                new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5)

        );

        // 1. Print all departments
        System.out.println("Departments:");
        students.stream()
                .map(s -> s.getEngDepartment())
                .distinct()
                .forEach(s -> System.out.println(s));

        // 2. Students enrolled after 2018
        System.out.println("Students enrolled after 2018:");
        students.stream()
                .filter(s -> s.getYearOfEnrollment() > 2018)
                .map(s -> s.getName())
                .forEach(s -> System.out.println(s));
        // 3. Male students Computer science department
        System.out.println("Male students Computer science department");
        students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male") &&
                s.getEngDepartment().equalsIgnoreCase("Computer Science"))
                .map(s -> s.getName())
                .forEach(s -> System.out.println(s));

        // 4. Count male and female students
        System.out.println("\nNumber of male and female students:");
        Map<String, Long> genderCount = students.stream()
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(genderCount);

        // 5. Average age of male and female students
        System.out.println("\nAverage age by gender:");
        Map<String, Double> avgAgeByGender = students.stream()
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.averagingInt(s -> s.getAge())));
        System.out.println(avgAgeByGender);

        // 6. Student with highest percentage
        System.out.println("\nStudent with highest percentage:");
        students.stream()
                .max((s1, s2) -> Double.compare(s1.getPerTillDate(), s2.getPerTillDate()))
                .ifPresent(s -> System.out.println(s));

        // 7. Student count per department
        System.out.println("\nStudent count per department:");
        Map<String, Long> studentCountByDept = students.stream()
                .collect(Collectors.groupingBy(s -> s.getEngDepartment(), Collectors.counting()));
        System.out.println(studentCountByDept);

        // 8. Average percentage per department
        System.out.println("\nAverage percentage per department:");
        Map<String, Double> avgPercentByDept = students.stream()
                .collect(Collectors.groupingBy(s -> s.getEngDepartment(), Collectors.averagingDouble(s -> s.getPerTillDate())));
        System.out.println(avgPercentByDept);

        // 9. Youngest male student in Electronic department
        System.out.println("\nYoungest male student in Electronic:");
        students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male") &&
                        s.getEngDepartment().equalsIgnoreCase("Electronic"))
                .min((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
                .ifPresent(s -> System.out.println(s));

        // 10. Gender count in Computer Science department
        System.out.println("\nMale and Female students in Computer Science:");
        Map<String, Long> csGenderCount = students.stream()
                .filter(s -> s.getEngDepartment().equalsIgnoreCase("Computer Science"))
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(csGenderCount);
    }

}
