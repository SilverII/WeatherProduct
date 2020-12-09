package cfg;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WAppInit implements WebApplicationInitializer {
        @Override
        public void onStartup(ServletContext servletContext) throws ServletException {
            AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
            appContext.register(WebConfig.class);

            ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
                    "SpringDispatcher", new DispatcherServlet(appContext));
            dispatcher.setLoadOnStartup(1);
            dispatcher.addMapping("/auth");

        }
    }

