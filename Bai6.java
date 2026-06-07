import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;
    private static int auto_id = 1;

    public Product() {
        this.id = auto_id++;
    }

    public void input(Scanner sc) {
        System.out.print("Nhập tên sản phẩm: ");
        this.name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        this.price = Double.parseDouble(sc.nextLine());
    }

    public void print() {
        System.out.println("------------------");
        System.out.printf("Mã sản phẩm: %d\n", this.id);
        System.out.printf("Tên sản phẩm: %s\n", this.name);
        System.out.printf("Giá của sản phẩm: %.1f\n", this.price);
    }

    public double getPrice() {
        return Double.parseDouble(String.format("%.1f", this.price));
    }

    public static int getTotalProduct(){
        return auto_id;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======== MENU SẢN PHẨM ==========");
            System.out.println("1. Thêm sản phẩm mới. ");
            System.out.println("2. In danh sách sản phẩm. ");
            System.out.println("3. Tìm sản phẩm theo khoảng giá. ");
            System.out.println("4. Thống kê số sản phẩm đã tạo. ");
            System.out.println("0. Thoát. ");
            System.out.println("Lựa chọn của bạn: ");
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    Product product = new Product();
                    product.input(sc);
                    list.addLast(product);
                    break;
                case "2":
                    System.out.println("Danh sách sản phẩm: ");
                    for (var x : list) {
                        x.print();
                    }
                    break;
                case "3":
                    System.out.println("Biểu thị giá. ");
                    System.out.println("1. Trên 10 triệu. ");
                    System.out.println("2. Từ 5 triệu đến 10 triệu. ");
                    System.out.println("3. Từ 1 triệu đến 5 triệu. ");
                    System.out.println("4. Dưới 1 triệu. ");
                    System.out.println("Chọn giá: ");
                    switch(option){
                        case "1":
                            for(var x : list){
                                if(x.getPrice() > 10000000){
                                    x.print();
                                }
                            }
                            break;
                        case "2":
                            for(var x : list){
                                if(x.getPrice() > 5000000 && x.getPrice() <= 10000000){
                                    x.print();
                                }
                            }
                            break;
                        case "3":
                            for(var x : list){
                                if(x.getPrice() >1000000 && x.getPrice() <= 5000000){
                                    x.print();
                                }
                            }
                            break;
                        case "4":
                            for(var x : list){
                                if(x.getPrice() <= 1000000){
                                    x.print();
                                }
                            }
                            break;
                    }
                    break;
                case "4":
                    System.out.printf("Số lượng sản phẩm đã tạo: %d", Product.getTotalProduct());
                    break;
                case "0":
                    System.out.println("Tạm biệt");
                    System.exit(0);
                    break;
            }
        }
    }
}
