class Mahasiswa:
    
    # atribut privat
    __name = ""
    __nim = 0
    __studi = ""
    __fakultas = ""
    
    # contsructor
    def __init__(self, name="", nim="", studi="", fakultas=""):
        self.__name = name
        self.__nim = nim 
        self.__studi = studi
        self.__fakultas = fakultas
    
    # getter
    def getName(self):
        return self.__name
    
    def getNim(self):
        return self.__nim
    
    def getStudi(self):
        return self.__studi
    
    def getFakultas(self):
        return self.__fakultas
    
    # setter
    def setName(self, name):
        self.__name = name

    def setNim(self, nim):
        self.__nim = nim
    
    def setStudi(self, studi):
        self.__studi = studi
    
    def setFakultas(self, fakultas):
        self.__fakultas = fakultas
    