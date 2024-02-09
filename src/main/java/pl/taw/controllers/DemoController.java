/**
 * Created by tomasz_taw
 * Date: 09.02.2024
 * Time: 20:38
 * Project Name: chuck-norris-app
 * Description:
 */
package pl.taw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
