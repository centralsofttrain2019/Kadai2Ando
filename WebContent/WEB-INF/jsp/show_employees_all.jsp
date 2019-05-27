
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="jp.co.central_soft.train2019.bean.ShowEmployeesAllBean" scope="request" />
<!DOCTYPE html>

<html>

<head>
  <meta charset="UTF-8">
  <title>全従業員表示画面 - 課題2</title>
  <style>
    p, pre, h1, h2, h3, h4, h5, h6 {
      color: hsl(0, 0%, 10%);
    }
    p {
      font-size: 90%;
    }
    h1 {
      font-size: 170%;
    }
    th, td {
      font-size: 80%;
    }
  </style>
</head>

<body>
  <article>
    <h1>従業員情報</h1>
    <table>
      <tr>
        <th>ID</th>
        <th>名前</th>
        <th>Email</th>
        <th>身長</th>
        <th>体重</th>
        <th>雇用開始年</th>
        <th>誕生日</th>
        <th>血液型</th>
      </tr>
      <%
        for(jp.co.central_soft.train2019.bean.EmployeeBean emp: bean.getList()) {
      %>
      <tr>
        <td><%=emp.getEmployeeID() %></td>
        <td><%=emp.getEmployeeName() %></td>
        <td><%=emp.getEMail() %></td>
        <td><%=emp.getHeight() %></td>
        <td><%=emp.getWeight() %></td>
        <td><%=emp.getHireFiscalYear() %></td>
        <td><%=emp.getBirthday() %></td>
        <td><%=emp.getBloodType() %></td>
      </tr>
      <% } %>
    </table>
  </article>
</body>

</html>

