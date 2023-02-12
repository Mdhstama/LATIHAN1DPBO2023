#include <iostream>
#include <string>

using namespace std;

class Mahasiswa {

    // atribut privat
    private:
        string name;
        int nim;
        string studi;
        string fakultas;
    
    // constructor
    public:
        Mahasiswa(){
            this->name = "";
            this->nim = 0;
            this->studi = "";
            this->fakultas = "";
        }

        Mahasiswa(string name, int nim, string studi, string fakultas){
            this->name = name;
            this->nim = nim;
            this->studi = studi;
            this->fakultas = fakultas;
        }

    // getter
    string getName()
    {
        return this->name;
    }
    int getNim()
    {
        return this->nim;
    }
    string getStudi()
    {
        return this->studi;
    }
    string getFakultas()
    {
        return this->fakultas;
    }

    // setter
    void setName(string name)
    {
        this->name = name;
    }
    void setNim(int nim)
    {
        this->nim = nim;
    }
    void setStudi(string studi)
    {
        this->studi = studi;
    }
    void setFakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }
};



