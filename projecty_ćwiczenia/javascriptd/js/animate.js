$(document).ready(run);

var czasprędkość1 = (1000);
var czasprędkość2 = (1000);
var czasprędkość3 = (1000);

function run() {
  $("img").css("position", "relative");
  $("#pierwszy").animate({"left": 1100}, czasprędkość1);
  $("#drugie").animate({"opacity": 0}, czasprędkość2);
  $("#trzecie").animate({"opacity": 1}, czasprędkość3);
  $("#trzecie").animate({"left": 1100,"top": -500}, 1100,
  function(){
    $(this).animate({"left": "500"}, czasprędkość3);
    $("#pierwszy").animate({"left": "500"}, czasprędkość1);
  });
}


