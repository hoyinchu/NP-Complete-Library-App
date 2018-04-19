package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HamiltonianCycleContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamiltonian_cycle_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.three_satisfiability_entry:
                startActivity( new Intent(this,ThreeSatisfiabilityContent.class));
                break;
            case R.id.vertex_cover_entry:
                startActivity(new Intent(this, VertexCoverContent.class));
                break;
            case R.id.hamiltonian_path_entry:
                startActivity(new Intent(this,HamiltonianPathContent.class));
                break;
            case R.id.traveling_salesman_entry:
                startActivity(new Intent(this,TravelingSalesmanContent.class));
                break;
            default:
                break;
        }
    }

}
