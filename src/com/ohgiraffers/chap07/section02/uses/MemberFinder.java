package com.ohgiraffers.chap07.section02.uses;

public class MemberFinder {

    public Member[] findAllMembers(){

        return MemberRepository.findAllMembers();
    }
}
