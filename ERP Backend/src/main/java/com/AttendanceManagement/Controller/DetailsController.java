package com.AttendanceManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceManagement.Model.Details;
import com.AttendanceManagement.Service.DetailsService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins ="*")
public class DetailsController {

    private final DetailsService detailsService;

    @Autowired
    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @PostMapping("/details")
    public ResponseEntity<String> saveDetails(@RequestBody Details details) {
        try {
            detailsService.saveDetails(details);
            return ResponseEntity.ok("Details saved successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving details");
        }
    }
}
