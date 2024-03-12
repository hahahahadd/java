package a0312.car1;

public class studentexample {
    public static void main(String[] args) {
        //자바에서 객체로 만들기 위해 new라는 생성키워드를 통해
        //heap 영역에 생성 먼저해야됨 (공간을 할당)
        Student moon = new Student();
        moon.name = "문동은";
        moon.age = 20;
        moon.height = 167;

        System.out.println(moon.name+"님의 나이는"+moon.age+"살이고, 키는"+
        moon.height); //주소값 출력

        Student park = new Student();
        park.name = "박연진";
        park.age = 21;
        park.height = 174.3;
        System.out.println(park.name+"님의 나이는"+park.age+"살이고 키는"+park.height);

    }
}
