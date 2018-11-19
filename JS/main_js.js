// JavaScript Document
//disc_js
function disc_over(id)
{
	var classVal = document.getElementById(id).getAttribute("class");
	if(classVal =="")
	{
		classVal=classVal.replace("","disc_current");
		document.getElementById(id).setAttribute("class",classVal);	
	}
}
function disc_out(id)
{
	var classVal = document.getElementById(id).getAttribute("class");
	if(classVal =="disc_current")
	{
		classVal=classVal.replace("disc_current","");
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