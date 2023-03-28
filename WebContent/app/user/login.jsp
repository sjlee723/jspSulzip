<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>login</title>
    <script>
      function showPopup() {
        let popupX = document.body.offsetWidth / 2 - 400 / 2;
        let popupY = window.screen.height / 2 - 300;
        window.open(
          "findIdPw.html",
          "아이디/비밀번호찾기",
          "width=400, height=300, left=" + popupX + ", top=" + popupY
        );
      }
    </script>
  </head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/user/login.css" />
  <style>
    * {
      font-family: "NanumBarunGothic", sans-serif;
    }
  </style>
  <body>
    <header></header>
    <div id="container">
      <div id="content" class="at-container">
        <div class="at-content">
          <div class="custom-login">
            <div class="login-header">
              <div class="amina-header-lato">로그인</div>
            </div>
            <div class="login-header">
              <div class="amina-header lato">
                <div class="login-body">
                  <div class="tab-content maber-login active">
                    <div class="login-weap">
                      <div class="form-group">
                        <input
                          type="text"
                          name="mb_id"
                          id="login_id"
                          required
                          calss="form-control input-sm"
                          size="20"
                          maxlength="20"
                          placeholder="아이디"
                        />
                      </div>
                      <div class="form-group">
                        <input
                          type="text"
                          name="mb_password"
                          id="login_password"
                          required
                          calss="form-control input-sm"
                          size="20"
                          maxlength="20"
                          placeholder="비밀번호"
                        />
                      </div>
                      <!-- <div class="login-opt">
                        <div class="pull-left">
                          <input type="checkbox" name="auto_login" id="login_auto_login">
                            <label for="login_auto_login" class="remembr-me">
                              자동로그인
                            </label>
                        </div>
                      </div> -->

                      <div class="login-btn">
                        <a href="https://www.naver.com/"
                          ><button type="submit" class="btn btn-login">
                            로그인
                          </button></a
                        >
                      </div>
                      <!---->
                      <!-- <div class="login-btn">
                          <a href="">로그인</a>
                      </div> -->
                      <!---->
                      <div class="regis-wrap">
                        <ul class="join-n-find-wrap">
                          <li>
                            <span>· 아직 쉐이킷 회원이 아니신가요?</span>
                            <a href="">쉐이킷 회원가입</a>
                          </li>
                          <li>
                            <span>· 아이디/비밀번호를 잊어버리셨나요?</span>
                            <a href="" onclick="showPopup();"
                              >아이디/비밀번호 찾기</a
                            >
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <footer></footer>
  </body>
</html>