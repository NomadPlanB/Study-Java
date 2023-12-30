public class MemberTest {
    public static void main(String[] args) {
        // GYM Member data
        Member member = new Member();
        member.name = "James";
        member.age = 39;
        member.tel = "010-1111-1111";
        member.email = "james@gmail.com";
        member.address = "Seoul";
        member.weight = 80.5f;
        System.out.println(member.name + "/" + member.age + "/" + member.tel + "/" + member.email + "/" + member.address + "/" + member.weight);
    }
}
