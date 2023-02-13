<?php

require('Mahasiswa.php');

$detail = new Mahasiswa('Adit', 2000360, 'Ilmu Komputer', 'FPMIPA');
$detail2 = new Mahasiswa('Tama', 2000365, 'Matematika', 'FPMIPA');

echo "========================== Data Mahasiswa ===========================" . "<br/>";
$detail->printMhs();
$detail2->printMhs();
