
var app=getApp()
Page({
    data: {
        cname:'您还未预约课程',
        date:'',
        time:'',
        key:''
      },
    onLoad: function (options) {
     
        this.setData({
          cname:wx.getStorageSync('cname'),
          time:wx.getStorageSync('currentTime'),
          date:wx.getStorageSync('currentIndex')
          // date:wx.getStorage(date),
          // time:wx.getStorage(time),
        })
        
    
    },
    
    

    

})