package com.benezeth.MockinApp.exception;

import com.benezeth.MockinApp.entity.Segment;
import com.benezeth.MockinApp.repository.SegmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SuppressWarnings("ALL")
public class SegmentService {
private SegmentRepository segmentRepository;
@Autowired
public SegmentService (SegmentRepository segmentRepository){
    this.segmentRepository=segmentRepository;
}
public Segment getSegmentById(Long id){
    return segmentRepository.findById(id).orElse(null);
}
public List<Segment> getAllSegments(){
    return segmentRepository.findAll();
}
public Segment saveSegment(Segment segment){
    return segmentRepository.save(segment);
}
public void deleteSegment(Long id){
    segmentRepository.deleteById(id);
}
}
