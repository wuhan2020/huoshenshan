package org.wuhan2020.huoshenshan.service;

import org.wuhan2020.huoshenshan.bean.Pagination;
import org.wuhan2020.huoshenshan.bean.VedioQueryEntity;
import org.wuhan2020.huoshenshan.domain.Vedio;

public interface VideoService {

    /**
     * 通过视频id查询视频元数据
     *
     * @param vedioId 视频id
     * @return
     */
    Vedio getById(Long vedioId);


    /**
     * 分页查询视频列表
     *
     * @param entity 分页查询条件
     * @return
     */
    Pagination<Vedio> getVedioListByCondition(VedioQueryEntity entity);

}
