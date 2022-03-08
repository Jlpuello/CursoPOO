<?php
    require_once("car.php");
    require_once("uberX.php");
    require_once("account.php");

    $uberX = new UberX("BPO109", new Account("Jorge Puello", 1051890135), "Chevrolet", "Optra");

    $uberX->printDataCar();
    
?>