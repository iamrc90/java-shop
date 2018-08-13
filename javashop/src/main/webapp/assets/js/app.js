$(function(){
	activeMenu(window);
});


function activeMenu(window){
	let path = window.location.pathname;
	let route = path.split("/");
	route = route[route.length -1];
	$("#"+route).addClass("active");
}