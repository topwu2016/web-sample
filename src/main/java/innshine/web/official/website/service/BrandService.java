package innshine.web.official.website.service;

import innshine.web.official.website.dao.BrandDao;
import innshine.web.official.website.entity.BrandInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BrandService
 */
@Service
public class BrandService extends BaseService<BrandInfo, String> {

    @Autowired
    private BrandDao dao;

    public BrandInfo getEntity(Long id) {
        return this.dao.getEntity(id);
    }


}
