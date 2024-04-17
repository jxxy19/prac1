package org.fullstack4.prac1;


import lombok.extern.log4j.Log4j2;
import org.fullstack4.prac1.sample.SampleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class) //단위테스트?
@ContextConfiguration(locations = "file://src/main/webapp/WEB-INF/root-context.xml")

public class SampleTest {
    @Autowired

    private SampleService sampleService;

    @Test
    public void testService() {
        log.info("===================");
        log.info("sampleService Test : " + sampleService);
        log.info("===================");
        Assertions.assertNotNull(sampleService);
        //null인지 아닌지 판단하는 ,,,,?
    }
}
