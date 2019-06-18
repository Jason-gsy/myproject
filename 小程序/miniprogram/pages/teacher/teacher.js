const app = getApp()
Page({
    
copyTBL:function(e){
    var self=this;
    wx.setClipboardData({
    data: "15075381698",
    success: function(res) {

    }
  });
  },
 copyTBL1:function(e){
    var self=this;
    wx.setClipboardData({
    data: "Jasongsy",
    success: function(res) {

    }
  });
  }

})