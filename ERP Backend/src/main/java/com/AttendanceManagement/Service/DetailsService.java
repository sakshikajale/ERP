package com.AttendanceManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceManagement.Model.Details;
import com.AttendanceManagement.Repository.DetailsRepository;

@Service
public class DetailsService {

    private final DetailsRepository detailsRepository;

    @Autowired
    public DetailsService(DetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

    public void saveDetails(Details details) {
        detailsRepository.save(details);
    }
}
