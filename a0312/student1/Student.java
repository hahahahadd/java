package a0312.student1;

public class Student {
    public String name;
    public int age;
    public String major;

    //public Stiudent(){} 눈에 보이진 않ㅇ느ㅏ 기본생성자 생성
    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }
    //정보출력 매서드
    public void displayInfo(){
        System.out.println("학생이름:"+name);
        System.out.println("나이:"+age);
        System.out.println("전공:"+major);
        System.out.println();
    }
}
