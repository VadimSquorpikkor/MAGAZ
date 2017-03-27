package com.example.squorpikkor.magaz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;

    TextView textView7;

    EditText editText;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    EditText editText9;
    EditText editText10;
    EditText editText11;
    EditText editText12;

    //TextView textView15;
    //TextView textView16;
    TextView textView17;
    //TextView textView18;
    TextView textView19;

    TextView textView25;

    EditText editText13;
    EditText editText14;
    EditText editText15;
    EditText editText16;
    EditText editText17;
    EditText editText18;
    EditText editText19;
    EditText editText20;
    EditText editText21;
    EditText editText22;
    EditText editText23;
    EditText editText24;
    EditText editText25;
    EditText editText26;
    EditText editText27;
    EditText editText28;
    EditText editText29;
    EditText editText30;
    EditText editText31;
    EditText editText32;
    EditText editText33;
    EditText editText34;
    EditText editText35;
    EditText editText36;
    EditText editText37;
    EditText editText38;
    EditText editText39;
    EditText editText40;
    EditText editText41;
    EditText editText42;
    EditText editText43;
    EditText editText44;
    EditText editText45;
    EditText editText46;
    EditText editText47;
    EditText editText48;
    EditText editText49;
    EditText editText50;
    EditText editText51;
    EditText editText52;
    EditText editText53;
    EditText editText54;
    EditText editText55;
    EditText editText56;
    EditText editText57;
    EditText editText58;
    EditText editText59;
    EditText editText60;
    EditText editText61;
    EditText editText62;
    EditText editText63;
    EditText editText64;
    EditText editText65;
    EditText editText66;
    EditText editText67;
    EditText editText68;
    EditText editText69;
    EditText editText70;
    EditText editText71;
    EditText editText72;

    int malmol;
    int malsok;
    int rashod;
    int sokovvzal = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        textView7 = (TextView) findViewById(R.id.textView7);
        //textView15 = (TextView) findViewById(R.id.textView15);
        //textView16 = (TextView) findViewById(R.id.textView16);
        textView17 = (TextView) findViewById(R.id.textView17);
        //textView18 = (TextView) findViewById(R.id.textView18);
        textView19 = (TextView) findViewById(R.id.textView19);
        textView25 = (TextView) findViewById(R.id.textView25);

        editText = (EditText) findViewById(R.id.editText);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText8 = (EditText) findViewById(R.id.editText8);
        editText9 = (EditText) findViewById(R.id.editText9);
        editText10 = (EditText) findViewById(R.id.editText10);
        editText11 = (EditText) findViewById(R.id.editText11);
        editText12 = (EditText) findViewById(R.id.editText12);
        editText13 = (EditText) findViewById(R.id.editText13);
        editText14 = (EditText) findViewById(R.id.editText14);
        editText15 = (EditText) findViewById(R.id.editText15);
        editText16 = (EditText) findViewById(R.id.editText16);
        editText17 = (EditText) findViewById(R.id.editText17);
        editText18 = (EditText) findViewById(R.id.editText18);
        editText19 = (EditText) findViewById(R.id.editText19);
        editText20 = (EditText) findViewById(R.id.editText20);
        editText21 = (EditText) findViewById(R.id.editText21);
        editText22 = (EditText) findViewById(R.id.editText22);
        editText23 = (EditText) findViewById(R.id.editText23);
        editText24 = (EditText) findViewById(R.id.editText24);
        editText25 = (EditText) findViewById(R.id.editText25);
        editText26 = (EditText) findViewById(R.id.editText26);
        editText27 = (EditText) findViewById(R.id.editText27);
        editText28 = (EditText) findViewById(R.id.editText28);
        editText29 = (EditText) findViewById(R.id.editText29);
        editText30 = (EditText) findViewById(R.id.editText30);
        editText31 = (EditText) findViewById(R.id.editText31);
        editText32 = (EditText) findViewById(R.id.editText32);
        editText33 = (EditText) findViewById(R.id.editText33);
        editText34 = (EditText) findViewById(R.id.editText34);
        editText35 = (EditText) findViewById(R.id.editText35);
        editText36 = (EditText) findViewById(R.id.editText36);
       editText37 = (EditText) findViewById(R.id.editText37);
        editText38 = (EditText) findViewById(R.id.editText38);
        editText39 = (EditText) findViewById(R.id.editText39);
        editText40 = (EditText) findViewById(R.id.editText40);
        editText41 = (EditText) findViewById(R.id.editText41);
        editText42 = (EditText) findViewById(R.id.editText42);
        editText43 = (EditText) findViewById(R.id.editText43);
        editText44 = (EditText) findViewById(R.id.editText44);
        editText45 = (EditText) findViewById(R.id.editText45);
        editText46 = (EditText) findViewById(R.id.editText46);
        editText47 = (EditText) findViewById(R.id.editText47);
        editText48 = (EditText) findViewById(R.id.editText48);
        editText49 = (EditText) findViewById(R.id.editText49);
        editText50 = (EditText) findViewById(R.id.editText50);
        editText51 = (EditText) findViewById(R.id.editText51);
        editText52 = (EditText) findViewById(R.id.editText52);
        editText53 = (EditText) findViewById(R.id.editText53);
        editText54 = (EditText) findViewById(R.id.editText54);
        editText55 = (EditText) findViewById(R.id.editText55);
        editText56 = (EditText) findViewById(R.id.editText56);
        editText57 = (EditText) findViewById(R.id.editText57);
        editText58 = (EditText) findViewById(R.id.editText58);
        editText59 = (EditText) findViewById(R.id.editText59);
        editText60 = (EditText) findViewById(R.id.editText60);
        editText61 = (EditText) findViewById(R.id.editText61);
        editText62 = (EditText) findViewById(R.id.editText62);
       editText63 = (EditText) findViewById(R.id.editText63);
        editText64 = (EditText) findViewById(R.id.editText64);
        editText65 = (EditText) findViewById(R.id.editText65);
        editText66 = (EditText) findViewById(R.id.editText66);
        editText67 = (EditText) findViewById(R.id.editText67);
        editText68 = (EditText) findViewById(R.id.editText68);
        editText69 = (EditText) findViewById(R.id.editText69);
        editText70 = (EditText) findViewById(R.id.editText70);
        editText71 = (EditText) findViewById(R.id.editText71);
        editText72 = (EditText) findViewById(R.id.editText72);

    }

    public void summa(View view) {

        rashod = 0;
        sokovvzal = 0;

        int sum = Integer.parseInt(editText1.getText().toString());
        sum += Integer.parseInt(editText2.getText().toString());
        sum += Integer.parseInt(editText3.getText().toString());
        sum += Integer.parseInt(editText4.getText().toString());
        sum += Integer.parseInt(editText5.getText().toString());



        int melkiysok = Integer.parseInt(editText11.getText().toString());

        switch (melkiysok){
            case 0 :  malsok=0;break;
            case 25 :  malsok=1;break;
            case 50 :  malsok=2;break;
            case 5 :  malsok=2;break;
            case 75 :  malsok=3;break;
        }

        int melkiymol = Integer.parseInt(editText12.getText().toString());

        switch (melkiymol){
            case 0 :  malmol=0;break;
            case 25 :  malmol=1;break;
            case 50 :  malmol=2;break;
            case 5 :  malmol=2;break;
            case 75 :  malmol=3;break;
        }

        int bablo = (Integer.parseInt(editText.getText().toString()))*(Integer.parseInt(editText9.getText().toString()));
            bablo += (Integer.parseInt(editText6.getText().toString()))*(Integer.parseInt(editText10.getText().toString()));
            bablo += (Integer.parseInt(editText7.getText().toString()))*malsok;
            bablo += (Integer.parseInt(editText8.getText().toString()))*malmol;











        if((editText13.getText().length() != 0)&&(editText23.getText().length() != 0)){
            rashod += (Integer.parseInt(editText13.getText().toString()))*
                    (Integer.parseInt(editText23.getText().toString()));
            sokovvzal += Integer.parseInt(editText23.getText().toString());
        }
        
        if((editText14.getText().length() != 0)&&(editText24.getText().length() != 0)){
            rashod += (Integer.parseInt(editText14.getText().toString()))*
                    (Integer.parseInt(editText24.getText().toString()));
            sokovvzal += Integer.parseInt(editText24.getText().toString());
        }
        
        if((editText15.getText().length() != 0)&&(editText25.getText().length() != 0)){
            rashod += (Integer.parseInt(editText15.getText().toString()))*
                    (Integer.parseInt(editText25.getText().toString()));
            sokovvzal += Integer.parseInt(editText25.getText().toString());
        }
        
        if((editText16.getText().length() != 0)&&(editText26.getText().length() != 0)){
            rashod += (Integer.parseInt(editText16.getText().toString()))*
                    (Integer.parseInt(editText26.getText().toString()));
            sokovvzal += Integer.parseInt(editText26.getText().toString());
        }
        
        if((editText17.getText().length() != 0)&&(editText27.getText().length() != 0)){
            rashod += (Integer.parseInt(editText17.getText().toString()))*
                    (Integer.parseInt(editText27.getText().toString()));
            sokovvzal += Integer.parseInt(editText27.getText().toString());
        }
        
        if((editText18.getText().length() != 0)&&(editText28.getText().length() != 0)){
            rashod += (Integer.parseInt(editText18.getText().toString()))*
                    (Integer.parseInt(editText28.getText().toString()));
            sokovvzal += Integer.parseInt(editText28.getText().toString());
        }
        
        if((editText19.getText().length() != 0)&&(editText29.getText().length() != 0)){
            rashod += (Integer.parseInt(editText19.getText().toString()))*
                    (Integer.parseInt(editText29.getText().toString()));
            sokovvzal += Integer.parseInt(editText29.getText().toString());
        }
        
        if((editText20.getText().length() != 0)&&(editText30.getText().length() != 0)){
            rashod += (Integer.parseInt(editText20.getText().toString()))*
                    (Integer.parseInt(editText30.getText().toString()));
            sokovvzal += Integer.parseInt(editText30.getText().toString());
        }
        
        if((editText21.getText().length() != 0)&&(editText31.getText().length() != 0)){
            rashod += (Integer.parseInt(editText21.getText().toString()))*
                    (Integer.parseInt(editText31.getText().toString()));
            sokovvzal += Integer.parseInt(editText31.getText().toString());
        }
        
        if((editText22.getText().length() != 0)&&(editText32.getText().length() != 0)){
            rashod += (Integer.parseInt(editText22.getText().toString()))*
                    (Integer.parseInt(editText32.getText().toString()));
            sokovvzal += Integer.parseInt(editText32.getText().toString());
        }
        


        if((editText33.getText().length() != 0)&&(editText53.getText().length() != 0)){
            rashod += (Integer.parseInt(editText33.getText().toString()))*
                    (Integer.parseInt(editText53.getText().toString()));
            sokovvzal += Integer.parseInt(editText53.getText().toString());
        }

        if((editText34.getText().length() != 0)&&(editText54.getText().length() != 0)){
            rashod += (Integer.parseInt(editText34.getText().toString()))*
                    (Integer.parseInt(editText54.getText().toString()));
            sokovvzal += Integer.parseInt(editText54.getText().toString());
        }

        if((editText35.getText().length() != 0)&&(editText55.getText().length() != 0)){
            rashod += (Integer.parseInt(editText35.getText().toString()))*
                    (Integer.parseInt(editText55.getText().toString()));
            sokovvzal += Integer.parseInt(editText55.getText().toString());
        }

        if((editText36.getText().length() != 0)&&(editText56.getText().length() != 0)){
            rashod += (Integer.parseInt(editText36.getText().toString()))*
                    (Integer.parseInt(editText56.getText().toString()));
            sokovvzal += Integer.parseInt(editText56.getText().toString());
        }

        if((editText37.getText().length() != 0)&&(editText57.getText().length() != 0)){
            rashod += (Integer.parseInt(editText37.getText().toString()))*
                    (Integer.parseInt(editText57.getText().toString()));
            sokovvzal += Integer.parseInt(editText57.getText().toString());
        }

//////////////////////////////////////////////////////////////////////////////////////////


        textView7.setText(Integer.toString(sokovvzal)+"/"+Integer.toString(sum));
        textView19.setText(Integer.toString(bablo));

        if(sokovvzal!=sum){
            textView7.setTextColor(Color.RED);
            textView17.setTextColor(Color.RED);
            textView25.setTextColor(Color.RED);
            textView19.setTextColor(Color.RED);
        }
        else {
            textView7.setTextColor(Color.BLUE);
            textView17.setTextColor(Color.BLUE);
            textView25.setTextColor(Color.BLUE);
            textView19.setTextColor(Color.BLUE);
        }

////////////////////////////////КРОМЕ СОКОВ//////////////////////////////////////////////


        if((editText38.getText().length() != 0)&&(editText43.getText().length() != 0)){
            rashod += (Integer.parseInt(editText38.getText().toString()))*
                    (Integer.parseInt(editText43.getText().toString()));
        }

        if((editText39.getText().length() != 0)&&(editText44.getText().length() != 0)){
            rashod += (Integer.parseInt(editText39.getText().toString()))*
                    (Integer.parseInt(editText44.getText().toString()));
        }

        if((editText40.getText().length() != 0)&&(editText45.getText().length() != 0)){
            rashod += (Integer.parseInt(editText40.getText().toString()))*
                    (Integer.parseInt(editText45.getText().toString()));
        }

        if((editText41.getText().length() != 0)&&(editText46.getText().length() != 0)){
            rashod += (Integer.parseInt(editText41.getText().toString()))*
                    (Integer.parseInt(editText46.getText().toString()));
        }

        if((editText42.getText().length() != 0)&&(editText47.getText().length() != 0)){
            rashod += (Integer.parseInt(editText42.getText().toString()))*
                    (Integer.parseInt(editText47.getText().toString()));
        }






        if((editText58.getText().length() != 0)&&(editText48.getText().length() != 0)){
            rashod += (Integer.parseInt(editText58.getText().toString()))*
                    (Integer.parseInt(editText48.getText().toString()));
        }

        if((editText59.getText().length() != 0)&&(editText49.getText().length() != 0)){
            rashod += (Integer.parseInt(editText59.getText().toString()))*
                    (Integer.parseInt(editText49.getText().toString()));
        }

        if((editText60.getText().length() != 0)&&(editText50.getText().length() != 0)){
            rashod += (Integer.parseInt(editText60.getText().toString()))*
                    (Integer.parseInt(editText50.getText().toString()));
        }

        if((editText61.getText().length() != 0)&&(editText51.getText().length() != 0)){
            rashod += (Integer.parseInt(editText61.getText().toString()))*
                    (Integer.parseInt(editText51.getText().toString()));
        }

        if((editText62.getText().length() != 0)&&(editText52.getText().length() != 0)){
            rashod += (Integer.parseInt(editText62.getText().toString()))*
                    (Integer.parseInt(editText52.getText().toString()));
        }








        if((editText63.getText().length() != 0)&&(editText68.getText().length() != 0)){
            rashod += (Integer.parseInt(editText63.getText().toString()))*
                    (Integer.parseInt(editText68.getText().toString()));
        }

        if((editText64.getText().length() != 0)&&(editText69.getText().length() != 0)){
            rashod += (Integer.parseInt(editText64.getText().toString()))*
                    (Integer.parseInt(editText69.getText().toString()));
        }

        if((editText65.getText().length() != 0)&&(editText70.getText().length() != 0)){
            rashod += (Integer.parseInt(editText65.getText().toString()))*
                    (Integer.parseInt(editText70.getText().toString()));
        }

        if((editText66.getText().length() != 0)&&(editText71.getText().length() != 0)){
            rashod += (Integer.parseInt(editText66.getText().toString()))*
                    (Integer.parseInt(editText71.getText().toString()));
        }

        if((editText67.getText().length() != 0)&&(editText72.getText().length() != 0)){
            rashod += (Integer.parseInt(editText67.getText().toString()))*
                    (Integer.parseInt(editText72.getText().toString()));
        }



        int ostatok = bablo - rashod;
        int milost = ostatok%1000000;
        int mil = (ostatok-milost)/1000000;
        int tysost = ostatok%1000;
        int tys = (milost-tysost)/1000;

        textView25.setText(mil+" "+tys+" "+tysost);
        textView17.setText(Integer.toString(ostatok/2));

        //int ostatok = bablo - rashod;
        //textView25.setText(Integer.toString(ostatok));
        //textView17.setText(Integer.toString(ostatok/2));


    }
}
