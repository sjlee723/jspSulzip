/**
 * 
 */


$('#checkAll').on('click', function(){
	
	if($(this).is(':checked')){
		$('.cbox').attr('checked', true);	
	}else{
		$('.cbox').attr('checked', false);	
	}
});

$('.ctg-list').on('click', '.cbox' , function(){
	$('#checkAll').prop('checked', false);
});



$('#search-btn').on('click', function(){
	let searchKeyword = $('#search-keyword').val();
	let product = $('input[name=product]:checked').val();
	
	console.log(product);
	console.log(searchKeyword);

	console.log()
	$.ajax({
		url : '/admin/search.adm',
		type : 'get',
		data : {
			keyword : searchKeyword,
			category : product	
		},
		data: 'json',
		success : function(result){
			console.log(result.aa);
		},
		error : function(a,b,c){
			console.error(c);
		}
	});
});
