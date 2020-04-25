package org.wuhan2020.huoshenshan.service.impl;

import org.springframework.stereotype.Service;
import org.wuhan2020.huoshenshan.bean.Pagination;
import org.wuhan2020.huoshenshan.bean.VedioQueryEntity;
import org.wuhan2020.huoshenshan.domain.Vedio;
import org.wuhan2020.huoshenshan.service.VideoService;

/**
 * @author wx
 */
@Service
public class VideoServiceImpl implements VideoService {
    @Override
    public Vedio getById(Long vedioId) {
        return null;
    }

    @Override
    public Pagination<Vedio> getVedioListByCondition(VedioQueryEntity entity) {
        return null;
    }
}
