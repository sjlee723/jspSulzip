<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>alcohol1</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/sulkit/sulkit.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</head>

<body>
    <header></header>
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
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/고든(드라이진).jpg" class="card-img-top" alt="고든(드라이진)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">고든</h5>
                            <p class="card-text-2"><small class="text-muted">15,800원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/깔루아.jpg" class="card-img-top" alt="깔루아이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">깔루아</h5>
                            <p class="card-text-2"><small class="text-muted">22,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/디사론노.jpg" class="card-img-top" alt="디사론노이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">디사론노</h5>
                            <p class="card-text-2"><small class="text-muted">33,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/디카이퍼멜론(멜론리큐르).jpg" class="card-img-top" alt="디카이퍼멜론(멜론리큐르)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">디카이퍼멜론</h5>
                            <p class="card-text-2"><small class="text-muted">27,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/마리브리자드(애프리콧브랜디).jpg" class="card-img-top" alt="마리브리자드(애프리콧브랜디)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">마리브리자드(애프리콧)</h5>
                            <p class="card-text-2"><small class="text-muted">31,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/마리브리자드(체리브랜디).jpg" class="card-img-top" alt="마리브리자드(체리브랜디)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">마리브리자드(체리)</h5>
                            <p class="card-text-2"><small class="text-muted">31,500원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/볼스(슬로진).jpg" class="card-img-top" alt="볼스(슬로진)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">볼스(슬로진)</h5>
                            <p class="card-text-2"><small class="text-muted">41,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/마티니(드라이베르무트).png" class="card-img-top" alt="마티니(드라이베르무트)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">마티니(드라이베르무트)</h5>
                            <p class="card-text-2"><small class="text-muted">37,500원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/말리부.jpg" class="card-img-top" alt="말리부이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">말리부</h5>
                            <p class="card-text-2"><small class="text-muted">20,000원</small></p>
                        </div>
                    </div>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/바카디(화이트럼).jpg" class="card-img-top" alt="바카디(화이트럼)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">바카디(화이트럼)</h5>
                            <p class="card-text-2"><small class="text-muted">32,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/베일리스.jpg" class="card-img-top" alt="베일리스이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">베일리스</h5>
                            <p class="card-text-2"><small class="text-muted">45,000원</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/assets/img/alcohol/볼스(바나나리큐르).jpg" class="card-img-top" alt="볼스(바나나리큐르)이미지">
                        <div class="card-body">
                            <p class="card-text-1">술</p>
                            <h5 class="card-title">볼스(바나나)</h5>
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
    <footer></footer>
    </body>

</html>