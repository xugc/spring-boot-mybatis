
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
				$("#main").attr("src","default");
			}else{
				var lmenu=$(".left").find("ul[id='left_menu_"+mindex+"']");
				$(lmenu).show();
				var targetUrl=$(lmenu).find("a[class='selected']").attr("turl");
				$("#main").attr("src",targetUrl);
				$(lmenu).siblings().hide();
				$(".left_title").show();
				$(".catsub").show();
				$(".left").show();
				
			}
		});
	});
	$(".left > ul[class*='side']").each(function(){
		var ulEl=$(this);
		$(ulEl).find("a").click(function(){
			$(this).addClass("selected");
			$(this).parent("li").siblings().find("a").removeClass("selected");
			var targetUrl=$(this).attr("turl");
			$("#main").attr("src",targetUrl);
		});
	});

 }) 
