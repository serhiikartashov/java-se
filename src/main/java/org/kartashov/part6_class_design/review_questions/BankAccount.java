package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 11/4/2015.
 */
interface Account {

    public default String getId() {
        return "0000";
    }
}

interface PremiumAccount extends Account {
    public String getId();
}

public class BankAccount implements PremiumAccount {

    public String getId(){
        return "1111";
    }

    public static void main(String[] args) {
        Account acct = new BankAccount();
        System.out.println(acct.getId());
    }
}
