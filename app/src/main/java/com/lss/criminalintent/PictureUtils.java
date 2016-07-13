package com.lss.criminalintent;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;

/**
 * Created by shuai on 16-6-17.
 */
public class PictureUtils {
    public static Bitmap getScaledBitmap(String path, Activity activity){
        Point size = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(size);
        return getScaledBitmap(path,size.x,size.y);
    }
    public static Bitmap getScaledBitmap(String path, int destWidth,int destHeight) {
        //读取在磁盘上的图像的尺寸
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds=true;
        BitmapFactory.decodeFile(path,options);
        int srcWidth = options.outWidth;
        int srcHeight = options.outHeight;
        //如何缩减图片
        int inSampleSize =1;
        if (srcWidth>destWidth||srcHeight>destHeight){
            if (srcWidth > srcHeight){
                inSampleSize = Math.round(srcHeight / destHeight);
            }else {
                inSampleSize= Math.round(srcWidth / destWidth);
            }
        }
        options=new BitmapFactory.Options();
        options.inSampleSize=inSampleSize;
        //读取并创建位图
        return BitmapFactory.decodeFile(path,options);
    }

}
