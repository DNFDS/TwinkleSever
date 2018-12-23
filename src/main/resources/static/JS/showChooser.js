// JavaScript Document
function choseSongList(index,songid){
    $.ajax({
        type:"GET",
        url:"/getMySongList",
        data:{
            songid:songid
        },
        dataType: "html",   //返回值类型       使用json的话也可以，但是需要在JS中编写迭代的html代码，如果格式样式
        cache:true,
        success:function(data){
            $('#popwindow').html(data);
            popwindowup(index);
        },
        error:function(){
            alert('请求失败');
        }
    });
}
function favoriteSong(songid) {
    $.ajax({
        type:"POST",
        url:"/favoriteSong",
        data:{
            songid:songid
        },
        dataType: "json",
        cache:true,
        success:function(data){
            showTips( data.errorMsg, 50, 1 );
        }
    });
}
function KeepSonglist(songlistid) {
    $.ajax({
        type:"POST",
        url:"/KeepSongList",
        data:{
            songlistid:songlistid,
        },
        dataType: "json",   //返回值类型       使用json的话也可以，但是需要在JS中编写迭代的html代码，如果格式样式
        cache:true,
        success:function(data){
            showTips(data.errorMsg,50,1);
        }
    });
}
document.onclick = function (event)  {
    var e = event || window.event;
    var istrue="false";
    var elem = e.srcElement||e.target;
    var styleVal1 = document.getElementById('popwindow').getAttribute("style");
    var len= styleVal1.length;
    var xx= styleVal1.substring(0,14);
    var yy= styleVal1.substring(14,len);
    if(xx=="display:block;"){
        while(elem)
        {
            if(elem.id == "popwindow"||elem.id =="add")
            {
                istrue="true";
                break;
            }
            elem = elem.parentNode;
        }
        if(istrue!="true"){
            styleVal1="display:none;"+yy;
            document.getElementById("popwindow").setAttribute("style",styleVal1);
        }
    }
    var e = event || window.event;
    var elem = e.srcElement||e.target;

    while(elem)
    {
        if(elem.id == "search_group"||elem.id == "search_result")
        {
            return;
        }
        elem = elem.parentNode;
    }
    search_out();
}