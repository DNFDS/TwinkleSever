// JavaScript Document
function playSong(songid) {
    var songid = parseInt(songid);
    $.ajax({
        type: 'post',
        url: "/addSongToList",
        data: {
            songID: songid
        },
        dataType: 'json',
        success: function (data) {
            window.open(data.urllink);
        },
        error: function () {
            showTips( "添加成功！", 50, 1 );
        }
    });
}
function playSongList(songListID) {
    $.ajax({
        type:'post',
        url:"/addSongListToList",
        data:{
            songListID:songListID
        },
        dataType: 'json',   //返回值类型       使用json的话也可以，但是需要在JS中编写迭代的html代码，如果格式样式
        success:function(data){
            window.open(data.urllink);
        },
        error: function () {
            showTips( "添加成功！", 50, 1 );
        }
    });
}
function playAlbum(albumID) {
    $.ajax({
        type:'post',
        url:"/addAlbumToList",
        data:{
            albumID:albumID
        },
        dataType: 'json',   //返回值类型       使用json的话也可以，但是需要在JS中编写迭代的html代码，如果格式样式
        success:function(data){
            window.open(data.urllink);
        },
        error: function () {
            showTips( "添加成功！", 50, 1 );
        }
    });
}
