package com.study.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ${DESCRIPTION}
 *
 * @author xujiping 2017-11-01 16:18
 */
@Controller
public class IndexController {

  @GetMapping("/index")
  public String index(){
    return "index";
  }
}
