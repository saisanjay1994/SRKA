<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Items</title>
</head>
<body>
<h6>Add items</h6><br /><br />
<form name="addItem" method="post" action="/SRKA/addItem">
Item Name : <input type="text" name="itemName"><br />
Item Quantity : <input type="number" name="itemValue"><br />
Item Unit of Measurement : <select name="itemUnit">
  					<option value="units">units</option>
  					<option value="lbs">lbs</option>
  					<option value="gallons">gallons</option>
				</select> <br />
 <input type="submit" value="Submit">
</form>
</body>
</html>