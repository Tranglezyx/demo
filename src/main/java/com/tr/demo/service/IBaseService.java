package com.tr.demo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author trangle
 */
public interface IBaseService<T> {

    /**
     * 插入一条记录
     * <p>
     * entity 实体对象
     */
    int insert(T entity);

    /**
     * 根据 ID 删除
     * <p>
     * id 主键ID
     */
    int deleteById(Serializable id);

    /**
     * 根据 columnMap 条件，删除记录
     * <p>
     * columnMap 表字段 map 对象
     */
    int deleteByMap(Map<String, Object>columnMap);

    /**
     * 根据 entity 条件，删除记录
     * <p>
     * wrapper 实体对象封装操作类（可以为 null）
     */
    int delete(Wrapper<T> wrapper);

    /**
     * 删除（根据ID 批量删除）
     * <p>
     * idList 主键ID列表(不能为 null 以及 empty)
     */
    int deleteBatchIds(Collection<? extends Serializable> idList);

    /**
     * 根据 ID 修改
     * <p>
     * entity 实体对象
     */
    int updateById(T entity);

    /**
     * 根据 whereEntity 条件，更新记录
     * <p>
     * entity        实体对象 (set 条件值,可以为 null)
     * updateWrapper 实体对象封装操作类（可以为 null,里面的 entity 用于生成 where 语句）
     */
    int update(T entity, Wrapper<T> updateWrapper);

    /**
     * 根据 ID 查询
     * <p>
     * id 主键ID
     */
    T selectById(Serializable id);

    /**
     * 查询（根据ID 批量查询）
     * <p>
     * idList 主键ID列表(不能为 null 以及 empty)
     */
    List<T> selectBatchIds(Collection<? extends Serializable> idList);

    /**
     * 查询（根据 columnMap 条件）
     * <p>
     * columnMap 表字段 map 对象
     */
    List<T> selectByMap(Map<String, Object> columnMap);

    /**
     * 根据 entity 条件，查询一条记录
     * <p>
     * queryWrapper 实体对象封装操作类（可以为 null）
     */
    T selectOne(Wrapper<T> queryWrapper);

    /**
     * 根据 Wrapper 条件，查询总记录数
     * <p>
     * queryWrapper 实体对象封装操作类（可以为 null）
     */
    Integer selectCount(Wrapper<T> queryWrapper);

    /**
     * 根据 entity 条件，查询全部记录
     * <p>
     * queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<T> selectList(Wrapper<T> queryWrapper);

    /**
     * 根据 Wrapper 条件，查询全部记录
     * <p>
     * queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<Map<String, Object>> selectMaps(Wrapper<T> queryWrapper);

    /**
     * 根据 Wrapper 条件，查询全部记录
     * <p>注意： 只返回第一个字段的值</p>
     * <p>
     * queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<Object> selectObjs(Wrapper<T> queryWrapper);

    /**
     * 根据 entity 条件，查询全部记录（并翻页）
     * <p>
     * page         分页查询条件（可以为 RowBounds.DEFAULT）
     * queryWrapper 实体对象封装操作类（可以为 null）
     */
    IPage<T> selectPage(IPage<T> page, Wrapper<T> queryWrapper);

    /**
     * 根据 Wrapper 条件，查询全部记录（并翻页）
     * <p>
     * page         分页查询条件
     * queryWrapper 实体对象封装操作类
     */
    IPage<Map<String, Object>> selectMapsPage(IPage<T> page, Wrapper<T> queryWrapper);
}
