package service;

import java.util.ArrayList;
import entity.QuicLib;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import utils.ButtonEditor;
import repository.QuicLibRepository;

public class QuicLibServiceImpl implements QuicLibService {

    private final QuicLibRepository quicLibRepository;
    private JTable tabelLib;
    private boolean archived = false;

    public QuicLibServiceImpl(QuicLibRepository quicLibRepository) {
        this.quicLibRepository = quicLibRepository;
    }

    @Override
    public void setTableQuicLib(JTable tableLib) {
        this.tabelLib = tableLib;
        showQuicLib("", "");
    }

    @Override
    public void tableHandling() {

        try {
            JTable tabelLib = this.tabelLib;
            tabelLib.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(new JTextField()) {
                @Override
                public boolean isCellEditable(EventObject anEvent) {
                    return false;
                }
            });

            {
                // Menambahkan JComboBox cbxStatus ke kolom "status" di posisi ke-3
                JComboBox<String> cbxStatus = new JComboBox<>();
                cbxStatus.addItem("Diarsipkan");
                cbxStatus.addItem("Belum Diarsipkan");
                tabelLib.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(cbxStatus));

                // Menambahkan ActionListener untuk cbxStatus
                cbxStatus.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int row = tabelLib.getSelectedRow();
                        int column = tabelLib.getSelectedColumn();
                        if (row >= 0 && column == 4) {
                            JComboBox<String> combo = (JComboBox<String>) e.getSource();
                            String selectedValue = (String) combo.getSelectedItem();
                            tabelLib.setValueAt(selectedValue, row, column);

                            // Panggil metode yang sesuai saat nilai cbxStatus diubah
                            //changeStatus((Integer) tabelLib.getValueAt(row, 0), selectedValue.equals("Sudah Dibaca"));
                            System.out.println("" + selectedValue);
                        }
                    }
                });

                // Membuat Button untuk kolom di JTable
                {
                    // Membuat Button Editor untuk ditambahkan ke kolom JTabel
                    ButtonEditor btnDeleteEditor = new ButtonEditor(new JCheckBox());
                    // Menambahkan ActionListener ke Button yang ada di Button Editor
                    btnDeleteEditor.button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int row = tabelLib.getSelectedRow();
                            int column = tabelLib.getSelectedColumn();
                            DefaultTableModel model = (DefaultTableModel) tabelLib.getModel();

                            if (row >= 0 && column == 5) {
                                int quicLibIsbn = (int) model.getValueAt(row, 0);
                                removeQuicLib(quicLibIsbn);
                                model.removeRow(row);
                            }

                        }
                    });
                    // Menambahkan Button Editor ke JTable
                    tabelLib.getColumnModel().getColumn(5).setCellRenderer(new utils.ButtonRenderer());
                    tabelLib.getColumnModel().getColumn(5).setCellEditor(btnDeleteEditor);
                }

                // Menambahkan CellEditorListener untuk menangkap perubahan pada kolom di JTable
                tabelLib.getDefaultEditor(String.class).addCellEditorListener(new CellEditorListener() {
                    @Override
                    public void editingStopped(ChangeEvent e) {
                        int row = tabelLib.getSelectedRow();
                        int column = tabelLib.getSelectedColumn();
                        String selectedValue = tabelLib.getValueAt(row, column).toString();
                        System.out.println("Cell di baris " + row + ", kolom " + column + " diubah menjadi: " + selectedValue);

                    }

                    @Override
                    public void editingCanceled(ChangeEvent e) {
                        // aksi jika pengiditan dibatalkan
                    }
                });
            }
        } catch (Error | Exception e) {

        }
    }

    @Override
     public void loadData(String keywords, String cbxStatus) {
        JTable tabelLib = this.tabelLib;
        String status = "";
        if (cbxStatus == null) {
            status = "";
        }
        ArrayList<QuicLib> model = quicLibRepository.getAll(keywords, status);
        DefaultTableModel tableModel = new DefaultTableModel(null, new Object[]{"ISBN", "JUDUL", "GENRE", "JUMLAH HALAMAN", "STATUS", "AKSI"
            + ""}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }
        };

        tabelLib.setModel(tableModel);
        tabelLib.setCellSelectionEnabled(false);
        tabelLib.setRowSelectionAllowed(true);
        tabelLib.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelLib.setRowHeight(40);

        TableColumnModel columnModel = tabelLib.getColumnModel();

        TableColumn columnIsbn = columnModel.getColumn(0);
        columnIsbn.setPreferredWidth(150);

        TableColumn columnJudul = columnModel.getColumn(1);
        columnJudul.setPreferredWidth(150);

        TableColumn columnGenre = columnModel.getColumn(2);
        columnGenre.setPreferredWidth(150);

        TableColumn columnJumlahHalaman = columnModel.getColumn(3);
        columnJumlahHalaman.setPreferredWidth(150);

        TableColumn columnStatus = columnModel.getColumn(4);
        columnStatus.setPreferredWidth(150);

        TableColumn columnAksi = columnModel.getColumn(5);
        columnAksi.setPreferredWidth(150);

        if (!model.isEmpty()) {
            for (var i = 0; i < model.size(); i++) {
                var quicLib = model.get(i);
                var stat = "Belum Diarsipkan";
                System.out.println(status);
                if (quicLib != null) {
                    if (quicLib.isStatus()) {
                        stat = "Diarsipkan";
                    }
                }

                if (status.equals("Belum Diarsipkan")) {
                    if (keywords != null && !quicLib.isStatus()) {
                        if (quicLib.getJudul().contains(keywords)) {
                            tableModel.addRow(new Object[]{quicLib.getIsbn(), quicLib.getJudul(), quicLib.getGenre(), quicLib.getJumlahHalaman(),  stat, "Hapus"});

                        }
                    } else {
                        tableModel.addRow(new Object[]{quicLib.getIsbn(), quicLib.getJudul(), quicLib.getGenre(), quicLib.getJumlahHalaman(), stat, "Hapus"});

                    }
                } else {
                    if (keywords != null && quicLib.isStatus()) {
                        if (quicLib.getJudul().contains(keywords)) {
                            tableModel.addRow(new Object[]{quicLib.getIsbn(), quicLib.getJudul(), quicLib.getGenre(), quicLib.getJumlahHalaman(), stat, "Hapus"});

                        }
                    } else {
                        tableModel.addRow(new Object[]{quicLib.getIsbn(), quicLib.getJudul(), quicLib.getGenre(), quicLib.getJumlahHalaman(),stat, "Hapus"});

                    }
                }
            }
        }

    }

    @Override
    public void showQuicLib(String keywords, String cbxStatus) {
        loadData(keywords, cbxStatus);
        tableHandling();
    }

    @Override
    public void addQuicLib(Integer isbn, String judul, String genre, Integer jumlah_halaman, boolean status) {
        // Validasi panjang karakter judul minimal 3
        if (judul.length() < 3) {
            System.err.println("GAGAL MENAMBAH MyBook : Panjang karakter judul minimal 3.");
            return;
        }

        QuicLib quicLib = new QuicLib(isbn, judul, genre, jumlah_halaman, status);

        boolean success = quicLibRepository.add(quicLib);

        if (success) {
            System.out.println("SUKSES MENAMBAH MyBook : " + quicLib.getJudul());
        } else {
            System.err.println("GAGAL MENAMBAH MyBook : " + quicLib.getJudul() + ". Terjadi kesalahan saat menambahkan.");
        }

        showQuicLib("", "");
    }

    @Override
    public void removeQuicLib(int Isbn) {
        boolean success = quicLibRepository.remove(Isbn);

        if (success) {
            System.out.println("SUKSES MENGHAPUS MyBook : posisi ke-" + Isbn);
        } else {
            System.out.println("GAGAL MENGHAPUS MyBook : " + Isbn);
        }

    }

 
    @Override
    public void changeQuicLib(Integer isbn, String judul) {
        QuicLib existingQuicLib = quicLibRepository.getQuicLibISBN(isbn);

        if (existingQuicLib != null) {
            existingQuicLib.setJudul(judul);

            boolean result = quicLibRepository.change(isbn, judul);

            if (result) {
                System.out.println("SUKSES MENGUBAH MyBook : posisi ke-" + isbn + " menjadi " + judul);
            } else {
                System.out.println("GAGAL MENGUBAH MyBook : posisi ke-" + isbn + " menjadi " + judul + ". MyBook tidak tersedia.");
            }
        } else {
            System.out.println("MyBook dengan ISBN " + isbn + " tidak ditemukan.");
        }
    }
}
