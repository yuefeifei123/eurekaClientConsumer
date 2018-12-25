package eurekaclientconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.websocket.Session;

/**
 * @author feifei
 */
@Slf4j
@Controller
@RequestMapping("/hello")
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String testList() {

        log.info("***********start service client two**********");
        return "hello eureka two test";
    }
}
