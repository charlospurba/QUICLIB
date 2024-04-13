package repository;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.QuicLib;
import utils.DB;

public class QuicLibRepositoryImpl implements QuicLibRepository {

    private final DB db;

    public QuicLibRepositoryImpl() {
        db = new DB();
    }

    @Override
    public ArrayList<QuicLib> getAll(String keywords, String status) {
        String query = "SELECT ISBN, JUDUL, GENRE, JUMLAH_HALAMAN, STATUS FROM MyQuicLib WHERE JUDUL LIKE ?";
        ResultSet resultSet = db.getAllData(query, keywords);
        ArrayList<QuicLib> model = new ArrayList<>();

        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    int isbn = resultSet.getInt("ISBN");
                    String judul = resultSet.getString("JUDUL");
                    String genre = resultSet.getString("GENRE");
                    int jumlah_halaman = resultSet.getInt("JUMLAH_HALAMAN");

                    boolean stat = resultSet.getString("STATUS").equalsIgnoreCase("Diarsipkan");
                    QuicLib quicLib = new QuicLib(isbn, judul, genre, jumlah_halaman, stat);

                    if (status.isEmpty() || status.equalsIgnoreCase("Status")
                            || (status.equalsIgnoreCase("Belum Diarsipkan") && !stat)
                            || (status.equalsIgnoreCase("Diarsipkan") && stat)) {
                        model.add(quicLib);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return model;
    }

    @Override
    public QuicLib getQuicLibISBN(Integer ISBN) {
        QuicLib quicLib = null;
        String query = "SELECT * FROM MyQuicLib WHERE ISBN = ?";
        String[] values = new String[]{String.valueOf(ISBN)};
        ResultSet resultSet = db.get(query, values);

        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    int bookISBN = resultSet.getInt("ISBN");
                    String judul = resultSet.getString("JUDUL");
                    String genre = resultSet.getString("GENRE");
                    int jumlah_halaman = resultSet.getInt("JUMLAH_HALAMAN");
                    boolean status = resultSet.getString("STATUS").equalsIgnoreCase("Diarsipkan");
                    quicLib = new QuicLib(bookISBN, judul, genre, jumlah_halaman, status);
                    break;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return quicLib;
    }

    @Override
    public boolean add(QuicLib quicLib) {
        String query = "INSERT INTO MyQuicLib (ISBN, JUDUL, GENRE,JUMLAH_HALAMAN, STATUS) VALUES (?, ?, ?, ?,?)";

        String status = quicLib.isStatus() ? "Diarsipkan" : "Belum Diarsipkan";
        System.out.println("error");
        String[] values = new String[]{String.valueOf(quicLib.getIsbn()), quicLib.getJudul(), quicLib.getGenre(), String.valueOf(quicLib.getJumlahHalaman()), status};
        return db.update(query, values);
    }

    @Override
    public boolean remove(Integer isbn) {
        String query = "DELETE FROM MyQuicLib WHERE ISBN = ?";
        String[] values = new String[]{String.valueOf(isbn)};
        return db.update(query, values);
    }

    @Override
    public boolean change(int ISBN, String Judul) {
        String query = "UPDATE MyQuicLib SET JUDUL = ? WHERE ISBN = ?";
        String[] values = new String[]{Judul, String.valueOf(ISBN)};
        return db.update(query, values);
    }

    @Override
    public ArrayList<QuicLib> search(ArrayList<QuicLib> model, String keywords) {
        ArrayList<QuicLib> searchResult = new ArrayList<QuicLib>();

        for (QuicLib quicLib : model) {
            if (quicLib.getJudul().contains(keywords)) {
                searchResult.add(quicLib);
            } else {
                searchResult.add(null);
            }
        }

        return searchResult;
    }

}
