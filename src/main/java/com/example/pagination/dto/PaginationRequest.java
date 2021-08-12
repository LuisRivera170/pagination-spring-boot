package com.example.pagination.dto;

public class PaginationRequest {

    private Integer items;

    private Integer page;

    private String columnOrder;

    private String directionOrder;

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getColumnOrder() {
        return columnOrder;
    }

    public void setColumnOrder(String columnOrder) {
        this.columnOrder = columnOrder;
    }

    public String getDirectionOrder() {
        return directionOrder;
    }

    public void setDirectionOrder(String directionOrder) {
        this.directionOrder = directionOrder;
    }

}
