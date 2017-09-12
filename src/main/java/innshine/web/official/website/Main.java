package innshine.web.official.website;

import innshine.web.official.website.entity.BrandInfo;
import innshine.web.official.website.service.BrandService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/3.
 */
public class Main {

    public static void main(String[] strgs) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");

        BrandService servic = (BrandService) ctx.getBean("brandService");

        BrandInfo entity = servic.getEntity(1L);
        if (entity != null) {
            System.out.print(entity.getName());
        }
    }
}
