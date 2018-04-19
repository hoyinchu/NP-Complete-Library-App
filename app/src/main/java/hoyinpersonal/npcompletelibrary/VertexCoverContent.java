package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VertexCoverContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertex_cover_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.three_satisfiability_entry:
                startActivity(new Intent(this,ThreeSatisfiabilityContent.class));
                break;
            case R.id.hamiltonian_cycle_entry:
                startActivity(new Intent(this, HamiltonianCycleContent.class));
                break;
            case R.id.independent_set_entry:
                startActivity(new Intent(this,IndependentSetContent.class));
                break;
            case R.id.set_cover_entry:
                startActivity(new Intent(this,SetCoverContent.class));
                break;
            case R.id.feedback_vertex_set_entry:
                startActivity(new Intent(this,FeedbackVertexSetContent.class));
                break;
            case R.id.feedback_arc_set_entry:
                startActivity(new Intent(this,FeedbackArcSetContent.class));
                break;
            case R.id.dominating_set_entry:
                startActivity(new Intent(this,DominatingSetContent.class));
                break;
            default:
                break;
        }
    }

}
