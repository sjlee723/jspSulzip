<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>alcohol2</title>
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
                <img class="banner-img" src="${pageContext.request.contextPath}/assets/img/banner/술배너.jpg" alt="술배너이미지">
            </a>
        </div>
    </div>
    <div class="container">
        <div class="content">
            <div class="asidebar">
                <div class="list-nav">
                    <span class="text-muted1">홈 >
                            <span class="text-muted2">술</span>
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
                    <div class="card" data-num="13">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/마티니로쏘(스위트베르무트).png" class="card-img-top inside" alt="마티니로쏘(스위트베르무트)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">마티니로쏘</h5>
                            <p class="card-text-2"><small class="text-muted">15,800원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="14">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/볼스(카시스).png" class="card-img-top inside" alt="볼스(카시스)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">볼스 카시스</h5>
                            <p class="card-text-2"><small class="text-muted">22,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="15">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/블루큐라소.jpg" class="card-img-top inside" alt="블루큐라소이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">블루큐라소</h5>
                            <p class="card-text-2"><small class="text-muted">33,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card" data-num="16">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/애플브랜디.png" class="card-img-top inside" alt="애플브랜디이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">애플브랜디</h5>
                            <p class="card-text-2"><small class="text-muted">27,500원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="17">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/앱솔루트(보드카).jpg" class="card-img-top inside" alt="앱솔루트보드카이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">앱솔루트 엑스트랙</h5>
                            <p class="card-text-2"><small class="text-muted">31,500원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="18">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/앱솔루트(엑스트랙).jpg" class="card-img-top inside" alt="앱솔루트보드카1이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">앱솔루트 보드카</h5>
                            <p class="card-text-2"><small class="text-muted">31,500원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group" data-num="19">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/진빔(버번).jpg" class="card-img-top inside" alt="진빔이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">진빔</h5>
                            <p class="card-text-2"><small class="text-muted">41,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="20">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/시바스리갈.png" class="card-img-top inside" alt="시바스리갈이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">시바스리갈</h5>
                            <p class="card-text-2"><small class="text-muted">52,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="21">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/트리플섹.jpg" class="card-img-top inside" alt="트리플섹이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">트리플섹</h5>
                            <p class="card-text-2"><small class="text-muted">20,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card" data-num="22">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/피치트리.jpg" class="card-img-top inside" alt="피치트리이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">피치트리</h5>
                            <p class="card-text-2"><small class="text-muted">32,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="23">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/헤네시(꼬냑).jpg" class="card-img-top inside" alt="헤네시(꼬냑)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">헤네시 X.O</h5>
                            <p class="card-text-2"><small class="text-muted">275,000원</small></p>
                        </div>
                    </div>
                    <div class="card" data-num="24">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/호세쿠엘보(데낄라).png" class="card-img-top inside" alt="호세쿠엘보(데낄라)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title inside">호세쿠엘보 데낄라</h5>
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
                          <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/product/productAlcohol1.prd">1</a></li>
                          <li class="page-item active">
                            <a class="page-link" href="${pageContext.request.contextPath}/product/productAlcohol2.prd">2</a>
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
    <script src="${pageContext.request.contextPath}/assets/js/product/alcohol.js"></script>
    </body>

</html>