package buoi3;

public class Huy108829 {

    public static void main(String[] args) {
       
                // Khai báo các biến chứa thông tin sinh viên
                String maSinhVien = "108829";
                String hoVaTen = "Phạm Gia Huy";
                String ngaySinh = "24/08/2006";
                String lop = "GD24A";
                String khoa = "Mĩ Thuật Ứng Dụng";
                String diaChi = "Liên Chiểu ,Đà Nẵng";
                int tuoi = 18;  // Thay đổi tuổi hợp lý với ngày sinh
                boolean gioiTinh = true;  // true: Nam, false: Nữ
        
                // In ra thông tin sinh viên
                System.out.println("-----THÔNG TIN SINH VIÊN-----");
                System.out.println("Mã sinh viên: " + maSinhVien);
                System.out.println("Họ và tên: " + hoVaTen);
                System.out.println("Ngày sinh: " + ngaySinh);
                System.out.println("Tuổi: " + tuoi);
                System.out.println("Giới tính: " + (gioiTinh ? "Nam" : "Nữ"));
                System.out.println("Lớp: " + lop);
                System.out.println("Khoa: " + khoa);
                System.out.println("Địa chỉ: " + diaChi);
                System.out.println("-----HẾT-----");
            }
}