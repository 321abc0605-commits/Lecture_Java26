package bank.account;

import java.util.List;

// 계좌 저장소가 반드시 가져야 할 기능을 정의한 인터페이스
// 실제 저장은 하지 않고, "이런 기능을 만들어야 한다"라는 규칙만 정함
public interface AccountDao {

    // 계좌 1개 저장
    // 저장 성공하면 true, 실패하면 false
    boolean save(Account a);

    // 저장된 모든 계좌 조회
    List findAll();

    // 계좌번호(no)를 이용해서 계좌 1개 찾기
    Account findByNo(int no);

    // 특정 회원의 ID로 그 회원이 가진 계좌들을 모두 찾기
    // 한 사람이 여러 계좌를 가질 수 있으므로 List로 반환
    List findByMemberId(String id);

    // 기존 계좌 정보 수정
    boolean update(Account a);

    // 계좌 삭제
    boolean delete(Account a);
}