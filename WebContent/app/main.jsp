<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Main</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
    <style>
      * {
        font-family: "NanumBarunGothic", sans-serif;
      }
    </style>
  </head>
  <body>
    <header>
      <div class="h-header">
        <div class="h-title-page">
          <div class="h-top-line">
            <div class="h-logo">
              <a href=""><img src="${pageContext.request.contextPath}/assets/img/logo/mainlogo.jpg" /></a>
            </div>
            <div class="h-line-right">
              <div class="h-join"><a href="${pageContext.request.contextPath}/app/user/login.jsp">로그인/회원가입</a></div>
              <div class="h-cart"><a href="${pageContext.request.contextPath}/app/cart/cart.jsp">장바구니</a></div>
            </div>
          </div>
          <div class="h-bottom-line">
            <ul class="h-ctg">
              <li><a href="${pageContext.request.contextPath}/app/sulkit/sulkit1.jsp">술키트</a></li>
              <li><a href="${pageContext.request.contextPath}/app/product/alcohol1.jsp">술</a></li>
              <li><a href="${pageContext.request.contextPath}/app/product/ingredients.jsp">재료</a></li>
              <li><a href="${pageContext.request.contextPath}/app/product/supplies1.jsp">용품</a></li>
              <li><a href="${pageContext.request.contextPath}/app/myrecipe/myrecipe.jsp">나만의 레시피</a></li>
              <li><a href="${pageContext.request.contextPath}/app/partners/partners.jsp">파트너스</a></li>
              <li><a href="${pageContext.request.contextPath}/app/clientboard/service.jsp">고객센터</a></li>
            </ul>
          </div>
        </div>
      </div>
    </header>
    <main>
      <div style="overflow: hidden;" class="main">
        <div class="main-img">
          <div class="main-first">
            <a href="${pageContext.request.contextPath}/app/sulkit/sulkit1.jsp">
              <img src="${pageContext.request.contextPath}/assets/img/banner/mainImg.jpg" />
            </a>
          </div>
          <div class="main-second">
            <a href="">
              <img src="${pageContext.request.contextPath}/assets/img/banner/mainimg2.jpg" />
            </a>
          </div>
          <div class="main-first">
            <a href="${pageContext.request.contextPath}/app/sulkit/sulkit.jsp">
              <img src="${pageContext.request.contextPath}/assets/img/banner/mainImg.jpg" />
            </a>
          </div>
        </div>
        <div class="button-box">
          <button class="first"></button>
          <button class="second"></button>
        </div>
      </div>
      <!-- <div class="button-box">
        <button class="first"></button>
        <button class="second"></button>
      </div> -->
      <div class="section-1">
        <div class="border-box">
          <div class="slides-wrap">
            <ul class="slide-box">
              <li>
                <div class="slide-img">
                  <a href="${pageContext.request.contextPath}/app/partners/partners.jsp"><img src="${pageContext.request.contextPath}/assets/img/sub-banner/brand_image_left.jpg" alt="" /></a>
                </div>
              </li>
              <li>
                <div class="slide-img">
                  <a href="${pageContext.request.contextPath}/app/sulkit/sulkit1.jsp"><img src="${pageContext.request.contextPath}/assets/img/sub-banner/brand_image_main.jpg" alt="" /></a>
                </div>
              </li>
              <li>
                <div class="slide-img">
                  <a href="${pageContext.request.contextPath}/app/myrecipe/myrecipe.jsp"><img src="${pageContext.request.contextPath}/assets/img/sub-banner/brand_image_right.jpg" /></a>
                </div>
              </li>
            </ul>
            <!-- &lt, &gt는 html에서 <, > 를 나타낼 때 사용 -->
            <div class="prev">&lt</div>
            <div class="next">&gt</div>
          </div>
        </div>
      </div>
    </main>
    <footer><div class="f-footer">
      <div class="f-footer-box">
        <nav class="f-footer-menu">
          <div class="f-column">
            <ul class="f-index">
              <li class="f-index-ul">쇼핑 및 레시피</li>
              <li class="f-index-li"><a href="" class="f-a">칵테일 패키지</a></li>
              <li class="f-index-li"><a href="" class="f-a">칵테일 재료</a></li>
            </ul>
          </div>
          <div class="f-column">
            <ul class="f-index">
              <li class="f-index-ul">계정</li>
              <li class="f-index-li"><a href="" class="f-a">로그인</a></li>
              <li class="f-index-li"><a href="" class="f-a">회원가입</a></li>
              <li class="f-index-li"><a href="" class="f-a">마이페이지</a></li>
              <li class="f-index-li"><a href="" class="f-a">장바구니</a></li>
            </ul>
          </div>
          <div class="f-column">
            <ul class="f-index">
              <li class="f-index-ul">파트너스</li>
              <li class="f-index-li"><a href="" class="f-a">가입문의</a></li>
            </ul>
          </div>
          <div class="f-column">
            <ul>
              <li class="f-index-ul">고객센터</li>
              <li class="f-index-li">02-0000-0000</li>
              <li class="f-index-li">
                운영시간 : 오전10:00~오후06:00 <br />점심시간 :
                오후12:00~오후13:00 <br />
                휴<span class="f-transparency">무휴</span>무 : 토요일, 일요일,
                공휴일
              </li>
            </ul>
          </div>
          <div class="f-column">
            <ul>
              <li class="f-index-ul">카카오톡 채널상담</li>
              <li class="f-index-li">sulzip_official</li>
              <li class="f-index-li">
                카카오톡 채널로 문의주시면 <br />
                빠르게 답변 받으실 수 있습니다.
              </li>
            </ul>
          </div>
        </nav>
        <div class="f-footer-legal">
          <div class="f-footer-copyright-wrap">
            <div class="f-footer-copyright">
              Copyright © 2023 Sulzip Inc. 모든 권리 보유.
            </div>
            <ul>
              <a href="" class="f-footer-copyright-li">개인정보 처리방침</a>
              <a href="" class="f-footer-copyright-li">웹 사이트 이용 약관</a>
            </ul>
          </div>
          <div class="f-footer-company">
            사업자등록번호 : 000-00-00000 | 통신판매업신고번호 : 제
            2023-서울강남-00000호 | 주소 : 서울 강남구 테헤란로 152
            강남파이낸스센터 | 대표전화 : 02-0000-0000 | 팩스 : 02-0000-0000 |
            sulzip@naver.com
          </div>
        </div>
      </div>
    </div class="f-footer"></footer>
  </body>
  <script
    src="https://code.jquery.com/jquery-3.6.3.js"
    integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
    crossorigin="anonymous"
  ></script>
  <script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
</html>
