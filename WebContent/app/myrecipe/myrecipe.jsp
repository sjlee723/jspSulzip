<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>myrecipe</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/sulkit/sulkit.css">
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
    <div class="container-fluid">
        <div class="img-content">
            <a href="javascript:alert('준비중인 페이지입니다.');">
                <img class="banner-img" src="${pageContext.request.contextPath}/assets/img/banner/myrecipebanner.jpg" alt="마이레시피배너이미지">
                <div class="btn-wrap">
                    <button type="button" class="btn-join">참가신청 바로가기</button>
                </div>
            </a>
        </div>
    </div>
    <div class="container">
        <div class="content">
            <div class="asidebar">
                <div class="list-nav">
                    <span class="text-muted1">홈 >
                            <span class="text-muted2">마이레시피</span>
                    </span>
                </div>
            </div>
            <div class="row">
             <div class="col-10 filter-group mb-5">
                 <button type="button" class="btn btn-dark">전체보기</button>
                 <button type="button" class="btn btn-light text-secondary" >베스트</button>
                 <button type="button" class="btn btn-light text-secondary" >스테디</button>
             </div>
             <div class="col-2 filter-group mb-5 d-md-flex justify-content-md-end">
                    <a href="${pageContext.request.contextPath}/myrecipe/myRecipeUpload.mrb" class="btn" style="color: white; background-color: #d61c6a;">작성하기</a>
             </div>
            </div>
            <div class="list-group">
<c:forEach items="${list}" varStatus="idx">
	<c:if test="${idx.count % 3 == 1}">
					<div class="card-group">
	</c:if>
					<div class="card" data-num="1">
                        <img src="${pageContext.request.contextPath}/assets/img/myrecipe/빅터프랑켄슈타인.jpg" class="card-img-top inside" alt="빅터프랑켄슈타인이미지">
                        <div class="card-body">
                            <p class="card-text-1">레시피</p>
                            <h5 class="card-title inside">빅터프랑켄슈타인</h5>
                            <p class="card-text-2"><small class="text-muted">HIT</small></p>
                        </div>
                    </div>
	<c:if test="${idx.count % 3 == 0}">
					</div>
	</c:if>

</c:forEach>            
                <!-- 
                	controller에서 jsp로 list라는 변수를 던져주면 row에 3개씩 나오게 작업은 해뒀음
                	controller에서 List형태로 목록에 뿌려줄 마이레시피 데이터를 limit으로 가져옴. 몇개씩 끊어서 가져올지 정하기.
                 -->
                
                
                </div>
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
                    <nav aria-label="${pageContext.request.contextPath}/assets.">
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
         </div>
       </div>  
    <footer>
    	<jsp:include page="${pageContext.request.contextPath}/app/footer.jsp"/>
    </footer>
    <script src="https://code.jquery.com/jquery-3.6.4.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/myrecipe/myrecipe.js"></script>
    </body>

</html>