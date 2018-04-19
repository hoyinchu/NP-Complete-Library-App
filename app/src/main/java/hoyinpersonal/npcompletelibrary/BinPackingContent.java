package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BinPackingContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bin_packing_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.partition_entry:
                startActivity(new Intent(this, PartitionContent.class));
                break;
            default:
                break;
        }
    }

}
