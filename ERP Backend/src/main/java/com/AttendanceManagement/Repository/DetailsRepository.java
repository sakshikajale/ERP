package com.AttendanceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.AttendanceManagement.Model.Details;
@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {
}
