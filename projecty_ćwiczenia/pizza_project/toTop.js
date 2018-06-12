$(document).ready(run);
function run() {
  var KOLORGÓRZIKU = "yellow";  
  $("body").append('<div id="toTop"><div></div></div>');
  $("#toTop").css({"background-color": KOLORGÓRZIKU,"padding": "15px","position": "fixed",
    "zIndex": "100000","right": "48","left": "48.5%","bottom": "40px","border-radius": "25%",
	"cursor": "pointer","display": "none", "opacity": "0.8"
  });
  toTopSetup();
  $(window).scroll(toTopSetup);
  $(window).resize(toTopSetup);
  $("#toTop").click(gotoTop);
  function toTopSetup() {
    $(window).scrollTop() > 100 ? $("#toTop").show() : $("#toTop").hide();
  }
  function gotoTop() {
    $("html, body").animate({"scrollTop": 0}, 1700);
  }
	}
