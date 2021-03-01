package commonLog.webConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;

/**
 * <h3>commonLog</h3>
 *
 * @author : ck
 * @date : 2020-07-23 10:01
 **/
@Configuration

@EnableWebMvc
public class RootConfig {
    @Bean
    public SpringTemplateEngine springTemplateEngine(ServletContextTemplateResolver servletcontexttemplateresolver){
        SpringTemplateEngine springTemplateEngine= new SpringTemplateEngine();
        springTemplateEngine.setTemplateResolver(servletcontexttemplateresolver);
        return springTemplateEngine;
    }
    @Bean
    public ThymeleafViewResolver thymeleafViewResolver(SpringTemplateEngine springTemplateEngine){
        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        thymeleafViewResolver.setTemplateEngine(springTemplateEngine);
        thymeleafViewResolver.setCharacterEncoding("UTF-8");
        return thymeleafViewResolver;
    }
    @Bean
    public ServletContextTemplateResolver servletContextTemplateResolver(ServletContext servletContext){
        ServletContextTemplateResolver servletContextTemplateResolver = new ServletContextTemplateResolver(servletContext);
        servletContextTemplateResolver.setPrefix("/templateView/view/");
        servletContextTemplateResolver.setSuffix(".html");
        servletContextTemplateResolver.setTemplateMode("HTML5");
        servletContextTemplateResolver.setCharacterEncoding("UTF-8");
        return servletContextTemplateResolver;
    }
}
