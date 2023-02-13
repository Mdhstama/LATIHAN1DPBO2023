<?php

class Mahasiswa
{
    // atribut private
    private $name = '';
    private $nim = 0;
    private $studi = '';
    private $fakultas = '';

    // construct
    public function __construct($name = '', $nim = 0, $studi = '', $fakultas = '')
    {
        $this->name = $name;
        $this->nim = $nim;
        $this->studi = $studi;
        $this->fakultas = $fakultas;
    }

    //setter
    public function setName($name)
    {
        $this->name = $name;
    }
    public function setNim($nim)
    {
        $this->nim = $nim;
    }
    public function setStudi($studi)
    {
        $this->studi = $studi;
    }
    public function setFakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }

    //getter
    public function getName()
    {
        return $this->name;
    }
    public function getNim()
    {
        return $this->nim;
    }
    public function getStudi()
    {
        return $this->studi;
    }
    public function getFakultas()
    {
        return $this->fakultas;
    }

    //print
    function printMhs()
    {
        echo "Nama :" . $this->getName() . " -- NIM :" . $this->getNim() . " -- Studi :" . $this->getStudi() . " -- Fakultas :" . $this->getFakultas() . "<br/>";
    }
}
