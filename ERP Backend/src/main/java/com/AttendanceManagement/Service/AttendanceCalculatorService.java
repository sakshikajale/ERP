//package com.AttendanceManagement.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.AttendanceManagement.Model.Attendance;
//import com.AttendanceManagement.Model.AttendanceCalculator;
//import com.AttendanceManagement.Model.AttendanceRequest;
//import com.AttendanceManagement.Repository.AttendanceRepository;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//public class AttendanceCalculatorService {
//	
//    @Autowired
//    private static AttendanceRepository attendanceRepository;
//
//    // Method to calculate attendance percentage for an employee over 8 days
//    public double calculateAttendancePercenta(Attendance attendance) {
//        long totalTime = attendance.getLogoutTime().getTime() - attendance.getLoginTime().getTime();
//        long workingHours = 8 * 60 * 60 * 1000; // Assuming 8 hours working day
//        return (double) totalTime / workingHours * 100;
//    }
//}
