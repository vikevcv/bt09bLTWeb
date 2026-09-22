package vn.iotstar.bt09b.service;
import org.springframework.web.multipart.MultipartFile;
public interface CloudinaryService {
    CloudinaryUploadResult upload(MultipartFile file);
    void delete(String publicId);
}