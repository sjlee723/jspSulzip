/* 카테고리 선택 시 술과 재료 목록 나오기 */
let $category = $(".myrecipe-category");
let $alcohol = $(".myrecipe-alcohol");
let $ingre = $(".myrecipe-ingre");

$category.change(function () {
  var v = $category.val();
  if (v == 2) {
    $alcohol.show();
    $ingre.hide();
  } else if (v == 3) {
    $alcohol.hide();
    $ingre.show();
  } else if (v == 1) {
    $alcohol.hide();
    $ingre.hide();
  }
});


/* 이미지 업로드 시 미리보기 나오기 */
let $imgPreview = $('.img-preview');

$('#ex-file').on('change', function(){
	removePreview();
	
	let files = checkLength(this.files, 3);
	
	addPreview(files);
	
});



	/* 미리보기 이미지 삭제버튼 구현 */
$imgPreview.on('click', '.img-cancel-btn', function() {
		$(this).parent().parent().remove();
		
		let files = $("#ex-file")[0].files;
		let fileName = $(this).data('name');
		let dt = new DataTransfer();
		
		for (let i = 0; i < files.length; i++) {
			if (files[i].name !== fileName) {
				dt.items.add(files[i]);
			}
		}
		
		$("#ex-file")[0].files = dt.files;
	});

/* 업로드한 파일 배열의 길이 */
function checkLength(files, length){
	
	if(files.length > length){
		alert(`파일은 최대 ${length}개까지만 가능합니다.`);
		console.log(DataTransfer().files);
		/*return new DataTransfer().files;*/
		return files;
	}
	
	return files;
}

/* 미리보기에 삭제버튼 추가 */ 
function addPreview(files){
	for (let i = 0; i < files.length; i++) {
		let src = URL.createObjectURL(files[i]);
			$imgPreview.eq(i).html(
			`<li class="preview-li">
                  <div class="preview-img-box">
                    <img src="${src}" class="preview-img" />
                  </div>
                  <div class="preview-cancel-box">
                    <button type="button" class="img-cancel-btn" data-name="${files[i].name}">
                      삭제
                    </button>
                  </div>
                </li>`
			);
	}
}

/* 미리보기 전체 삭제 */
function removePreview(){
	for(let i=0; i<$imgPreview.length; i++){
		$imgPreview.eq(i).html(``);
	}
}

















