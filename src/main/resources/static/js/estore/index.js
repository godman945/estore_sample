
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
	
	//送出資料
	function sendAlexData(){
	
	let formData = new FormData();
	formData.append("name", $("#data1").val());
	formData.append("addr", $("#data2").val());
	formData.append("userfile", $("#alexFile")[0].files[0]);
	//console.log($("#alexFile")[0]);
	
	console.log("----查看資料-------");
	for (var key of formData.entries()) {
        console.log(key[0]);
        console.log(key[1]);
        console.log("----END-------");
    }
	
	$.ajax({
		url:"alex4",
		data: formData,
		cache: false,
        contentType: false,
        processData: false,
		type:"post",
		success:function(response, status){
			console.log(response);
		},
		error: function(xtl) {
			console.log(xtl);
			
		}
	});
}
