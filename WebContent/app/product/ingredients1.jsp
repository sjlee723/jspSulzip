<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ingredients</title>
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
                <img class="banner-img" src="${pageContext.request.contextPath}/assets/img/banner/칵테일재료배너_pc.jpg" alt="칵테일재료배너이미지">
            </a>
        </div>
    </div>
    <div class="container">
        <div class="content">
            <div class="asidebar">
                <div class="list-nav">
                    <span class="text-muted1">홈 >
                            <span class="text-muted2">재료</span>
                    </span>
                </div>
            </div>
            <div class="filter-group mb-5">
                <button type="button" class="btn btn-dark">전체보기</button>
                <button type="button" class="btn btn-light text-secondary" >베스트</button>
                <button type="button" class="btn btn-light text-secondary" >스테디</button>
            </div>
            <div class="list-group">
                <div class="card-group">
                    <div class="card" data-num="25">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/꿀.jpg" class="card-img-top inside inside" alt="꿀이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside inside">꿀</h5>
                            <p class="card-text-2"><small class="text-muted">30,800원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="26">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/라임.jpg" class="card-img-top inside" alt="라임이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">라임</h5>
                            <p class="card-text-2"><small class="text-muted">8,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="27">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/레몬.jpg" class="card-img-top inside" alt="레몬이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">레몬</h5>
                            <p class="card-text-2"><small class="text-muted">7,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group" data-num="28">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/버터.jpg" class="card-img-top inside" alt="버터이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">버터</h5>
                            <p class="card-text-2"><small class="text-muted">9,500원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="29">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/오렌지쥬스.jpg" class="card-img-top inside" alt="오렌지쥬스이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">오렌지 주스</h5>
                            <p class="card-text-2"><small class="text-muted">21,500원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="30">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/우유.jpg" class="card-img-top inside" alt="우유이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">우유</h5>
                            <p class="card-text-2"><small class="text-muted">11,500원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card" data-num="31">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/칵테일비터스.jpg" class="card-img-top inside" alt="칵테일비터스이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">칵테일 비터스</h5>
                            <p class="card-text-2"><small class="text-muted">19,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="32">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/칵테일소금.jpg" class="card-img-top inside" alt="칵테일소금이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">칵테일 소금</h5>
                            <p class="card-text-2"><small class="text-muted">17,500원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="33">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/칵테일올리브.jpg" class="card-img-top inside" alt="칵테일올리브이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">칵테일 올리브</h5>
                            <p class="card-text-2"><small class="text-muted">20,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card" data-num="34">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/커피시럽.jpg" class="card-img-top inside" alt="커피시럽이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">커피시럽</h5>
                            <p class="card-text-2"><small class="text-muted">12,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="35">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/코카콜라.jpg" class="card-img-top inside" alt="코카콜라이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">코카콜라</h5>
                            <p class="card-text-2"><small class="text-muted">9,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="36">
                        <img src="${pageContext.request.contextPath}/assets/img/ingredients/토닉워터.jpg" class="card-img-top inside" alt="토닉워터이미지">
                        <div class="card-body">
                            <p class="card-text-1">재료</p>
                            <h5 class="card-title inside">토닉워터</h5>
                            <p class="card-text-2"><small class="text-muted">8,900원</small></p>
                        </div>
                    </div>
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
                    <nav aria-label="...">
                        <ul class="pagination">
                          <li class="page-item disabled">
                            <a class="page-link" href="#" tabindex="-1"><</a>
                          </li>
                          <li class="page-item active"><a class="page-link" href="${pageContext.request.contextPath}/product/productIngredients1.prd">1</a></li>
                          <li class="page-item">
                            <a class="page-link" href="${pageContext.request.contextPath}/product/productIngredients2.prd">2</a>
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
    	<script src="${pageContext.request.contextPath}/assets/js/product/ingredients.js"></script>
    </body>

</html>