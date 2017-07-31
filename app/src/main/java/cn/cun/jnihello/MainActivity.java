package cn.cun.jnihello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //固定写法，表示我们要加载的资源文件为libhello.so
    static {
        System.loadLibrary("hello");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView= (TextView) findViewById(R.id.textView);
        textView.setText(getStringFromNative());
    }
    //声明一个本地方法，用native关键字修饰
    public native String getStringFromNative();
}
