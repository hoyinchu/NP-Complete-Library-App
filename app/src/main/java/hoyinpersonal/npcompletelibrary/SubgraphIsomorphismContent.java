package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubgraphIsomorphismContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subgraph_isomorphism_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.clique_entry:
                startActivity(new Intent(this,CliqueContent.class));
                break;
            default:
                break;
        }
    }
}
