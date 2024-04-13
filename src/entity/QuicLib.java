package entity;

public class QuicLib {

    private int isbn;
    private String judul;
    private String genre;
    private int jumlahhalaman;
    private boolean status;

    public QuicLib(Integer isbn, String judul, String genre, Integer jumlahhalaman, boolean status) {
        this.isbn = isbn;
        this.judul = judul;
        this.genre = genre;
        this.jumlahhalaman = jumlahhalaman;
        this.status = status;
    }

    public QuicLib() {

    }

    public int getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public int getJumlahHalaman() {
        return jumlahhalaman;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String isGenre() {
        return genre;
    }

}
