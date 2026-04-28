package com.leets.blog.entity;

public interface Reportable {
    void addWeight(int weight);
    int getTotalWeight();
    void updateStatus(ContentStatus status);
}