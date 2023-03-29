<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>sulkit1</title>
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
                <img class="banner-img" src="${pageContext.request.contextPath}/assets/img/banner/칵테일키트.jpg" alt="칵테일키트이미지">
            </a>
        </div>
    </div>
    <div class="container">
        <div class="content">
            <div class="asidebar">
                <div class="list-nav">
                    <span class="text-muted1">홈 >
                            <span class="text-muted2">술키트</span>
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
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/bacardiwhite-1.jpg" class="card-img-top" alt="바카디화이트이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">바카디화이트</h5>
                            <p class="card-text-2"><small class="text-muted">35,800원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/blackjack_1.jpg" class="card-img-top" alt="블랙잭이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">블랙잭</h5>
                            <p class="card-text-2"><small class="text-muted">42,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/blackrussian.jpg" class="card-img-top" alt="블랙러시안이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">블랙러시안</h5>
                            <p class="card-text-2"><small class="text-muted">33,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/bluesapphire-1.jpg" class="card-img-top" alt="블랙사파이어이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">블랙사파이어</h5>
                            <p class="card-text-2"><small class="text-muted">27,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/cherryblossom_1.jpg" class="card-img-top" alt="체리블로썸이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">체리블로썸</h5>
                            <p class="card-text-2"><small class="text-muted">31,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/cosmopolitan-1.jpg" class="card-img-top" alt="코스모폴리탄이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">코스모폴리탄</h5>
                            <p class="card-text-2"><small class="text-muted">31,500원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/daiquiri-1.jpg" class="card-img-top" alt="다이키리이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">다이키리</h5>
                            <p class="card-text-2"><small class="text-muted">41,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/derby-1.jpg" class="card-img-top" alt="더비이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">더비</h5>
                            <p class="card-text-2"><small class="text-muted">37,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/eggsour-1.jpg" class="card-img-top" alt="에그사워이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">에그사워</h5>
                            <p class="card-text-2"><small class="text-muted">20,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/emeraldcity-1.jpg" class="card-img-top" alt="에메랄드시티이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">에메랄드시티</h5>
                            <p class="card-text-2"><small class="text-muted">32,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/goldrush_1.jpg" class="card-img-top" alt="골드러시이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">골드러시</h5>
                            <p class="card-text-2"><small class="text-muted">45,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/grandblue_1.jpg" class="card-img-top" alt="그랜드블루이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">그랜드블루</h5>
                            <p class="card-text-2"><small class="text-muted">41,000원</small></p>
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
                          <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/app/sulkit/sulkit1.jsp">1</a></li>
                          <li class="page-item active">
                            <a class="page-link" href="${pageContext.request.contextPath}/app/sulkit/sulkit2.jsp">2</a>
                          </li>
                          <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/app/sulkit/sulkit3.jsp">3</a></li>
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
    </body>

</html>