package com.arrayexa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contx=0;
    int conty=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button2);
        Button button1 = (Button) findViewById(R.id.button4);
        Button button2 = (Button) findViewById(R.id.button3);
        EditText arraysize = (EditText) findViewById(R.id.editText2);
        TextView arraysize1 = (TextView) findViewById(R.id.textView2);
        button.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        arraysize.setVisibility(View.INVISIBLE);
        arraysize1.setVisibility(View.INVISIBLE);



    }

    public void goBack(View view){
        EditText arraysize = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView1);
        Button button = (Button) findViewById(R.id.button);
        arraysize.setVisibility(View.VISIBLE);
        button.setVisibility(View.VISIBLE);
        textView.setVisibility(View.VISIBLE);
        Button button0 = (Button) findViewById(R.id.button2);
        Button button1 = (Button) findViewById(R.id.button4);
        Button button2 = (Button) findViewById(R.id.button3);
        EditText arraysize0 = (EditText) findViewById(R.id.editText2);
        TextView arraysize1 = (TextView) findViewById(R.id.textView2);
        button0.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        arraysize0.setVisibility(View.INVISIBLE);
        arraysize1.setVisibility(View.INVISIBLE);
        arraysize1.setText("");
        arraysize.setText("");


    }

    public void arraySize (View view){

        EditText arraysize = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView1);
        Button button = (Button) findViewById(R.id.button);
        int size = 1;
        if(!arraysize.getText().toString().equals("")){
        size = Integer.parseInt(arraysize.getText().toString());
        }
        arraysize.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        Button button0 = (Button) findViewById(R.id.button2);
        Button button1 = (Button) findViewById(R.id.button4);
        Button button2 = (Button) findViewById(R.id.button3);
        EditText arraysize0 = (EditText) findViewById(R.id.editText2);
        TextView arraysize1 = (TextView) findViewById(R.id.textView2);
        Button order = (Button)findViewById(R.id.button5);
        button0.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        arraysize0.setVisibility(View.VISIBLE);
        arraysize1.setVisibility(View.VISIBLE);
        order.setVisibility(View.INVISIBLE);


        if (arraysize.equals("")){
            size=1;
        }
        conty= size;
        contx=0;
        create();

    }


    private void create (){


        Button sub = (Button)findViewById(R.id.button2);
        Button add = (Button)findViewById(R.id.button4);
        Button order = (Button)findViewById(R.id.button5);

        if (contx==0){
            sub.setVisibility(View.INVISIBLE);
        }
        else{
            sub.setVisibility(View.VISIBLE);
        }
        if (contx==conty){
            add.setVisibility(View.INVISIBLE);
            order.setVisibility(View.VISIBLE);
        }
        else{
            add.setVisibility(View.VISIBLE);
            order.setVisibility(View.INVISIBLE);
        }
    }

    public void add (View view){

        EditText mod = (EditText)findViewById(R.id.editText2);
        TextView num = (TextView) findViewById(R.id.textView2);
        String conca = mod.getText().toString();
        String concaf = num.getText().toString();
        concaf = conca + ","+ concaf;
        num.setText(concaf);
        mod.setText("");

        int prov = contx + 1;
        contx = prov;
        create();
    }

    public void subs (View view){
        TextView num = (TextView) findViewById(R.id.textView2);
        String conca = num.getText().toString();
        String arrayprov[];
        arrayprov = (conca.split(","));
        int i = arrayprov.length;
        arrayprov[i-1] = "";
        num.setText("");
        String comp = "";
        for (int in=0;in<arrayprov.length-1;in++)
            {
               comp= comp + arrayprov[in] +",";

            }
        num.setText(comp);

        int prov = contx - 1;
        contx = prov;
        create();
    }

    public  void order66 (View view){
        //execute order 66

        TextView num = (TextView) findViewById(R.id.textView2);
        String conca[] = num.getText().toString().split(",");
        int arrayprov[]= new int[conca.length];
        for(int i =0; i<conca.length;i++){
            arrayprov[i] = Integer.parseInt(conca[i]);
        }
        main(arrayprov);
    }

    private void main(int... arraysize) {


        //int num[] = {1,2,3,11,3,4,3,5,7,5,5,1,2,1,1,9};
        int num[] = new int[arraysize.length];
        int num2[] = new int[16];// hacer un sting con todos los no repetidos y sacar el tama;o total.
        num = arraysize;
        int y=0;
        int flag;
        int cont = 0;
        for(int i=0;i<num.length;i++)
        {
            int x=num[i];
            flag = 1;
            for(int u=0;u<num2.length;u++)
            {
                if (num2[u]==x)
                {
                    flag=0;
                }
            }
            if (flag ==1)
            {
                num2[y]=x;
                System.out.println(num2[y]);
                y++;
            }
        }
        for (int p=0;p<num2.length;p++)
        {
            for (int t=0;t<num.length;t++)
            {
                if(num2[p] == num[t])
                {
                    cont++;
                }
            }
            if (num2[p]==0){}
            else{
                System.out.println("numero" + num2[p] + "veces" + cont);
            }
            cont = 0;
        }
    }
}
