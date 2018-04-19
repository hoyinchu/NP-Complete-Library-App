package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CliqueContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clique_content);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.three_satisfiability_entry:
                startActivity(new Intent(this,ThreeSatisfiabilityContent.class));
                break;
            case R.id.independent_set_entry:
                startActivity(new Intent(this,IndependentSetContent.class));
                break;
            case R.id.subgraph_isomorphism_entry:
                startActivity(new Intent(this,SubgraphIsomorphismContent.class));
                break;
            default:
                break;
        }
    }
}
