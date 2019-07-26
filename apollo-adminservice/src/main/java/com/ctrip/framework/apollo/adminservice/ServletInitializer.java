package com.ctrip.framework.apollo.adminservice;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Entry point for traditional web app
 *
 * @author Jason Song(song_s@ctrip.com)
 */
public class ServletInitializer extends SpringBootServletInitializer {

  //这里是使用了外置的tomcat进行配置
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(AdminServiceApplication.class);
  }

}
