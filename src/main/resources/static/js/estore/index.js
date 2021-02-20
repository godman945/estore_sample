
﻿$(document).ready(function(){

})

//點擊撈取alex資料
function ckickAlexData(){
	$.ajax({
		url:"alex3",
		data:{
			// "boardType": $("#boardType").val()
		},
		type:"post",
		dataType:"json",
		success:function(response, status){
			console.log(response);
		},
		error: function(xtl) {
			console.log(xtl);
			
		}
	});

}

