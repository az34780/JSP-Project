<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html> 
 
<html>
<head>
	<title>JSP/Servlet Example</title>  
	<style >
	body{
	
		background-image:url("images.jpg");
		bacground-repeat:no-repeat;
		background-attachment:fixed;
	
	}
	input{
		border:green 2pt dashed;/*색,크기,태두리모양*/
		color:red; /*입력창 글씨색*/
		font-size:30px;
		background-color:gold;
	}
	

	</style>
	<script>
	function gofunc(){
		alert("Hello JavaScript");
		
	}
	
	</script>
</head>
<body>
<h1>request test</h1>
<hr>

<form action="TestServlet" onsubmit="return gofunc()"><!--서브밑버튼을 눌럿을 때 gofunc() 함수 호출-->
	  <label for="name">이름:</label><input type="text" id="name" name="name"><br><!--for="name"과 id가 같아야함 -->
      <label for="pwd">비밀번호:</label><input type="password" id="pwd"><br>
      <input type="radio" name="gender" value="남자">남자  
      <input type="radio" name="gender" value="여자">여자<br> 
  
  	  <input type="checkbox" name="hobby" value="축구">축구
  	  <input type="checkbox" name="hobby" value="야구">야구
  	  <input type="checkbox" name="hobby" value="농구">농구<br>
  	
  	
        <input type="color" name="mycolor"><br>
    이메일:<input type="email"  name="myEmail"><br>
    <select name="subgect">
    	<option value="java">JAVA</option>
    	<option value="jsp">JSP</option>
    	<option value="html">HTML</option>
    </select>   
    
    <textarea rows="20" cols="50" name="txt"></textarea> <br>   
    <input type="submit" value="서버로 제출">
 </form>

</body>
</html>
     

