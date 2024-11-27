create database NhacCuDiTan
use NhacCuDiTan
	go
	create table Category
	(
		id nvarchar(15) primary key,
		name nvarchar(50)
	)
	INSERT INTO Category (id, name) VALUES 
	('C001', N'Guitar Điện'),
	('C002', N'Guitar Accoustic'),
	('C003', N'Guitar Classic'),
	('C004', N'Piano điện'),
	('C005', N'Piano Cơ');
go
	CREATE TABLE Product (
		id INT PRIMARY KEY IDENTITY(1,1),
		name NVARCHAR(255) NOT NULL,
		image NVARCHAR(255),
		price DECIMAL(18, 2) NOT NULL,
		available BIT DEFAULT 1,
		Date DATE DEFAULT GETDATE(),
		description NVARCHAR(MAX) DEFAULT '',
		brand NVARCHAR(30) not null,
		category_id NVARCHAR(15),
		FOREIGN KEY (category_id) REFERENCES Category(id)
	);
	SELECT * FROM product 
INSERT INTO Product (name, image, price, description, brand, category_id) 
VALUES
(N'KAWAI K-15E', 'piano_co_1', 82000000, N'Đàn piano Kawai K-15E là sản phẩm tuyệt hảo để đưa khách hàng vào dòng sản phẩm K-Series cao cấp của KAWAI PIANO', N'Kawai', 'C005'),
(N'Kawai K-300', 'piano_co_2', 182000000, N'Piano Kawai K-300 được thiết kế dựa trên những thành công của K3 – cây đàn piano từng đạt giải thưởng Piano Acoustic của năm do MMR bình chọn trong 4 năm liên', N'Kawai', 'C005'),
(N'Kawai K-800', 'piano_co_3', 285000000, N'Đàn piano Kawai K800 được biết đến là cây đàn cao cấp trong dòng K series của hãng Kawai, có thiết kế kiểu dáng thanh lịch, âm điệu chuẩn piano acoustic đáp ứng đầy đủ ch', N'Kawai', 'C005'),
(N'Kawai GL-10', 'piano_co_4', 295000000, N'Đàn Piano Kawai GL-10 là sản phẩm đàn piano mới trong đại gia đình piano Kawai. Piano Kawai GL-10 thuộc dòng "baby grand" được sản xuất và', N'Kawai', 'C005'),
(N'KAWAI GL-30', 'piano_co_5', 409000000, N'Sự hoạt động ổn định trong khoảng thời gian dài của độ cảm ứng phím chỉ có thể đạt được bằng việc đạt đến một thiết kế thông minh cùng những phương pháp và vật liệu tiên', N'Kawai', 'C005');

INSERT INTO Product (name, image, price, description,brand, category_id ) VALUES
(N'Taylor Academy A10E', 'taylor1.jpg', 22450000, N'Có được tất cả các tính năng tuyệt vời của một chiếc dreanought cao cấp trong seri Academy của Taylor.', N'TayLor','C002'),
(N'Taylor 114CE-S', 'taylor2.jpg', 20990000, N'Đàn guitar Taylor 114CE-S là cây đàn guitar thuộc thương hiệu Taylor và phiên bản Sapele là bản Limited của năm 2023. Đàn Guitar Taylor 114CE-S tương tự Guitar Taylor Series 200, Ser.', N'TayLor', 'C002'),
(N'Taylor 110CE-S', 'taylor3.jpg', 20990000, N'Taylor 110CE-S  là một trong những cây guitar tốt nhất bạn sẽ tìm thấy, phù hợp với túi tiền của mình, đặc biệt với sự tích hợp của pickup Taylor ® ES-2. Taylor 110CE-S thực sự là sự lựa c', N'TayLor', 'C002'),
(N'Taylor 114E', 'taylor4.jpg', 20990000, N'Đàn Guitar Taylor 114E tương tự Series 200, Series 100 cung cấp khả năng phục hồi trong điều kiện khí hậu biến đổi, và cần đàn hẹp hơn m',  N'TayLor','C002'),
(N'Taylor 310CE', 'taylor5.jpg', 60530000, N'Hình dạng  Dreadnought  Khung: Forward Shifted với Relief Rout  Loại gỗ: Sapele  Đường cắt: phong cách Venice  Điện tử:',  N'TayLor','C002'),
(N'Taylor Academy A12E', 'taylor6.jpg', 22450000, N'Chiếc Grand Concert acoustic tuyệt vời từ seri Academy của Taylor. Thân đàn nhỏ gọn dễ chịu thích hợp với lối chơi fingerpic',  N'TayLor','C002')
INSERT INTO Product (name, image, price, description,brand, category_id ) VALUES
(N'Taylor PS14ce, Macassar', 'taylor7.jpg', 355050000, N'Chắc chắn không thể thiếu là cấu trúc nang đàn V-class (V-Class Bracing) độc quyền của Taylor. Được phủ lớp sơn bóng. Taylor Pickup ES-2. Phần tay armrest c', N'TayLor','C002'),
(N'Taylor K24ce', 'taylor8.jpg', 146000000, N'TAYLOR K24ce mang Vẻ đẹp quyến rũ của chất gỗ Koa vùng Hawaii được kết hợp bởi giai', N'TayLor', 'C002')