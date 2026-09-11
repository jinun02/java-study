package day07;

public class Course {
    // 모든 사람이면 등록가능
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이 코스1 등록함");
    }
    // 학생만 등록 가능하도록 정의
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이 코스2 등록함");
    }

    public static void registerCourse3(Applicant<? super Worker>applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이 코스3 등록함");
    }
}
