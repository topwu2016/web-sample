package innshine.web.official.website.dao;


import innshine.web.official.website.entity.BrandInfo;
import innshine.web.official.website.mybatis.MyBatisRepository;
import org.apache.ibatis.annotations.Param;

/**
 * Brand
 */
@MyBatisRepository
public interface BrandDao extends BaseDao<BrandInfo, String> {

    public BrandInfo getEntity(@Param("id") Long id);

}
