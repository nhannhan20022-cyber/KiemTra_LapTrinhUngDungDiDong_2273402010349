# BÀI THI THỰC HÀNH - CÂU 1 VÀ CÂU 2

- Họ và tên: **[Điền họ tên]**
- MSSV: **[Điền MSSV]**
- Nhánh: `cau-2`

## Nội dung
- LoginActivity bằng ConstraintLayout phẳng, đúng 5 thành phần chính.
- Ánh xạ `findViewById`, **không dùng ViewBinding**.
- Kiểm tra dữ liệu trống, `Patterns.EMAIL_ADDRESS`, mật khẩu ít nhất 6 ký tự.
- Thông báo lỗi hoặc `Xác thực thành công!` trên `txtStatus`.

## Minh chứng Câu 1
> **Cần chụp ảnh THẬT trên thiết bị hoặc Emulator và lưu đúng tên; file ZIP không có ảnh giả.**

![Validation Error](screenshots/cau1_validation_error.png)

![Validation Success](screenshots/cau1_validation_success.png)

**Cách thử:**
- Email `abc`, mật khẩu `123456` → lỗi định dạng Email.
- Email `test@gmail.com`, mật khẩu `123456` → `Xác thực thành công!`.

## Minh chứng Câu 2
> Chạy đăng nhập hợp lệ để chuyển sang ProfileActivity rồi chụp Email hiển thị đúng.

![Profile Intent](screenshots/cau2_profile_intent.png)

- `LoginActivity`: `Intent(this, ProfileActivity::class.java)` và `putExtra()`.
- `ProfileActivity`: `getStringExtra()` và `finish()` khi Đăng xuất.
