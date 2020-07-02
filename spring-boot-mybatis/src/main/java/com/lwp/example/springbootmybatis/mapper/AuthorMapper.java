package com.lwp.example.springbootmybatis.mapper;

import com.lwp.example.springbootmybatis.model.Author;
import com.lwp.example.springbootmybatis.model.AuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    long countByExample(AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    int deleteByExample(AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    int insert(Author record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    int insertSelective(Author record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    List<Author> selectByExample(AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    Author selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Author record, @Param("example") AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Author record, @Param("example") AuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Author record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table author
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Author record);
}