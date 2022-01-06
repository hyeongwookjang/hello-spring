package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member>
}
