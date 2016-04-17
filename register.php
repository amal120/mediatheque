<?php
require "init.php";
$matricule =$_POST["matricule"];
$name =$_POST["name"];
$classe =$_POST["classe"];
$login = $_POST["login"];
$password =$_POST["password"];

$sql_query = "insert into etudiant values('$matricule','$name','$classe','$login','$password');";

if(mysqli_query($con,$sql_query))
{
//echo "<h3> Data Insertion Success...</h3>";
}
else
{
//echo "Data insertion error..".mysqli_error($con);
}




?>
