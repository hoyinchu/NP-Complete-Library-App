package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PartitionContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partition_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.subset_sum_entry:
                startActivity(new Intent(this,SubsetSumContent.class));
                break;
            case R.id.job_scheduling_entry:
                startActivity(new Intent(this,JobSchedulingContent.class));
                break;
            case R.id.bin_packing_entry:
                startActivity(new Intent(this,BinPackingContent.class));
                break;
            default:
                break;
        }
    }

}
