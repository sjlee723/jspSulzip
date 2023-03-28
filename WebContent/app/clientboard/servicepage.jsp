<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>service-page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/clientboard/servicepage.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
  </head>
  <body>
    <header></header>
    <main>
      <div class="tabmenu-black">
        <a href="">
          <img src="${pageContext.request.contextPath}/assets/img/banner/csbanner.jpg" alt="" />
        </a>
      </div>
      <div class="container">
        <div class="wrap">
          <div class="title-box">
            <h3>제목칸</h3>
            <div class="text">
              <div class="info">
                <div class="date">
                  <span><strong>날짜 : </strong></span>
                  <span>2023-03-03</span>
                </div>
                <div class="hit">
                  <span><strong>조회수 : </strong></span>
                  <span>22</span>
                </div>
                <div class="id">
                  <span><strong>작성자 : </strong></span>
                  <span>admin</span>
                </div>
              </div>
            </div>
          </div>
          <div class="content"></div>
        </div>
      </div>
      <div class="btn-box">
        <div class="button">
          <button><span>목록</span></button>
          <button><span>업로드</span></button>
        </div>
      </div>
    </main>
    <footer></footer>
  </body>
</html>
