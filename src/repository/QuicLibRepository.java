package repository;

import java.util.ArrayList;
import entity.QuicLib;


public interface QuicLibRepository {

    ArrayList<QuicLib> getAll(String keywords, String status);

    boolean add(QuicLib quicLib);

    boolean remove(Integer isbn);

    boolean change(int isbn, String Judul);

    ArrayList<QuicLib> search(ArrayList<QuicLib> quicLibList, String keywords);

    QuicLib getQuicLibISBN(Integer isbn);
}
