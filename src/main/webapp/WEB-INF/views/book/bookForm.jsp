<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="actionUrl" value="save.do" />

<form:form id="bookForm" commandName="book" method="post"
       action="save.do" class="pure-form pure-form-aligned">

     <fieldset>
          <legend></legend>

          <div class="pure-control-group">
              <label for="name">Name</label>
              <form:input path="name" placeholder="Book Name" />
          </div>
          <div class="pure-control-group">
               <label for="code">Code</label>
               <form:input path="code" placeholder="Code" maxlength="15" />
          </div>
          <div class="pure-control-group">
              <label for="price">Price</label>
              <form:input path="price" placeholder="Price" maxlength="10" />
          </div>
          <div class="pure-control-group">
              <label for="authors">Author(s)</label>
              <form:input path="authors" placeholder="Authors" />
          </div>
          <div class="pure-control-group">
              <label for="isbn">ISBN</label>
              <form:input path="isbn" placeholder="ISBN" />
          </div>
          <div class="pure-control-group">
              <label for="publisher">Publisher</label>
              <form:input path="publisher" placeholder="Publisher" />
          </div>
          <div class="pure-control-group">
              <label for="publishedOn">Published On</label>
              <form:input path="publishedOn" placeholder="YYYY-MM-DD" class="datepicker" />
          </div>

          <form:input path="id" type="hidden" />
      </fieldset>
</form:form>
<!-- </body>
</html> -->