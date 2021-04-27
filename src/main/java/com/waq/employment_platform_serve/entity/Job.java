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
    public class Job implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 外键，关联其对应的企业
     */
      private Integer companyId;

      /**
     * 工作名称
     */
      private String name;

      /**
     * 工作职责
     */
      private String duty;

      /**
     * 工作要求
     */
      private String request;

      /**
     * 工作地点
     */
      private String location;

      /**
     * 招聘人数
     */
      private String account;

      /**
     * 工作状态 0删除 1存在
     */
      private String status;

      /**
     * 工作发布时间
     */
      private LocalDateTime startDate;

      /**
     * 工作截止日期
     */
      private LocalDateTime endDate;

      /**
     * 工作关键词，用||分割
     */
      private String tag;


}
