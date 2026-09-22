package vn.iotstar.bt09b.service;
public interface EmailService {
    void sendOtp(String email, String otp, String subject);
}