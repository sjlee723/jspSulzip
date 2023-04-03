/**
 * 
 */
console.log("aaa");

let $inside = $('.inside');


$inside.on('click', function() {
	let num = $(this).closest('.card').data('num');
	
	window.location.href = "/sulkit/sulkitDetail.suk?num=" + num;
	console.log(num);
});