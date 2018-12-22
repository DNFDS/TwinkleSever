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
            alert(data.errorMsg);
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