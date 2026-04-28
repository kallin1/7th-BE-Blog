package com.leets.blog.dto;

import com.leets.blog.entity.*;

public record ReportRequest(Long targetId, TargetType targetType, Long reporterId, ReportReason reason) {
    public Report toEntity() {
        return Report.builder()
                .targetId(targetId)
                .targetType(targetType)
                .reporterId(reporterId)
                .reason(reason)
                .build();
    }
}