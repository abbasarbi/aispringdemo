package com.ttl.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {AppConfig.class};
    }
       @Override
       protected Class<?>[] getRootConfigClasses() {
           return null;
       }
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/*"};
    }

}