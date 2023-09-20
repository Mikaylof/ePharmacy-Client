package az.mushfigm.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class EphrmcyclientApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EphrmcyclientApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EphrmcyclientApplication.class);
    }
}
