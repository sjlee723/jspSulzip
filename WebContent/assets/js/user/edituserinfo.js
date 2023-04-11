function fn_edituser(userId){
	let userChangePw = $("#userChangePw").val();
	let userChangePwConfirm = $("#userChangePwConfirm").val();
	
	if(userChangePw != ""){
		if(userChangePwConfirm == "" 
			|| (userChangePw != userChangePwConfirm) ){
			alert("변경할 비밀번호 확인을 입력해주세요.");
			$("#userChangePwConfirm").focus();
			return false;
		}
		$("#userPw").val(userChangePw);
	}
	
	$.ajax({
		type : 'post',
		data : $("#edituserFrm").serialize(),
		url : '/user/edituserinfoOk.usr',
		success : function(){
			alert("회원정보가 수정되었습니다. 메인페이지로 이동합니다.");
			location.href="/";
		}
	});	
}