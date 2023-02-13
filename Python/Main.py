from Mahasiswa import Mahasiswa

# deklarasi objek
detail = Mahasiswa()

# deklarasi array
temp = []

# loop menu
while True:
    
    # input menu
    print("========== Menu ============")
    print("1)Add -- 2)Delete -- 3)Update")
    print ("Masukkan pilihan menu :")
    menu = int(input())
    
    if menu == 1:
        # add data
        
        # input banyaknya data
        print ("Masukkan banyaknya data yang ingin dimasukkan :")
        n = int(input())
        
        # isi data
        print ("Masukkan isi data :")
        for i in range (n):
            name = str(input())
            nim = int(input())
            studi = str(input())
            fakultas = str(input())
            
            # masukkan data ke dalam array
            temp.append((Mahasiswa(name,nim,studi,fakultas)))
            
    elif menu == 2:
        # delete data
        
        # input index
        print ("Masukkan index data yang ingin dihapus :")
        n = int(input())
        
        # cek index
        if n > len(temp):
            # jika index salah
            print("Index tidak ditemukan!!\n")
        else :
            # hapus data
            temp.pop(n-1)
            
    elif menu == 3:
        # update data
        
        # input index
        print ("Masukkan index data yang ingin diupdate :")
        n = int(input())
        
        # cek index
        if n > len(temp):
            # jika index salah
            print("Index tidak ditemukan!!\n")
        else :
            # update data
            
            # masukkab data update
            print ("Masukkan data yang ingin diupdate :")
            name = str(input())
            nim = int(input())
            studi = str(input())
            fakultas = str(input())
            
            # loop cari index yang sesuai input
            i = 0
            for Mahasiswa in temp:
                if i == n-1:
                    # jika ketemu, update datanya
                    Mahasiswa.setName(name)
                    Mahasiswa.setNim(nim)
                    Mahasiswa.setStudi(studi)
                    Mahasiswa.setFakultas(fakultas)
                i += 1
    else:
        # jika input menu salah
        print("Menu yang anda masukkan salah!\n")
    
    if len(temp) == 0:
        # jika isi array kosong
        print("Data Kosong atau tidak ada!!\n")
    else :
        # print data
        print("\n============ Data Mahasiswa ============")
        i = 0
        for Mahasiswa in temp:
            print(str(i+1) + ") ", Mahasiswa.getName(), Mahasiswa.getNim(), Mahasiswa.getStudi(), Mahasiswa.getFakultas())
            i += 1
    
    # input dan cek pilihan menu
    print("\nKetik 't' untuk lanjut atau ketik apa saja untuk keluar menu!.")
    cekMenu = str(input())
    if cekMenu != 't':
        break
    