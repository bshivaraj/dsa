package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI{

    public static void main(String[] args) {
        Student s1= new Student("rama",1000L);
        Student s2= new Student("shama",200L);
        Student s3= new Student("bhama",10000L);
        Student s4= new Student("daama",8900L);

       List<Student> students= Arrays.asList(s1,s2,s3,s4);
       //System.out.println(students.stream().sorted().skip(students.size()-2).findFirst());
        String s5="";
        String s6=" ";
        s5.isBlank();
        s6.isEmpty();

        String t1="abc";
        String t2="abc";
        String t3=new String("abc");
        String t4=new String("abc");

        System.out.println(t1==t3);
        System.out.println(t2==t4);

        //sum of list
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
        System.out.println("res "+  students.stream().skip(students.size()-2).findFirst().get().getName());


        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        var c=list.stream().filter(x->x>2).count();
       // System.out.println(c);

    }

}
class Student{
    private String name;
    private Long salary;

    public Student(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
