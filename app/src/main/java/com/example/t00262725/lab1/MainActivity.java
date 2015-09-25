package com.example.t00262725.lab1;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText txtkm, txtmpg;
        double km,mpg,result;
        Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtkm = (EditText)findViewById(R.id.editText);
        txtmpg = (EditText)findViewById(R.id.editText2);
        button01 = (Button)findViewById(R.id.button_label);

        button01.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(txtkm.getText().toString().length() > 0) {
                km = Double.parseDouble(txtkm.getText().toString());
                //mpg = Double.parseDouble(txtmpg.getText().toString());
                result = 0.42 * km;
                txtmpg.setText(Double.toString(result));
            }

            if(txtkm.getText().toString().length() == 0) {
                Toast.makeText(getApplicationContext(),
                        "Button is clicked", Toast.LENGTH_LONG).show();

            }

         }
         });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
