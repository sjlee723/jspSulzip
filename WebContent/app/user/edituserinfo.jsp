<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/user/edituserinfo.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font/nanumbarungothicsubset.css" />
    <title>edituserinfo</title>
</head>
<body>
    <header></header>
    <main class="main">
        <section class="section1">
            <div class="title">회원 정보 수정</div>
        </section>
        <section class="section2">
            <div class="sub-title">회원정보입력</div>
            <table class="edit-table">
                <colgroup class="edit-colgroup">
                    <col class="edit-col1">
                    <col class="edit-col2">
                </colgroup>
                <tbody class="edit-tbody">
                    <tr class="edit-tr">
                        <th class="edit-th">아이디</th>
                        <td class="edit-td">
                            <input type="text" name="edit_id" class="edit_id" autofocus><span class="text-details">&nbsp;영문자, 숫자, _만 입력 가능. 최소 3자 이상 입력하세요.</span>
                        </td>
                    </tr>
                    <tr class="edit-tr">
                        <th class="edit-th">비밀번호</th>
                        <td class="edit-td">
                            <input type="text" name="edit_pw" class="edit_pw">
                        </td>
                    </tr>
                    <tr class="edit-tr">
                        <th class="edit-th">비밀번호 확인</th>
                        <td class="edit-td">
                            <input type="text" name="edit_pwconfirm" class="edit_pwconfirm">
                        </td>
                    </tr>
                    <tr class="edit-tr">
                        <th class="edit-th">이름</th>
                        <td class="edit-td">
                            <input type="text" name="edit_name" class="edit_name" readonly>
                        </td>
                    </tr>
                    <tr class="edit-tr">
                        <th class="edit-th">성별</th>
                        <td class="edit-td">
                            <input type="radio" name="edit_gender" value="male" class="edit_male" checked="checked">남성
                            <input type="radio" name="edit_gender" value="female" class="edit_female">여성
                        </td>
                    </tr>
                    <tr class="edit-tr">
                        <th class="edit-th">이메일</th>
                        <td class="edit-td">
                            <input type="text" name="edit_email" class="edit_email">
                        </td>
                    </tr>
                    <tr class="edit-tr">
                        <th class="edit-th">휴대폰번호</th>
                        <td class="edit-td">
                            <input type="text" name="edit_contact" class="edit_contact">
                        </td>
                    </tr>
                    <!-- <tr class="edit-tr">
                        <th class="edit-th">주소</th>
                        <td class="edit-td">
                            <input type="text" name="edit_address1" class="edit_address1"><br/>
                            <input type="text" name="edit_address2" class="edit_address2"><br/>
                            <input type="text" name="edit_address3" class="edit_address3">
                        </td>
                    </tr> -->
                </tbody>
            </table>
        </section>
        <section class="section3">
            <button type="submit" class="edit-btn-cancel" onclick="history.back()">취소</button>
            <button type="submit" class="edit-btn-submit" accesskey="s">정보수정</button>
        </section>
    </main>
    <footer></footer>
</body>
</html>