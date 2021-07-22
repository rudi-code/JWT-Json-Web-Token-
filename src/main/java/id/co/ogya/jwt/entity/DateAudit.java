package id.co.ogya.jwt.entity;

import java.io.Serializable;
import java.time.Instant;

public class DateAudit implements Serializable {

//	@CreatedDate
//    @Column(nullable = false, updatable = false)
    private Instant createdAt;

//    @LastModifiedDate
//    @Column(nullable = false)
    private Instant updatedAt;

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
