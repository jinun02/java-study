package day07;

public class  GenericEx5{
     public static void main(String[] args) {
         //모든 사람이 코스1을 수강함.
         Course.registerCourse1(new Applicant<Person>(new Person()));
         Course.registerCourse1(new Applicant<Worker>(new Worker()));
         Course.registerCourse1(new Applicant<Student>(new Student()));
         Course.registerCourse1(new Applicant<HightStudent>(new HightStudent()));
         Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
         System.out.println();

         Course.registerCourse2(new Applicant<Student>(new Student()));
         Course.registerCourse2(new Applicant<HightStudent>(new HightStudent()));
         Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

         Course.registerCourse3(new Applicant<Person>(new Person()));
         Course.registerCourse3(new Applicant<Worker>(new Worker()));
    }
}