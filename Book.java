public class Book {
    private String tensach;
    private boolean hoanthanh;

    public Book(String tensach) {
        this.tensach = tensach;
        this.hoanthanh = false;
    }

    public void danhdauSach(){
        this.hoanthanh = true;
    }

    public String getTensach() {
        return this.tensach;
    }

    public boolean isHoanthanh() {
        return this.hoanthanh;
    }

    @Override
    public String toString() {
        return tensach + " - " + (hoanthanh ? "da doc xong" : "chua doc xong");
    }
}
