package com.levietthang.eeshopserver.constant;

public interface Constant {
    String STATUS_SUCCESS = "{\"status\":\"success\"}";
    String STATUS_FAILED = "{\"status\":\"failed\"}";
    String REGISTER_SUCCESS = "Đăng ký thành công";
    String REGISTER_VALIDATE_FAILED_USER_NAME = "Tên đăng nhập không hợp lệ";
    String REGISTER_VALIDATE_FAILED_EMAIL = "Email không hợp lệ";
    String REGISTER_VALIDATE_FAILED_PASSWORD = "Mật khẩu phải ít nhất 6 ký tự, có kí tự đặc biệt và in hoa in thường, dài không quá 20 ký tự";
    String REGISTER_EXISTS_USER_NAME = "Tên đăng nhập đã được sử dụng";
    String REGISTER_EXISTS_EMAIL = "Email đã được sử dụng";
    String REGISTER_NOT_MATCH_PASSWORD = "Mật khẩu không trùng khớp";
    String REGISTER_FAILED = "Đăng ký thất bại";
}
