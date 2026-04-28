package week15;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import streamsLambdas.Student;
//Streams Pipeline
//  stream()
//	filter()
//	map()
//	sorted()
// limit(3)
//peek()
//	collect() - terminal
//	forEach(System.out::println) - terminal

//	Java - streams lambda
//	c# - LINQ - language integrated query
//	Python - generative functions + linq

public class TestStreams {
	public static void main(String[] args) {
		
		Course oop = new Course("oop");
		//	1. print oop students
		System.out.println("1");
		Data.INSTANCE.students.stream().
							  filter(s->s.courses.containsKey(oop)).
							  forEach(System.out::println);

		//2. collect oop students in a List
		System.out.println("2");
		List<Student> oopStuds =  Data.INSTANCE.students.stream().
								filter(s->s.courses.containsKey(oop)).
								collect(Collectors.toList());
		System.out.println("OOP students:"+" "+oopStuds);
		// OR 	oopStuds.forEach(n -> System.out.println(n));
		//OR  oopStuds.forEach(System.out::println);
		
		//3. Put 100 to all oop students. You can use getOrDefault to update value
		//oopStuds.forEach(n -> n.courses.put(oop, new Mark(30,30,40)));
		
		//4. collect PHD students from students list. In the same way you can collect students from all users
		List<Student> phdStuds =  Data.INSTANCE.students.stream().
								  filter(s->s instanceof PhDStudent).
								  collect(Collectors.toList());
		
		//5. Collect names of young students with high gpa
		List<String> namesOfBestAndYoung = Data.INSTANCE.students.stream().
										   filter(s->s.gpa>3 && s.age<20).
										   map(Student::getName). //or n->n.getName() or n->n.toString()
										   collect(Collectors.toList());

		
		List<Student> students = Data.INSTANCE.students;
		//6. Sorting 1
		List<Student> sorted1 = students.stream().
								sorted((a,b)-> (a.name.compareTo(b.name))).
								collect(Collectors.toList());
		//7. Sorting 2
		List<Student> sorted2 = students.stream().
								filter( s -> s.gpa>3).
								sorted((a,b)-> (a.gpa>b.gpa?1:-1)).
								limit(3).
								collect(Collectors.toList());
		//8. Sorting 3
		List<Student> sorted3 = students.stream().
								filter( s -> s.gpa>3).
								sorted(Comparator.comparing(s->s.name)).
								limit(3).collect(Collectors.toList());

		//9. Sorting 4 - top 5 students in oop based on att2
		students.stream().
		filter(s->s.courses.containsKey(oop)).
		sorted(Comparator.comparing(s->s.courses.get(oop).att2)).
		limit(5);
		
		//10. Sorting 5
				students.stream().
				filter( s -> s.gpa>3).
				sorted(Comparator.comparing(Student::getGpa).reversed()).
				limit(3).
			    forEach(Student::freeFromExam); //peek(n->n.freeFromExam) - performs method and returns items
		
			  //11. CS students
		List<Student> computerScienceStudents = students.stream()
			    				.filter(s -> s.getDepartment().equals("Computer Science"))
			    				.collect(Collectors.toList());
		
		
		//11. Calculating Total Credits
		int totalCredits = students.stream()
			    .mapToInt(Student::getCredits)
			    .sum();
		
		//12. Finding Average gpa. Put default 0 if no items in stream
		double averageGPA = students.stream()
			    .mapToDouble(Student::getGPA)
			    .average()
			    .orElse(0.0);
		
		//13. Finding Average gpa + exceptions handling

		double averageGPA2 = students.stream()
			    .mapToDouble(student -> {
			        if (student.getGPA() < 0) {
			            throw new IllegalStateException("Invalid GPA");
			        }
			        return student.getGPA();
			    })
			    .average()
			    .orElseThrow(() -> new IllegalStateException("No students with valid GPA"));
		
		//14. Calculating Average Marks for a Specific Course
		double averageMarks = students.stream()
		    .filter(student -> student.getCourses().containsKey(oop))
		    .mapToDouble(student -> student.getCourses().get(oop))
		    .average()
		    .orElse(0.0);
		
		//15. Identify students who have at least one course with a failing grade
		List<Student> failingStudents = students.stream()
										.filter(student -> student.getCourses().values().stream().anyMatch(mark -> mark < 50))
										.collect(Collectors.toList());
		
		//16. Grouping Students by Department, the key is the department name and the value is a list of students.
		Map<String, List<Student>> studentsByDepartment = students.stream()
			    										  .collect(Collectors.groupingBy(Student::getDepartment));
		
		//17.  find the average GPA of Computer Science students
		
		double averageGPAComputerScience = students.stream()
			    .filter(student -> student.getDepartment().equals("Computer Science"))
			    .mapToDouble(Student::getGPA)
			    .average()
			    .orElse(0.0);
		
		//18. Finding Teachers of Specific Course
		List<Teacher> teachersTeachingDataStructures = teachers.stream()
			    .filter(teacher -> teacher.getCourses().contains(oop))
			    .collect(Collectors.toList());
		
		//19. Counting Students in Each Department
		Map<String, Integer> studentCountByDepartment = students.stream()
			    .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
		
		//20 Filtering Teachers with Over 10 research papers
		List<Teacher> experiencedTeachers = teachers.stream()
			    .filter(teacher -> teacher.getPapers() > 10)
			    .collect(Collectors.toList());
		
		//21. Finding Students Enrolled in OOP and ADS at the same time
		Set<String> targetCourses = new HashSet<>(Arrays.asList("OOP", "ADS"));
		List<Student> studentsEnrolledInCourses = students.stream()
		    .filter(student -> student.getCourses().keySet().containsAll(targetCourses))
		    .collect(Collectors.toList());
		
		//22. Grouping Students by GPA Range
		Map<String, List<Student>> studentsByGPARange = students.stream()
			    .collect(Collectors.groupingBy(student -> {
			        double gpa = student.getGPA();
			        if (gpa >= 3.5) return "High GPA";
			        else if (gpa >= 2.5) return "Medium GPA";
			        else return "Low GPA";
			    }));
		
		
	}

}
