$(document).ready(function(){
	console.log("開始取得初始資料");
	
	var data_address = {"A01": "中文","A02": "英文"};
	console.log(data_address);
	
	
    var languageData = [  {ID:"CN",item:'中文'},    {ID:"EN",item:'English'}	 ];
	//資料綁定
	var language_select = new Vue({
		  el: '#language_select',
		  data: {
			  language_data : languageData
		  },
		  mounted() {
			  $("#language_select").combobox({});
//			  console.log(this.$refs.comp_option[0]);
			}
	});
	
	
	
	
//	
////	  
//	
////	var data,json;
////	data = [];
////	data.push({ "text": "测试", "id":"2"  });
////	$("#rwlb").combobox("loadData", data);
//	
//	 var app = new Vue({
//		  el: '#app3',
//		  data: {
//		    message: [
//		     'A'
//		    ]
//		  }
//		});
//            
//		var language_select = new Vue({
//		  el: '#language_select',
//		  data: {
//		    message: [
//		     {"A":"A01"},
//		     {"A":"A02"}
//		    ]
//		  }
//		});
//		
//		//console.log(language_select.ClassName);
//		
//		
//		 console.log("-----AAAAAAA------");
//		let genderData = {
//		    selectName : '',
//		    lists : [
//		        {val:"M",item:'男'},
//		        {val:"W",item:'女'},
//		    ]
//		}
//
//		let gender = new Vue({
//		    el:'#gender',
//		    data:
//		    {
//		    	alex_class: 'easyui-combobox',
//		    	selectName : genderData,
//		        lists : [
//			        {val:"M",item:'男'},
//			        {val:"W",item:'女'},
//			    ]
//		    },
//			mounted() {
//			/* */
////			 console.log(this);
////			 console.log(this.$refs);
////			 console.log(this.$refs.comp_option);
////			 console.log(this.$refs.comp_option[0]);
////			 console.log(this.$refs.comp_option[1]);
////			 console.log($("#ALEX").css("easyui-combobox"););
//			}
//		});
//		
//	//	console.log(gender);
//		
//		//console.log(gender.$children);
		
		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////END	
})




document.addEventListener("DOMContentLoaded", function(){
	console.log("start vue");
	let firstVueObj = new Vue({
	    el:'#firstVue',
	    data:{
	        content:'Hello!world!',
	    },
	})
	
	
	
	
	

	
	
	
	
	
	
})


