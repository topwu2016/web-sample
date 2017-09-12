package innshine.web.official.website.controller;


import innshine.web.official.website.entity.BrandInfo;
import innshine.web.official.website.service.BrandService;
import innshine.web.official.website.util.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created with IntelliJ IDEA.
 * User: wjh
 * Date: 16-8-22
 * Time: 2016-08-26 10:19:39
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/brand")
public class BrandController {
    @Autowired
    private BrandService service;

    @RequestMapping(value = "getString")
    @ResponseBody
    public String getString(Long id) {
        return "test";
//        return BeanMapper.map(service.getEntity(id),BrandInfo.class);
    }

    @RequestMapping(value = "getEntity")
    @ResponseBody
    public BrandInfo getEntity(Long id) {
        return service.getEntity(id);
        //return BeanMapper.map(service.getEntity(id),BrandInfo.class);
    }
}
