// JavaScript Document
//disc_js
function showTips( content, height, time ){
    //窗口的宽度
    var windowWidth  = $(window).width();
    var tipsDiv = '<div class="tipsClass">' + content + '</div>';
    $( 'body' ).append( tipsDiv );
    $( 'div.tipsClass' ).css({
        'top'       : '50%',
        'left'      : '40%',
        'position'  : 'fixed',
        'padding'   : '3px 5px',
        'background': '#8FBC8F',
        'font-size' : 12 + 'px',
        'margin'    : '0 auto',
        'text-align': 'center',
        'width'     : '350px',
        'height'    : 'auto',
        'color'     : '#fff',
        'opacity'   : '0.8'
    }).show();
    setTimeout( function(){$( 'div.tipsClass' ).fadeOut();}, ( time * 1000 ) );
}
function disc_over(id)
{
	var classVal = document.getElementById(id).getAttribute("class");
	if(classVal =="")
	{
		if(id=="disc1"){
			classVal=classVal.replace("","disc_current1");
			document.getElementById(id).setAttribute("class",classVal);	
		}
		else if(id=="disc2"){
			classVal=classVal.replace("","disc_current2");
			document.getElementById(id).setAttribute("class",classVal);
		}
		else if(id=="disc3"){
			classVal=classVal.replace("","disc_current3");
			document.getElementById(id).setAttribute("class",classVal);
		}
		else if(id=="disc4"){
			classVal=classVal.replace("","disc_current4");
			document.getElementById(id).setAttribute("class",classVal);
		}
	}
}

function buttonShow(index){
    $("#oa_"+index).show();
}
function buttonhide(index){
    $("#oa_"+index).hide();
}
function disc_out(id)
{
	var classVal = document.getElementById(id).getAttribute("class");
	if(classVal =="disc_current1")
	{
		classVal=classVal.replace("disc_current1","");
		document.getElementById(id).setAttribute("class",classVal);	
	}
	else if(classVal =="disc_current2")
	{
		classVal=classVal.replace("disc_current2","");
		document.getElementById(id).setAttribute("class",classVal);	
	}
	else if(classVal =="disc_current3")
	{
		classVal=classVal.replace("disc_current3","");
		document.getElementById(id).setAttribute("class",classVal);	
	}
	else if(classVal =="disc_current4")
	{
		classVal=classVal.replace("disc_current4","");
		document.getElementById(id).setAttribute("class",classVal);	
	}
}
function disc1_over()
{
	disc_over("disc1");
}
function disc2_over()
{
	disc_over("disc2");
}
function disc3_over()
{
	disc_over("disc3");
}
function disc4_over()
{
	disc_over("disc4");
}
function disc5_over()
{
	disc_over("disc5");
}
function disc1_out()
{
	disc_out("disc1");
}
function disc2_out()
{
	disc_out("disc2");
}
function disc3_out()
{
	disc_out("disc3");
}
function disc4_out()
{
	disc_out("disc4");
}
function disc5_out()
{
	disc_out("disc5");
}