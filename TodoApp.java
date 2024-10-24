import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public ArrayList<Book> danhsach;

    public TodoApp(){
        danhsach = new ArrayList();
    }

    public void themSach(String tenSach){
        Book sach = new Book(tenSach);
        danhsach.add(sach);
        System.out.println("Da them sach: " + tenSach);
    }

    public void danhdauSach(int vitri){
        if(vitri >= 0 && vitri < danhsach.size()){
            Book sach = danhsach.get(vitri);
            sach.danhdauSach();
            System.out.println("Sach: " + sach.getTensach() + " da duoc danh dau");
        }
        else{
            System.out.println("Vi tri khong hop le");
        }
    }

    public void xoaSach(int vitri){
        if(vitri >= 0 && vitri < danhsach.size()){
            Book sach = danhsach.remove(vitri);
            System.out.println("Sach: " + sach.getTensach() + " da duoc xoa");
        }
    }
    public void hienthids(){
        if(danhsach.isEmpty()){
            System.out.println("Khong co cuon sach nao");
        }
        else{
            System.out.println("Danh sach cac cuon sach: ");
            for (int i = 0; i < danhsach.size(); i++) {
                System.out.println((i+1) + ". " + danhsach.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoApp todoApp = new TodoApp();
        while(true) {
            System.out.println("1. Them sach");
            System.out.println("2. Danh dau sach");
            System.out.println("3. Xoa sach");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten sach: ");
                    String tenSach = sc.nextLine();
                    todoApp.themSach(tenSach);
                    break;
                case 2:
                    System.out.println("Nhap vi tri sach can danh dau: ");
                    int vt = sc.nextInt();
                    todoApp.danhdauSach(vt);
                    break;
                case 3:
                    System.out.println("Nhap vi tri sach can xoa: ");
                    int vtri = sc.nextInt();
                    todoApp.xoaSach(vtri);
                    break;
                case 4:
                    System.out.println("Danh sach hien thi: ");
                    todoApp.hienthids();
                    break;
                case 5:
                    System.out.println("Thoat ung dung");
                    sc.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }

    }
}
