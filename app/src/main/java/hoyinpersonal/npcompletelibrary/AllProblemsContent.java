package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AllProblemsContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_problems_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bin_packing_entry:
                startActivity(new Intent(this, BinPackingContent.class));
                break;
            case R.id.clique_entry:
                startActivity(new Intent(this,CliqueContent.class));
                break;
            case R.id.dominating_set_entry:
                startActivity(new Intent(this,DominatingSetContent.class));
                break;
            case R.id.feedback_arc_set_entry:
                startActivity(new Intent(this,FeedbackArcSetContent.class));
                break;
            case R.id.feedback_vertex_set_entry:
                startActivity(new Intent(this,FeedbackVertexSetContent.class));
                break;
            case R.id.hamiltonian_cycle_entry:
                startActivity(new Intent(this,HamiltonianCycleContent.class));
                break;
            case R.id.hamiltonian_path_entry:
                startActivity(new Intent(this,HamiltonianPathContent.class));
                break;
            case R.id.independent_set_entry:
                startActivity(new Intent(this,IndependentSetContent.class));
                break;
            case R.id.job_scheduling_entry:
                startActivity(new Intent(this,JobSchedulingContent.class));
                break;
            case R.id.longest_path_entry:
                startActivity(new Intent(this,LongestPathContent.class));
                break;
            case R.id.partition_entry:
                startActivity(new Intent(this, PartitionContent.class));
                break;
            case R.id.satisfiability_entry:
                startActivity(new Intent(this,SatisfiabilityContent.class));
                break;
            case R.id.set_cover_entry:
                startActivity(new Intent(this,SetCoverContent.class));
                break;
            case R.id.set_packing_entry:
                startActivity(new Intent(this,SetPackingContent.class));
                break;
            case R.id.subgraph_isomorphism_entry:
                startActivity(new Intent(this,SubgraphIsomorphismContent.class));
                break;
            case R.id.subset_sum_entry:
                startActivity(new Intent(this,SubsetSumContent.class));
                break;
            case R.id.three_coloring_entry:
                startActivity(new Intent(this,ThreeColoringContent.class));
                break;
            case R.id.three_dimensional_matching_entry:
                startActivity(new Intent(this,ThreeDimensionalMatchingContent.class));
                break;
            case R.id.three_satisfiability_entry:
                startActivity( new Intent(this,ThreeSatisfiabilityContent.class));
                break;
            case R.id.traveling_salesman_entry:
                startActivity(new Intent(this,TravelingSalesmanContent.class));
                break;
            case R.id.vertex_cover_entry:
                startActivity(new Intent(this,VertexCoverContent.class));
                break;
            default:
                break;
        }
    }

}
