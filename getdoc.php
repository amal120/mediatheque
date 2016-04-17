
<?php
$host = "localhost";
$user = "root";
$pass = "";
$db = "mediaDB";

$con = mysqli_connect($host,$user,$pass,$db);
$query = "select * from document;";

$result = mysqli_query($con,$query);
$response = array();

while($row = mysqli_fetch_array($result))
{
      array_push($response,array('code'=>$row[0],'titre'=>$row[1],'auteur'=>$row[2],'type'=>$row[3]));
}

mysqli_close($con);
echo json_encode(array('server_response'=>$response));