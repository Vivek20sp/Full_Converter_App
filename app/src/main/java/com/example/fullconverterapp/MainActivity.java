package com.example.fullconverterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText editText;
    EditText textView;
    Spinner spi;
    Spinner spi1;

    @SuppressLint("SetTextI18n")
    public void OnClickSubmit(View view)
    {
        String item=spi.getSelectedItem().toString();
        String item1=spi1.getSelectedItem().toString();
        String number=editText.getText().toString().trim();
        int no=Integer.parseInt(number);
        String value;
        if(item.equals("select")&&item1.equals("select")) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
        else if(editText.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter The Number", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(item.equals("Kilometer") && item1.equals("Kilometer"))
            {
                value= Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Kilometer") && item1.equals("Meter"))
            {
                value=Integer.toString(no*1000);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Decimeter"))
            {
                value=Integer.toString(no*10000);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Centimeter"))
            {
                value=Integer.toString(no*100000);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Millimeter"))
            {
                value=Integer.toString(no*1000000);
                textView.setText(value);
            }
            else if(item.equals("Kilometer") && item1.equals("Micrometer"))
            {
                value=Integer.toString(no*1000000000);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*0.539957);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Mile"))
            {
                value=Double.toString(no*0.621371);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Yard"))
            {
                value=Double.toString(no*1093.61);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Foot"))
            {
                value= Double.toString(no*3280.84);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Inch"))
            {
                value= Double.toString(no*39370.1);
                textView.setText(value);
            }
            else if (item.equals("Kilometer") && item1.equals("Astronomical Unit"))
            {
                value=Double.toString(no*6.6846e-9);
                textView.setText(value);
            }
            // next line starts here
            else if(item.equals("Meter") && item1.equals("Meter"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Meter") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*0.001);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Decimeter"))
            {
                value=Integer.toString(no*10);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Centimeter"))
            {
                value=Integer.toString(no*100);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Millimeter"))
            {
                value=Integer.toString(no*1000);
                textView.setText(value);
            }
            else if(item.equals("Meter") && item1.equals("Micrometer"))
            {
                value=Integer.toString(no*1000000);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Nautical Mile"))
            {
                value= Double.toString(no*0.000539957);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Mile"))
            {
                value=Double.toString(no*0.000621371);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Yard"))
            {
                value=Double.toString(no*1.09361);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Foot"))
            {
                value=Double.toString(no*3.28084);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Inch"))
            {
                value=Double.toString(no*39.3701);
                textView.setText(value);
            }
            else if (item.equals("Meter") && item1.equals("Astronomical Unit"))
            {
                value=Double.toString(no*6.68459e-12);
                textView.setText(value);
            }
            // next line starts here
            else if(item.equals("Decimeter") && item1.equals("Decimeter"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Decimeter") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*0.0001);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Meter"))
            {
                value=Double.toString(no*0.1);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Centimeter"))
            {
                value=Integer.toString(no*10);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Millimeter"))
            {
                value=Integer.toString(no*100);
                textView.setText(value);
            }
            else if(item.equals("Decimeter") && item1.equals("Micrometer"))
            {
                value=Integer.toString(no*100000);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*5.39957e-5);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Mile"))
            {
                value=Double.toString(no*6.21371e-5);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Yard"))
            {
                value=Double.toString(no*0.109361);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Foot"))
            {
                value=Double.toString(no*0.328084);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Inch"))
            {
                value=Double.toString(no*3.93701);
                textView.setText(value);
            }
            else if (item.equals("Decimeter") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            // next line starts here
            else if(item.equals("Centimeter") && item1.equals("Centimeter"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Centimeter") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*1e-5);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Meter"))
            {
                value=Double.toString(no*0.01);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Decimeter"))
            {
                value=Double.toString(no*0.1);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Millimeter"))
            {
                value=Integer.toString(no*10);
                textView.setText(value);
            }
            else if(item.equals("Centimeter") && item1.equals("Micrometer"))
            {
                value=Integer.toString(no*10000);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*5.39957e-6);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Mile"))
            {
                value=Double.toString(no*6.21371e-6);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Yard"))
            {
                value=Double.toString(no*0.0109361);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Foot"))
            {
                value=Double.toString(no*0.0328084);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Inch"))
            {
                value=Double.toString(no*0.393701);
                textView.setText(value);
            }
            else if (item.equals("Centimeter") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            // next line starts here
            else if(item.equals("Millimeter") && item1.equals("Millimeter"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Millimeter") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*1e-6);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Meter"))
            {
                value=Double.toString(no*0.001);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Decimeter"))
            {
                value=Double.toString(no*0.01);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Centimeter"))
            {
                value=Double.toString(no*0.1);
                textView.setText(value);
            }
            else if(item.equals("Millimeter") && item1.equals("Micrometer"))
            {
                value=Integer.toString(no*1000);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*5.39957e-7);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Mile"))
            {
                value=Double.toString(no*6.21371e-7);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Yard"))
            {
                value=Double.toString(no*0.00109361);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Foot"))
            {
                value=Double.toString(no*0.00328084);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Inch"))
            {
                value=Double.toString(no*0.0393701);
                textView.setText(value);
            }
            else if (item.equals("Millimeter") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            // next line starts here
            else if(item.equals("Micrometer") && item1.equals("Micrometer"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Micrometer") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*1e-9);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Meter"))
            {
                value=Double.toString(no*1e-6);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Decimeter"))
            {
                value=Double.toString(no*1e-5);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Centimeter"))
            {
                value=Double.toString(no*1e-4);
                textView.setText(value);
            }
            else if(item.equals("Micrometer") && item1.equals("Millimeter"))
            {
                value=Double.toString(no*0.001);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*5.39957e-10);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Mile"))
            {
                value=Double.toString(no*6.21371e-10);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Yard"))
            {
                value=Double.toString(no*1.09361e-6);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Foot"))
            {
                value=Double.toString(no*3.28084e-6);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Inch"))
            {
                value=Double.toString(no*3.93701e-5);
                textView.setText(value);
            }
            else if (item.equals("Micrometer") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            // next line starts here
            else if(item.equals("Nautical Mile") && item1.equals("Nautical Mile"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Nautical Mile") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*1.852);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Meter"))
            {
                value=Double.toString(no*1852);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Decimeter"))
            {
                value=Double.toString(no*18520);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Centimeter"))
            {
                value=Double.toString(no*185200);
                textView.setText(value);
            }
            else if(item.equals("Nautical Mile") && item1.equals("Millimeter"))
            {
                value=Double.toString(no*1.852e+6);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Micrometer"))
            {
                value=Double.toString(no*1.852e+9);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Mile"))
            {
                value=Double.toString(no*1.15078);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Yard"))
            {
                value=Double.toString(no*2025.37);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Foot"))
            {
                value=Double.toString(no*6076.12);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Inch"))
            {
                value=Double.toString(no*72913.4);
                textView.setText(value);
            }
            else if (item.equals("Nautical Mile") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            // next line starts here
            else if(item.equals("Mile") && item1.equals("Mile"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Mile") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*1.60934);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Meter"))
            {
                value=Double.toString(no*1609.34);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Decimeter"))
            {
                value=Double.toString(no*16093.4);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Centimeter"))
            {
                value=Double.toString(no*160934);
                textView.setText(value);
            }
            else if(item.equals("Mile") && item1.equals("Millimeter"))
            {
                value=Double.toString(no*1.609e+6);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Micrometer"))
            {
                value=Double.toString(no*1.609e+9);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*0.868976);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Yard"))
            {
                value=Double.toString(no*1760);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Foot"))
            {
                value=Double.toString(no*5280);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Inch"))
            {
                value=Double.toString(no*63360);
                textView.setText(value);
            }
            else if (item.equals("Mile") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            else if(item.equals("Yard") && item1.equals("Yard"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Yard") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*0.0009144);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Meter"))
            {
                value=Double.toString(no*0.9144);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Decimeter"))
            {
                value=Double.toString(no*9.144);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Centimeter"))
            {
                value=Double.toString(no*91.44);
                textView.setText(value);
            }
            else if(item.equals("Yard") && item1.equals("Millimeter"))
            {
                value=Double.toString(no*914.4);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Micrometer"))
            {
                value=Double.toString(no*914400);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*0.000493737);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Mile"))
            {
                value=Double.toString(no*0.000568182);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Foot"))
            {
                value=Double.toString(no*3);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Inch"))
            {
                value=Double.toString(no*36);
                textView.setText(value);
            }
            else if (item.equals("Yard") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            //next line starts here
            else if(item.equals("Foot") && item1.equals("Foot"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Foot") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*0.0003048);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Meter"))
            {
                value=Double.toString(no*0.3048);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Decimeter"))
            {
                value=Double.toString(no*3.048);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Centimeter"))
            {
                value=Double.toString(no*30.48);
                textView.setText(value);
            }
            else if(item.equals("Foot") && item1.equals("Millimeter"))
            {
                value=Double.toString(no*304.8);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Micrometer"))
            {
                value=Double.toString(no*304800);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*0.000164579);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Mile"))
            {
                value=Double.toString(no*0.000189394);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Yard"))
            {
                value=Double.toString(no*0.333333);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Inch"))
            {
                value=Double.toString(no*12);
                textView.setText(value);
            }
            else if (item.equals("Foot") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            //next line starts here
            else if(item.equals("Inch") && item1.equals("Inch"))
            {
                value=Integer.toString(no);
                textView.setText(value);
            }
            else if(item.equals("Inch") && item1.equals("Kilometer"))
            {
                value=Double.toString(no*2.54e-5);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Meter"))
            {
                value=Double.toString(no*0.0254);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Decimeter"))
            {
                value=Double.toString(no*0.254);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Centimeter"))
            {
                value=Double.toString(no*2.54);
                textView.setText(value);
            }
            else if(item.equals("Inch") && item1.equals("Millimeter"))
            {
                value=Double.toString(no*25.4);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Micrometer"))
            {
                value=Double.toString(no*25400);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Nautical Mile"))
            {
                value=Double.toString(no*1.37149e-5);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Mile"))
            {
                value=Double.toString(no*1.57828e-5);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Yard"))
            {
                value=Double.toString(no*0.0277778);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Foot"))
            {
                value=Double.toString(no*0.0833333);
                textView.setText(value);
            }
            else if (item.equals("Inch") && item1.equals("Astronomical Unit"))
            {
                textView.setText("Error");
            }
            //next line starts here
            else
            {
                textView.setText("Error");
            }
        }
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edt);
        textView=findViewById(R.id.edt1);
        spi=findViewById(R.id.spinner);
        spi1=findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.converter1, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.converter2, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spi.setAdapter(adapter);
        spi1.setAdapter(adapter1);
    }
}