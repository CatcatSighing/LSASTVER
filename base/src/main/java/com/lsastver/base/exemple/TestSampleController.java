package com.lsastver.base.exemple;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * .<br/>
 *
 * @ClassName: TestSampleController
 * @Description:
 * @date: 2022/3/11 15:53
 * @Version: 1.0.0
 * @author: LSASTVER
 * @email: LsAstver@163.com
 * Modification History:
 * Date             Author          Version            Description
 * ------------------------------------------------------------------- *
 * 2022/3/11 15:53       LSASTVER          v1.0.0               创建
 */
@SpringBootTest(classes = TestSampleController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestSampleController {
    @Autowired
    private SampleController sampleController;

    @Test
    public void testHome(){
        TestCase.assertEquals(this.sampleController.home(),"www.lsastver.com");
    }
}
