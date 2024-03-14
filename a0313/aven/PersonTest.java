package a0313.aven;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        //유효성 검사를 통한 값 설정
        person.setName("John");
        person.setAge(25);

        //유효하지 않는 값 설정
        person1.setName("");
        person1.setAge(-5);

        System.out.println("이름:" + person.getName());
        System.out.println("나이: " + person.getAge());
    }
}

class Person{
    private String name;
    private int age;

    //Gatter 메소드
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //setter 메소드  - 유효성검사
    public void setName(String name){
        //이름이 null이 아니고 비어있지 않으경우에만 설정
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else{
            System.out.println("유효하지 않는 이름입니다.");
        }
    }

    public void setAge(int age){
        //나이가 0 이상이 경우에만 설정
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("유효하지 않는 나이입니다.");
        }

    }


}