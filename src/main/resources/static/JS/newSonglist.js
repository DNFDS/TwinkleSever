function show_newsonglist_div(){
    var styleVal1 = document.getElementById('newsonglist_div').getAttribute("style");
    var styleVal2 = document.getElementById('mask').getAttribute("style");
    var zz="display:block;";
    var dd="display:block;position:fixed;z-index:100000;left:50%;top:50%;margin-left:-260px;margin-top:-121px;"
    styleVal1=dd;
    styleVal2=zz;
    document.getElementById("newsonglist_div").setAttribute("style",styleVal1);
    document.getElementById("mask").setAttribute("style",styleVal2);
}
function close_newsonglist_div(){
    var styleVal1 = document.getElementById('newsonglist_div').getAttribute("style");
    var styleVal2 = document.getElementById('mask').getAttribute("style");
    var zz="display:none;";
    styleVal1=zz;
    styleVal2=zz;
    document.getElementById("newsonglist_div").setAttribute("style",styleVal1);
    document.getElementById("mask").setAttribute("style",styleVal2);
}
function create_newsonglist() {
    var name = document.getElementById('new_playlist_fav').value;
    $.ajax({
        type:'post',
        url:"/createNewSonglist",
        data:{
            name:name,
            isprivate:'0',
            image:'0'
        },
        dataType: 'json',   //返回值类型       使用json的话也可以，但是需要在JS中编写迭代的html代码，如果格式样式
        success:function(data){
            close_newsonglist_div()
            showTips( data['errorMsg'], 50,3);
        },
        error: function () {
            showTips( "创建出错", 50, 1 );
        }
    });
    
}