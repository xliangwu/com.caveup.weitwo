package com.caveup.weitwo.web.fun;

import org.junit.Test;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class FunTest {

    @Test
    public void test1() {
        PasswordEncoder encoder = new StandardPasswordEncoder();
        System.out.println(encoder.encode("123456"));
    }
}
