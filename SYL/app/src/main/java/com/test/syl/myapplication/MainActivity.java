package com.test.syl.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button b;
    private TextView t;
    private TextView k;
    private LocationManager locationManager;
    private LocationListener listener;

    final int SEND_SMS_PERMISSION_REQUEST_CODE = 1;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }


    public void polPress(View view){



        Button btn = (Button) findViewById(R.id.btnpol);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder altdial= new AlertDialog.Builder(MainActivity.this);
                altdial.setMessage("Bulunduğunuz konumunuz Polis’e gönderilecektir, emin misiniz ?  ").setCancelable(false)
                        .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                                Uri uri = Uri.parse("smsto:05347494136");
                                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                                it.putExtra("sms_body", "39.830373,30.4242535");
                                startActivity(it);



                                dialog.cancel();
                            }
                        })
                        .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert = altdial.create();
                alert.setTitle("Uyarı!");
                alert.show();

            }
        });


    }

    public void medPress(View view){



        Button btn = (Button) findViewById(R.id.btnmed);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder altdial= new AlertDialog.Builder(MainActivity.this);
                altdial.setMessage("Bulunduğunuz konumunuz Ambulans’a gönderilecektir, emin misiniz ?  ").setCancelable(false)
                        .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                                Uri uri = Uri.parse("smsto:05346573516");
                                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                                it.putExtra("sms_body", "39.830373,30.4242535");
                                startActivity(it);



                                dialog.cancel();
                            }
                        })
                        .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert = altdial.create();
                alert.setTitle("Uyarı!");
                alert.show();

            }
        });


    }

    public void ormanPress(View view){



        Button btn = (Button) findViewById(R.id.btnorman);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder altdial= new AlertDialog.Builder(MainActivity.this);
                altdial.setMessage("Bulunduğunuz konumunuz Orman Yangın birimlerine gönderilecektir, emin misiniz ?  ").setCancelable(false)
                        .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                                Uri uri = Uri.parse("smsto:05346573516");
                                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                                it.putExtra("sms_body","39.830373,30.4242535");
                                startActivity(it);



                                dialog.cancel();
                            }
                        })
                        .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert = altdial.create();
                alert.setTitle("Uyarı!");
                alert.show();

            }
        });


    }

    public void itfPress(View view){



        Button btn = (Button) findViewById(R.id.btnitf);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder altdial= new AlertDialog.Builder(MainActivity.this);
                altdial.setMessage("Bulunduğunuz konumunuz İtfaye birimlerine gönderilecektir, emin misiniz ?  ").setCancelable(false)
                        .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                                Uri uri = Uri.parse("smsto:05347494136");
                                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                                it.putExtra("sms_body", "39.830373,30.4242535");
                                startActivity(it);



                                dialog.cancel();
                            }
                        })
                        .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert = altdial.create();
                alert.setTitle("Uyarı!");
                alert.show();

            }
        });


    }



}
