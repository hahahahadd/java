package a0312.student1;

public class St1 {
    public static void main(String[] args) {
        Student student1 = new Student("문동은",20,"컴퓨터공학");
        Student student2 = new Student("문여은",21,"수학과");
        Student student3 = new Student("김이은",26,"인공지능학과");
        //생성한 객체의 정보 출려
        System.out.println("====학생 정보====");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

    }
}
