package day03;
abstract class Father{
    abstract void familyBusiness();

    final void doSome(){ //  final 선언된 메서드는 오버라이드 금지.
    }
}

public class FamilyBusiness {

    // 이 메서드를 통해서 Father 타입들의 가업이 뭔지 출력하고자 한다.
    public static void printFamilyJob(Father f){
        f.familyBusiness();
    }
    public static void printFamilyJob(Father[] f){
        for(Father ff:f){
            ff.familyBusiness();
            // 만약 자식들의 job를 출력하고 싶으면

            if(ff instanceof Son)((Son)ff).job();
            if (ff instanceof Daughter)((Daughter)ff).job();
        }
    }

    public static void main(String[] args) {
        Son son = new Son();
        printFamilyJob(son);
        Daughter d = new Daughter();
        printFamilyJob(d);

        Father[] fs ={son,d};
        printFamilyJob(fs);
    }


}
class Son extends Father{
    @Override
    void familyBusiness() {
        System.out.println("가업의 내용...");
    }
    void job(){
        System.out.println("개발자");
    }

}
class Daughter extends Father{
    @Override
    void familyBusiness() {
        System.out.println("가업의 내용...");
    }
    void job(){
        System.out.println("디자이너");
    }

}
