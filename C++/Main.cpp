#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

using namespace std;

int main()
{
    // deklarasi objek
    Mahasiswa detail;

    // inisialisasi dan deklarasi variabel
    int n, cek, menu = 0;
    string name, studi, fakultas, cekMenu;
    int nim, nimcheck, index;

    // deklarasi objek list
    list<Mahasiswa> myList;

    // loop menu
    do
    {
        // pilihan menu
        cout << "\n========== Menu ===========" << '\n';
        cout << "1)Add -- 2)Delete -- 3)Update" << '\n';
        cout << "Masukkan pilihan menu : " << "";
        cin >> menu;

        if (menu == 1)
        {
            // menu add data

            // input jumlah dan isi data
            cout << "Masukkan banyaknya data : " << "";
            cin >> n;
            cout << "Masukkan data yang dimaksud (Nama--Nim--ProgramStudi--Fakultas)" << '\n';
            for (int i = 0; i < n; i++)
            {
                cin >> name >> nim >> studi >> fakultas;

                Mahasiswa detail;
                detail.setName(name);
                detail.setNim(nim);
                detail.setStudi(studi);
                detail.setFakultas(fakultas);

                //masukkan data ke dalam list
                myList.push_back(detail);
            }
        }
        else if (menu == 2)
        {
            // menu delete data

            // input index yang ingin dihapus
            cout << "Masukkan index data yang ingin dihapus : " << "";
            cin >> index;

            // cek index sesuai ukuran list
            if (index > myList.size()){
                // jika index tidak ditemukan
                cout << "Data tidak ditemukan!" << '\n';
            } else {
                // cari index yang sesuai input
                list<Mahasiswa>::iterator it = myList.begin();
                advance(it, (index-1));

                // hapus list sesuai index inputan
                myList.erase(it);
            }
        }
        else if (menu == 3)
        {
            // menu update data

            // masukkan index yang ingin di update
            cout << "Masukkan index data yang ingin di update" << '\n';
            cin >> index;

            // cek index sesuai ukuran list
            if (index > myList.size()){
                // jika index tidak ditemukan
                cout << "Data tidak ditemukan!" << '\n';
            } else {
                // cari index yang sesuai input
                list<Mahasiswa>::iterator it = myList.begin();
                advance(it, (index-1));
                
                // input data update
                cin >> name >> nim >> studi >> fakultas;

                // massukan data update
                it -> setName(name);
                it -> setNim(nim);
                it -> setStudi(studi);
                it -> setFakultas(fakultas);
            }
        }
        else
        {
            cout << "Menu tidak ada!" << '\n';
        }

    // print isi list
    cout << "\n====== Data Mahasiswa ======" << '\n';
    int i = 0;
    if (myList.size() == 0){
        // jika list kosong
        cout << "List masih kosong!!" << '\n';
    } else {
        // jika list ada
        for(list<Mahasiswa>::iterator it = myList.begin(); it != myList.end(); it++)
        {
            cout << (i + 1) << ") " << it->getName() << " -- " << it->getNim() << " -- " << it->getStudi() << " -- " << it->getFakultas() << '\n';
            i++;
        }
    }
    
    // input menu
    cout << "\nKetik 't' lanjut atau ketik apa saja jika ingin keluar dari menu : " << "";
    cin >> cekMenu;
    } while (cekMenu == "t");
}

/* 
Add :
3
Adit
2000360
Ilmu_Komputer
FPMIPA
Fahreza
2000455
Teknik_Elektro
FPTK
Hawwa
2000563
DKV
FPSD

Update :
Fikri
2000223
Sastra_Jepang
FPBS
*/ 