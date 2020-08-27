<?php

    require_once 'Account.php';
    require_once 'Car.php';

    $car = new Car("GAN301", new Account("Dilan Ariza", "1000133806"));
    print_r($car);
    print_r($car->driver);
