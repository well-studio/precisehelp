$('form').submit(function(){
	if(!$('#phonenumber').val().match(/1[35478]\d{9}/)){
		layer.msg('手机号不合法');
		return false;
	}else if(!$('#pass').val().match(/.{5,}/)){
		layer.msg('密码长度必需大于或等于6位');
		return false;
	}
	$('#sub').html('<i class="fa fa-circle-o-notch fa-spin"></h4>').attr('disabled', true);
	$.ajax({
		url : '/signin',
		type: 'post',
		dataType: 'json',
		data: {
			func: 'signin',
			phone: $('#phonenumber').val(),
			pass: $('#pass').val(),
		},
		success: function(data){
			/* 这里处理登录成功的跳转 */
			layer.msg('登录成功，请等待跳转');
			setTimeout(function(){
				window.location.href = '/user/'+data.usersinfo.userId;
			},1000);
		},
		/* 这里处理登录失败的弹窗提示 */
		error: function(XMLHttpRequest, textStatus, errorThrown){
			/* 用户名密码错误什么的 */
			layer.msg('用户名或密码错误');
			$('#sub').attr('disabled', false).html('登录');
		}
	});
	return false;
});