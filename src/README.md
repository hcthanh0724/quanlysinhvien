Trong Java, từ khóa static được sử dụng để chỉ ra rằng một trường (field) 
hoặc phương thức (method) thuộc về lớp (class), 
chứ không phải thuộc về đối tượng (object) của lớp đó. 
Điều này có nghĩa là khi một trường hay phương thức được khai báo là static, 
nó có thể được truy cập mà không cần phải tạo ra một đối tượng của lớp đó.

Các tính năng chính của từ khóa static trong Java bao gồm:

Biến (trường) static: một biến static là một biến thuộc về lớp, 
không phải thuộc về một đối tượng cụ thể của lớp đó. 
Một biến static có thể được truy cập trực tiếp từ tên lớp, 
và các đối tượng của lớp đó sẽ chia sẻ cùng một bản sao của biến static này.

Phương thức static: một phương thức static là một phương thức của lớp, 
không phải của một đối tượng cụ thể của lớp đó. 
Một phương thức static có thể được gọi trực tiếp từ tên lớp, 
và không cần phải tạo ra một đối tượng của lớp đó.

Tham trị (pass by value): Khi truyền một biến vào một phương thức, 
giá trị của biến được sao chép vào một tham số mới trong phương thức. 
Bất kỳ thay đổi nào được thực hiện trên tham số này không ảnh hưởng đến giá trị của biến ban đầu. 
Vì vậy, các biến nguyên thủy (primitive types) như int, float, double, boolean... được truyền theo kiểu tham trị.

Tham chiếu (pass by reference): Khi truyền một đối tượng (object) vào một phương thức, 
một tham chiếu đến đối tượng đó được sao chép vào một tham số mới trong phương thức. 
Bất kỳ thay đổi nào được thực hiện trên tham số này sẽ ảnh hưởng đến đối tượng gốc, 
vì tham số và đối tượng gốc đều trỏ đến cùng một vùng nhớ. 
Vì vậy, các biến đối tượng (object reference) được truyền theo kiểu tham chiếu.