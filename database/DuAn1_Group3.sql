create database DuAn1_Group3
go
use DuAn1_Group3
go
CREATE TABLE [SizeSP] (
  [IDSizeSP] BIGINT Identity(1,1),
  [SIze] int,
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDSizeSP])
);

CREATE TABLE [VanChuyen] (
  [IDVanChuyen] BIGINT Identity(1,1),
  [TenHangVanChuyen] Nvarchar(50),
  [TocDoVanChuyen] Nvarchar(50),
  [GiaVanChuyen] Float,
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDVanChuyen])
);

CREATE TABLE [CaLam] (
  [IDCaLam] BIGINT Identity(1,1),
  [TenCaLam] Nvarchar(50),
  [ThoiGianBatDau] Varchar(50),
  [ThoiGianKetThuc] Varchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDCaLam])
);

CREATE TABLE [ChucVu] (
  [IDChucVu] BIGINT Identity(1,1),
  [TenChucVu] Nvarchar(50),
  [Luong] NVarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDChucVu])
);

CREATE TABLE [NhanVien] (
  [IDNhanVien] BIGINT Identity(1,1),
  [IDChucVu] BIGINT,
  [IDCaLam] BIGINT,
  [HoTen] Nvarchar(50),
  [GioiTinh] Bit,
  [NgaySinh] Date,
  [DiaChi] Nvarchar(100),
  [MaNhanVien] Nvarchar(50),
  [Email] Nvarchar(50),
  [TrangThai] Nvarchar(50),
  [AnSP] bit,
  PRIMARY KEY ([IDNhanVien]),
  CONSTRAINT [FK_NhanVien.IDCaLam]
    FOREIGN KEY ([IDCaLam])
      REFERENCES [CaLam]([IDCaLam]),
  CONSTRAINT [FK_NhanVien.IDChucVu]
    FOREIGN KEY ([IDChucVu])
      REFERENCES [ChucVu]([IDChucVu])
);

CREATE TABLE [PhuongThucThanhToan] (
  [IDPhuongThucThanhToan] BIGINT Identity(1,1),
  [LoaiPhuongThucThanhToan] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDPhuongThucThanhToan])
);

CREATE TABLE [LoaiKhachHang] (
  [IDLoaiKH] BIGINT Identity(1,1),
  [TenLoaiKhachHang] Nvarchar(50),
  [DacQuyen] NVarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDLoaiKH])
);

CREATE TABLE [PhanHoiKH] (
  [IDPhanHoiKH] BIGINT Identity(1,1),
  [SoSaoDanhGia] int,
  [GhiChuPhanHoi] Nvarchar(200),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDPhanHoiKH])
);

CREATE TABLE [SoThichKH] (
  [IDSoThichKH] BIGINT Identity(1,1),
  [TenSanPham] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(50),
  [AnSP] Bit,
  PRIMARY KEY ([IDSoThichKH])
);

CREATE TABLE [KhachHang] (
  [IDKhachHang] BIGINT Identity(1,1),
  [IDPhanHoiKH] BIGINT,
  [IDLoaiKH] BIGINT,
  [IDSoThichKH] BIGINT,
  [HoTen] Nvarchar(50),
  [NgaySinh] Date,
  [GioiTinh] Bit,
  [SDT] Nvarchar(10),
  [DiaChi] Nvarchar(50),
  [Email] Nvarchar(200),
  [HinhAnh] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDKhachHang]),
  CONSTRAINT [FK_KhachHang.IDLoaiKH]
    FOREIGN KEY ([IDLoaiKH])
      REFERENCES [LoaiKhachHang]([IDLoaiKH]),
  CONSTRAINT [FK_KhachHang.IDPhanHoiKH]
    FOREIGN KEY ([IDPhanHoiKH])
      REFERENCES [PhanHoiKH]([IDPhanHoiKH]),
  CONSTRAINT [FK_KhachHang.IDSoThichKH]
    FOREIGN KEY ([IDSoThichKH])
      REFERENCES [SoThichKH]([IDSoThichKH])
);

CREATE TABLE [HoaDon] (
  [IDHoaDon] BIGINT Identity(1,1),
  [TongTien] Money,
  [IDNhanVien] BIGINT,
  [IDKhachHang] BIGINT,
  [IDPhuongThucThanhToan] BIGINT,
  [IDVanChuyen] BIGINT,
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDHoaDon]),
  CONSTRAINT [FK_HoaDon.IDVanChuyen]
    FOREIGN KEY ([IDVanChuyen])
      REFERENCES [VanChuyen]([IDVanChuyen]),
  CONSTRAINT [FK_HoaDon.IDKhachHang]
    FOREIGN KEY ([IDKhachHang])
      REFERENCES [KhachHang]([IDKhachHang]),
  CONSTRAINT [FK_HoaDon.IDNhanVien]
    FOREIGN KEY ([IDNhanVien])
      REFERENCES [NhanVien]([IDNhanVien]),
  CONSTRAINT [FK_HoaDon.IDPhuongThucThanhToan]
    FOREIGN KEY ([IDPhuongThucThanhToan])
      REFERENCES [PhuongThucThanhToan]([IDPhuongThucThanhToan])
);

CREATE TABLE [NSXSP] (
  [IDNSXSP] BIGINT Identity(1,1),
  [TenNSX] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDNSXSP])
);

CREATE TABLE [LoaiDeDep] (
  [IDLoaiDeDep] BIGINT Identity(1,1),
  [TenLoaiDeDep] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDLoaiDeDep])
);

CREATE TABLE [MauSP] (
  [IDMauSP] BIGINT Identity(1,1),
  [TenMau] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(50),
  [AnSP] Bit,
  PRIMARY KEY ([IDMauSP])
);

CREATE TABLE [TrinhDoHocVan] (
  [IDTrinhDoHocVan] BIGINT Identity(1,1),
  [HocVan] Nvarchar(50),
  [BangCap] Nvarchar(50),
  [ChungChi] Nvarchar(50),
  [KinhNgiem] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDTrinhDoHocVan])
);

INSERT INTO [dbo].[TrinhDoHocVan]
           ([HocVan]
           ,[BangCap]
           ,[ChungChi]
           ,[KinhNgiem]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (N'Trung cấp', N'Trung cấp Khoa học xã hội', N'Chứng chỉ An toàn Lao động', N'1 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Cao đẳng', N'Cao đẳng Công nghệ Thông tin', N'Chứng chỉ Quản lý dự án', N'2 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Đại học', N'Đại học Kỹ thuật Điện tử', N'Chứng chỉ Tiếng Anh TOEIC', N'3 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Đại học', N'Đại học Quản trị Kinh doanh', N'Chứng chỉ Quản lý nhân sự', N'4 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Cao đẳng', N'Cao đẳng Du lịch và Khách sạn', N'Chứng chỉ Tiếng Nhật JLPT N3', N'5 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Đại học', N'Đại học Y Dược', N'Chứng chỉ Nghiệp vụ Dược học', N'6 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Cao đẳng', N'Cao đẳng Nghệ thuật ứng dụng', N'Chứng chỉ Thiết kế Đồ họa', N'7 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Trung cấp', N'Trung cấp Marketing', N'Chứng chỉ Quảng cáo sáng tạo', N'8 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Đại học', N'Đại học Văn hóa Nghệ thuật', N'Chứng chỉ Sáng tạo nghệ thuật', N'9 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0),
  (N'Trung cấp', N'Trung cấp Tài chính Ngân hàng', N'Chứng chỉ Kế toán quản trị', N'10 năm kinh nghiệm', GETDATE(), N'Hoạt động', 0);


CREATE TABLE [KieuDang] (
  [IDKieuDang] BIGINT Identity(1,1),
  [TenKieuDang] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDKieuDang])
);

CREATE TABLE [ThuongHieuSP] (
  [IDThuongHieuSP] BIGINT Identity(1,1),
  [TenChatLieu] Nvarchar(50),
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDThuongHieuSP])
);

CREATE TABLE [SanPham] (
  [IDSanPham] BIGINT Identity(1,1),
  [TenSP] Nvarchar(50),
  [IDKieuDang] BIGINT,
  [IDMauSP] BIGINT,
  [IDSizeSP] BIGINT,
  [IDNSXSP] BIGINT,
  [ChatLieu] Nvarchar(20),
  [IDThuongHieu] BIGINT,
  [IDLoaiDeDep] BIGINT,
  [soLuongTonKho] int,
  [GiaNhapSP] Money,
  [GiaBanSP] Money,
  [MucDichSuDung] Nvarchar(50),
  [NgayNhap] date,
  [HinhAnh] Nvarchar(200),
  [MoTa] Nvarchar(200),
  [TrangThai] Nvarchar(20),
  [AnSP] bit,
  PRIMARY KEY ([IDSanPham]),
  CONSTRAINT [FK_SanPham.IDLoaiDeDep]
    FOREIGN KEY ([IDLoaiDeDep])
      REFERENCES [LoaiDeDep]([IDLoaiDeDep]),
  CONSTRAINT [FK_SanPham.IDKieuDang]
    FOREIGN KEY ([IDKieuDang])
      REFERENCES [KieuDang]([IDKieuDang]),
  CONSTRAINT [FK_SanPham.IDSizeSP]
    FOREIGN KEY ([IDSizeSP])
      REFERENCES [SizeSP]([IDSizeSP]),
  CONSTRAINT [FK_SanPham.IDNSXSP]
    FOREIGN KEY ([IDNSXSP])
      REFERENCES [NSXSP]([IDNSXSP]),
  CONSTRAINT [FK_SanPham.IDThuongHieu]
    FOREIGN KEY ([IDThuongHieu])
      REFERENCES [ThuongHieuSP]([IDThuongHieuSP]),
  CONSTRAINT [FK_SanPham.IDMauSP]
    FOREIGN KEY ([IDMauSP])
      REFERENCES [MauSP]([IDMauSP])
);

CREATE TABLE [TaiKhoan] (
  [IDTaiKhoan] BIGINT Identity(1,1),
  [TenTaiKhoan] Nvarchar(50),
  [MatKhau] NVarchar(50),
  [IDNhanVien] BIGINT,
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDTaiKhoan]),
  CONSTRAINT [FK_TaiKhoan.IDNhanVien]
    FOREIGN KEY ([IDNhanVien])
      REFERENCES [NhanVien]([IDNhanVien])
);

CREATE TABLE [LichSuGiaoDich] (
  [IDLichSuGiaoDich] BIGINT Identity(1,1),
  [IDHoaDon] BIGINT,
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDLichSuGiaoDich]),
  CONSTRAINT [FK_LichSuGiaoDich.IDHoaDon]
    FOREIGN KEY ([IDHoaDon])
      REFERENCES [HoaDon]([IDHoaDon])
);

CREATE TABLE [HoaDonChiTiet] (
  [IDHoaDonCT] BIGINT Identity(1,1),
  [IDSPCT] BIGINT,
  [IDHoaDon] BIGINT,
  [SoLuong] int,
  [GiaTien] Money,
  [NgayTao] Date,
  [TrangThai] Nvarchar(20),
  [AnSP] Bit,
  PRIMARY KEY ([IDHoaDonCT]),
  CONSTRAINT [FK_HoaDonChiTiet.IDHoaDon]
    FOREIGN KEY ([IDHoaDon])
      REFERENCES [HoaDon]([IDHoaDon]),
  CONSTRAINT [FK_HoaDonChiTiet.IDSPCT]
    FOREIGN KEY ([IDSPCT])
      REFERENCES [SanPham]([IDSanPham])
);


  INSERT INTO [KieuDang] ([TenKieuDang], [NgayTao], [TrangThai], [AnSP])
VALUES
  (N'Dép quai ngang', GETDATE(), N'Hoạt động', 0),
  (N'Dép quai dọc', GETDATE(), N'Hoạt động', 0),
  (N'Dép xỏ ngón', GETDATE(), N'Hoạt động', 0),
  (N'Dép đế bằng', GETDATE(), N'Hoạt động', 0),
  (N'Dép thể thao', GETDATE(), N'Hoạt động', 0),
  (N'Dép cao gót', GETDATE(), N'Hoạt động', 0),
  (N'Dép búp bê', GETDATE(), N'Hoạt động', 0),
  (N'Dép cổ điển', GETDATE(), N'Hoạt động', 0),
  (N'Dép bãi biển', GETDATE(), N'Hoạt động', 0),
  (N'Dép xinh xắn', GETDATE(), N'Hoạt động', 0);

    INSERT INTO [MauSP] ([TenMau], [NgayTao], [TrangThai], [AnSP])
VALUES
  (N'Màu đen', GETDATE(), N'Hoạt động', 0),
  (N'Màu trắng', GETDATE(), N'Hoạt động', 0),
  (N'Màu xanh', GETDATE(), N'Hoạt động', 0),
  (N'Màu đỏ', GETDATE(), N'Hoạt động', 0),
  (N'Màu vàng', GETDATE(), N'Hoạt động', 0),
  (N'Màu hồng', GETDATE(), N'Hoạt động', 0),
  (N'Màu xám', GETDATE(), N'Hoạt động', 0),
  (N'Màu nâu', GETDATE(), N'Hoạt động', 0),
  (N'Màu cam', GETDATE(), N'Hoạt động', 0),
  (N'Màu lục', GETDATE(), N'Hoạt động', 0);

    INSERT INTO [SizeSP] ([SIze], [NgayTao], [TrangThai], [AnSP])
VALUES
  (36, GETDATE(), N'Hoạt động', 0),
  (37, GETDATE(), N'Hoạt động', 0),
  (38, GETDATE(), N'Hoạt động', 0),
  (39, GETDATE(), N'Hoạt động', 0),
  (40, GETDATE(), N'Hoạt động', 0),
  (41, GETDATE(), N'Hoạt động', 0),
  (42, GETDATE(), N'Hoạt động', 0),
  (43, GETDATE(), N'Hoạt động', 0),
  (44, GETDATE(), N'Hoạt động', 0),
  (45, GETDATE(), N'Hoạt động', 0);

    INSERT INTO [NSXSP] ([TenNSX], [NgayTao], [TrangThai], [AnSP])
VALUES
  ('Nike', GETDATE(), N'Hoạt động', 0),
  ('Adidas', GETDATE(), N'Hoạt động', 0),
  ('Puma', GETDATE(), N'Hoạt động', 0),
  ('New Balance', GETDATE(), N'Hoạt động', 0),
  ('Converse', GETDATE(), N'Hoạt động', 0),
  ('Vans', GETDATE(), N'Hoạt động', 0),
  ('Reebok', GETDATE(), N'Hoạt động', 0),
  ('Under Armour', GETDATE(), N'Hoạt động', 0),
  ('FILA', GETDATE(), N'Hoạt động', 0),
  ('Skechers', GETDATE(), N'Hoạt động', 0);

    INSERT INTO [ThuongHieuSP] ([TenChatLieu], [NgayTao], [TrangThai], [AnSP])
VALUES
  ('Nike', GETDATE(), N'Hoạt động', 0),
  ('Adidas', GETDATE(), N'Hoạt động', 0),
  ('Puma', GETDATE(),N'Hoạt động', 0),
  ('New Balance', GETDATE(), N'Hoạt động', 0),
  ('Converse', GETDATE(), N'Hoạt động', 0),
  ('Vans', GETDATE(), N'Hoạt động', 0),
  ('Reebok', GETDATE(), N'Hoạt động', 0),
  ('Under Armour', GETDATE(), N'Hoạt động', 0),
  ('FILA', GETDATE(), N'Hoạt động', 0),
  ('Skechers', GETDATE(), N'Hoạt động', 0);

      INSERT INTO [LoaiDeDep] ([TenLoaiDeDep], [NgayTao], [TrangThai], [AnSP])
VALUES
  (N'Đế bệt', GETDATE(), N'Hoạt động', 0),
  (N'Đế mảnh', GETDATE(), N'Hoạt động', 0),
  (N'Đế vuông', GETDATE(), N'Hoạt động', 0),
  (N'Đế thấp', GETDATE(), N'Hoạt động', 0),
  (N'Đế cao', GETDATE(), N'Hoạt động', 0),
  (N'Đế bệt dẹp', GETDATE(), N'Hoạt động', 0),
  (N'Đế mảnh dẹp', GETDATE(), N'Hoạt động', 0),
  (N'Đế vuông dẹp', GETDATE(), N'Hoạt động', 0),
  (N'Đế thấp dẹp', GETDATE(), N'Hoạt động', 0),
  (N'Đế cao dẹp', GETDATE(), N'Hoạt động', 0);

  INSERT INTO [SanPham] ([TenSP], [IDKieuDang], [IDMauSP], [IDSizeSP], [IDNSXSP], [ChatLieu], [IDThuongHieu], [IDLoaiDeDep],soLuongTonKho, [GiaNhapSP], [GiaBanSP], [MucDichSuDung], [NgayNhap], [HinhAnh], [MoTa], [TrangThai], [AnSP])
VALUES
  (N'Dép thể thao Nike', 5, 1, 2, 1, N'Vải', 1, 4,100, 50.0, 100.0, N'Đi bộ và thể thao', GETDATE(), 'nike-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép xỏ ngón Adidas', 3, 2, 3, 2, N'Vải', 2, 2,50, 45.0, 90.0, N'Đi bộ và du lịch', GETDATE(), 'adidas-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép quai ngang Puma', 1, 3, 4, 3, N'Vải', 3, 1,40, 40.0, 80.0, N'Đi mua sắm và hàng ngày', GETDATE(), 'puma-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép búp bê New Balance', 7, 4, 5, 4, N'Vải', 4, 6,111, 55.0, 110.0, N'Đi bộ và hẹn hò', GETDATE(), 'new-balance-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép cổ điển Converse', 8, 5, 6, 5, N'Vải', 5, 8,100, 60.0, 120.0, N'Đi chơi và du lịch', GETDATE(), 'converse-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép đế bằng Vans', 6, 6, 7, 6, N'Vải', 6, 7,200, 50.0, 100.0, N'Đi làm và hẹn hò', GETDATE(), 'vans-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép xinh xắn Reebok', 9, 7, 8, 7, N'Vải', 7, 10, 200, 45.0, 90.0, N'Đi tiệc và sự kiện', GETDATE(), 'reebok-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép bãi biển Under Armour', 2, 8, 9, 8, N'Vải', 8, 9,300, 55.0, 110.0, N'Đi biển và du lịch', GETDATE(), 'under-armour-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép xỏ ngón FILA', 3, 9, 10, 9, N'Vải', 9, 3,100, 40.0, 80.0, N'Đi biển và thể thao', GETDATE(), 'fila-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0),
  (N'Dép thể thao Skechers', 5, 10, 1, 10, N'Vải', 10, 5,200, 50.0, 100.0, N'Đi bộ và thể thao', GETDATE(), 'skechers-dep.jpg', N'Mô tả sản phẩm', N'Hoạt động', 0);

  INSERT INTO [dbo].[CaLam]
  ([TenCaLam],[ThoiGianBatDau],[ThoiGianKetThuc],[NgayTao],[TrangThai],[AnSP])
     VALUES
		(N'Sáng','7:30','11:30',GETDATE(),N'Hoạt động',0),
		(N'Chiều','12:30','17:00',GETDATE(),N'Hoạt động',0),
		(N'Tối','17:30','22:30',GETDATE(),N'Hoạt động',0)

INSERT INTO [ChucVu] ([TenChucVu], [Luong], [NgayTao], [TrangThai], [AnSP])
VALUES
  (N'Quản lý', N'10000000 VND', GETDATE(), N'Hoạt động', 0),
  (N'Nhân viên bán hàng', N'5000000 VND', GETDATE(), N'Hoạt động', 0),
  (N'Nhân viên kho', N'5500000 VND', GETDATE(), N'Hoạt động', 0),
  (N'Nhân viên hỗ trợ', N'6000000 VND', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng', N'0 VND', GETDATE(), N'Hoạt động', 0),
  (N'Chuyên viên bán hàng', N'7500000 VND', GETDATE(), N'Hoạt động', 0),
  (N'Kế toán', N'7000000 VND', GETDATE(), N'Hoạt động', 0),
  (N'Phân loại sản phẩm', N'6500000 VND', GETDATE(), N'Hoạt động', 0),
  (N'Chăm sóc khách hàng', N'7500000 VND', GETDATE(), N'Hoạt động', 0),
  (N'Nhà cung cấp', N'0 VND', GETDATE(), N'Hoạt động', 0);
  INSERT INTO [dbo].[NhanVien]
           ([IDChucVu]
           ,[IDCaLam]
           ,[HoTen]
           ,[GioiTinh]
           ,[NgaySinh]
           ,[DiaChi]
           ,[MaNhanVien]
           ,[Email]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (1,1,N'Nguyễn Thị Ánh',0,'1992-08-15',N'234 Đường ABC, Quận 1, TP.HCM',null,N'nguyenthanh@gmail.com',N'Hoạt động',0),
  (3,2,N'Trần Văn Bình',1,'1990-12-20',N'345 Đường XYZ, Quận 2, TP.HCM',null,N'tranbinh@gmail.com',N'Hoạt động',0),
  (2,1,N'Lê Thị Cẩm',0,'1988-04-05',N'456 Đường DEF, Quận 3, TP.HCM',null,N'lecam@gmail.com',N'Hoạt động',0),
  (2,2,N'Hồ Văn Đạt',1,'1993-06-12',N'567 Đường GHI, Quận 4, TP.HCM',null,N'hodat@gmail.com',N'Hoạt động',0),
  (2,2,N'Phạm Thị Hiền',0,'1995-10-30',N'678 Đường LMN, Quận 5, TP.HCM',null,N'phamhien@gmail.com',N'Hoạt động',0),
  (4,2,N'Nguyễn Thị A',0,'1992-08-15',N'234 Đường ABC, Quận 1, TP.HCM',null,N'nguyenthanh@gmail.com',N'Hoạt động',0),
  (7,1,N'Nguyễn Thị B',0,'1992-08-15',N'234 Đường ABC, Quận 1, TP.HCM',null,N'nguyenthanh@gmail.com',N'Hoạt động',0),
  (8,3,N'Nguyễn Thị C',0,'1992-08-15',N'234 Đường ABC, Quận 1, TP.HCM',null,N'nguyenthanh@gmail.com',N'Hoạt động',0),
  (9,3,N'Nguyễn Thị D',0,'1992-08-15',N'234 Đường ABC, Quận 1, TP.HCM',null,N'nguyenthanh@gmail.com',N'Hoạt động',0),
  (3,2,N'Nguyễn Thị E',0,'1992-08-15',N'234 Đường ABC, Quận 1, TP.HCM',null,N'nguyenthanh@gmail.com',N'Hoạt động',0)

  INSERT INTO [dbo].[TaiKhoan]
           ([TenTaiKhoan]
           ,[MatKhau]
           ,[IDNhanVien]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (N'nguyenanh92', N'StrongPass1', 1, GETDATE(), N'Hoạt động', 0),
  (N'tranbinh90', N'SecurePass2', 2, GETDATE(), N'Hoạt động', 0),
  (N'lecam88', N'SecretPass3', 3, GETDATE(), N'Hoạt động', 0),
  (N'hodat93', N'ProtectedPass4', 4, GETDATE(), N'Hoạt động', 0),
  (N'phamhien95', N'SafePass5', 5, GETDATE(), N'Hoạt động', 0),
  (N'nguyenanh92_a', N'Pass123', 6, GETDATE(), N'Hoạt động', 0),
  (N'nguyenanh92_b', N'Pass456', 7, GETDATE(), N'Hoạt động', 0),
  (N'nguyenanh92_c', N'Pass789', 8, GETDATE(), N'Hoạt động', 0),
  (N'nguyenanh92_d', N'PassABC', 9, GETDATE(), N'Hoạt động', 0),
  (N'nguyenanh92_e', N'PassXYZ', 10, GETDATE(), N'Hoạt động', 0);

		INSERT INTO [dbo].[SoThichKH]
           ([TenSanPham]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (N'Dép Sneakers Adidas', GETDATE(), N'Yêu thích', 0),
  (N'Dép Thể Thao Nike', GETDATE(), N'Yêu thích', 0),
  (N'Dép Sandal Đi Biển', GETDATE(), N'Yêu thích', 0),
  (N'Dép Chống Nước Columbia', GETDATE(), N'Yêu thích', 0),
  (N'Dép Cao Gót Gucci', GETDATE(), N'Yêu thích', 0),
  (N'Dép Quai Ngang Hermes', GETDATE(), N'Yêu thích', 0),
  (N'Dép Bít Mũi Balenciaga', GETDATE(), N'Yêu thích', 0),
  (N'Dép Lười Salvatore Ferragamo', GETDATE(), N'Yêu thích', 0),
  (N'Dép Thể Thao Puma', GETDATE(), N'Yêu thích', 0),
  (N'Dép Đi Mưa Hunter', GETDATE(), N'Yêu thích', 0);

  INSERT INTO [dbo].[PhanHoiKH]
           ([SoSaoDanhGia]
           ,[GhiChuPhanHoi]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (5, N'Sản phẩm rất tốt, chất lượng đẹp', GETDATE(), N'Hoạt động', 0),
  (4, N'Nhân viên phục vụ nhiệt tình', GETDATE(), N'Hoạt động', 0),
  (3, N'Dép hơi chật so với size bình thường', GETDATE(), N'Hoạt động', 0),
  (5, N'Rất hài lòng với dịch vụ giao hàng nhanh chóng', GETDATE(), N'Hoạt động', 0),
  (2, N'Chất liệu không như mô tả, mong được cải thiện', GETDATE(), N'Hoạt động', 0),
  (4, N'Đã mua lần thứ 3, sản phẩm luôn đáp ứng mong đợi', GETDATE(), N'Hoạt động', 0),
  (3, N'Có thể cải thiện dịch vụ hỗ trợ khách hàng', GETDATE(), N'Hoạt động', 0),
  (5, N'Sản phẩm đẹp, giá cả hợp lý', GETDATE(), N'Hoạt động', 0),
  (4, N'Chất lượng dép rất tốt, đúng như hình ảnh', GETDATE(), N'Hoạt động', 0),
  (1, N'Rất không hài lòng với dịch vụ, hàng gửi sai size', GETDATE(), N'Hoạt động', 0);

  INSERT INTO [dbo].[LoaiKhachHang]
           ([TenLoaiKhachHang]
           ,[DacQuyen]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (N'Khách hàng thường', N'Không có', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng VIP', N'Ưu đãi đặc quyền', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng đại lý', N'Chiết khấu đặc biệt', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng doanh nghiệp', N'Thỏa thuận riêng', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng lẻ', N'Không có', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng mua sỉ', N'Chiết khấu số lượng', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng online', N'Ưu đãi mua sắm trực tuyến', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng offline', N'Ưu đãi mua sắm tại cửa hàng', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng thân thiết', N'Ưu đãi đặc biệt cho khách quen', GETDATE(), N'Hoạt động', 0),
  (N'Khách hàng mới', N'Ưu đãi chào mừng', GETDATE(), N'Hoạt động', 0);

  INSERT INTO [dbo].[KhachHang]
           ([IDPhanHoiKH]
           ,[IDLoaiKH]
           ,[IDSoThichKH]
           ,[HoTen]
           ,[NgaySinh]
           ,[GioiTinh]
           ,[SDT]
           ,[DiaChi]
           ,[Email]
           ,[HinhAnh]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (1, 1, 1, N'Mai Thị Hoa', '1990-05-15', 1, '0905123456', N'123 Đường Hoa Mai, Quận 1, TP.HCM', N'maithihoa@gmail.com', N'avatar1.jpg', GETDATE(), N'Hoạt động', 0),
  (2, 2, NULL, N'Nguyễn Minh Quân', '1985-07-20', 0, '0909876543', N'456 Đường Quân Trí, Quận 2, TP.HCM', N'nguyenminhquan@gmail.com', N'avatar2.jpg', GETDATE(), N'Hoạt động', 0),
  (3, 3, 3, N'Lê Văn Cường', '1993-02-10', 1, '0123456789', N'789 Đường Cường Kính, Quận 3, TP.HCM', N'levancuong@gmail.com', N'avatar3.jpg', GETDATE(), N'Hoạt động', 0),
  (4, 4, NULL, N'Phạm Thị Ngọc Lan', '1988-11-25', 0, '0901122334', N'101 Đường Lan Nhi, Quận 4, TP.HCM', N'phamthingoclan@gmail.com', N'avatar4.jpg', GETDATE(), N'Hoạt động', 0),
  (5, 5, 5, N'Hồ Văn Tuấn', '1995-09-03', 1, '0909876543', N'202 Đường Tuấn Hồ, Quận 5, TP.HCM', N'hovantuan@gmail.com', N'avatar5.jpg', GETDATE(), N'Hoạt động', 0),
  (6, 6, 6, N'Nguyễn Thị Hương', '1991-12-18', 0, '0123456789', N'303 Đường Hương Sen, Quận 6, TP.HCM', N'nguyenthihuong@gmail.com', N'avatar6.jpg', GETDATE(), N'Hoạt động', 0),
  (7, 7, NULL, N'Lê Văn Hải', '1987-06-30', 1, '0901122334', N'404 Đường Hải Phòng, Quận 7, TP.HCM', N'levanhai@gmail.com', N'avatar7.jpg', GETDATE(), N'Hoạt động', 0),
  (8, 8, 8, N'Đỗ Thị Hạnh', '1996-04-22', 0, '0909876543', N'505 Đường Hạnh Phúc, Quận 8, TP.HCM', N'dothihanh@gmail.com', N'avatar8.jpg', GETDATE(), N'Hoạt động', 0),
  (9, 9, 9, N'Nguyễn Văn Hải', '1990-08-10', 1, '0123456789', N'606 Đường Hải Bắc, Quận 9, TP.HCM', N'nguyenvanhai@gmail.com', N'avatar9.jpg', GETDATE(), N'Hoạt động', 0),
  (10, 10, 10, N'Hoàng Thị Kim', '1985-03-15', 0, '0901122334', N'707 Đường Kim Liên, Quận 10, TP.HCM', N'hoangthikim@gmail.com', N'avatar10.jpg', GETDATE(), N'Hoạt động', 0),
  (NULL, 1, 1, N'Trần Văn Lợi', '1992-11-05', 1, '0909876543', N'808 Đường Lợi Nhuận, Quận 11, TP.HCM', N'tranvanloi@gmail.com', N'avatar11.jpg', GETDATE(), N'Hoạt động', 0),
  (9, 2, NULL, N'Lê Thị Mỹ Linh', '1988-07-20', 0, '0123456789', N'909 Đường Linh Trung, Quận 12, TP.HCM', N'lethimylinh@gmail.com', N'avatar12.jpg', GETDATE(), N'Hoạt động', 0),
  (NULL, 3, 3, N'Nguyễn Thị Ngân', '1993-02-10', 1, '0901122334', N'1010 Đường Ngân Hàng, Quận 1, TP.HCM', N'nguyenthingan@gmail.com', N'avatar13.jpg', GETDATE(), N'Hoạt động', 0),
  (7, 4, NULL, N'Hồ Văn Phú', '1988-11-25', 0, '0909876543', N'1111 Đường Phú Quý, Quận 2, TP.HCM', N'hovanphu@gmail.com', N'avatar14.jpg', GETDATE(), N'Hoạt động', 0),
  (NULL, 5, 5, N'Phạm Thị Quỳnh', '1995-09-03', 1, '0123456789', N'1212 Đường Quỳnh Anh, Quận 3, TP.HCM', N'phamthiquynh@gmail.com', N'avatar15.jpg', GETDATE(), N'Hoạt động', 0),
  (NULL, 6, 6, N'Đỗ Văn Quý', '1991-12-18', 0, '0901122334', N'1313 Đường Quý Sơn, Quận 4, TP.HCM', N'dovanquy@gmail.com', N'avatar16.jpg', GETDATE(), N'Hoạt động', 0),
  (3, 7, NULL, N'Lê Thị Rừng', '1987-06-30', 1, '0909876543', N'1414 Đường Rừng Cao Su, Quận 5, TP.HCM', N'lerung@gmail.com', N'avatar17.jpg', GETDATE(), N'Hoạt động', 0),
  (NULL, 8, 8, N'Nguyễn Văn Sơn', '1996-04-22', 0, '0901122334', N'1515 Đường Sơn Hải, Quận 6, TP.HCM', N'nguyenvanson@gmail.com', N'avatar18.jpg', GETDATE(), N'Hoạt động', 0),
  (10, 9, 9, N'Hồ Thị Thảo', '1990-08-10', 1, '0909876543', N'1616 Đường Thảo Nguyên, Quận 7, TP.HCM', N'hothithao@gmail.com', N'avatar19.jpg', GETDATE(), N'Hoạt động', 0),
  (NULL, 10, 10, N'Đỗ Văn Uy', '1985-03-15', 0, '0901122334', N'1717 Đường Uy Nhiên, Quận 8, TP.HCM', N'dovanuy@gmail.com', N'avatar20.jpg', GETDATE(), N'Hoạt động', 0);

  INSERT INTO [dbo].[VanChuyen]
           ([TenHangVanChuyen]
           ,[TocDoVanChuyen]
           ,[GiaVanChuyen]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (N'Giao hàng nhanh', N'Nhanh', 50.0, GETDATE(), N'Hoạt động', 0),
  (N'Giao hàng tiết kiệm', N'Chậm', 30.0, GETDATE(), N'Hoạt động', 0),
  (N'Chuyển phát nhanh', N'Rất nhanh', 70.0, GETDATE(), N'Hoạt động', 0),
  (N'Giao hàng thông thường', N'Bình thường', 20.0, GETDATE(), N'Hoạt động', 0),
  (N'Giao hàng siêu tốc', N'Siêu nhanh', 100.0, GETDATE(), N'Hoạt động', 0),
  (N'Giao hàng tiêu chuẩn', N'Tiêu chuẩn', 40.0, GETDATE(), N'Hoạt động', 0),
  (N'Chuyển phát siêu tốc', N'Cực kỳ nhanh', 120.0, GETDATE(), N'Hoạt động', 0),
  (N'Giao hàng hỏa tốc', N'Hỏa tốc', 90.0, GETDATE(), N'Hoạt động', 0),
  (N'Giao hàng trong ngày', N'Trong ngày', 80.0, GETDATE(), N'Hoạt động', 0),
  (N'Chuyển phát cực nhanh', N'Cực nhanh', 150.0, GETDATE(), N'Hoạt động', 0);
  
  INSERT INTO [dbo].[PhuongThucThanhToan]
           ([LoaiPhuongThucThanhToan]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (N'Thanh toán bằng thẻ tín dụng', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán bằng thẻ ghi nợ', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán khi nhận hàng', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán qua ví điện tử', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán bằng chuyển khoản ngân hàng', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán bằng tiền mặt', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán qua cổng thanh toán trực tuyến', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán qua ứng dụng di động', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán bằng QR code', GETDATE(), N'Hoạt động', 0),
  (N'Thanh toán qua thẻ thành viên', GETDATE(), N'Hoạt động', 0);
  INSERT INTO [dbo].[HoaDon]
           ([TongTien]
           ,[IDNhanVien]
           ,[IDKhachHang]
           ,[IDPhuongThucThanhToan]
           ,[IDVanChuyen]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (1500000, 1, 1, 1, 1, GETDATE(), N'Đã thanh toán', 0),
  (2500000, 2, 2, 2, 2, GETDATE(), N'Chưa thanh toán', 0),
  (1800000, 3, 3, 3, 3, GETDATE(), N'Đã thanh toán', 0),
  (3200000, 4, 4, 4, 4, GETDATE(), N'Đã thanh toán', 0),
  (2000000, 5, 5, 5, 5, GETDATE(), N'Chưa thanh toán', 0),
  (2800000, 6, 6, 6, 6, GETDATE(), N'Chưa thanh toán', 0),
  (3500000, 7, 7, 7, 7, GETDATE(), N'Đã thanh toán', 0),
  (4200000, 8, 8, 8, 8, GETDATE(), N'Đã thanh toán', 0),
  (5000000, 9, 9, 9, 9, GETDATE(), N'Chưa thanh toán', 0),
  (1800000, 10, 10, 10, 10, GETDATE(), N'Đã thanh toán', 0);
  
  INSERT INTO [dbo].[HoaDonChiTiet]
           ([IDSPCT]
           ,[IDHoaDon]
           ,[SoLuong]
           ,[GiaTien]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (1, 1, 2, 500000, GETDATE(), N'Đã giao hàng', 0),
  (2, 1, 1, 1000000, GETDATE(), N'Đã giao hàng', 0),
  (3, 2, 3, 800000, GETDATE(), N'Chưa giao hàng', 0),
  (4, 2, 1, 1200000, GETDATE(), N'Chưa giao hàng', 0),
  (5, 3, 2, 700000, GETDATE(), N'Đã giao hàng', 0),
  (6, 3, 1, 1100000, GETDATE(), N'Đã giao hàng', 0),
  (7, 4, 2, 1600000, GETDATE(), N'Chưa giao hàng', 0),
  (8, 4, 3, 1600000, GETDATE(), N'Chưa giao hàng', 0),
  (9, 5, 1, 1000000, GETDATE(), N'Đã giao hàng', 0),
  (10, 5, 2, 800000, GETDATE(), N'Đã giao hàng', 0);
  
  INSERT INTO [dbo].[LichSuGiaoDich]
           ([IDHoaDon]
           ,[NgayTao]
           ,[TrangThai]
           ,[AnSP])
     VALUES
  (1, GETDATE(), N'Đã hoàn thành', 0),
  (2, GETDATE(), N'Đang xử lý', 0),
  (3, GETDATE(), N'Chưa xác nhận', 0),
  (4, GETDATE(), N'Đang xử lý', 0),
  (5, GETDATE(), N'Đã hoàn thành', 0),
  (6, GETDATE(), N'Đã hoàn thành', 0),
  (7, GETDATE(), N'Chưa xác nhận', 0),
  (8, GETDATE(), N'Đã hoàn thành', 0),
  (9, GETDATE(), N'Đang xử lý', 0),
  (10, GETDATE(), N'Đã hoàn thành', 0);

