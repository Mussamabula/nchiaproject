package com.benezeth.MockinApp.repository;

import com.benezeth.MockinApp.entity.Segment;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("ALL")
public interface SegmentRepository extends JpaRepository<Segment,Long> {
}
