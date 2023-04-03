<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>service-page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/clientboard/servicepage.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css" />
  </head>
  <body>
    <header>
    	<jsp:include page="${pageContext.request.contextPath}/app/header.jsp"/>
    </header>
    <main>
      <div class="tabmenu-black">
        <a href="">
          <img src="${pageContext.request.contextPath}/assets/img/banner/csbanner.jpg" alt="" />
        </a>
      </div>
      <div class="container">
        <div class="wrap">
          <div class="title-box">
            <h3><c:out value="${boardRow.getBoardTitle()}"/></h3>
            <div class="text">
              <div class="info">
                <div class="date">
                  <span><strong>날짜 : </strong></span>
                  <span><c:out value="${boardRow.getBoardDate()}"/></span>
                </div>
                <div class="id">
                  <span><strong>작성자 : </strong></span>
                  <span><c:out value="${boardRow.getUserId()}"/></span>
                </div>
              </div>
            </div>
          </div>
          <div class="content"> <c:out value="${boardRow.getBoardContent()}" /></div>
         
        </div>
      </div>
      <div class="btn-box">
        <div class="button">
          <button type="button" class="list-btn">목록</button>
          <button type="button" class="modify-btn">수정</button>
          <button type="button" class="delete-btn">삭제</button>
        </div>
      </div>
    </main>
    <footer>
    	<jsp:include page="${pageContext.request.contextPath}/app/footer.jsp"/>
    </footer>
  </body>
</html>
