package com.github.CCweixiao;

/**
 * 定义HBase SQL的操作接口
 *
 * @author leojie 2020/11/28 8:29 下午
 */
public interface HBaseSqlOperations {
    /**
     * 数据插入
     *
     * @param hql HBase SQL
     */
    void insert(String hql);

    /**
     * 数据删除
     *
     * @param hql HBase SQL
     */
    void delete(String hql);
}
