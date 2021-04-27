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
 * @since 2021-04-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Jobseeker implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 用户编号，标识用户唯一性的主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 密码
     */
      private String password;

      /**
     * 邮箱
     */
      private String email;

      /**
     * 用户昵称
     */
      private String nickname;

      /**
     * 用户头像的存储路径
     */
      private String headerSrc;

      /**
     * 用户学校信息
     */
      private String school;

      /**
     * 用户职业信息
     */
      private String position;

      /**
     * 用户资质认证 0未认证通过 1通过
     */
      private String qualification;

      /**
     * 用户资质认证文件地址
     */
      private String docSrc;


}
