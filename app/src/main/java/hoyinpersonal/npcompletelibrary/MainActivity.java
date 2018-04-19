package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.satisfiability_entry:
                startActivity(new Intent(this,SatisfiabilityContent.class));
                break;
            case R.id.three_satisfiability_entry:
                startActivity( new Intent(this,ThreeSatisfiabilityContent.class));
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
            case R.id.partition_entry:
                startActivity(new Intent(this, PartitionContent.class));
                break;
            case R.id.all_problems_entry:
                startActivity(new Intent(this,AllProblemsContent.class));
                break;
            case R.id.disclaimer_entry:
                startActivity(new Intent(this,DisclaimerContent.class));
                break;
            default:
                break;
        }
    }
}
