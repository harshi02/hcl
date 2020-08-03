<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "bank";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>

<h1>Retrieve data from database in jsp</h1>
<table border="1">
<tr>
<td>acc_no</td>
<td>name</td>
<td>City name</td>
<td>balance</td>
<td>Transfer_type</td>
<td>amount</td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from account";
resultSet = statement.executeQuery(sql);
		String num;
		long balance = 0;

        do {

            
            long amount;
			acc_id =resultSet.getString("acc_no"); 
			num = resultSet.getString("transfer_type");
			                amount = resultSet.getString("amount");
			
			if (num == "Deposit" ) {

                // Add the amount to the balance
                balance += amount;
               sql= "UPDATE account SET balance = balance WHERE acc_no=acco_id";
            } else if (num == "Withdrawal") {

                amount = scan.nextLong();

                // Remove the amount from the balance
                balance -= amount;
                sql= "UPDATE account SET balance = balance WHERE acc_no=acco_id";

            } else if (num == "Balance") {


                sql="select balance from account";

            }

        } while (num != "null");
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("acc_no") %></td>
<td><%=resultSet.getString("Name") %></td>
<td><%=resultSet.getString("Location") %></td>
<td><%=resultSet.getString("balance") %></td>
<td><%=resultSet.getString("transfer_type") %></td>
<td><%=resultSet.getString("amount") %></td>
</tr>
<%

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>