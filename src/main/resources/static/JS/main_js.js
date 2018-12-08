// JavaScript Document
//disc_js
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