<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="balance" value="123456.789"/><br>
<fmt:formatNumber type="currency" value="${balance}" />
<fmt:formatNumber type="number"  maxIntegerDigits="3" value="${balance}" /><br>
<fmt:formatNumber type="number"  maxFractionDigits="3" value="${balance}"/><br>
<fmt:formatNumber type="number"  groupingUsed="3" value="${balance}"/><br>
<fmt:formatNumber type="percent"  maxIntegerDigits="3" value="${balance}"/><br>
<fmt:formatNumber type="percent"  minFractionDigits="3" value="${balance}"/><br>
<fmt:formatNumber type="percent"  maxIntegerDigits="3" value="${balance}"/><br>
<fmt:formatNumber type="number"  pattern="###.####E0" value="${balance}"/><br>
<p>Currency in USA:
<fmt:setLocale value="en_us"/>
<fmt:formatNumber value="${balance}" type="currency"/></p>
<fmt:parseNumber value="1,234.56" pattern="0,000.000" var="num"/>
<fmt:parseNumber value="123" var="num2"/>
${num1+num1}