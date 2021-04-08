<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.edu_jsp.beans.BookBean"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="name" value="Amy"/>
<c:out value="${name}"/><br>

<c:remove var="name"/> 
<c:out value="${name}"/><br>

<%
BookBean book = new BookBean("The Secret","Byrne,Rhonda","Atria Books");
request.setAttribute("bookOne", book);
%>

<c:set var="title" value="${bookOne.title}"/>
<c:out value="${title}"/><br>

<c:set var="author" value="<%=book.getAuthor() %>"/>
<c:out value="${author}"/><br>
<hr>
<c:set var="name">Tobey</c:set>
<c:out value="${name}"/><br>

<%
BookBean book2 = new BookBean("The Last Lecture","Randy Pausch","hyperion");
request.setAttribute("bookTwo", book2);
%>
<c:set var="title" value="${bookTwo.title}"/>
<c:out value="${title}"/><br>

<c:set var="author" value="<%=book2.getAuthor() %>"/>
<c:out value="${author}"/><br>