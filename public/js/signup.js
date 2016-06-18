$('form').submit(function(){
	if(!$('#phone').val().match(/1[35478]\d{9}/)){
		layer.msg('手机号不合法');
		return false;
	}else if(!$('#pass').val().match(/.{5,}/)){
		layer.msg('密码长度必需大于或等于6位');
		return false;
	}else if($('#pass').val() !== $('#pass_sec').val()){
		layer.msg('两次密码不一致');
		return false;
	}
	$('#sub').html('<i class="fa fa-circle-o-notch fa-spin"></h4>').attr('disabled', true);
	$.ajax({
		url : '/signup',
		type: 'post',
		dataType: 'json',
		data: {
			func: 'signup',
			phone: $('#phone').val(),
			pass: $('#pass').val(),
			pass_sec: $('#pass_sec').val(),
			pass_pay: $('#pass_pay').val()
		},
		success: function(data){
			/* 这里处理注册成功的跳转 */
			layer.msg('注册成功，请等待跳转');
			setTimeout(function(){
				window.location.href = '/user/'+data.userId+'/data';
			},1000);
		},
		/* 这里处理注册失败的弹窗提示 */
		error: function(XMLHttpRequest, textStatus, errorThrown){
			layer.msg('unknown error');
			$('#sub').attr('disabled', false).html('注册');
		}
	});
	return false;
});