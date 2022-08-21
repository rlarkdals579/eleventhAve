package eleventhAvenue.assignment.service;

import eleventhAvenue.assignment.domain.Member;
import eleventhAvenue.assignment.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public List<Member> findMembers() {
        return memberRepository.findAll();
    }


}
