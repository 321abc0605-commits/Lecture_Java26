package bank.account;

import java.util.ArrayList;
import java.util.List;

// AccountDao에서 정한 기능을 실제로 구현하는 클래스
// 지금은 진짜 DB 대신 ArrayList를 계좌 저장소처럼 사용함
public class AccountListDao implements AccountDao {

    // 계좌들을 저장할 공간
    // 쉽게 생각하면 "계좌 DB"
    List<Account> accountDB = new ArrayList<>();


    @Override
    public boolean save(Account a) {

        // 전달받은 계좌 a를 accountDB에 추가
        // add()가 성공하면 true 반환
        return accountDB.add(a);
    }


    @Override
    public List findAll() {

        // 저장된 계좌가 하나도 없으면 null 반환
        if (accountDB.size() == 0)
            return null;


        // 외부에 넘겨줄 새로운 계좌 목록 생성
        List<Account> accounts = new ArrayList<>();


        // accountDB에 있는 계좌를 하나씩 꺼냄
        for (Account a : accountDB) {

            // 꺼낸 계좌를 새로운 리스트에 추가
            accounts.add(a);
        }


        // 전체 계좌 목록 반환
        return accounts;
    }


    @Override
    public Account findByNo(int no) {

        // 저장되어 있는 모든 계좌를 하나씩 확인
        for (Account a : accountDB) {

            // 현재 계좌번호가 찾으려는 계좌번호와 같으면
            if (a.getNo() == no)

                // 해당 계좌 반환
                return a;
        }


        // 끝까지 찾았는데 없으면 null
        return null;
    }


    @Override
    public List findByMemberId(String id) {

        // 해당 회원의 계좌들을 담을 새로운 리스트
        List<Account> accounts = new ArrayList<>();


        // 전체 계좌를 하나씩 확인
        for (Account a : accountDB) {

            // 계좌의 소유자 ID가
            // 찾으려는 회원 ID와 같으면
            if (a.getMemberId().equals(id))

                // 해당 계좌를 결과 목록에 추가
                accounts.add(a);
        }


        // 찾은 계좌가 하나도 없으면 null
        // 하나라도 있으면 accounts 반환
        return accounts.size() == 0 ? null : accounts;
    }


    @Override
    public boolean update(Account a) {

        // 수정하려는 계좌의 계좌번호를 이용해서
        // 기존 계좌를 찾음
        Account target = findByNo(a.getNo());


        // 기존 계좌가 없으면 수정할 수 없으므로 false
        if (target == null)
            return false;


        // 기존 계좌 정보 삭제
        accountDB.remove(target);


        // 수정된 계좌 정보를 다시 저장
        return accountDB.add(a);
    }


    @Override
    public boolean delete(Account a) {

        // 삭제하려는 계좌의 번호를 이용해
        // 실제 저장된 계좌를 찾음
        Account target = findByNo(a.getNo());


        // 계좌가 존재하지 않으면 삭제 실패
        if (target == null)
            return false;


        // 계좌를 accountDB에서 삭제
        // 삭제 성공 시 true
        return accountDB.remove(target);
    }
}