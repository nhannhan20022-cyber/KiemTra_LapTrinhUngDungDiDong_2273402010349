# BÀI THI THỰC HÀNH - CẢ 3 CÂU

- Họ và tên: **[Điền họ tên]**
- MSSV: **[Điền MSSV]**
- Nhánh: `cau-3`

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

## Minh chứng Câu 3

![ListView Display](screenshots/cau3_listview_display.png)

![Item Click Toast](screenshots/cau3_item_click_toast.png)

- `ProfileActivity` có `ListView` dưới phần Email và nút Đăng xuất.
- `findViewById<ListView>`, `ArrayAdapter(android.R.layout.simple_list_item_1)`.
- `setOnItemClickListener` hiển thị Toast **đúng tên môn học**.

## Lưu ý bắt buộc trước khi nộp
1. Thay `MSSV` trong tên thư mục project, `rootProject.name`, tên Repository GitHub.
2. Điền họ tên và MSSV vào README tại từng nhánh.
3. Chụp **5 ảnh chạy thật** tương ứng ba câu (2 ảnh Câu 1, 1 ảnh Câu 2, 2 ảnh Câu 3).
4. Bổ sung ảnh vào đúng nhánh rồi đẩy cả `cau-1`, `cau-2`, `cau-3` lên GitHub Public.
5. Nộp **link GitHub**, không nộp file ZIP.

Xem `HUONG_DAN_MO_VA_NOP_BAI.txt` để biết cách mở project và chụp ảnh theo nhánh.
