// JavaScript Document
function search_click_keydown()
{
	var input_value=document.getElementById('search_input').value;
	if(input_value!="")
	{
		search_other_out_setTimeout();
		search_result_drop();
	}
	else
	{
		search_result_out_setTimeout();
		search_other_drop();
	}
}
function search_other_drop()
{
	
	var classVal = document.getElementById('search_other').getAttribute("class");
	if(classVal =="mod_search_other")
	{
		classVal=classVal.concat(" drop");
		document.getElementById("search_other").setAttribute("class",classVal);	
	}
}
function search_result_drop()
{
	var classVal = document.getElementById('search_result').getAttribute("class");
	if(classVal =="mod_search_result")
	{
		classVal=classVal.concat(" drop");
		document.getElementById("search_result").setAttribute("class",classVal);	
	}
}	
function search_out()
{
	var input_value=document.getElementById('search_input').value;
	if(input_value!="")
	{
		setTimeout(search_result_out_setTimeout,100);
	}
	else
	{
		setTimeout(search_other_out_setTimeout,100);
	}
}
function search_other_out_setTimeout()
{
	var classVal = document.getElementById('search_other').getAttribute("class");
	if(classVal =="mod_search_other drop")
	{
		classVal=classVal.replace("search_other drop","search_other");
		document.getElementById("search_other").setAttribute("class",classVal);
	}
}
function search_result_out_setTimeout()
{
	var classVal = document.getElementById('search_result').getAttribute("class");
	if(classVal =="mod_search_result drop")
	{
		classVal=classVal.replace("search_result drop","search_result");
		document.getElementById("search_result").setAttribute("class",classVal);
	}
}