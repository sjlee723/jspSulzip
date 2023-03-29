<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/clientboard/servicewrite.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css" />
</head>
<body>
<header>
	<jsp:include page="${pageContext.request.contextPath}/app/header.jsp"/>
</header>
  <section id="conteiner" class="container">
      <img class="img-banner" src="${pageContext.request.contextPath}/assets/img/banner/csbanner.jpg">
      <div class="contents spacr_top_none" id="contents">
        <div class="tab_wrap">
          <ul class="tab_list">
            <li>
              <a>Q&A</a>
            </li>
          </ul>
        </div>

  
  
        <form id="registerForm" name="registerForm">
            <div class="sect_comm">
              <div class="sect_header">
                <div class="title_sect">
                  <h3 class="sect_title">Q&A</h3>
                  <span class="title_desc mo_inb_show">
                    <em class="txt_star">
                      부적절하거나 광고 및 홍보성 게시글은 관리자에 의해 삭제될 수 있습니다
                    </em>
                  </span>
                </div>
            <div class="header_aside pc_show">
                <span class="required">
                  <!-- 필수입력 -->
                </span>
            </div>
              </div>

              
              
            </form>
        <!--      -->
          <div class="test">

            
          </div>

       <!--        -->
          </div>

          
          
          
        </div>
        <!-- 예시-->
        <div class="cont_sect board_sect qna_save">
          <div class="board board_write">
              <table class="form_table">
                <colgroup>
                  <col style="width: 18%;">
                </colgroup>
                <tbody>
                  <tr>
                    <th>
                        <span class="required" title="필수입력">
                          제목
                        </span>
                    </th>
                    <td>
                        <input type="text" name="title" value class="inpt w100" placeholder="제목을 입력하세요" maxlength="200">
                    </td>
                  </tr>
        <!--예시-->
        
        <div class="cont_sect board_sect qna_save">
            <div class="board board_write">
                <table class="form_table">
                  <colgroup>
                    <col style="width: 18%;">
                  </colgroup>
                  <tbody>
                    <tr>
                      <th>
                          <span class="required" title="필수입력">
                            작성자명
                          </span>
                      </th>
                      <td>
                          <input type="text" name="title" value class="inpt w100" placeholder="이름을 입력하세요" maxlength="200">
                      </td>
                    </tr>
                    <!--ㄹ저ㅔㅐㅓㅔㅐㄷ저ㅐㅔㄷㅈ-->
                   

                  </div>
                </div>

                        <tr>
                          <tb>
                            <div class="eqitor_area">
                              <div class="note-editor note-frame">
                                <div class="note-editable" contenteditable="true" role="textbox" aria-mltiline="true" spellcheck="true"
                                autocorrect="true" style="height: 300px;">
                              </div>
                              </div>
                            </div>
                          </tb>
                        </tr>
                  </tbody>
                </table>
        <div class="board_btm">
          <div class="btns_area mo_block">
            <a href="#" class="btn-basic btn-strong btn-red mo_block saveBtn"
            id="saveBtn">등록</a>
            <a href="#"class="btn_basic btn_gray mo_block">취소</a>
          </div>
        </div>
    
    </section>
<footer>
	<jsp:include page="${pageContext.request.contextPath}/app/footer.jsp"/>
</footer> 
</body>
</html>