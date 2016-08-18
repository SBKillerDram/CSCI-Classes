
sliderint = 1;
sliderNext = 2;
$(document).ready(function(){
    $("#slider>img#1").fadeIn(300);
    startSlider();
    
$("a.right").click(function(){
    newSlide = sliderint + 1;
    showSlide(newSlide);
});
    
$("a.left").click(function(){
    newSlide = sliderint - 1;
    sliderNext --;
    showSlide(newSlide);
});

$("#slider>img").hover(
    function(){
        stopLoop();
    },
    function(){
        startSlider();
    });


});

function startSlider(){
    count=$("#slider>img").size();
    
    loop = setInterval(function(){
        if(sliderNext > count){
             sliderNext = 1;
             sliderint = 1;
        }
        $("#slider>img").fadeOut(300);
        $("#slider>img#"+sliderNext).delay(300).fadeIn(300);
        sliderint = sliderNext;
        sliderNext++;
    }, 2000);
}

function stopLoop(){
     window.clearInterval(loop); 
}
function showSlide(id){
     stopLoop();
     if(sliderNext > count){
           id = 1;
     }else if(id<1){
         id = count;
     }
      $("#slider>img").fadeOut(300);
      $("#slider>img#"+id).delay(300).fadeIn(300);
      sliderint = id;
      sliderNext = id+1;
      startSlider();
}