<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>sulkit3</title>
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
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/metropolitan_1.jpg" class="card-img-top" alt="메트로폴리탄이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">메트로폴리탄</h5>
                            <p class="card-text-2"><small class="text-muted">35,800원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/midorisour_1.jpg" class="card-img-top" alt="미도리샤워이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">미도리샤워</h5>
                            <p class="card-text-2"><small class="text-muted">42,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/orgasm-1.jpg" class="card-img-top" alt="오르가즘이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">오르가즘</h5>
                            <p class="card-text-2"><small class="text-muted">33,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/paradise-1.jpg" class="card-img-top" alt="파라다이스이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">파라다이스</h5>
                            <p class="card-text-2"><small class="text-muted">27,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/peachcrush_1.jpg" class="card-img-top" alt="피치크러쉬이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">피치크러쉬</h5>
                            <p class="card-text-2"><small class="text-muted">31,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/pinacolada-1.jpg" class="card-img-top" alt="피나콜라다이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">피나콜라다</h5>
                            <p class="card-text-2"><small class="text-muted">31,500원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/pinklady-1.jpg" class="card-img-top" alt="핑크레이디이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">핑크레이디</h5>
                            <p class="card-text-2"><small class="text-muted">41,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/revolver-1.jpg" class="card-img-top" alt="리볼버이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">리볼버</h5>
                            <p class="card-text-2"><small class="text-muted">37,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/royalhawaiian-1.jpg" class="card-img-top" alt="로얄하와이안이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">로얄하와이안</h5>
                            <p class="card-text-2"><small class="text-muted">20,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/rumcock_1.jpg" class="card-img-top" alt="럼콕이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">럼콕</h5>
                            <p class="card-text-2"><small class="text-muted">32,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/sexonthebeach_1.jpg" class="card-img-top" alt="섹스온더비치이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">섹스온더비치</h5>
                            <p class="card-text-2"><small class="text-muted">45,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/sulkit/whitelady-1.jpg" class="card-img-top" alt="화이트레이디이미지">
                        <div class="card-body">
                            <p class="card-text-1">술키트</p>
                            <h5 class="card-title">화이티레이디</h5>
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
                          <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/sulkit/productSulkit1.suk">1</a></li>
                          <li class="page-item">
                            <a class="page-link" href="${pageContext.request.contextPath}/sulkit/productSulkit2.suk">2</a>
                          </li>
                          <li class="page-item active"><a class="page-link" href="${pageContext.request.contextPath}/sulkit/productSulkit3.suk">3</a></li>
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