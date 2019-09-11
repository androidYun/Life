package com.gy.life.common;

import java.util.List;

public class PageEntity<T> {
    private int totalPageSize;//总页数

    private int pageNumber;//当前页数

    private int pageSize;//一页总数量

    private Long totalCount;//总数量

    private List<T> list = null;

    public PageEntity() {
    }

    public PageEntity(int totalPageSize, int pageSize, int pageNumber, Long totalCount, List<T> list) {
        this.totalPageSize = totalPageSize;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalCount = totalCount;
        this.list = list;
    }

    public int getTotalPageSize() {
        return totalPageSize;
    }

    public void setTotalPageSize(int totalPageSize) {
        this.totalPageSize = totalPageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public static PageEntity createPageEntity(int totalPageSize, int pageSize, int pageNumber, Long totalCount, List list) {
        return new PageEntity<>(totalPageSize, pageSize, pageNumber, totalCount, list);
    }
}
