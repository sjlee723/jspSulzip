<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/user/withdrawal.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/header.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/footer.css" />
</head>
<body>
	<header>
		<jsp:include page="${pageContext.request.contextPath}/app/header.jsp" />
	</header>

	<div class="container">
		<div class="title-text">개인정보 보호를 위한 비밀번호 재확인</div>
		<div class="inner">
			<div class="confirm-wrap">
				<p class="info">계정정보를 입력하시면 회원탈퇴가 완료됩니다.</p>
				<form class="form" role="form" name="memberconfirm"
					action="/user/withdrawalOk.usr" method="post">
					<div class="form-wrap">
						<input type="hidden" name="w" value="u">

						<div class="input-wrap">
							<div>
								<input type="text" name="userId" class="input-id" value=""
									required="" placeholder="아이디" autofocus>
							</div>
							<div>
								<input type="password" name="userPw" class="input-pw"
									required="" placeholder="비밀번호">
							</div>
						</div>

						<div class="btn-wrap">
							<button type="submit" class="submit-btn" onclick="withdrawal()">확인</button>
							<a href="/"><button type="button" class="cancel-btn"
									role="button">취소</button></a>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<footer>
		<jsp:include page="${pageContext.request.contextPath}/app/footer.jsp" />
	</footer>
	<script>
		const params = new URLSearchParams(window.search);
		let result = params.get("result");
		/* let getParameter = (key) => {
			return new URLSraechParams(window.location.search).get(key);
		};
		*/
		
		function withdrawal() {
			if(result.equals("false")){
			alert("탈퇴되었습니다.");
			window.location.href = "https://localhost:8085/";
		}
	</script>
</body>
</html>