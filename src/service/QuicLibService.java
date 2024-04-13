package service;

import javax.swing.JTable;

public interface QuicLibService {

    void setTableQuicLib(JTable tabelLib);

    void tableHandling();

    void loadData(String keywords, String cbxStatus);

    void showQuicLib(String keywords, String cbxStatus);

    void addQuicLib(Integer isbn, String judul, String genre, Integer jumlah_halaman, boolean status);

    void removeQuicLib(int isbn);

    void changeQuicLib(Integer isbn, String judul);

    
}
