package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThreeDimensionalMatchingContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_dimensional_matching_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.three_satisfiability_entry:
                startActivity( new Intent(this,ThreeSatisfiabilityContent.class));
                break;
            case R.id.subset_sum_entry:
                startActivity(new Intent(this,SubsetSumContent.class));
                break;
            default:
                break;
        }
    }

}
