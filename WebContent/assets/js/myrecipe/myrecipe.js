/**
 * 
 */
console.log("aaa");

let $inside = $('.inside');


$inside.on('click', function() {
	let mrbNum = $(this).closest('.card').data('num');
	
	window.location.href = "/myrecipe/myRecipeDetail.mrb?num=" + mrbNum;
	console.log(mrbNum);
});