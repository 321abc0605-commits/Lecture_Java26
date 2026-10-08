package bank.test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberService;

public class TestMemberService {

    public static void main(String[] args) {

        MemberService service = new MemberService();

        // 1. 회원가입
        System.out.println("===== 회원가입 =====");

        Member m1 = new Member("jaehyuk", "1111","고재혁",null,null);
        Member m2 = new Member("curi", "2222", "큐리",null,null);

        System.out.println(service.join(m1));
        System.out.println(service.join(m2));


        // 2. 회원목록
        System.out.println("===== 회원목록 =====");

        List<Member> members = service.getMembers();

        for(Member m : members) {
            System.out.println(m);
        }


        // 3. 로그인
        System.out.println("===== 로그인 =====");

        boolean result = service.login("curi", "2222");

        System.out.println("로그인 결과 : " + result);
        System.out.println("로그인 회원 : " + service.loginMember);


        // 4. 비밀번호 변경
        System.out.println("===== 비밀번호 변경 =====");

        boolean changeResult =
                service.updatePassword("curi", "2222", "1234");

        System.out.println("변경 결과 : " + changeResult);
        System.out.println(service.getMemberById("curi"));


        // 5. 로그아웃
        System.out.println("===== 로그아웃 =====");

        service.logout();

        System.out.println("로그인 회원 : " + service.loginMember);


        // 6. 회원삭제
        System.out.println("===== 회원삭제 =====");

        boolean deleteResult = service.deleteMember("curi");

        System.out.println("삭제 결과 : " + deleteResult);


        // 삭제 후 목록 확인
        System.out.println("===== 최종 회원목록 =====");

        for(Member m : service.getMembers()) {
            System.out.println(m);
        }
    }
}