package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_open_in_new extends SVGRenderer {

    public ic_open_in_new(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(19.0f, 19.0f);
        mPath.lineTo(5.0f, 19.0f);
        mPath.lineTo(5.0f, 5.0f);
        mPath.rLineTo(7.0f, 0f);
        mPath.lineTo(12.0f, 3.0f);
        mPath.lineTo(5.0f, 3.0f);
        mPath.rCubicTo(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rLineTo(0f, -7.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 7.0f);
        mPath.close();
        mPath.moveTo(19.0f, 19.0f);
        mPath.moveTo(14.0f, 3.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(3.59f, 0f);
        mPath.rLineTo(-9.83f, 9.83f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.lineTo(19.0f, 6.41f);
        mPath.lineTo(19.0f, 10.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(21.0f, 3.0f);
        mPath.rLineTo(-7.0f, 0f);
        mPath.close();
        mPath.moveTo(14.0f, 3.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}