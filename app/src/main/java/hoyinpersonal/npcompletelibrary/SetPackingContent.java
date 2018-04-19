package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SetPackingContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_packing_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.independent_set_entry:
                startActivity(new Intent(this,IndependentSetContent.class));
                break;
            default:
                break;
        }
    }

}
