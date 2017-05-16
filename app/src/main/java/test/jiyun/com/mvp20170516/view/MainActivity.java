package test.jiyun.com.mvp20170516.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import test.jiyun.com.mvp20170516.R;
import test.jiyun.com.mvp20170516.presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity implements ViewLenstner {
    private EditText xingming;
    private EditText mima;
    private ProgressBar progress;
    private PresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mima = (EditText) findViewById(R.id.mima);
        xingming = (EditText) findViewById(R.id.xingming);
        progress = (ProgressBar) findViewById(R.id.progressbar);
        presenter = new PresenterImpl(this);
        findViewById(R.id.denglu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBar();
                presenter.dianjidenglu(xingming.getText().toString(), mima.getText().toString());
            }
        });
    }

    @Override
    public void chengong() {

        hindBar();
        Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();

    }

    public void showBar() {
        progress.setVisibility(View.VISIBLE);
    }

    public void hindBar() {
        progress.setVisibility(View.INVISIBLE);
    }

    @Override
    public void shibai() {
        hindBar();
        Toast.makeText(this, "失败", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void kaishi() {
        showBar();
    }

    @Override
    public void jieshu() {
        hindBar();
    }
}
