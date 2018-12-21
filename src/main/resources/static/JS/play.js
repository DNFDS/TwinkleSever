function playSong(songid) {
    var songid = parseInt(songid);
    alert('1');
    $.ajax({
        type:"POST",
        url:"/addSongToList",
        data:{
            songID:songid
        },
        dataType: "json",   //返回值类型       使用json的话也可以，但是需要在JS中编写迭代的html代码，如果格式样式
        cache:true,
        success:function(data){
        alert('2');
        }
    });
}

function playSongList(songListID) {
    $.ajax({
        type:"POST",
        url:"/addSongListToList",
        data:{
            songListID:songListID
        },
        dataType: "text",   //返回值类型       使用json的话也可以，但是需要在JS中编写迭代的html代码，如果格式样式
        cache:true,
        success:function(data){

        }
    });
}

function playAlbum(albumID) {
    $.ajax({
        type:"POST",
        url:"/addAlbumToList",
        data:{
            albumID:albumID
        },
        dataType: "text",   //返回值类型       使用json的话也可以，但是需要在JS中编写迭代的html代码，如果格式样式
        cache:true,
        success:function(data){

        }
    });
}