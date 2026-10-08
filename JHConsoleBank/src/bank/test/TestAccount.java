package bank.test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountListDao;

public class TestAccount {

    public static void main(String[] args) {
        testAccountDao();
    }

    public static void testAccountDao() {

        // AccountDao 타입으로 AccountListDao 객체 생성
        AccountDao adao = new AccountListDao();


        // ==============================
        // 1. 계좌 추가
        // ==============================
        System.out.println(">>>>> 계좌추가 및 계좌목록");

        adao.save(new Account(1001, "1111", "jaehyuk", 10000));
        adao.save(new Account(1002, "2222", "curi", 20000));
        adao.save(new Account(1003, "3333", "curi", 30000));


        // ==============================
        // 2. 전체 계좌 조회
        // ==============================
        List<Account> accounts = adao.findAll();

        printAccountList(accounts);


        // ==============================
        // 3. 계좌번호로 계좌 찾기
        // ==============================
        System.out.println(">>>>> 계좌번호로 계좌찾기");

        Account a = adao.findByNo(1002);

        System.out.println(a);


        // ==============================
        // 4. 회원 ID로 계좌 찾기
        // ==============================
        System.out.println(">>>>> 회원 ID로 계좌찾기");

        List<Account> memberAccounts =
                adao.findByMemberId("curi");

        printAccountList(memberAccounts);


        // ==============================
        // 5. 계좌 수정
        // ==============================
        System.out.println(">>>>> 계좌 수정");

        a.setBalance(50000);

        adao.update(a);

        printAccountList(adao.findAll());


        // ==============================
        // 6. 계좌 삭제
        // ==============================
        System.out.println(">>>>> 계좌 삭제");

        adao.delete(adao.findByNo(1002));

        printAccountList(adao.findAll());
    }


    // 계좌 목록 출력용 메서드
    public static void printAccountList(List<Account> accounts) {

        if(accounts == null) {
            System.out.println("계좌가 없습니다.");
            return;
        }

        for(Account a : accounts) {
            System.out.println(a);
        }
    }
}