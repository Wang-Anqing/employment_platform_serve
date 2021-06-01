package com.waq.employment_platform_serve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Resumebox implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 投递记录的主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 求职者id
     */
      private Integer jobseekerId;

      /**
     * 投递岗位的id
     */
      private Integer jobId;

      /**
     * 投递公司的id
     */
      private Integer companyId;

      /**
     * 投递的简历id
     */
      private Integer resumeId;


}
