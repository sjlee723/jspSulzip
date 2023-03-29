<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
 
 

<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Document</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/clientboard/service.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css" />

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>

    

</head>

 
 
<body>
	<header>
		<jsp:include page="${pageContext.request.contextPath}/app/header.jsp"/>
	</header>
    <div class="tabmenu-black">
        <a href="">
            <img src="${pageContext.request.contextPath}/assets/img/banner/csbanner.jpg" alt="">
        </a>
    </div>

    <div class="write-btn-box">
        <button><span>글쓰기</span></button>
    </div>

    <section class="main">

        <h1 class="d-none">게시판</h1>

            <div class="board">

                <table class="table">

                    <thead class="thead">

                        <tr>

                            <td>번호</td>

                            <td>글제목</td>

                            <td>작성자</td>

                            <td>작성일</td>

                            <td>조회</td>

                        </tr>

                    </thead>

                    <tbody class="tbody">

                        <tr>

                            <td>1</td>

                            <td><a href="">제목1</a></td>

                            <td>홍길동</td>

                            <td>2023/01/01</td>

                            <td>18</td>

                        </tr>

                        <tbody class="tbody">

                            <tr>

                                <td>2</td>

                                <td><a href="">제목2</a></td>

                                <td>홍길동2</td>

                                <td>2023/01/02</td>

                                <td>1</td>

                            </tr>

                            <tbody class="tbody">

                              <tr>
  
                                  <td>3</td>
  
                                  <td><a href="">제목3</a></td>
  
                                  <td>홍길동3</td>
  
                                  <td>2023/01/03</td>
  
                                  <td>3</td>
  
                              </tr>

                              <tbody class="tbody">

                                <tr>
    
                                    <td>4</td>
    
                                    <td><a href="">제목4</a></td>
    
                                    <td>홍길동4</td>
    
                                    <td>2023/01/04</td>
    
                                    <td>4</td>
    
                                </tr>

                                <tbody class="tbody">

                                  <tr>
      
                                      <td>5</td>
      
                                      <td><a href="">제목5</a></td>
      
                                      <td>홍길동5</td>
      
                                      <td>2023/01/05</td>
      
                                      <td>11</td>
      
                                  </tr>

                                  <tbody class="tbody">

                                    <tr>
        
                                        <td>6</td>
        
                                        <td><a href="">제목6</a></td>
        
                                        <td>홍길동6</td>
        
                                        <td>2023/01/06</td>
        
                                        <td>7</td>
        
                                    </tr>

                                    <tbody class="tbody">

                                      <tr>
          
                                          <td>7</td>
        
                                          <td><a href="">제목7</a></td>
          
                                          <td>홍길동7</td>
          
                                          <td>2023/01/07</td>
          
                                          <td>11</td>
          
                                      </tr>

                                      
              




                        </tbody>

                    </tbody>

                </table>

               <!-- <div class="page-wrap">

                    <ul class="page-nation">

                        <li><a href="">1</a></li>

                        <li><a href="">2</a></li>

                        <li><a href="">3</a></li>

                        <li><a href="">4</a></li>

                        <li><a href="">5</a></li>

                        <div class="pg">
                          <button>글쓰기</button>
                        </div>

                    </ul> 

                </div> -->

                <div class="pagination-area ">
                    <style>
                        .page-link {
                          color: #000; 
                          background-color: #fff;
                          border: 1px solid #ccc; 
                        }
                        
                        .page-item.active .page-link {
                         z-index: 1;
                         color: #555;
                         font-weight:bold;
                         background-color: #f1f1f1;
                         border-color: #ccc;
                         
                        }
                        
                        .page-link:focus, .page-link:hover {
                          color: #000;
                          background-color: #fafafa; 
                          border-color: #ccc;
                        }
                        </style>
                    <nav aria-label="...">
                        <ul class="pagination">
                          <li class="page-item disabled">
                            <a class="page-link" href="#" tabindex="-1"><</a>
                          </li>
                          <li class="page-item"><a class="page-link" href="#">1</a></li>
                          <li class="page-item active">
                            <a class="page-link" href="#">2</a>
                          </li>
                          <li class="page-item"><a class="page-link" href="#">3</a></li>
                          <li class="page-item">
                            <a class="page-link" href="#">></a>
                          </li>
                        </ul>
                      </nav>
                </div>


            </div>

    </section>

	<footer>
		<jsp:include page="${pageContext.request.contextPath}/app/footer.jsp"/>
	</footer>
</body>


</html>

 