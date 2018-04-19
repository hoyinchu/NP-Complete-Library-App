package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThreeColoringContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_coloring_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.three_satisfiability_entry:
                startActivity( new Intent(this,ThreeSatisfiabilityContent.class));
                break;
            default:
                break;
        }
    }


}
