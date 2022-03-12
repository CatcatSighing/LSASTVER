package com.lsastver.base.exemple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * .<br/>
 *
 * @ClassName: MessageController
 * @Description:
 * @date: 2022/3/11 17:02
 * @Version: 1.0.0
 * @author: LSASTVER
 * @email: LsAstver@163.com
 * Modification History:
 * Date             Author          Version            Description
 * ------------------------------------------------------------------- *
 * 2022/3/11 17:02       LSASTVER          v1.0.0               创建
 */
@RestController
public class MessageController {
    @RequestMapping("/")
    public String main(){
        return "www.lsastver.com";
    }
    @GetMapping("/echo")
    public String echo(String msg){
        return "LSASTVER" + msg;
    }
    @GetMapping("/object")
    public Object object(HttpServletRequest request, HttpServletResponse httpServletResponse){
        Map<String,String> map = new HashMap<String, String>();
        map.put("",null);
        map.put("客户端IP地址",request.getLocalAddr());
        map.put("客户端影响编码",httpServletResponse.getCharacterEncoding());
        map.put("SessionID",request.getSession().getId());
        map.put("项目真实目的",request.getServletContext().getRealPath("/"));
        return map;
    }
}
