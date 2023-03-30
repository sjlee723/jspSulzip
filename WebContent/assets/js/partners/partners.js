/**
 * 
 */

// 약관 확인하기
$('form').on('submit', function(e){
   e.preventDefault(); // 기본 이벤트를 막아주는 명령어 
   
   console.log(   $('#agree').prop('checked')      );
   
   if(   $('#agree').prop('checked')      ){
      this.submit(); // 서브밋 이벤트를 발생시키는 메소드(폼 요소에 사용해야 함)
   }else{
      alert('약관에 동의해주세요!');
   }
});