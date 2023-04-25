package com.benezeth.MockinApp.controller;

import com.benezeth.MockinApp.entity.Segment;
import com.benezeth.MockinApp.exception.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/segments")
public class SegmentController {
private SegmentService segmentService;
@Autowired
    public SegmentController(SegmentService segmentService){
    this.segmentService=segmentService;
}
@GetMapping("/{id}")
    public ResponseEntity<Segment>getSegmentById(@PathVariable Long id){
    Segment segment=segmentService.getSegmentById(id);
    return  segment == null ?ResponseEntity.notFound().build():ResponseEntity.ok(segment);

}
@GetMapping
    public ResponseEntity<java.util.List<Segment>> getAllSegments(){
    List<Segment> segments=segmentService.getAllSegments();
    return segments.isEmpty()?ResponseEntity.noContent().build():ResponseEntity.ok(segments);
}
@PostMapping
    public ResponseEntity<Segment>saveSegment(@RequestBody Segment segment){
    Segment savedSegment=segmentService.saveSegment(segment);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedSegment);
}
@DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteSegment(@PathVariable long id){
    segmentService.deleteSegment(id);
    return ResponseEntity.noContent().build();
}
}
