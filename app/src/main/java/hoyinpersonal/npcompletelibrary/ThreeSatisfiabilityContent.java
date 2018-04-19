package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThreeSatisfiabilityContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_satisfiability_content);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.satisfiability_entry:
                startActivity(new Intent(this,SatisfiabilityContent.class));
                break;
            case R.id.clique_entry:
                startActivity(new Intent(this,CliqueContent.class));
                break;
            case R.id.hamiltonian_cycle_entry:
                startActivity(new Intent(this,HamiltonianCycleContent.class));
                break;
            case R.id.vertex_cover_entry:
                startActivity(new Intent(this,VertexCoverContent.class));
                break;
            case R.id.three_dimensional_matching_entry:
                startActivity(new Intent(this,ThreeDimensionalMatchingContent.class));
                break;
            case R.id.subset_sum_entry:
                startActivity(new Intent(this,SubsetSumContent.class));
                break;
            case R.id.three_coloring_entry:
                startActivity(new Intent(this,ThreeColoringContent.class));
                break;
            default:
                break;
        }
    }
}
