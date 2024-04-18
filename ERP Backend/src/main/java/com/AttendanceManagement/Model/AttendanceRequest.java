package com.AttendanceManagement.Model;

import java.time.LocalDateTime;
import java.util.List;

public class AttendanceRequest {
    private String email;
    private List<LocalDateTime> loginTimes;
    private List<LocalDateTime> logoutTimes;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<LocalDateTime> getLoginTimes() {
		return loginTimes;
	}
	public void setLoginTimes(List<LocalDateTime> loginTimes) {
		this.loginTimes = loginTimes;
	}
	public List<LocalDateTime> getLogoutTimes() {
		return logoutTimes;
	}
	public void setLogoutTimes(List<LocalDateTime> logoutTimes) {
		this.logoutTimes = logoutTimes;
	}
    
}
