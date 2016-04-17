<?php
require "init.php";
$mat_etud =$_POST["mat_etud"];
$dateRes =$_POST["dateRes"];
$heureRes =$_POST["heureRes"];


$sql_query = "insert into reservationp values('$dateRes','$heureRes','$mat_etud');";

if(mysqli_query($con,$sql_query))
{
//echo "<h3> Data Insertion Success...</h3>";
}
else
{
//echo "Data insertion error..".mysqli_error($con);
}




?>
