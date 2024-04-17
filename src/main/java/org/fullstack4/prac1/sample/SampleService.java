package org.fullstack4.prac1.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@ToString // 시리얼라이징
@Service // 서비스 객체?
@RequiredArgsConstructor // 파라미터 생성자
public class SampleService {
    private SampleDAO sampleDAO;
}
