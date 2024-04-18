package com.AttendanceManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AttendanceManagement.Model.LeaveRequest;
import com.AttendanceManagement.Service.LeaveRequestService;
import java.util.List;

@RestController
@RequestMapping("/emp/Leave")
public class LeaveRequestController {

    @Autowired
    private LeaveRequestService leaveRequestService;
    
//    @PostMapping("/create")
//    public ResponseEntity<LeaveResponseDTO> createLeaveRequest(@RequestBody LeaveRequestDTO leaveRequestDTO) {
//        LeaveResponseDTO responseDTO = leaveRequestService.createLeaveRequest(leaveRequestDTO);
//        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
//    }
    @PostMapping("/Create")
    public ResponseEntity<String> createLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
        leaveRequestService.createLeaveRequest(leaveRequest.getEmployeeEmail(), leaveRequest.getStartDate(), leaveRequest.getEndDate(), leaveRequest.getReason());
        return ResponseEntity.ok("Leave request created successfully");
    }

    @GetMapping
    public ResponseEntity<List<LeaveRequest>> getAllLeaveRequests() {
        List<LeaveRequest> allLeaveRequests = leaveRequestService.getAllLeaveRequests();
        return new ResponseEntity<>(allLeaveRequests, HttpStatus.OK);
    }

    @PutMapping("/{id}/approve")
    public ResponseEntity<LeaveRequest> approveLeaveRequest(@PathVariable Long id) {
        LeaveRequest approvedLeaveRequest = leaveRequestService.approveLeaveRequest(id);
        return new ResponseEntity<>(approvedLeaveRequest, HttpStatus.OK);
    }

    @PutMapping("/{id}/reject")
    public ResponseEntity<LeaveRequest> rejectLeaveRequest(@PathVariable Long id) {
        LeaveRequest rejectedLeaveRequest = leaveRequestService.rejectLeaveRequest(id);
        return new ResponseEntity<>(rejectedLeaveRequest, HttpStatus.OK);
    }


    // Approved, Rejected, Pending request List

    @GetMapping("/pending")
    public ResponseEntity<List<LeaveRequest>> getPendingLeaveRequests() {
        List<LeaveRequest> pendingLeaveRequests = leaveRequestService.getPendingLeaveRequests();
        return new ResponseEntity<>(pendingLeaveRequests, HttpStatus.OK);
    }

    @GetMapping("/approved")
    public ResponseEntity<List<LeaveRequest>> getApprovedLeaveRequests() {
        List<LeaveRequest> approvedLeaveRequests = leaveRequestService.getApprovedLeaveRequests();
        return new ResponseEntity<>(approvedLeaveRequests, HttpStatus.OK);
    }

    @GetMapping("/rejected")
    public ResponseEntity<List<LeaveRequest>> getRejectedLeaveRequests() {
        List<LeaveRequest> rejectedLeaveRequests = leaveRequestService.getRejectedLeaveRequests();
        return new ResponseEntity<>(rejectedLeaveRequests, HttpStatus.OK);
    }
}
