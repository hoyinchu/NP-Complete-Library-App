package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubsetSumContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subset_sum_content);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.three_satisfiability_entry:
                startActivity( new Intent(this,ThreeSatisfiabilityContent.class));
                break;
            case R.id.three_dimensional_matching_entry:
                startActivity(new Intent(this,ThreeDimensionalMatchingContent.class));
                break;
            case R.id.partition_entry:
                startActivity(new Intent(this, PartitionContent.class));
                break;
            default:
                break;
        }
    }

}
