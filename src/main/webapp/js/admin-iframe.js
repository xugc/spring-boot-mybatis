
 $(function(){  
	$(".top_nav").find("li").each(function(){
		var liEl=$(this);
		$(liEl).find("a").click(function(){
			$(this).addClass("selected");
			liEl.siblings().find("a").removeClass("selected");
			var menuId=$(this).attr("id");
			var mindex=menuId.split("_")[1];
			if(mindex==0){
				$(".left").hide();
			}else{
				var lmenu=$(".left").find("ul[id='left_menu_"+mindex+"']");
				$(lmenu).show();
				$(lmenu).siblings().hide();
				$(".left_title").show();
				$(".catsub").show();
				$(".left").show();
				
			}
		});
	});

 }) 
