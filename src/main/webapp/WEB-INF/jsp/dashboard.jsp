<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://cdn.tailwindcss.com"></script>

    <title>Dashboard</title>
    <!--<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">-->
</head>
<body>
    <%@ include file="header3.jsp"%>
<div class="bg-white w-fit p-6 rounded-xl shadow-lg border border-gray-300 mb-8 ml-10 mt-10">
   <div class="flex flex-col  space-y-4">
     <a href="<c:url value='${pageContext.request.contextPath}/school-app/teachers/view'/>"
       <button type="submit" class="px-6 py-2 border border-transparent rounded-md shadow-sm text-sm font-medium text-white bg-blue-600 hover:bg-blue-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-blue-500 transition-colors duration-200">
         Προβολή Καθηγητών
       </button>
     </a>

     <a href="<c:url value='${pageContext.request.contextPath}/school-app/teachers/insert'/>"
       <button type="submit" class="px-6 py-2 border border-transparent rounded-md shadow-sm text-sm font-medium text-white bg-blue-600 hover:bg-blue-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-blue-500 transition-colors duration-200">
         Εισαγωγή Καθηγητή
       </button>
     </a>
   </div>
 </div>


    <%@include file="footer2.jsp"%>
</body>
</html>