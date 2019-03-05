package org.yx.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yx.db.domain.LitemallGrouponRules;
import org.yx.db.domain.LitemallGrouponRulesExample;
import org.yx.db.domain.LitemallGrouponRules;
import org.yx.db.domain.LitemallGrouponRulesExample;

public interface LitemallGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    long countByExample(LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int insert(LitemallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int insertSelective(LitemallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGrouponRules selectOneByExample(LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGrouponRules selectOneByExampleSelective(@Param("example") LitemallGrouponRulesExample example, @Param("selective") LitemallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallGrouponRules> selectByExampleSelective(@Param("example") LitemallGrouponRulesExample example, @Param("selective") LitemallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    List<LitemallGrouponRules> selectByExample(LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGrouponRules selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    LitemallGrouponRules selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallGrouponRules record, @Param("example") LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallGrouponRules record, @Param("example") LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}