package com.gj.easyrest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/rest")
public class JaxrsApplication extends Application {
}
