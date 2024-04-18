package com.AttendanceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AttendanceManagement.Model.Attendance;
import com.AttendanceManagement.Model.AttendanceCalculator;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

	Attendance findTopByEmailOrderByLoginTimeDesc(String email);

	void save(AttendanceCalculator attendanceCalculator);

}
