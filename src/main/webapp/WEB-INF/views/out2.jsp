<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<!-- Model 방식과 ModelAndView 방식의 출력
<h1 style="text-align: center;">
${message}<br>
</h1>
<table border="1" width="600px" align="center">
  <tr>
  <th>이름</th> <th>나이</th> <th>전화번호</th>
   <th>국어</th> <th>영어</th> <th>수학</th><th>총점</th>
  </tr> 

  <tr>
  <td>${list.name }</td>
  <td>${list.age }</td>
  <td>${list.phone }</td>
  <td>${list.kor }</td>
  <td>${list.eng }</td>
  <td>${list.mat }</td>
   <td>${list.tot }</td>
  
  </tr>

</table>
 -->
 <h1>Command 전달방식</h1>
 <table border="1" width="600px" align="center">
  <tr>
  <th>이름</th> <th>나이</th> <th>전화번호</th>
   <th>국어</th> <th>영어</th> <th>수학</th><th>총점</th>
  </tr> 

  <tr>
  <td>${scoreDTO.name }</td>
  <td>${scoreDTO.age }</td>
  <td>${scoreDTO.phone }</td>
  <td>${scoreDTO.kor }</td>
  <td>${scoreDTO.eng }</td>
  <td>${scoreDTO.mat }</td>
   <td>${scoreDTO.kor+scoreDTO.eng+scoreDTO.mat }</td>
  
  </tr>

</table>
</body>
</html>