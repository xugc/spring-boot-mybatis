function addTab(e) {
	var url = $(e).attr("turl");
	var t = $(e).text();
	if ($("#centerPanel").tabs('exists', t)) {
		$("#centerPanel").tabs('select', t);
	} else {
		$("#centerPanel").tabs('add', {
			title : t,
			content : '<iframe style="width: 100%;height: 100%;" src="' + url + '" frameBorder=0 scrolling="auto"></iframe>',
			closable : true,
			onSelect:function(title,index){
		    }
		});
	}
}

function menuSel(e){
	$(e).addClass("selected");
	$(e).parent("li").siblings().find("a").removeClass("selected");
}

function quickVisit(index) {
	var topIndex = $("#left_menu_" + index).attr("pid");
	$("#left_menu_" + index).parent("li").siblings().find("a").removeClass("selected");
	$("#left_menu_" + index).click();
	$("#menu_" + topIndex).click();
}

$(function() {
	$(".top_nav").find("li").each(function() {
		var liEl = $(this);
		$(liEl).find("a").click(function() {
			menuSel(this);
			var menuId = $(this).attr("id");
			var mindex = menuId.split("_")[1];
			if (mindex == 0) {
				$(".left").hide();
				$("#main").show();
				$("#main").attr("src", "default");
			} else {
				$("#main").hide();
				var lmenu = $("#left_menu_" + mindex );
				$(lmenu).show();
				$(lmenu).siblings().hide();
				$(".left_title").show();
				$(".catsub").show();
				$(".left").show();
				addTab($(lmenu).find("a[class='selected']"));

			}
		});
	});
	$(".left > ul[class='side']").each(function() {
		var ulEl = $(this);
		$(ulEl).find("a").click(function() {
			menuSel(this);
			addTab(this);
		});
	});

})
