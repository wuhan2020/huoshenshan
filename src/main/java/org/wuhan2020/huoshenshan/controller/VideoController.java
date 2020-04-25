package org.wuhan2020.huoshenshan.controller;

import io.wangxin.result.Result;
import io.wangxin.result.utils.ResultUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wuhan2020.huoshenshan.bean.Pagination;
import org.wuhan2020.huoshenshan.bean.VedioQueryEntity;
import org.wuhan2020.huoshenshan.domain.Vedio;
import org.wuhan2020.huoshenshan.service.VideoService;

import javax.annotation.Resource;

/**
 * 视频展示
 *
 * @author wx
 */
@Controller
@RequestMapping(value = "/video")
@CrossOrigin
public class VideoController {
    @Resource
    private VideoService videoService;

    /**
     * 查询单个视频的元数据
     * @param vedioId
     * @return
     */
    public Result<Vedio> getById(Long vedioId) {
        try {
            return ResultUtils.wrapSuccess(videoService.getById(vedioId));
        } catch (Exception e) {
            return ResultUtils.wrapException(e);
        }
    }

    /**
     * 分页查询视频的元数据
     * @param entity 查询条件
     * @return
     */
    public Result<Pagination<Vedio>> getVedioListByCondition(VedioQueryEntity entity) {
        try {
            return ResultUtils.wrapSuccess(videoService.getVedioListByCondition(entity));
        } catch (Exception e) {
            return ResultUtils.wrapException(e);
        }
    }

}
