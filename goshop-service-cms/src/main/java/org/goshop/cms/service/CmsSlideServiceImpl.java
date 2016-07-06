package org.goshop.cms.service;

import org.goshop.cms.i.CmsSlideService;
import org.goshop.cms.mapper.master.CmsSlideMapper;
import org.goshop.cms.pojo.CmsSlide;
import org.goshop.common.dubbo.spring.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService(interfaceClass = CmsSlideService.class)
public class CmsSlideServiceImpl implements CmsSlideService {

    @Autowired
    CmsSlideMapper cmsSlideMapper;

    @Override
    public List<CmsSlide> findAll() {
        return cmsSlideMapper.findAll();
    }

    @Override
    public void delete(Integer slideId) {
        cmsSlideMapper.deleteByPrimaryKey(slideId);
    }

    @Override
    public CmsSlide save(Integer slideSort, String slidePath) {
        CmsSlide cmsSlide = new CmsSlide();
        cmsSlide.setSlideSort(slideSort);
        cmsSlide.setSlidePath(slidePath);
        cmsSlideMapper.insertSelective(cmsSlide);
        return cmsSlide;
    }

    @Override
    public CmsSlide update(Integer slideId, Integer slideSort, String slidePath) {
        CmsSlide cmsSlide = new CmsSlide();
        cmsSlide.setSlideId(slideId);
        cmsSlide.setSlideSort(slideSort);
        cmsSlide.setSlidePath(slidePath);
        cmsSlideMapper.updateByPrimaryKeySelective(cmsSlide);
        return cmsSlide;
    }

    @Override
    public void update(Integer[] ids, String[] imageUrl) {
        for(int i=0;i<ids.length;i++){
            CmsSlide cmsSlide = new CmsSlide();
            cmsSlide.setSlideId(ids[i]);
            cmsSlide.setSlideUrl(imageUrl[i]);
            cmsSlideMapper.updateByPrimaryKeySelective(cmsSlide);
        }
    }

    @Override
    public void update(Integer[] ids, String[] imageUrl, Integer[] slideSort) {
        for(int i=0;i<ids.length;i++){
            CmsSlide cmsSlide = new CmsSlide();
            cmsSlide.setSlideId(ids[i]);
            cmsSlide.setSlideUrl(imageUrl[i]);
            cmsSlide.setSlideSort(slideSort[i]);
            cmsSlideMapper.updateByPrimaryKeySelective(cmsSlide);
        }
    }
}
