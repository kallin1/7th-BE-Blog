package com.leets.blog.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Report extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long targetId;
    @Enumerated(EnumType.STRING)
    private TargetType targetType;
    private Long reporterId;
    @Enumerated(EnumType.STRING)
    private ReportReason reason;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private ReportStatus status = ReportStatus.PENDING;

    public void setStatus(ReportStatus status) { this.status = status; }
}