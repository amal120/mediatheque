<?php
require "init.php";
$login=$_POST["login_name"];
$password=$_POST["login_pass"];

$sql_query = "select name from etudiant where login like '$login' and password like '$password';";

$result = mysqli_query($con,$sql_query);

if(mysqli_num_rows($result) >0 )
{
$row = mysqli_fetch_assoc($result);
$name = $row["name"];
echo "Login Success....Welcome".$name;

}
else
{
echo "Login Failed....Try Again..";

}