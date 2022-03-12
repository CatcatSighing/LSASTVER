package com.lsastver.base.exemple;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * .<br/>
 *
 * @ClassName: SampleController
 * @Description: execple
 * @date: 2022/3/11 15:45
 * @Version: 1.0.0
 * @author: LSASTVER
 * @email: LsAstver@163.com
 * Modification History:
 * Date             Author          Version            Description
 * ------------------------------------------------------------------- *
 * 2022/3/11 15:45       LSASTVER          v1.0.0               创建
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return "www.lsastver.com";
    }
}
