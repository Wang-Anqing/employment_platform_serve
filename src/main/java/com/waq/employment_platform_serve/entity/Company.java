package com.waq.employment_platform_serve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Company implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 标识招聘单位唯一性的主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 用户名
     */
      private String number;

      /**
     * 密码
     */
      private String password;

      /**
     * 公司名称
     */
      private String name;

  /**
   *招聘简介
   */

    private String des;
  /**
   * 邮箱
     */
      private String email;

      /**
     * 公司logo存储地址
     */
      private String logoSrc;

      /**
     * 资质认证文件的存储地址
     */
      private String docSrc;

      /**
     * 海报图片的存储地址
     */
      private String postSrc;

      /**
     * 公司简介
     */
      private String introduce;

      /**
     * 公司待遇
     */
      private String benefit;

      /**
     * 公司基本要求
     */
      private String request;

      /**
     * 内推起始时间
     */
      private LocalDateTime recomStartDate;

      /**
     * 内推结束时间
     */
      private LocalDateTime recomEndDate;

      /**
     * 网申起始时间
     */
      private LocalDateTime applyStartDate;

      /**
     * 网申结束时间
     */
      private LocalDateTime applyEndDate;

      /**
     * 笔试开始时间
     */
      private LocalDateTime writtenStartDate;

      /**
     * 笔试结束时间
     */
      private LocalDateTime writtenEndDate;

      /**
     * 面试开始时间
     */
      private LocalDateTime interviewStartDate;

      /**
     * 面试结束时间
     */
      private LocalDateTime interviewEndDate;

      /**
     * offer开始时间
     */
      private LocalDateTime offerStartDate;

      /**
     * offer结束时间 
     */
      private LocalDateTime offerEndDate;

      /**
     * 是否通过资质认证 0未通过 1通过
     */
      private String qualification;

      /**
     * 是否展示在首页推荐模块 0不展示 1展示
     */
      private String isRecom;

      /**
     * 是否为热投 0不是热投 1是热投
     */
      private String isHot;

      /**
     * 是否为上新 0不是上新 1上新
     */
      private String isNew;

      /**
     * 是否将其推荐到轮播图 0不是轮播 1轮播
     */
      private String isSwiper;

      /**
     * 标记当前用户的状态 1存在 0删除
     */
      private String status;

      /**
     * 浏览人数
     */
      private Integer viewer;

      /**
     * 投递人数
     */
      private Integer deliver;

      /**
     * 活跃度(发帖数，回帖数)
     */
      private Integer activity;

    /**
     * 公司标签(最多填四个标签 || 分割）
     */
    private String tag;

}
