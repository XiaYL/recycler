package health.rubbish.recycler.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import health.rubbish.recycler.R;
import health.rubbish.recycler.adapter.MainModuleAdapter;
import health.rubbish.recycler.base.BaseActivity;
import health.rubbish.recycler.widget.HeaderLayout;

/**
 * 主功能界面
 */
public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener {

    private MainModuleAdapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViewAndEvents() {
        HeaderLayout headerLayout = (HeaderLayout) findViewById(R.id.header_layout);
        GridView gridView = (GridView) findViewById(R.id.module_gridview);
        adapter = new MainModuleAdapter();
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (adapter.getModule(position)) {
            case R.string.rubbish_collection:
                break;
            case R.string.rubbish_storage:
                break;
            case R.string.rubbish_incar:
                break;
            case R.string.data_sync:
                break;
            case R.string.data_query:
                break;
        }
    }
}
