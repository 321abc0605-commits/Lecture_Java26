package bank.member;

import java.util.List;

public class MemberService {

    // 관리자 계정
    public static final String ADMIN_ID = "admin";
    public static final String ADMIN_PASSWORD = "1234";

    // 회원 데이터를 관리하는 DAO
    private MemberDao dao = new MemberListDao();

    // 현재 로그인한 회원
    public Member loginMember;

    // 회원가입
    public boolean join(Member member) {

        // 이미 같은 아이디가 있는지 확인
        Member findMember = dao.findById(member.getId());

        if(findMember != null) {
            return false;
        }

        return dao.save(member);
    }

    // 로그인
    public boolean login(String id, String password) {

        Member member = dao.findById(id);

        // 아이디가 존재하지 않으면 로그인 실패
        if(member == null) {
            return false;
        }

        // 비밀번호가 다르면 로그인 실패
        if(!member.getPassword().equals(password)) {
            return false;
        }

        // 로그인 성공
        loginMember = member;

        return true;
    }

    // 로그아웃
    public void logout() {
        loginMember = null;
    }

    // 전체 회원 조회
    public List<Member> getMembers() {
        return dao.findAll();
    }

    // 아이디로 회원 조회
    public Member getMemberById(String id) {
        return dao.findById(id);
    }

    // 비밀번호 변경
    public boolean updatePassword(
            String id,
            String currentPassword,
            String newPassword) {

        Member member = dao.findById(id);

        // 회원이 없으면 실패
        if(member == null) {
            return false;
        }

        // 현재 비밀번호가 틀리면 실패
        if(!member.getPassword().equals(currentPassword)) {
            return false;
        }

        // 새 비밀번호로 변경
        member.setPassword(newPassword);

        return dao.update(member);
    }

    // 회원 삭제
    public boolean deleteMember(String id) {

        Member member = dao.findById(id);

        if(member == null) {
            return false;
        }

        return dao.delete(member);
    }
}