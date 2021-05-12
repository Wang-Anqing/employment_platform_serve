package com.waq.employment_platform_serve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author WAQ
 * @since 2021-05-10
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Resume implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 简历主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 简历的标题
     */
      private String title;

      /**
     * 简历的最新更新时间
     */
      private Date updateTime;

      /**
     * 外键，连接jobseeker表
     */
      private Integer jobseekerId;

      /**
     * 照片的存储地址
     */
      private String photo;

      /**
     * 求职者名称
     */
      private String name;

      /**
     * 求职者电话
     */
      private String phone;

      /**
     * 求职者邮箱
     */
      private String email;

      /**
     * 求职者的现居住地
     */
      private String location;

      /**
     * 民族
     */
      private String nation;

      /**
     * 政治面貌
     */
      private String politicalStatus;

      /**
     * 性别
     */
      private String sex;

      /**
     * 生日
     */
      private Date birthday;

      /**
     * 求职意向
     */
      private String job;

      /**
     * 期望薪资
     */
      private String wage;

      /**
     * 毕业院校
     */
      private String school;

      /**
     * 专业 
     */
      private String profession;

      /**
     * 学院
     */
      private String academy;

      /**
     * 学历
     */
      private String background;

      /**
     * 教育经历
     */
      private String eduExpress;

      /**
     * 专业技能
     */
      private String skill;

      /**
     * 项目经历1名称
     */
      private String program1Name;

      /**
     * 项目经历1扮演角色
     */
      private String program1Role;

      /**
     * 项目1描述
     */
      private String program1Express;

      /**
     * 项目2名称
     */
      private String program2Name;

      /**
     * 项目2扮演角色
     */
      private String program2Role;

      /**
     * 项目2描述
     */
      private String program2Express;

      /**
     * 校内经历1名称
     */
      @TableField("schoolExp1_name")
    private String schoolexp1Name;

      /**
     * 校内经历1橘色
     */
      @TableField("schoolExp1_role")
    private String schoolexp1Role;

      /**
     * 经历1描述
     */
      @TableField("schoolExp1_express")
    private String schoolexp1Express;

      /**
     * 经历2名称
     */
      @TableField("schoolExp2_name")
    private String schoolexp2Name;

      /**
     * 经历2角色
     */
      @TableField("schoolExp2_role")
    private String schoolexp2Role;

      /**
     * 经理描述
     */
      @TableField("schoolExp2_express")
    private String schoolexp2Express;

      /**
     * 其他经理
     */
      private String others;

      /**
     * 个人总结
     */
      private String conclusion;


}
