jQuery(document).ready(function($){
	var context = $("#context").attr("context-path")
	
	$('#btn-register').click(function(e){
		e.preventDefault()
		
		var userName = $('#user-name').val()
		var email = $('#email').val()
		var password = $('#password').val()
		
		$.ajax({
			url: context + "/api/register",
			method: 'post',
			dataType: 'json',
			data: {
				userName: userName,
				email: email,
				password: password
			}
		}).done(function(result){
			if(result){
				alert('Thêm thành công')
			}else{
				alert('Thêm thất bại')
			}
		})
	})
	
	$('#btn-login').click(function(){
		e.preventDefault()
		
		var email = $('#email').val()
		var password = $('#password').val()
		
		$.ajax({
			url: context + "/api/login",
			method: 'post',
			dataType: 'json',
			data: {
				email: email,
				password: password
			}
		}).done(function(result){
			console.log(result)
		})
	})
})