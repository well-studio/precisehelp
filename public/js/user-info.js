$('form').submit(function(){
	if(!$('#phone').val().match(/1[35478]\d{9}/)){
		layer.msg('手机号不合法');
		return false;
	}else if(!$('#idnum').val().match(/\d{17}[\dxX]/)){
		layer.msg('身份证号不合法');
		return false;
	}
	$('#sub').html('<i class="fa fa-circle-o-notch fa-spin"></h4>').attr('disabled', true);
	$.ajax({
		url : '/user/info',
		type: 'post',
		dataType: 'json',
		data: {
			func: 'update_userinfo',
			nickname: $('#nickname').val(),
			phone: $('#phone').val(),
			rname: $('#rname').val(),
			idnum: $('#idnum').val(),
			sign: $('#sign').val(),
			userId: $('#userId').val()
		},
		success: function(data){
			layer.msg('修改成功');
			$('#sub').attr('disabled', false).html('提交修改');
		},
		error: function(XMLHttpRequest, textStatus, errorThrown){
			layer.msg('修改失败');
			$('#sub').attr('disabled', false).html('提交修改');
		}
	});
	return false;
});