package com.topideal.plateform.webServer.infrastructure.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * <p>
 *
 * @author kaka
 * @date 2020/3/12 11:26.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/create")
    public void createUser() {

        System.out.println("hello");
    }
}
