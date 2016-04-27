<?php
require "init.php";
$matriculet =$_POST["matriculet"];
$dateEmprunt =$_POST["dateEmprunt"];
$titreD =$_POST["titreD"];


$sql_query = "insert into reservationd values('$matriculet','$dateEmprunt','$titreD');";

if(mysqli_query($con,$sql_query))
{
//echo "<h3> Data Insertion Success...</h3>";
}
else
{
//echo "Data insertion error..".mysqli_error($con);
}




?>
